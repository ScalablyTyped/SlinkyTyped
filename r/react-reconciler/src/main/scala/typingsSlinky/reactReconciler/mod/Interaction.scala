package typingsSlinky.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// scheduler/Tracing
@js.native
trait Interaction extends StObject {
  
  var __count: Double = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var timestamp: Double = js.native
}
object Interaction {
  
  @scala.inline
  def apply(__count: Double, id: Double, name: String, timestamp: Double): Interaction = {
    val __obj = js.Dynamic.literal(__count = __count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction]
  }
  
  @scala.inline
  implicit class InteractionMutableBuilder[Self <: Interaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__count(value: Double): Self = StObject.set(x, "__count", value.asInstanceOf[js.Any])
  }
}
