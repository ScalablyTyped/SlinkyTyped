package typingsSlinky.heremaps.H.service.traffic

import typingsSlinky.heremaps.H.service.AbstractRestService
import typingsSlinky.heremaps.H.service.JsonpRequestHandle
import typingsSlinky.heremaps.H.service.ServiceParameters
import typingsSlinky.heremaps.H.service.ServiceResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TrafficIncindentsService provides functionality to the low level traffic incidents api Traffic API documentation where it is possible to retrieve traffic incident information on a
  * tile basis
  */
@js.native
trait Service_ extends AbstractRestService {
  
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
