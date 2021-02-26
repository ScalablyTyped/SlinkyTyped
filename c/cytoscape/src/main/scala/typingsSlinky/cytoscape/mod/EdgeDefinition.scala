package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeDefinition extends ElementDefinition {
  
  @JSName("data")
  var data_EdgeDefinition: EdgeDataDefinition = js.native
}
object EdgeDefinition {
  
  @scala.inline
  def apply(data: EdgeDataDefinition): EdgeDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDefinition]
  }
  
  @scala.inline
  implicit class EdgeDefinitionMutableBuilder[Self <: EdgeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: EdgeDataDefinition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
