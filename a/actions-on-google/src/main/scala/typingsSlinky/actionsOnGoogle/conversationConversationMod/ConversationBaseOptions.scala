package typingsSlinky.actionsOnGoogle.conversationConversationMod

import typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationBaseOptions[TConvData, TUserStorage] extends js.Object {
  /** @public */
  var debug: js.UndefOr[Boolean] = js.native
  /** @public */
  var headers: js.UndefOr[Headers] = js.native
  /** @public */
  var init: js.UndefOr[ConversationOptionsInit[TConvData, TUserStorage]] = js.native
  /** @public */
  var ordersv3: js.UndefOr[Boolean] = js.native
}

object ConversationBaseOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](): ConversationBaseOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationBaseOptions[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class ConversationBaseOptionsOps[Self[tconvdata, tuserstorage] <: ConversationBaseOptions[tconvdata, tuserstorage], TConvData, TUserStorage] (val x: Self[TConvData, TUserStorage]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TConvData, TUserStorage] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TConvData, TUserStorage]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TConvData, TUserStorage]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TConvData, TUserStorage]) with Other]
    @scala.inline
    def withDebug(value: Boolean): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: ConversationOptionsInit[TConvData, TUserStorage]): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdersv3(value: Boolean): Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordersv3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdersv3: Self[TConvData, TUserStorage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordersv3")(js.undefined)
        ret
    }
  }
  
}

