package typingsSlinky.actionsOnGoogle.dialogflowConvMod

import typingsSlinky.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2WebhookRequest
import typingsSlinky.actionsOnGoogle.conversationConversationMod.ConversationBaseOptions
import typingsSlinky.actionsOnGoogle.v1Mod.DialogflowV1WebhookRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowConversationOptions[TConvData, TUserStorage] extends ConversationBaseOptions[TConvData, TUserStorage] {
  /** @public */
  var body: js.UndefOr[GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest] = js.native
}

object DialogflowConversationOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](): DialogflowConversationOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowConversationOptions[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class DialogflowConversationOptionsOps[Self[tconvdata, tuserstorage] <: DialogflowConversationOptions[tconvdata, tuserstorage], TConvData, TUserStorage] (val x: Self[TConvData, TUserStorage]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TConvData, TUserStorage] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TConvData, TUserStorage]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TConvData, TUserStorage]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TConvData, TUserStorage]) with Other]
    @scala.inline
    def withBody(value: GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
  }
  
}

