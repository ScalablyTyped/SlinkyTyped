package typingsSlinky.plugapi.mod.Event

import typingsSlinky.plugapi.mod.User.DJ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DJListUpdate extends StObject {
  
  var djs: js.Array[DJ] = js.native
  
  var remove: String = js.native
}
object DJListUpdate {
  
  @scala.inline
  def apply(djs: js.Array[DJ], remove: String): DJListUpdate = {
    val __obj = js.Dynamic.literal(djs = djs.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[DJListUpdate]
  }
  
  @scala.inline
  implicit class DJListUpdateMutableBuilder[Self <: DJListUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDjs(value: js.Array[DJ]): Self = StObject.set(x, "djs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDjsVarargs(value: DJ*): Self = StObject.set(x, "djs", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
