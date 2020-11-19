package typingsSlinky.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-env/dist/fetch", "Body")
@js.native
class Body () extends js.Object {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  val bodyUsed: Boolean = js.native
  
  def json(): js.Promise[_] = js.native
  
  def text(): js.Promise[String] = js.native
}
