package typingsSlinky.atOracleOraclejet.ojpopupMod

import typingsSlinky.atOracleOraclejet.Anon_AriaCloseSkipLink
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.default
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.firstFocusable
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focusLoss
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.popup
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.simple
import typingsSlinky.atOracleOraclejet.ojpopupMod.ojPopup.Position
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
  var translations_ojPopupSettableProperties: Anon_AriaCloseSkipLink
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
    translations: Anon_AriaCloseSkipLink
  ): ojPopupSettableProperties = {
    val __obj = js.Dynamic.literal(autoDismiss = autoDismiss.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojPopupSettableProperties]
  }
}

