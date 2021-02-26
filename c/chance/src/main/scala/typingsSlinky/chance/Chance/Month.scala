package typingsSlinky.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Month extends StObject {
  
  var name: String = js.native
  
  var numeric: String = js.native
  
  var short_name: String = js.native
}
object Month {
  
  @scala.inline
  def apply(name: String, numeric: String, short_name: String): Month = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Month]
  }
  
  @scala.inline
  implicit class MonthMutableBuilder[Self <: Month] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeric(value: String): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
  }
}
