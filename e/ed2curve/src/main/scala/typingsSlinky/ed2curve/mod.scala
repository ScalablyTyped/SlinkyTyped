package typingsSlinky.ed2curve

import typingsSlinky.tweetnacl.mod.BoxKeyPair
import typingsSlinky.tweetnacl.mod.SignKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ed2curve", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def convertKeyPair(keyPair: SignKeyPair): BoxKeyPair | Null = js.native
  
  def convertPublicKey(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Null = js.native
  
  def convertSecretKey(secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
}
