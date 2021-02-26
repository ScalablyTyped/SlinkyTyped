package typingsSlinky.leafletGeosearch

import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.node
import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.relation
import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.way
import typingsSlinky.leafletGeosearch.mod.LatLngLiteral
import typingsSlinky.leafletGeosearch.mod.PointTuple
import typingsSlinky.leafletGeosearch.mod.SearchResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Address extends StObject {
    
    var address: City = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: City): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: City): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AdminDistrict extends StObject {
    
    var adminDistrict: String = js.native
    
    var adminDistrict2: String = js.native
    
    var countryRegion: String = js.native
    
    var formattedAddress: String = js.native
    
    var landmark: String = js.native
    
    var locality: String = js.native
    
    var neighborhood: String = js.native
  }
  object AdminDistrict {
    
    @scala.inline
    def apply(
      adminDistrict: String,
      adminDistrict2: String,
      countryRegion: String,
      formattedAddress: String,
      landmark: String,
      locality: String,
      neighborhood: String
    ): AdminDistrict = {
      val __obj = js.Dynamic.literal(adminDistrict = adminDistrict.asInstanceOf[js.Any], adminDistrict2 = adminDistrict2.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], landmark = landmark.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdminDistrict]
    }
    
    @scala.inline
    implicit class AdminDistrictMutableBuilder[Self <: AdminDistrict] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdminDistrict(value: String): Self = StObject.set(x, "adminDistrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminDistrict2(value: String): Self = StObject.set(x, "adminDistrict2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryRegion(value: String): Self = StObject.set(x, "countryRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLandmark(value: String): Self = StObject.set(x, "landmark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeighborhood(value: String): Self = StObject.set(x, "neighborhood", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined leaflet-geosearch.leaflet-geosearch.BingProviderResultPoint & {  calculationMethod :string,   usageTypes :std.Array<string>} */
  @js.native
  trait BingProviderResultPointca extends StObject {
    
    var calculationMethod: String = js.native
    
    var coordinates: PointTuple = js.native
    
    var `type`: String = js.native
    
    var usageTypes: js.Array[String] = js.native
  }
  object BingProviderResultPointca {
    
    @scala.inline
    def apply(calculationMethod: String, coordinates: PointTuple, `type`: String, usageTypes: js.Array[String]): BingProviderResultPointca = {
      val __obj = js.Dynamic.literal(calculationMethod = calculationMethod.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], usageTypes = usageTypes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BingProviderResultPointca]
    }
    
    @scala.inline
    implicit class BingProviderResultPointcaMutableBuilder[Self <: BingProviderResultPointca] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculationMethod(value: String): Self = StObject.set(x, "calculationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinates(value: PointTuple): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageTypes(value: js.Array[String]): Self = StObject.set(x, "usageTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageTypesVarargs(value: String*): Self = StObject.set(x, "usageTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Button extends StObject {
    
    var button: js.UndefOr[String] = js.native
    
    var container: js.UndefOr[String] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var input: js.UndefOr[String] = js.native
    
    var msgbox: js.UndefOr[String] = js.native
    
    var resetButton: js.UndefOr[String] = js.native
  }
  object Button {
    
    @scala.inline
    def apply(): Button = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Button]
    }
    
    @scala.inline
    implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setMsgbox(value: String): Self = StObject.set(x, "msgbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgboxUndefined: Self = StObject.set(x, "msgbox", js.undefined)
      
      @scala.inline
      def setResetButton(value: String): Self = StObject.set(x, "resetButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetButtonUndefined: Self = StObject.set(x, "resetButton", js.undefined)
    }
  }
  
  @js.native
  trait City extends StObject {
    
    var city: String = js.native
    
    var country: String = js.native
    
    var country_code: String = js.native
    
    var county: String = js.native
    
    var house_number: String = js.native
    
    var postcode: String = js.native
    
    var road: String = js.native
    
    var state: String = js.native
    
    var state_district: String = js.native
    
    var town: String = js.native
  }
  object City {
    
    @scala.inline
    def apply(
      city: String,
      country: String,
      country_code: String,
      county: String,
      house_number: String,
      postcode: String,
      road: String,
      state: String,
      state_district: String,
      town: String
    ): City = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], house_number = house_number.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], state_district = state_district.asInstanceOf[js.Any], town = town.asInstanceOf[js.Any])
      __obj.asInstanceOf[City]
    }
    
    @scala.inline
    implicit class CityMutableBuilder[Self <: City] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHouse_number(value: String): Self = StObject.set(x, "house_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState_district(value: String): Self = StObject.set(x, "state_district", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTown(value: String): Self = StObject.set(x, "town", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Location extends StObject {
    
    var location: LatLngLiteral = js.native
    
    var location_type: String = js.native
    
    var viewport: Northeast = js.native
  }
  object Location {
    
    @scala.inline
    def apply(location: LatLngLiteral, location_type: String, viewport: Northeast): Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation_type(value: String): Self = StObject.set(x, "location_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewport(value: Northeast): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Northeast extends StObject {
    
    var northeast: LatLngLiteral = js.native
    
    var southwest: LatLngLiteral = js.native
  }
  object Northeast {
    
    @scala.inline
    def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): Northeast = {
      val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Northeast]
    }
    
    @scala.inline
    implicit class NortheastMutableBuilder[Self <: Northeast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNortheast(value: LatLngLiteral): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouthwest(value: LatLngLiteral): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Osmid extends StObject {
    
    var osm_id: js.UndefOr[Double] = js.native
    
    var osm_type: js.UndefOr[node | way | relation] = js.native
  }
  object Osmid {
    
    @scala.inline
    def apply(): Osmid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Osmid]
    }
    
    @scala.inline
    implicit class OsmidMutableBuilder[Self <: Osmid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOsm_id(value: Double): Self = StObject.set(x, "osm_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsm_idUndefined: Self = StObject.set(x, "osm_id", js.undefined)
      
      @scala.inline
      def setOsm_type(value: node | way | relation): Self = StObject.set(x, "osm_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsm_typeUndefined: Self = StObject.set(x, "osm_type", js.undefined)
    }
  }
  
  @js.native
  trait Query extends StObject {
    
    var query: String = js.native
    
    var result: SearchResult[js.Object] = js.native
  }
  object Query {
    
    @scala.inline
    def apply(query: String, result: SearchResult[js.Object]): Query = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: SearchResult[js.Object]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Raw extends StObject {
    
    var raw: Osmid = js.native
  }
  object Raw {
    
    @scala.inline
    def apply(raw: Osmid): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    @scala.inline
    implicit class RawMutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: Osmid): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
