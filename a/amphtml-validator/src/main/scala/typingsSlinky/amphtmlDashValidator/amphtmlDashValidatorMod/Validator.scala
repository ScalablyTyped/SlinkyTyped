package typingsSlinky.amphtmlDashValidator.amphtmlDashValidatorMod

import typingsSlinky.node.vmMod.Context
import typingsSlinky.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amphtml-validator", "Validator")
@js.native
class Validator () extends Script {
  var sandbox: Context = js.native
  def validateString(stringToValidate: String): ValidationResult = js.native
}

