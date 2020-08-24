package typingsSlinky.oracleOraclejet.ojpopupMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.AriaCloseSkipLink
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
@js.native
trait ojPopupSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var autoDismiss: js.UndefOr[none | focusLoss] = js.native
  var chrome: js.UndefOr[default | none] = js.native
  var initialFocus: js.UndefOr[auto | none | firstFocusable | popup] = js.native
  var modality: js.UndefOr[modeless | modal] = js.native
  var position: js.UndefOr[Position] = js.native
  var tail: js.UndefOr[none | simple] = js.native
  var translations: js.UndefOr[AriaCloseSkipLink] = js.native
}

object ojPopupSettablePropertiesLenient {
  @scala.inline
  def apply(): ojPopupSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojPopupSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojPopupSettablePropertiesLenientOps[Self <: ojPopupSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoDismiss(value: none | focusLoss): Self = this.set("autoDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDismiss: Self = this.set("autoDismiss", js.undefined)
    @scala.inline
    def setChrome(value: default | none): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    @scala.inline
    def setInitialFocus(value: auto | none | firstFocusable | popup): Self = this.set("initialFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialFocus: Self = this.set("initialFocus", js.undefined)
    @scala.inline
    def setModality(value: modeless | modal): Self = this.set("modality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModality: Self = this.set("modality", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTail(value: none | simple): Self = this.set("tail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTail: Self = this.set("tail", js.undefined)
    @scala.inline
    def setTranslations(value: AriaCloseSkipLink): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

