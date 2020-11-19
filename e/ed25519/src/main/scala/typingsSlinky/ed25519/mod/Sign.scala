package typingsSlinky.ed25519.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ed25519", "Sign")
@js.native
object Sign extends js.Object {
  
  def apply(message: Buffer, privateKeyOrKeyPair: CurveKeyPair): Buffer = js.native
  def apply(message: Buffer, privateKeyOrKeyPair: Buffer): Buffer = js.native
}
