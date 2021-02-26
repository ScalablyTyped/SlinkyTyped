package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingAddress extends StObject {
  
  var city: String = js.native
  
  var country_code: String = js.native
  
  var post_code: String = js.native
  
  var state: String = js.native
  
  var street_line1: String = js.native
  
  var street_line2: String = js.native
}
object ShippingAddress {
  
  @scala.inline
  def apply(
    city: String,
    country_code: String,
    post_code: String,
    state: String,
    street_line1: String,
    street_line2: String
  ): ShippingAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], post_code = post_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street_line1 = street_line1.asInstanceOf[js.Any], street_line2 = street_line2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingAddress]
  }
  
  @scala.inline
  implicit class ShippingAddressMutableBuilder[Self <: ShippingAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost_code(value: String): Self = StObject.set(x, "post_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet_line1(value: String): Self = StObject.set(x, "street_line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreet_line2(value: String): Self = StObject.set(x, "street_line2", value.asInstanceOf[js.Any])
  }
}
