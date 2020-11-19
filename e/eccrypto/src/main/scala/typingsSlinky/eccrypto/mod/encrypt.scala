package typingsSlinky.eccrypto.mod

import typingsSlinky.eccrypto.anon.EphemPrivateKey
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eccrypto", "encrypt")
@js.native
object encrypt extends js.Object {
  
  def apply(publicKeyTo: Buffer, msg: Buffer): js.Promise[Ecies] = js.native
  def apply(publicKeyTo: Buffer, msg: Buffer, opts: EphemPrivateKey): js.Promise[Ecies] = js.native
}
