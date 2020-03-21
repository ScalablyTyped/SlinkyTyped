package typingsSlinky.ed2curve

import typingsSlinky.tweetnacl.mod.BoxKeyPair
import typingsSlinky.tweetnacl.mod.SignKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed2curve", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def convertKeyPair(keyPair: SignKeyPair): BoxKeyPair | Null = js.native
  def convertPublicKey(publicKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array | Null = js.native
  def convertSecretKey(secretKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
}

