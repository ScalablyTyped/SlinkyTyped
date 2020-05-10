package typingsSlinky.actionsOnGoogle.conversationConversationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationOptionsInit[TConvData, TUserStorage] extends js.Object {
  /** @public */
  var data: js.UndefOr[TConvData] = js.native
  /** @public */
  var storage: js.UndefOr[TUserStorage] = js.native
}

object ConversationOptionsInit {
  @scala.inline
  def apply[TConvData, TUserStorage](): ConversationOptionsInit[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationOptionsInit[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class ConversationOptionsInitOps[Self[tconvdata, tuserstorage] <: ConversationOptionsInit[tconvdata, tuserstorage], TConvData, TUserStorage] (val x: Self[TConvData, TUserStorage]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TConvData, TUserStorage] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TConvData, TUserStorage]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TConvData, TUserStorage]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TConvData, TUserStorage]) with Other]
    @scala.inline
    def withData(value: TConvData): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: TUserStorage): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
  }
  
}

