package typingsSlinky.oracleOraclejet.ojdialogMod

import typingsSlinky.oracleOraclejet.anon.LabelCloseIcon
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
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

@js.native
trait ojDialogSettableProperties extends baseComponentSettableProperties {
  var cancelBehavior: icon | escape | none = js.native
  var dialogTitle: String | Null = js.native
  var dragAffordance: `title-bar` | none = js.native
  var initialVisibility: hide | show = js.native
  var modality: modal | modeless = js.native
  var position: Position = js.native
  var resizeBehavior: resizable | none = js.native
  var role: String = js.native
  @JSName("translations")
  var translations_ojDialogSettableProperties: LabelCloseIcon = js.native
}

object ojDialogSettableProperties {
  @scala.inline
  def apply(
    cancelBehavior: icon | escape | none,
    dragAffordance: `title-bar` | none,
    initialVisibility: hide | show,
    modality: modal | modeless,
    position: Position,
    resizeBehavior: resizable | none,
    role: String,
    translations: LabelCloseIcon
  ): ojDialogSettableProperties = {
    val __obj = js.Dynamic.literal(cancelBehavior = cancelBehavior.asInstanceOf[js.Any], dragAffordance = dragAffordance.asInstanceOf[js.Any], initialVisibility = initialVisibility.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resizeBehavior = resizeBehavior.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDialogSettableProperties]
  }
  @scala.inline
  implicit class ojDialogSettablePropertiesOps[Self <: ojDialogSettableProperties] (val x: Self) extends AnyVal {
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
    def withDragAffordance(value: `title-bar` | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAffordance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialVisibility(value: hide | show): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModality(value: modal | modeless): Self = {
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
    def withResizeBehavior(value: resizable | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: LabelCloseIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTitle")(null)
        ret
    }
  }
  
}

