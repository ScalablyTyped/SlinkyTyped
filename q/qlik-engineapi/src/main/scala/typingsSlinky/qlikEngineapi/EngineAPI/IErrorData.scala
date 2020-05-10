package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ErrorData...
  */
@js.native
trait IErrorData extends js.Object {
  /**
    * Type of the error messages.
    */
  var qErrorDataCode: ErrorDataCodeType = js.native
  /**
    * Detailed information about the error message.
    */
  var qErrorString: String = js.native
  /**
    * Script statement where the error occurs.
    */
  var qLine: String = js.native
  /**
    * Line termination characters.
    */
  var qLineEnd: String = js.native
}

object IErrorData {
  @scala.inline
  def apply(qErrorDataCode: ErrorDataCodeType, qErrorString: String, qLine: String, qLineEnd: String): IErrorData = {
    val __obj = js.Dynamic.literal(qErrorDataCode = qErrorDataCode.asInstanceOf[js.Any], qErrorString = qErrorString.asInstanceOf[js.Any], qLine = qLine.asInstanceOf[js.Any], qLineEnd = qLineEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorData]
  }
  @scala.inline
  implicit class IErrorDataOps[Self <: IErrorData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQErrorDataCode(value: ErrorDataCodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qErrorDataCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQErrorString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qErrorString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLineEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLineEnd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

