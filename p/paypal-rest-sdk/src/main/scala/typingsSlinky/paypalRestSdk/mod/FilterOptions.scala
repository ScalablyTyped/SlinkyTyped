package typingsSlinky.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOptions extends StObject {
  
  var end_time: String = js.native
  
  var page_size: Double = js.native
  
  var start_time: String = js.native
}
object FilterOptions {
  
  @scala.inline
  def apply(end_time: String, page_size: Double, start_time: String): FilterOptions = {
    val __obj = js.Dynamic.literal(end_time = end_time.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
  
  @scala.inline
  implicit class FilterOptionsMutableBuilder[Self <: FilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
