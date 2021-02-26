package typingsSlinky.hafasClient.mod

import typingsSlinky.hafasClient.hafasClientStrings.station
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A station is a larger building or area that can be identified by a name.
  * It is usually represented by a single node on a public transport map.
  * Whereas a stop usually specifies a location, a station often is a broader area
  * that may span across multiple levels or buildings.
  */
@js.native
trait Station extends StObject {
  
  var distance: js.UndefOr[Double] = js.native
  
  var entrances: js.UndefOr[js.Array[Location]] = js.native
  
  var facilities: js.UndefOr[Facilities] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isMeta: js.UndefOr[Boolean] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var products: js.UndefOr[Products] = js.native
  
  /** region ids */
  var regions: js.UndefOr[js.Array[String]] = js.native
  
  var reisezentrumOpeningHours: js.UndefOr[ReisezentrumOpeningHours] = js.native
  
  var station: js.UndefOr[Station] = js.native
  
  var stops: js.UndefOr[js.Array[Station | Stop | Location]] = js.native
  
  var transitAuthority: js.UndefOr[String] = js.native
  
  var `type`: station = js.native
}
object Station {
  
  @scala.inline
  def apply(`type`: station): Station = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Station]
  }
  
  @scala.inline
  implicit class StationMutableBuilder[Self <: Station] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setEntrances(value: js.Array[Location]): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    @scala.inline
    def setEntrancesVarargs(value: Location*): Self = StObject.set(x, "entrances", js.Array(value :_*))
    
    @scala.inline
    def setFacilities(value: Facilities): Self = StObject.set(x, "facilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacilitiesUndefined: Self = StObject.set(x, "facilities", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsMeta(value: Boolean): Self = StObject.set(x, "isMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMetaUndefined: Self = StObject.set(x, "isMeta", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    @scala.inline
    def setReisezentrumOpeningHours(value: ReisezentrumOpeningHours): Self = StObject.set(x, "reisezentrumOpeningHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReisezentrumOpeningHoursUndefined: Self = StObject.set(x, "reisezentrumOpeningHours", js.undefined)
    
    @scala.inline
    def setStation(value: Station): Self = StObject.set(x, "station", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStationUndefined: Self = StObject.set(x, "station", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[Station | Stop | Location]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: (Station | Stop | Location)*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setTransitAuthority(value: String): Self = StObject.set(x, "transitAuthority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitAuthorityUndefined: Self = StObject.set(x, "transitAuthority", js.undefined)
    
    @scala.inline
    def setType(value: station): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
