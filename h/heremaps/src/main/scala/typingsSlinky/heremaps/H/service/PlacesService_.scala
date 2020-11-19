package typingsSlinky.heremaps.H.service

import typingsSlinky.heremaps.H.service.PlacesService.EntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Places service implements a low level places RestApi access. Please refer to Restful API documentation for providing parameters and handling response objects.
  */
@js.native
trait PlacesService_ extends AbstractRestService {
  
  /**
    * Function triggers places api 'around' entry point. Please refer to documentation for parameter specification and response handling.
    * @param aroundParams {H.service.ServiceParameters} - places api around entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def around(
    aroundParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'categories' entry point. Please refer to documentation for parameter specification and response handling.
    * @param categoriesParams {H.service.ServiceParameters} - places api here entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def categories(
    categoriesParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'explore' entry point. Please refer to documentation for parameter specification and response handling.
    * @param exploreParams {H.service.ServiceParameters} - places api explore entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def explore(
    exploreParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * This method should be used to follow hyperlinks available in results returned by dicovery queries.
    * @param hyperlink {string}
    * @param onResult {Function}
    * @param onError {Function}
    * @param opt_additionalParameters {Object=} - additional parameters to send with request
    * @returns {H.service.JsonpRequestHandle} - jsonp resquest handle
    */
  def follow(
    hyperlink: String,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): JsonpRequestHandle = js.native
  def follow(
    hyperlink: String,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit],
    opt_additionalParameters: js.Object
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'here' entry point. Please refer to documentation for parameter specification and response handling.
    * @param hereParams {H.service.ServiceParameters} - places api here entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def here(
    hereParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * This is generic method to query places RestAPI.
    * @param entryPoint {H.service.PlacesService.EntryPoint} - can be one of available entry points H.service.PlacesService.EntryPoint i.e value of H.service.PlacesService.EntryPoint.SEARCH
    * @param entryPointParams {Object} - parameter map key value pairs will be transformed into the url key=value parametes. For entry point parameters description please refer to places
    * restful api documentation documentation for available parameters for chose entry point
    * @param onResult {Function} - callback which is called when result is returned
    * @param onError {Function} - callback which is called when error occured (i.e request timeout)
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def request(
    entryPoint: EntryPoint,
    entryPointParams: js.Object,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'search' entry point. Please refer to documentation for parameter specification and response handling.
    * @param searchParams {H.service.ServiceParameters} - places api search entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def search(
    searchParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'suggestions' entry point. Please refer to documentation for parameter specification and response handling.
    * @param suggestParams {H.service.ServiceParameters} - places api suggest entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def suggest(
    suggestParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): JsonpRequestHandle = js.native
}
