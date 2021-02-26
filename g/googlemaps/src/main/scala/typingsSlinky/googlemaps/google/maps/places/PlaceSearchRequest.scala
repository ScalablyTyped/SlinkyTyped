package typingsSlinky.googlemaps.google.maps.places

import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.LatLngBoundsLiteral
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceSearchRequest extends StObject {
  
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
  
  var keyword: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.native
  
  var maxPriceLevel: js.UndefOr[Double] = js.native
  
  var minPriceLevel: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var openNow: js.UndefOr[Boolean] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var rankBy: js.UndefOr[RankBy] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var types: js.UndefOr[js.Array[String]] = js.native
}
object PlaceSearchRequest {
  
  @scala.inline
  def apply(): PlaceSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceSearchRequest]
  }
  
  @scala.inline
  implicit class PlaceSearchRequestMutableBuilder[Self <: PlaceSearchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    @scala.inline
    def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaxPriceLevel(value: Double): Self = StObject.set(x, "maxPriceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPriceLevelUndefined: Self = StObject.set(x, "maxPriceLevel", js.undefined)
    
    @scala.inline
    def setMinPriceLevel(value: Double): Self = StObject.set(x, "minPriceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPriceLevelUndefined: Self = StObject.set(x, "minPriceLevel", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpenNow(value: Boolean): Self = StObject.set(x, "openNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenNowUndefined: Self = StObject.set(x, "openNow", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRankBy(value: RankBy): Self = StObject.set(x, "rankBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankByUndefined: Self = StObject.set(x, "rankBy", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
