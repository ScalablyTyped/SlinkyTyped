package typingsSlinky.actionsOnGoogle.helperHelperMod

import typingsSlinky.actionsOnGoogle.conversationConversationMod.InputValueSpec
import typingsSlinky.actionsOnGoogle.conversationConversationMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelperOptions[TIntent /* <: Intent */, TValueSpec] extends js.Object {
  var data: js.UndefOr[TValueSpec] = js.native
  var intent: TIntent = js.native
  var `type`: InputValueSpec = js.native
}

object HelperOptions {
  @scala.inline
  def apply[TIntent, TValueSpec](intent: TIntent, `type`: InputValueSpec): HelperOptions[TIntent, TValueSpec] = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelperOptions[TIntent, TValueSpec]]
  }
  @scala.inline
  implicit class HelperOptionsOps[Self[tintent, tvaluespec] <: HelperOptions[tintent, tvaluespec], TIntent, TValueSpec] (val x: Self[TIntent, TValueSpec]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TIntent, TValueSpec] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TIntent, TValueSpec]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TIntent, TValueSpec]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TIntent, TValueSpec]) with Other]
    @scala.inline
    def withIntent(value: TIntent): Self[TIntent, TValueSpec] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: InputValueSpec): Self[TIntent, TValueSpec] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: TValueSpec): Self[TIntent, TValueSpec] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TIntent, TValueSpec] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

