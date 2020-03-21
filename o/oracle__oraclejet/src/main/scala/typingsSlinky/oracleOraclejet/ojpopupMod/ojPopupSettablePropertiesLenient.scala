package typingsSlinky.oracleOraclejet.ojpopupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.AnonAriaCloseSkipLink
import typingsSlinky.oracleOraclejet.ojpopupMod.ojPopup.Position
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.default
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.firstFocusable
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.modal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.modeless
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.popup
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojpopup.ojPopupSettableProperties> */
trait ojPopupSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var autoDismiss: js.UndefOr[none | focusLoss] = js.undefined
  var chrome: js.UndefOr[default | none] = js.undefined
  var initialFocus: js.UndefOr[auto | none | firstFocusable | popup] = js.undefined
  var modality: js.UndefOr[modeless | modal] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var tail: js.UndefOr[none | simple] = js.undefined
  var translations: js.UndefOr[AnonAriaCloseSkipLink] = js.undefined
}

object ojPopupSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    autoDismiss: none | focusLoss = null,
    chrome: default | none = null,
    initialFocus: auto | none | firstFocusable | popup = null,
    modality: modeless | modal = null,
    position: Position = null,
    tail: none | simple = null,
    translations: AnonAriaCloseSkipLink = null
  ): ojPopupSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (chrome != null) __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    if (initialFocus != null) __obj.updateDynamic("initialFocus")(initialFocus.asInstanceOf[js.Any])
    if (modality != null) __obj.updateDynamic("modality")(modality.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPopupSettablePropertiesLenient]
  }
}

