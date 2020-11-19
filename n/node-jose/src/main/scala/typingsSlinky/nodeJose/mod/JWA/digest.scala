package typingsSlinky.nodeJose.mod.JWA

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-jose", "JWA.digest")
@js.native
object digest extends js.Object {
  
  def apply(alg: String, data: String): js.Promise[Buffer] = js.native
  def apply(alg: String, data: String, props: js.Any): js.Promise[Buffer] = js.native
  def apply(alg: String, data: Buffer): js.Promise[Buffer] = js.native
  def apply(alg: String, data: Buffer, props: js.Any): js.Promise[Buffer] = js.native
}
