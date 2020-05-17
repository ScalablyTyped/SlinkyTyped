package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatInformation extends js.Object {
  val DataMask: Double = js.native
  val ErrorCorrectionLevel: typingsSlinky.jsqrcode.ErrorCorrectionLevel = js.native
  var dataMask: Double = js.native
  var errorCorrectionLevel: typingsSlinky.jsqrcode.ErrorCorrectionLevel = js.native
  def Equals(other: FormatInformation): Boolean = js.native
  def GetHashCode(): Double = js.native
}

object FormatInformation {
  @scala.inline
  def apply(
    DataMask: Double,
    Equals: FormatInformation => Boolean,
    ErrorCorrectionLevel: ErrorCorrectionLevel,
    GetHashCode: () => Double,
    dataMask: Double,
    errorCorrectionLevel: ErrorCorrectionLevel
  ): FormatInformation = {
    val __obj = js.Dynamic.literal(DataMask = DataMask.asInstanceOf[js.Any], Equals = js.Any.fromFunction1(Equals), ErrorCorrectionLevel = ErrorCorrectionLevel.asInstanceOf[js.Any], GetHashCode = js.Any.fromFunction0(GetHashCode), dataMask = dataMask.asInstanceOf[js.Any], errorCorrectionLevel = errorCorrectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatInformation]
  }
  @scala.inline
  implicit class FormatInformationOps[Self <: FormatInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquals(value: FormatInformation => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withErrorCorrectionLevel(value: ErrorCorrectionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCorrectionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetHashCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHashCode")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

