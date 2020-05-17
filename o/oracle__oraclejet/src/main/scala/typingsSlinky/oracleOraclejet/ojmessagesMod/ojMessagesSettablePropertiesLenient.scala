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
@js.native
trait ojMessagesSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var display: js.UndefOr[general | notification] = js.native
  var displayOptions: js.UndefOr[DisplayOptions] = js.native
  var messages: js.UndefOr[js.Array[Message] | (DataProvider[_, Message])] = js.native
  var position: js.UndefOr[Position] = js.native
  var translations: js.UndefOr[AriaLiveRegion] = js.native
}

object ojMessagesSettablePropertiesLenient {
  @scala.inline
  def apply(): ojMessagesSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojMessagesSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojMessagesSettablePropertiesLenientOps[Self <: ojMessagesSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: general | notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayOptions(value: DisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[Message] | (DataProvider[_, Message])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: AriaLiveRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

