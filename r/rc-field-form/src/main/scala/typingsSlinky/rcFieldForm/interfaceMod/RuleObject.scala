package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.rcFieldFormStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcFieldForm.interfaceMod.AggregationRule
  - typingsSlinky.rcFieldForm.interfaceMod.ArrayRule
*/
trait RuleObject extends js.Object
object RuleObject {
  
  @scala.inline
  def AggregationRule(): RuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleObject]
  }
  
  @scala.inline
  def ArrayRule(`type`: array): RuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleObject]
  }
}
