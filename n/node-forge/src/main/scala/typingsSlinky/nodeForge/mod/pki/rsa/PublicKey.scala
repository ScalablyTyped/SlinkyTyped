package typingsSlinky.nodeForge.mod.pki.rsa

import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.jsbn.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey
  extends typingsSlinky.nodeForge.mod.pki.PublicKey {
  var e: BigInteger = js.native
  var n: BigInteger = js.native
  def encrypt(data: Bytes): Bytes = js.native
  def encrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
  def encrypt(data: Bytes, scheme: EncryptionScheme, schemeOptions: js.Any): Bytes = js.native
  def verify(digest: Bytes, signature: Bytes): Boolean = js.native
  def verify(digest: Bytes, signature: Bytes, scheme: SignatureScheme): Boolean = js.native
}

