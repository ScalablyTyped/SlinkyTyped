package typingsSlinky.rcFieldForm.useFormMod

import typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
import typingsSlinky.rcFieldForm.rcFieldFormStrings.validateField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateAction extends ReducerAction {
  var namePath: InternalNamePath
  var triggerName: String
  var `type`: validateField
}

object ValidateAction {
  @scala.inline
  def apply(namePath: InternalNamePath, triggerName: String, `type`: validateField): ValidateAction = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateAction]
  }
}

