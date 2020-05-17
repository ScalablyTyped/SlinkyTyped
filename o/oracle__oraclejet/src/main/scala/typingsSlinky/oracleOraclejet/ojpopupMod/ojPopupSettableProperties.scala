package typingsSlinky.oracleOraclejet.ojpopupMod

import typingsSlinky.oracleOraclejet.anon.AriaCloseSkipLink
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

@js.native
trait ojPopupSettableProperties extends baseComponentSettableProperties {
  var autoDismiss: none | focusLoss = js.native
  var chrome: default | none = js.native
  var initialFocus: auto | none | firstFocusable | popup = js.native
  var modality: modeless | modal = js.native
  var position: Position = js.native
  var tail: none | simple = js.native
  @JSName("translations")
  var translations_ojPopupSettableProperties: AriaCloseSkipLink = js.native
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
    translations: AriaCloseSkipLink
  ): ojPopupSettableProperties = {
    val __obj = js.Dynamic.literal(autoDismiss = autoDismiss.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPopupSettableProperties]
  }
  @scala.inline
  implicit class ojPopupSettablePropertiesOps[Self <: ojPopupSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDismiss(value: none | focusLoss): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome(value: default | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialFocus(value: auto | none | firstFocusable | popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModality(value: modeless | modal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTail(value: none | simple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AriaCloseSkipLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

