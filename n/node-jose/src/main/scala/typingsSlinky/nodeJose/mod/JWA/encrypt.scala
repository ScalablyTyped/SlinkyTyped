package typingsSlinky.nodeJose.mod.JWA

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-jose", "JWA.encrypt")
@js.native
object encrypt extends js.Object {
  
  def apply(alg: String, key: String, pdata: String): js.Promise[EncryptReturn] = js.native
  def apply(alg: String, key: String, pdata: String, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def apply(alg: String, key: String, pdata: Buffer): js.Promise[EncryptReturn] = js.native
  def apply(alg: String, key: String, pdata: Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: String): js.Promise[EncryptReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: String, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: Buffer): js.Promise[EncryptReturn] = js.native
  def apply(alg: String, key: Buffer, pdata: Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
}
