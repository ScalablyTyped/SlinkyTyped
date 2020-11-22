package typingsSlinky.lockfileLintApi.mod

import typingsSlinky.lockfileLintApi.lockfileLintApiStrings.error
import typingsSlinky.lockfileLintApi.lockfileLintApiStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lockfileLintApi.mod.ValidationError
  - typingsSlinky.lockfileLintApi.mod.ValidationSuccess
*/
trait ValidationResult extends js.Object
object ValidationResult {
  
  @scala.inline
  def ValidationError(errors: js.Array[Error], `type`: error): ValidationResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
  
  @scala.inline
  def ValidationSuccess(`object`: Packages, `type`: success): ValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
}
