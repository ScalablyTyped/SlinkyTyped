package typingsSlinky.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAction extends StObject {
  
  def action(): Unit = js.native
  
  var id: String | Double = js.native
  
  var text: String = js.native
}
object ChartAction {
  
  @scala.inline
  def apply(action: () => Unit, id: String | Double, text: String): ChartAction = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction0(action), id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAction]
  }
  
  @scala.inline
  implicit class ChartActionMutableBuilder[Self <: ChartAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: () => Unit): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
