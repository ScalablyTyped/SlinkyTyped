package typingsSlinky.pulumiAws.outputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleActionFixedResponse extends js.Object {
  /**
    * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
    */
  var contentType: String = js.native
  /**
    * The message body.
    */
  var messageBody: js.UndefOr[String] = js.native
  /**
    * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
    */
  var statusCode: String = js.native
}

object ListenerRuleActionFixedResponse {
  @scala.inline
  def apply(contentType: String, statusCode: String): ListenerRuleActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionFixedResponse]
  }
  @scala.inline
  implicit class ListenerRuleActionFixedResponseOps[Self <: ListenerRuleActionFixedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBody")(js.undefined)
        ret
    }
  }
  
}

