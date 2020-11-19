package typingsSlinky.envToObject.mod

import typingsSlinky.envToObject.envToObjectStrings.boolean
import typingsSlinky.envToObject.envToObjectStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.envToObject.mod.IntegerMapping
  - typingsSlinky.envToObject.mod.BooleanMapping
  - typingsSlinky.envToObject.mod.GenericMapping
*/
trait Mapping extends js.Object
object Mapping {
  
  @scala.inline
  def IntegerMapping(keypath: String, radix: Double, `type`: integer): Mapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any], radix = radix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  
  @scala.inline
  def BooleanMapping(strict: Boolean, `type`: boolean): Mapping = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
  
  @scala.inline
  def GenericMapping(keypath: String): Mapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
}
