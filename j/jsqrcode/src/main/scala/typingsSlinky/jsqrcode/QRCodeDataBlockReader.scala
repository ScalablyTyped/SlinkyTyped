package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeDataBlockReader extends js.Object {
  val DataByte: js.Array[String | js.Array[Double]] = js.native
  var bitPointer: Double = js.native
  var blockPointer: Double = js.native
  var blocks: js.Array[Double] = js.native
  var dataLength: Double = js.native
  var dataLengthMode: Double = js.native
  var numErrorCorrectionCode: Double = js.native
  def NextMode(): Double = js.native
  def get8bitByteArray(dataLength: Double): js.Array[Double] = js.native
  def getDataLength(modeIndicator: Double): Double = js.native
  def getFigureString(dataLength: Double): String = js.native
  def getKanjiString(dataLength: Double): String = js.native
  def getNextBits(numBits: Double): Double = js.native
  def getRomanAndFigureString(dataLength: Double): String = js.native
  def parseECIValue(): Double = js.native
}

object QRCodeDataBlockReader {
  @scala.inline
  def apply(
    DataByte: js.Array[String | js.Array[Double]],
    NextMode: () => Double,
    bitPointer: Double,
    blockPointer: Double,
    blocks: js.Array[Double],
    dataLength: Double,
    dataLengthMode: Double,
    get8bitByteArray: Double => js.Array[Double],
    getDataLength: Double => Double,
    getFigureString: Double => String,
    getKanjiString: Double => String,
    getNextBits: Double => Double,
    getRomanAndFigureString: Double => String,
    numErrorCorrectionCode: Double,
    parseECIValue: () => Double
  ): QRCodeDataBlockReader = {
    val __obj = js.Dynamic.literal(DataByte = DataByte.asInstanceOf[js.Any], NextMode = js.Any.fromFunction0(NextMode), bitPointer = bitPointer.asInstanceOf[js.Any], blockPointer = blockPointer.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], dataLengthMode = dataLengthMode.asInstanceOf[js.Any], get8bitByteArray = js.Any.fromFunction1(get8bitByteArray), getDataLength = js.Any.fromFunction1(getDataLength), getFigureString = js.Any.fromFunction1(getFigureString), getKanjiString = js.Any.fromFunction1(getKanjiString), getNextBits = js.Any.fromFunction1(getNextBits), getRomanAndFigureString = js.Any.fromFunction1(getRomanAndFigureString), numErrorCorrectionCode = numErrorCorrectionCode.asInstanceOf[js.Any], parseECIValue = js.Any.fromFunction0(parseECIValue))
    __obj.asInstanceOf[QRCodeDataBlockReader]
  }
  @scala.inline
  implicit class QRCodeDataBlockReaderOps[Self <: QRCodeDataBlockReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataByte(value: js.Array[String | js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextMode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBitPointer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockPointer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLengthMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLengthMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet8bitByteArray(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get8bitByteArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDataLength(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFigureString(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFigureString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetKanjiString(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKanjiString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNextBits(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextBits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRomanAndFigureString(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRomanAndFigureString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNumErrorCorrectionCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numErrorCorrectionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseECIValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseECIValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

