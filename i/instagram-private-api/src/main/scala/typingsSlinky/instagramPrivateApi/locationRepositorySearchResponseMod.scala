package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.statusResponseMod.StatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationRepositorySearchResponseMod {
  
  @js.native
  trait LocationRepositorySearchResponseRootObject extends StatusResponse {
    
    var rank_token: String = js.native
    
    var request_id: String = js.native
    
    var venues: js.Array[LocationRepositorySearchResponseVenuesItem] = js.native
  }
  object LocationRepositorySearchResponseRootObject {
    
    @scala.inline
    def apply(
      rank_token: String,
      request_id: String,
      status: String,
      venues: js.Array[LocationRepositorySearchResponseVenuesItem]
    ): LocationRepositorySearchResponseRootObject = {
      val __obj = js.Dynamic.literal(rank_token = rank_token.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], venues = venues.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationRepositorySearchResponseRootObject]
    }
    
    @scala.inline
    implicit class LocationRepositorySearchResponseRootObjectMutableBuilder[Self <: LocationRepositorySearchResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVenues(value: js.Array[LocationRepositorySearchResponseVenuesItem]): Self = StObject.set(x, "venues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVenuesVarargs(value: LocationRepositorySearchResponseVenuesItem*): Self = StObject.set(x, "venues", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LocationRepositorySearchResponseVenuesItem extends StObject {
    
    var address: String = js.native
    
    var external_id: String = js.native
    
    var external_id_source: String = js.native
    
    var lat: Double = js.native
    
    var lng: Double = js.native
    
    var minimum_age: Double = js.native
    
    var name: String = js.native
  }
  object LocationRepositorySearchResponseVenuesItem {
    
    @scala.inline
    def apply(
      address: String,
      external_id: String,
      external_id_source: String,
      lat: Double,
      lng: Double,
      minimum_age: Double,
      name: String
    ): LocationRepositorySearchResponseVenuesItem = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], external_id_source = external_id_source.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], minimum_age = minimum_age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationRepositorySearchResponseVenuesItem]
    }
    
    @scala.inline
    implicit class LocationRepositorySearchResponseVenuesItemMutableBuilder[Self <: LocationRepositorySearchResponseVenuesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_id_source(value: String): Self = StObject.set(x, "external_id_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimum_age(value: Double): Self = StObject.set(x, "minimum_age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
