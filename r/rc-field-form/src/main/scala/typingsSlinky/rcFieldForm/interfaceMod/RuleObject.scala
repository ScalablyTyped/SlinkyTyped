package typingsSlinky.rcFieldForm.interfaceMod

import typingsSlinky.rcFieldForm.rcFieldFormStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcFieldForm.interfaceMod.AggregationRule
  - typingsSlinky.rcFieldForm.interfaceMod.ArrayRule
*/
trait RuleObject extends StObject
object RuleObject {
  
  @scala.inline
  def AggregationRule(): typingsSlinky.rcFieldForm.interfaceMod.AggregationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.rcFieldForm.interfaceMod.AggregationRule]
  }
  
  @scala.inline
  def ArrayRule(`type`: array): typingsSlinky.rcFieldForm.interfaceMod.ArrayRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rcFieldForm.interfaceMod.ArrayRule]
  }
}
