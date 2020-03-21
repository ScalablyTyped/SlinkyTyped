package typingsSlinky.oracleOraclejet.ojpopupMod

import typingsSlinky.oracleOraclejet.AnonAriaCloseSkipLink
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
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

trait ojPopupSettableProperties extends baseComponentSettableProperties {
  var autoDismiss: none | focusLoss
  var chrome: default | none
  var initialFocus: auto | none | firstFocusable | popup
  var modality: modeless | modal
  var position: Position
  var tail: none | simple
  @JSName("translations")
  var translations_ojPopupSettableProperties: AnonAriaCloseSkipLink
}

object ojPopupSettableProperties {
  @scala.inline
  def apply(
    autoDismiss: none | focusLoss,
    chrome: default | none,
    initialFocus: auto | none | firstFocusable | popup,
    modality: modeless | modal,
    position: Position,
    tail: none | simple,
    translations: AnonAriaCloseSkipLink
  ): ojPopupSettableProperties = {
    val __obj = js.Dynamic.literal(autoDismiss = autoDismiss.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojPopupSettableProperties]
  }
}

