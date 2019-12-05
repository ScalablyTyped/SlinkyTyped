package typingsSlinky.ed2curve

import typingsSlinky.tweetnacl.tweetnaclMod.BoxKeyPair
import typingsSlinky.tweetnacl.tweetnaclMod.SignKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ed2curve", JSImport.Namespace)
@js.native
object ed2curveMod extends js.Object {
  def convertKeyPair(keyPair: SignKeyPair): BoxKeyPair | Null = js.native
  def convertPublicKey(publicKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array | Null = js.native
  def convertSecretKey(secretKey: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array = js.native
}

