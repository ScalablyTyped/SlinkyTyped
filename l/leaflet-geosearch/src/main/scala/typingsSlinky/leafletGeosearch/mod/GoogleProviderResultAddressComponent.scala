package typingsSlinky.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleProviderResultAddressComponent extends StObject {
  
  var long_name: String = js.native
  
  var short_name: String = js.native
  
  var types: js.Array[String] = js.native
}
object GoogleProviderResultAddressComponent {
  
  @scala.inline
  def apply(long_name: String, short_name: String, types: js.Array[String]): GoogleProviderResultAddressComponent = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleProviderResultAddressComponent]
  }
  
  @scala.inline
  implicit class GoogleProviderResultAddressComponentMutableBuilder[Self <: GoogleProviderResultAddressComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong_name(value: String): Self = StObject.set(x, "long_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
