package typingsSlinky.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleNumbers.`0`
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.facebook_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.kik_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.line_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.skype_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.slack_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.telegram_
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.viber_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageText
  extends DialogflowV1BaseMessage[`0`]
     with DialogflowV1Message {
  var speech: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageText {
  @scala.inline
  def apply(
    platform: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_ = null,
    speech: String = null,
    `type`: `0` = null
  ): DialogflowV1MessageText = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (speech != null) __obj.updateDynamic("speech")(speech.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageText]
  }
}

