package typingsSlinky.oracleOraclejet.ojmessagesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.AriaLiveRegion
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typingsSlinky.oracleOraclejet.ojmessageMod.ojMessage.Message
import typingsSlinky.oracleOraclejet.ojmessagesMod.ojMessages.Position
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.general
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmessages.ojMessagesSettableProperties> */
trait ojMessagesSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var display: js.UndefOr[general | notification] = js.undefined
  var displayOptions: js.UndefOr[DisplayOptions] = js.undefined
  var messages: js.UndefOr[js.Array[Message] | (DataProvider[_, Message])] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var translations: js.UndefOr[AriaLiveRegion] = js.undefined
}

object ojMessagesSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    display: general | notification = null,
    displayOptions: DisplayOptions = null,
    messages: js.Array[Message] | (DataProvider[_, Message]) = null,
    position: Position = null,
    translations: AriaLiveRegion = null
  ): ojMessagesSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMessagesSettablePropertiesLenient]
  }
}

