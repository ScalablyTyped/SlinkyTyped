package typingsSlinky.heremaps.H.service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traffic {
  
  /**
    * TrafficIncindentsService provides functionality to the low level traffic incidents api Traffic API documentation where it is possible to retrieve traffic incident information on a
    * tile basis
    */
  @js.native
  trait Service extends AbstractRestService {
    
    /**
      * This method requests traffic incidents based on the service parameters provided.
      * @param serviceParams {H.service.ServiceParameters}
      * @param onResponse {function(H.service.ServiceResult)}
      * @param onError {function()}
      * @returns {H.service.JsonpRequestHandle}
      */
    def requestIncidents(
      serviceParams: ServiceParameters,
      onResponse: js.Function1[/* result */ ServiceResult, Unit],
      onError: js.Function1[/* error */ js.Error, Unit]
    ): JsonpRequestHandle = js.native
    
    /**
      * This method requests traffic incident information by tile coordinates
      * @param x {number} - tile column number
      * @param y {number} - tile row number
      * @param z {number} - zoom level
      * @param onResponse {function(H.service.ServiceResult)} - callback to handle service resposne
      * @param onError {function()} - callback to habdle communication error
      * @param opt_serviceParams {H.service.ServiceParameters=} - optional service parameters to be added to the request
      * @returns {H.service.JsonpRequestHandle}
      */
    def requestIncidentsByTile(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.Function1[/* result */ ServiceResult, Unit],
      onError: js.Function1[/* error */ js.Error, Unit]
    ): JsonpRequestHandle = js.native
    def requestIncidentsByTile(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.Function1[/* result */ ServiceResult, Unit],
      onError: js.Function1[/* error */ js.Error, Unit],
      opt_serviceParams: ServiceParameters
    ): JsonpRequestHandle = js.native
  }
  object Service {
    
    /**
      * @property subDomain {string=} - the sub-domain of the traffic incidents service relative to the platform's base URL, default is 'traffic'
      * @property path {string=} - the path of the traffic incidents service, default is 'traffic/6.1'
      * @property baseUrl {H.service.Url=} - an optional base URL if it differs from the platform's default base URL
      */
    @js.native
    trait Options extends StObject {
      
      var baseUrl: js.UndefOr[Url] = js.native
      
      var path: js.UndefOr[String] = js.native
      
      var subDomain: js.UndefOr[String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
      }
    }
  }
}
