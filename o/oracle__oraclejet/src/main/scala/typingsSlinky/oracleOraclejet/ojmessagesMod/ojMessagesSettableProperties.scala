package typingsSlinky.oracleOraclejet.ojmessagesMod

import typingsSlinky.oracleOraclejet.AnonAriaLiveRegion
import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typingsSlinky.oracleOraclejet.ojmessageMod.ojMessage.Message
import typingsSlinky.oracleOraclejet.ojmessagesMod.ojMessages.Position
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.general
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMessagesSettableProperties extends JetSettableProperties {
  var display: general | notification
  var displayOptions: DisplayOptions
  var messages: js.Array[Message] | Null | (DataProvider[_, Message])
  var position: Position | Null
  var translations: AnonAriaLiveRegion
}

object ojMessagesSettableProperties {
  @scala.inline
  def apply(
    display: general | notification,
    displayOptions: DisplayOptions,
    translations: AnonAriaLiveRegion,
    messages: js.Array[Message] | (DataProvider[_, Message]) = null,
    position: Position = null
  ): ojMessagesSettableProperties = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMessagesSettableProperties]
  }
}

