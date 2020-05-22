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
  var translations_ojDialogSettableProperties: LabelCloseIcon
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
    translations: LabelCloseIcon,
    dialogTitle: String = null
  ): ojDialogSettableProperties = {
    val __obj = js.Dynamic.literal(cancelBehavior = cancelBehavior.asInstanceOf[js.Any], dragAffordance = dragAffordance.asInstanceOf[js.Any], initialVisibility = initialVisibility.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resizeBehavior = resizeBehavior.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], dialogTitle = dialogTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDialogSettableProperties]
  }
}

