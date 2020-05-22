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

trait DialogflowV1BaseMessage[TType /* <: Double */] extends js.Object {
  var platform: js.UndefOr[facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_] = js.undefined
  var `type`: js.UndefOr[TType] = js.undefined
}

object DialogflowV1BaseMessage {
  @scala.inline
  def apply[TType](
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    `type`: TType = null
  ): DialogflowV1BaseMessage[TType] = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1BaseMessage[TType]]
  }
}

