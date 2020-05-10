package typingsSlinky.oracleOraclejet.ojdialogMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.AnonLabelCloseIcon
import typingsSlinky.oracleOraclejet.ojdialogMod.ojDialog.Position
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`title-bar`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.escape
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hide
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.icon
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.modal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.modeless
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.resizable
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdialog.ojDialogSettableProperties> */
@js.native
trait ojDialogSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var cancelBehavior: js.UndefOr[icon | escape | none] = js.native
  var dialogTitle: js.UndefOr[String] = js.native
  var dragAffordance: js.UndefOr[`title-bar` | none] = js.native
  var initialVisibility: js.UndefOr[hide | show] = js.native
  var modality: js.UndefOr[modal | modeless] = js.native
  var position: js.UndefOr[Position] = js.native
  var resizeBehavior: js.UndefOr[resizable | none] = js.native
  var role: js.UndefOr[String] = js.native
  var translations: js.UndefOr[AnonLabelCloseIcon] = js.native
}

object ojDialogSettablePropertiesLenient {
  @scala.inline
  def apply(): ojDialogSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDialogSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojDialogSettablePropertiesLenientOps[Self <: ojDialogSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelBehavior(value: icon | escape | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAffordance(value: `title-bar` | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAffordance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAffordance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAffordance")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialVisibility(value: hide | show): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withModality(value: modal | modeless): Self = {
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
    def withResizeBehavior(value: resizable | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: AnonLabelCloseIcon): Self = {
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

