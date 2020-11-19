package typingsSlinky.protobufjsFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@protobufjs/fetch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Fetches the contents of a file.
    * @memberof util
    * @param {string} filename File path or url
    * @param {FetchOptions} options Fetch options
    * @param {FetchCallback} callback Callback function
    * @returns {undefined}
    */
  def apply(filename: String, options: FetchOptions, callback: FetchCallback): Unit = js.native
  /**
    * Fetches the contents of a file.
    * @name util.fetch
    * @function
    * @param {string} path File path or url
    * @param {FetchOptions} [options] Fetch options
    * @returns {Promise<string|Uint8Array>} Promise
    * @variation 3
    */
  def apply(path: String): js.Promise[String | js.typedarray.Uint8Array] = js.native
  /**
    * Fetches the contents of a file.
    * @name util.fetch
    * @function
    * @param {string} path File path or url
    * @param {FetchCallback} callback Callback function
    * @returns {undefined}
    * @variation 2
    */
  def apply(path: String, callback: FetchCallback): Unit = js.native
  def apply(path: String, options: FetchOptions): js.Promise[String | js.typedarray.Uint8Array] = js.native
}
