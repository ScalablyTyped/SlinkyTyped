package typingsSlinky.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderResult extends StObject {
  
  var address: String = js.native
  
  var addressComponents: AddressComponent = js.native
  
  var business: String = js.native
  
  var point: Point = js.native
  
  var surroundingPoi: js.Array[LocalResultPoi] = js.native
}
object GeocoderResult {
  
  @scala.inline
  def apply(
    address: String,
    addressComponents: AddressComponent,
    business: String,
    point: Point,
    surroundingPoi: js.Array[LocalResultPoi]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressComponents = addressComponents.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], surroundingPoi = surroundingPoi.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResult]
  }
  
  @scala.inline
  implicit class GeocoderResultMutableBuilder[Self <: GeocoderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressComponents(value: AddressComponent): Self = StObject.set(x, "addressComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundingPoi(value: js.Array[LocalResultPoi]): Self = StObject.set(x, "surroundingPoi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundingPoiVarargs(value: LocalResultPoi*): Self = StObject.set(x, "surroundingPoi", js.Array(value :_*))
  }
}
