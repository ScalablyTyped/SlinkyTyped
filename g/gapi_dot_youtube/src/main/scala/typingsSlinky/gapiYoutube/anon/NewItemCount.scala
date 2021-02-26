package typingsSlinky.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewItemCount extends StObject {
  
  /**
    *
    */
  var newItemCount: Double = js.native
  
  /**
    *
    */
  var totalItemCount: Double = js.native
}
object NewItemCount {
  
  @scala.inline
  def apply(newItemCount: Double, totalItemCount: Double): NewItemCount = {
    val __obj = js.Dynamic.literal(newItemCount = newItemCount.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewItemCount]
  }
  
  @scala.inline
  implicit class NewItemCountMutableBuilder[Self <: NewItemCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewItemCount(value: Double): Self = StObject.set(x, "newItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
  }
}
