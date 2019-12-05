package typingsSlinky.atOracleOraclejet.ojdialogMod

import typingsSlinky.atOracleOraclejet.Anon_LabelCloseIcon
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.`title-bar`
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.escape
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hide
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.icon
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.modeless
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.resizable
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.show
import typingsSlinky.atOracleOraclejet.ojdialogMod.ojDialog.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDialogSettableProperties extends baseComponentSettableProperties {
  var cancelBehavior: icon | escape | none
  var dialogTitle: String | Null
  var dragAffordance: `title-bar` | none
  var initialVisibility: hide | show
  var modality: modal | modeless
  var position: Position
  var resizeBehavior: resizable | none
  var role: String
  @JSName("translations")
  var translations_ojDialogSettableProperties: Anon_LabelCloseIcon
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
    translations: Anon_LabelCloseIcon,
    dialogTitle: String = null
  ): ojDialogSettableProperties = {
    val __obj = js.Dynamic.literal(cancelBehavior = cancelBehavior.asInstanceOf[js.Any], dragAffordance = dragAffordance.asInstanceOf[js.Any], initialVisibility = initialVisibility.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resizeBehavior = resizeBehavior.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDialogSettableProperties]
  }
}

