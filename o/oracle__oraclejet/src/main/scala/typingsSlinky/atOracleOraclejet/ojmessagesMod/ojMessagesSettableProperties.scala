package typingsSlinky.atOracleOraclejet.ojmessagesMod

import typingsSlinky.atOracleOraclejet.Anon_AriaLiveRegion
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.general
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.notification
import typingsSlinky.atOracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.atOracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typingsSlinky.atOracleOraclejet.ojmessageMod.ojMessage.Message
import typingsSlinky.atOracleOraclejet.ojmessagesMod.ojMessages.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMessagesSettableProperties extends JetSettableProperties {
  var display: general | notification
  var displayOptions: DisplayOptions
  var messages: js.Array[Message] | Null | (DataProvider[_, Message])
  var position: Position | Null
  var translations: Anon_AriaLiveRegion
}

object ojMessagesSettableProperties {
  @scala.inline
  def apply(
    display: general | notification,
    displayOptions: DisplayOptions,
    translations: Anon_AriaLiveRegion,
    messages: js.Array[Message] | (DataProvider[_, Message]) = null,
    position: Position = null
  ): ojMessagesSettableProperties = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMessagesSettableProperties]
  }
}

