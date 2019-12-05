package typingsSlinky.qiniu.qiniuMod.rpc

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.qiniu.qiniuMod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "rpc.post")
@js.native
object post extends js.Object {
  def apply(requestURI: String, requestForm: String, headers: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: String, headers: Headers, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Null, headers: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Null, headers: Headers, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Buffer, headers: Null, callback: callback): Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param headers
    * @param callback
    */
  def apply(requestURI: String, requestForm: Buffer, headers: Headers, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: ReadableStream, headers: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: ReadableStream, headers: Headers, callback: callback): Unit = js.native
}

