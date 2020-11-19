package typingsSlinky.amplify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  /***
    * Request a resource.
    * resourceId: Identifier string for the resource.
    * data: A set of key/value pairs of data to be sent to the resource.
    * callback: A function to invoke if the resource is retrieved successfully.
    */
  def apply(resourceId: String): Unit = js.native
  def apply(resourceId: String, hash: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def apply(resourceId: String, hash: js.Any): Unit = js.native
  def apply(resourceId: String, hash: js.Any, callback: js.Function): Unit = js.native
  /***
    * Request a resource.
    * settings: A set of key/value pairs of settings for the request.
    *   resourceId: Identifier string for the resource.
    *   data (optional): Data associated with the request.
    *   success (optional): Function to invoke on success.
    *   error (optional): Function to invoke on error.
    */
  def apply(settings: RequestSettings): js.Any = js.native
  
  var cache: js.Any = js.native
  
  var decoders: Decoders = js.native
  
  /***
    * Define a resource.
    * resourceId: Identifier string for the resource.
    * requestType: The type of data retrieval method from the server. See the request types sections for more information.
    * settings: A set of key/value pairs that relate to the server communication technology. The following settings are available:
    *   Any settings found in jQuery.ajax().
    *   cache: See the cache section for more details.
    *   decoder: See the decoder section for more details.
    */
  def define(resourceId: String, requestType: String): Unit = js.native
  def define(resourceId: String, requestType: String, settings: AjaxSettings): Unit = js.native
  /***
    * Define a custom request.
    * resourceId: Identifier string for the resource.
    * resource: Function to handle requests. Receives a hash with the following properties:
    *   resourceId: Identifier string for the resource.
    *   data: Data provided by the user.
    *   success: Callback to invoke on success.
    *   error: Callback to invoke on error.
    */
  def define(resourceId: String, resource: js.Function1[/* settings */ RequestSettings, Unit]): Unit = js.native
}
