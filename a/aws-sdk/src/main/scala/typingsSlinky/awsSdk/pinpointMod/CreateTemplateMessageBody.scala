package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateMessageBody extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template that was created.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The message that's returned from the API for the request to create the message template.
    */
  var Message: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the request to create the message template.
    */
  var RequestID: js.UndefOr[string] = js.native
}

object CreateTemplateMessageBody {
  @scala.inline
  def apply(): CreateTemplateMessageBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateMessageBody]
  }
  @scala.inline
  implicit class CreateTemplateMessageBodyOps[Self <: CreateTemplateMessageBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestID(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestID")(js.undefined)
        ret
    }
  }
  
}

