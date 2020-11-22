package typingsSlinky.asana.mod.resources.Events

import typingsSlinky.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asana.asana.resources.Events.EventResource & std.Partial<asana.asana.resources.Stories.Type> */
@js.native
trait EventStory extends js.Object {
  
  var created_at: js.UndefOr[String] = js.native
  
  var created_by: js.UndefOr[Resource] = js.native
  
  var dispatchDelete: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* dispatchOptions */ js.UndefOr[js.Any], 
      typingsSlinky.bluebird.mod.^[_]
    ]
  ] = js.native
  /**
    * Dispatches a DELETE request to the API. The expected response is an
    * empty resource.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param dispatchOptions?
    * @return
    */
  def dispatchDelete(path: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchDelete(path: String, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  var dispatchGet: js.UndefOr[
    js.Function3[
      /* path */ String, 
      /* query */ js.UndefOr[js.Any], 
      /* dispatchOptions */ js.UndefOr[js.Any], 
      typingsSlinky.bluebird.mod.^[_]
    ]
  ] = js.native
  /**
    * Dispatches a GET request to the API, where the expected result is a
    * single resource.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def dispatchGet(path: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchGet(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchGet(path: String, query: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchGet(path: String, query: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  var dispatchGetCollection: js.UndefOr[
    js.Function3[
      /* path */ String, 
      /* query */ js.UndefOr[js.Any], 
      /* dispatchOptions */ js.UndefOr[js.Any], 
      typingsSlinky.bluebird.mod.^[_]
    ]
  ] = js.native
  /**
    * Dispatches a GET request to the API, where the expected result is a
    * collection.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def dispatchGetCollection(path: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchGetCollection(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchGetCollection(path: String, query: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchGetCollection(path: String, query: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  var dispatchPost: js.UndefOr[
    js.Function3[
      /* path */ String, 
      /* query */ js.UndefOr[js.Any], 
      /* dispatchOptions */ js.UndefOr[js.Any], 
      typingsSlinky.bluebird.mod.^[_]
    ]
  ] = js.native
  /**
    * Dispatches a POST request to the API, where the expected response is a
    * single resource.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def dispatchPost(path: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchPost(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchPost(path: String, query: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchPost(path: String, query: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  var dispatchPut: js.UndefOr[
    js.Function3[
      /* path */ String, 
      /* query */ js.UndefOr[js.Any], 
      /* dispatchOptions */ js.UndefOr[js.Any], 
      typingsSlinky.bluebird.mod.^[_]
    ]
  ] = js.native
  /**
    * Dispatches a POST request to the API, where the expected response is a
    * single resource.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def dispatchPut(path: String): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchPut(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchPut(path: String, query: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  def dispatchPut(path: String, query: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[_] = js.native
  
  var gid: String with js.UndefOr[String] = js.native
  
  var hearts: js.UndefOr[js.Array[typingsSlinky.asana.mod.resources.Stories.Type]] = js.native
  
  var html_text: js.UndefOr[String] = js.native
  
  var id: Double with js.UndefOr[Double] = js.native
  
  var name: String with js.UndefOr[String] = js.native
  
  var resource_subtype: String = js.native
  
  var resource_type: String = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[Resource] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
