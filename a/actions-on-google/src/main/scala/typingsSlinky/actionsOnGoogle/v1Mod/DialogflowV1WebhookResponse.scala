package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1WebhookResponse extends js.Object {
  var contextOut: js.UndefOr[js.Array[DialogflowV1Context]] = js.native
  var data: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var displayText: js.UndefOr[String] = js.native
  var followupEvent: js.UndefOr[DialogflowV1FollowupEvent] = js.native
  var messages: js.UndefOr[js.Array[DialogflowV1Message]] = js.native
  var source: js.UndefOr[String] = js.native
  var speech: js.UndefOr[String] = js.native
}

object DialogflowV1WebhookResponse {
  @scala.inline
  def apply(): DialogflowV1WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1WebhookResponse]
  }
  @scala.inline
  implicit class DialogflowV1WebhookResponseOps[Self <: DialogflowV1WebhookResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextOut(value: js.Array[DialogflowV1Context]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOut")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowupEvent(value: DialogflowV1FollowupEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowupEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followupEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[DialogflowV1Message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speech")(js.undefined)
        ret
    }
  }
  
}

