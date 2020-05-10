package typingsSlinky.actionsOnGoogle.convMod

import typingsSlinky.actionsOnGoogle.conversationConversationMod.ConversationBaseOptions
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsSdkConversationOptions[TConvData, TUserStorage] extends ConversationBaseOptions[TConvData, TUserStorage] {
  /** @public */
  var body: js.UndefOr[GoogleActionsV2AppRequest] = js.native
}

object ActionsSdkConversationOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](): ActionsSdkConversationOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsSdkConversationOptions[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class ActionsSdkConversationOptionsOps[Self[tconvdata, tuserstorage] <: ActionsSdkConversationOptions[tconvdata, tuserstorage], TConvData, TUserStorage] (val x: Self[TConvData, TUserStorage]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TConvData, TUserStorage] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TConvData, TUserStorage]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TConvData, TUserStorage]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TConvData, TUserStorage]) with Other]
    @scala.inline
    def withBody(value: GoogleActionsV2AppRequest): Self[TConvData, TUserStorage] = {
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

