package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxValidationError...
  */
@js.native
trait INxValidationError extends js.Object {
  /**
    * Context related to the error, from the user app domain.
    * It can be the identifier of an object, a field name, a table name.
    * This parameter is optional.
    * String
    */
  var qContext: js.UndefOr[String] = js.native
  /**
    * Error code.
    * This parameter is always displayed in case of error.
    * Integer
    */
  var qErrorCode: Double = js.native
  /**
    * Internal information from the server.
    * This parameter is optional.
    * String
    */
  var qExtendedMessage: js.UndefOr[String] = js.native
}

object INxValidationError {
  @scala.inline
  def apply(qErrorCode: Double): INxValidationError = {
    val __obj = js.Dynamic.literal(qErrorCode = qErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxValidationError]
  }
  @scala.inline
  implicit class INxValidationErrorOps[Self <: INxValidationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qContext")(js.undefined)
        ret
    }
    @scala.inline
    def withQExtendedMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExtendedMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQExtendedMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExtendedMessage")(js.undefined)
        ret
    }
  }
  
}

