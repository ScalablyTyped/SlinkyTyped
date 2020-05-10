package typingsSlinky.braintreeWeb.mod

import typingsSlinky.braintreeWeb.mod.BraintreeError.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BraintreeError_ extends js.Object {
  /**
    * @type {string}
    * @description A code that corresponds to specific errors.
    */
  var code: String = js.native
  /**
    * @type {object=}
    * @description Additional information about the error, such as an underlying network error response.
    */
  var details: js.Any = js.native
  /**
    * @type {string}
    * @description A short description of the error.
    */
  var message: String = js.native
  /**
    * @type {BraintreeError.types}
    * @description The type of error.
    */
  var `type`: Types = js.native
}

object BraintreeError_ {
  @scala.inline
  def apply(code: String, details: js.Any, message: String, `type`: Types): BraintreeError_ = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BraintreeError_]
  }
  @scala.inline
  implicit class BraintreeError_Ops[Self <: BraintreeError_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Types): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

