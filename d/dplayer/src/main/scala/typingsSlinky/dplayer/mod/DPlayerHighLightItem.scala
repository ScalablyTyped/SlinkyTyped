package typingsSlinky.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayerHighLightItem extends StObject {
  
  var text: String = js.native
  
  var time: Double = js.native
}
object DPlayerHighLightItem {
  
  @scala.inline
  def apply(text: String, time: Double): DPlayerHighLightItem = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerHighLightItem]
  }
  
  @scala.inline
  implicit class DPlayerHighLightItemMutableBuilder[Self <: DPlayerHighLightItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
