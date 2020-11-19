package typingsSlinky.nodeJose.mod.JWA

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-jose", "JWA.derive")
@js.native
object derive extends js.Object {
  
  def apply(alg: String, key: String): js.Promise[Buffer] = js.native
  def apply(alg: String, key: String, props: DeriveOptions): js.Promise[Buffer] = js.native
  def apply(alg: String, key: Buffer): js.Promise[Buffer] = js.native
  def apply(alg: String, key: Buffer, props: DeriveOptions): js.Promise[Buffer] = js.native
}
