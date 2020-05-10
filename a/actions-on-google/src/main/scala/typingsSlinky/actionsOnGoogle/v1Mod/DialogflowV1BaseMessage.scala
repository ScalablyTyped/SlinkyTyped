package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.facebook_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.kik_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.line_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.skype_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.slack_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.telegram_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.viber_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1BaseMessage[TType /* <: Double */] extends js.Object {
  var platform: js.UndefOr[facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_] = js.native
  var `type`: js.UndefOr[TType] = js.native
}

object DialogflowV1BaseMessage {
  @scala.inline
  def apply[TType](): DialogflowV1BaseMessage[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1BaseMessage[TType]]
  }
  @scala.inline
  implicit class DialogflowV1BaseMessageOps[Self[ttype] <: DialogflowV1BaseMessage[ttype], TType] (val x: Self[TType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TType] with Other]
    @scala.inline
    def withPlatform(value: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_): Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TType): Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[TType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

