package typingsSlinky.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressComponent[T] extends StObject {
  
  /** is the full text description or name of the address component as returned by the Geocoder. */
  var long_name: String = js.native
  
  /**
    * is an abbreviated textual name for the address component, if available.
    * For example, an address component for the state of Alaska may have a `long_name` of "Alaska" and a `short_name` of "AK"
    * using the 2-letter postal abbreviation.
    */
  var short_name: String = js.native
  
  /** is an array indicating the *type* of the address component. */
  var types: js.Array[T] = js.native
}
object AddressComponent {
  
  @scala.inline
  def apply[T](long_name: String, short_name: String, types: js.Array[T]): AddressComponent[T] = {
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressComponent[T]]
  }
  
  @scala.inline
  implicit class AddressComponentMutableBuilder[Self <: AddressComponent[_], T] (val x: Self with AddressComponent[T]) extends AnyVal {
    
    @scala.inline
    def setLong_name(value: String): Self = StObject.set(x, "long_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[T]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: T*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
