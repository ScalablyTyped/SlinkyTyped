package typingsSlinky.asana.mod.resources

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.asana.mod.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceStatic extends /**
  * @param dispatcher
  */
Instantiable1[/* dispatcher */ Dispatcher, Resource] {
  
  /**
    * @type {number} Default number of items to get per page.
    */
  var DEFAULT_PAGE_LIMIT: Double = js.native
  
  /**
    * Helper method that dispatches a GET request to the API, where the expected
    * result is a collection.
    * @param  {Dispatcher} dispatcher
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise<SimpleResourceList>} The Collection response for the request
    * @param dispatcher
    * @param path
    * @param query?
    * @param dispatchOptions?
    */
  def getCollection(dispatcher: js.Any, path: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def getCollection(dispatcher: js.Any, path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def getCollection(dispatcher: js.Any, path: String, query: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def getCollection(dispatcher: js.Any, path: String, query: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  /**
    * Helper method for any request Promise from the Dispatcher, unwraps the `data`
    * value from the payload.
    * @param  {Promise} promise A promise returned from a `Dispatcher` request.
    * @return {Promise}         The `data` portion of the response payload.
    * @param promise
    * @return
    */
  def unwrap(promise: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
}
