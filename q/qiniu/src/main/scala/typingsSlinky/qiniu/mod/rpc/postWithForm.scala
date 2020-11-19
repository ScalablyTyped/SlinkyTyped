package typingsSlinky.qiniu.mod.rpc

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.qiniu.mod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qiniu", "rpc.postWithForm")
@js.native
object postWithForm extends js.Object {
  
  def apply(requestURI: String, requestForm: String, token: String, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: String, token: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Null, token: String, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Null, token: Null, callback: callback): Unit = js.native
  /**
    *
    * @param requestURI
    * @param requestForm
    * @param token
    * @param callback
    */
  def apply(requestURI: String, requestForm: Buffer, token: String, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: Buffer, token: Null, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: ReadableStream, token: String, callback: callback): Unit = js.native
  def apply(requestURI: String, requestForm: ReadableStream, token: Null, callback: callback): Unit = js.native
}
