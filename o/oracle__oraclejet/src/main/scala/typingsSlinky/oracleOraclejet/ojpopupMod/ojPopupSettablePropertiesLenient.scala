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
    def withAutoDismiss(value: none | focusLoss): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withChrome(value: default | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFocus(value: auto | none | firstFocusable | popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withModality(value: modeless | modal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modality")(js.undefined)
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
    def withTail(value: none | simple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tail")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: AriaCloseSkipLink): Self = {
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

