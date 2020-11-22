package typingsSlinky.jsforce.chatterMod

import typingsSlinky.jsforce.connectionMod.Callback
import typingsSlinky.jsforce.connectionMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/api/chatter", "Chatter")
@js.native
class Chatter protected () extends js.Object {
  def this(conn: Connection) = this()
  
  def batch(): js.Promise[BatchRequestResults] = js.native
  def batch(callback: Callback[BatchRequestResults]): js.Promise[BatchRequestResults] = js.native
  
  def request(params: RequestParams): Request[RequestResult] = js.native
  def request(params: RequestParams, callback: Callback[Request[RequestResult]]): Request[RequestResult] = js.native
  
  def resource(url: String): Resource[RequestResult] = js.native
  def resource(url: String, queryParams: js.Object): Resource[RequestResult] = js.native
}
