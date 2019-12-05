package typingsSlinky.googleDashGax.googleDashGaxMod.protobuf.util

import typingsSlinky.protobufjs.protobufjsMod.FetchCallback
import typingsSlinky.protobufjs.protobufjsMod.IFetchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "protobuf.util.fetch")
@js.native
object fetch extends js.Object {
  /**
    * Fetches the contents of a file.
    * @param filename File path or url
    * @param options Fetch options
    * @param callback Callback function
    */
  def apply(filename: String, options: IFetchOptions, callback: FetchCallback): Unit = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param [options] Fetch options
    * @returns Promise
    */
  def apply(path: String): js.Promise[String | scala.scalajs.js.typedarray.Uint8Array] = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param callback Callback function
    */
  def apply(path: String, callback: FetchCallback): Unit = js.native
  def apply(path: String, options: IFetchOptions): js.Promise[String | scala.scalajs.js.typedarray.Uint8Array] = js.native
}

