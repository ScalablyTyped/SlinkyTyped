package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomErrorRule extends js.Object {
  /**
    * Mark this message as possible payload in error response.  Otherwise,
    * objects of this type will be filtered when they appear in error payload.
    */
  var isErrorType: js.UndefOr[Boolean] = js.native
  /**
    * Selects messages to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object CustomErrorRule {
  @scala.inline
  def apply(): CustomErrorRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomErrorRule]
  }
  @scala.inline
  implicit class CustomErrorRuleOps[Self <: CustomErrorRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsErrorType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isErrorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsErrorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isErrorType")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

