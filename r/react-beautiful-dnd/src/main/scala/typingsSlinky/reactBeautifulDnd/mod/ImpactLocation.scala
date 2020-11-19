package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.COMBINE
import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.REORDER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBeautifulDnd.mod.ReorderImpact
  - typingsSlinky.reactBeautifulDnd.mod.CombineImpact
*/
trait ImpactLocation extends js.Object
object ImpactLocation {
  
  @scala.inline
  def ReorderImpact(destination: DraggableLocation, `type`: REORDER): ImpactLocation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpactLocation]
  }
  
  @scala.inline
  def CombineImpact(combine: Combine, `type`: COMBINE): ImpactLocation = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpactLocation]
  }
}
