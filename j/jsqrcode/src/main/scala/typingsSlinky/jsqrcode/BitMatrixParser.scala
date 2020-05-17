package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitMatrixParser extends js.Object {
  var bitMatrix: BitMatrix = js.native
  var parsedFormatInfo: FormatInformation = js.native
  var parsedVersion: Version = js.native
  def copyBit(i: Double, j: Double, versionBits: Double): Double = js.native
  def readCodewords(): js.Array[Double] = js.native
  def readFormatInformation(): FormatInformation = js.native
  def readVersion(): Version = js.native
}

object BitMatrixParser {
  @scala.inline
  def apply(
    bitMatrix: BitMatrix,
    copyBit: (Double, Double, Double) => Double,
    parsedFormatInfo: FormatInformation,
    parsedVersion: Version,
    readCodewords: () => js.Array[Double],
    readFormatInformation: () => FormatInformation,
    readVersion: () => Version
  ): BitMatrixParser = {
    val __obj = js.Dynamic.literal(bitMatrix = bitMatrix.asInstanceOf[js.Any], copyBit = js.Any.fromFunction3(copyBit), parsedFormatInfo = parsedFormatInfo.asInstanceOf[js.Any], parsedVersion = parsedVersion.asInstanceOf[js.Any], readCodewords = js.Any.fromFunction0(readCodewords), readFormatInformation = js.Any.fromFunction0(readFormatInformation), readVersion = js.Any.fromFunction0(readVersion))
    __obj.asInstanceOf[BitMatrixParser]
  }
  @scala.inline
  implicit class BitMatrixParserOps[Self <: BitMatrixParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitMatrix(value: BitMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyBit(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyBit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withParsedFormatInfo(value: FormatInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedFormatInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsedVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadCodewords(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCodewords")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadFormatInformation(value: () => FormatInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFormatInformation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadVersion(value: () => Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readVersion")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

