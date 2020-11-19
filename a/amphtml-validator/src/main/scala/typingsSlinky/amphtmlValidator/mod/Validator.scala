package typingsSlinky.amphtmlValidator.mod

import typingsSlinky.node.vmMod.Context
import typingsSlinky.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amphtml-validator", "Validator")
@js.native
class Validator () extends Script {
  
  var sandbox: Context = js.native
  
  def validateString(stringToValidate: String): ValidationResult = js.native
  def validateString(stringToValidate: String, htmlFormat: String): ValidationResult = js.native
}
