package typingsSlinky.esriLeafletGeocoder

import typingsSlinky.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Address extends StObject {
    
    var address: String = js.native
    
    var latlng: LatLng_ = js.native
  }
  object Address {
    
    @scala.inline
    def apply(address: String, latlng: LatLng_): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatlng(value: LatLng_): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Results extends StObject {
    
    var results: js.Array[_] = js.native
  }
  object Results {
    
    @scala.inline
    def apply(results: js.Array[_]): Results = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResults(value: js.Array[_]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: js.Any*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
}
