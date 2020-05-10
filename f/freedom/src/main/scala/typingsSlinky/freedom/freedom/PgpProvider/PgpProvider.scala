package typingsSlinky.freedom.freedom.PgpProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PgpProvider extends js.Object {
  def armor(data: js.typedarray.ArrayBuffer): js.Promise[String] = js.native
  def armor(data: js.typedarray.ArrayBuffer, `type`: String): js.Promise[String] = js.native
  def clear(): js.Promise[Unit] = js.native
  def dearmor(data: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def ecdhBob(curve: String, pubKey: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def exportKey(): js.Promise[PublicKey] = js.native
  def getFingerprint(publicKey: String): js.Promise[KeyFingerprint] = js.native
  // Standard freedom crypto API
  def setup(passphrase: String, userid: String): js.Promise[Unit] = js.native
  def signEncrypt(data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def signEncrypt(data: js.typedarray.ArrayBuffer, encryptKey: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def signEncrypt(data: js.typedarray.ArrayBuffer, encryptKey: String, sign: Boolean): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def verifyDecrypt(data: js.typedarray.ArrayBuffer): js.Promise[VerifyDecryptResult] = js.native
  def verifyDecrypt(data: js.typedarray.ArrayBuffer, verifyKey: String): js.Promise[VerifyDecryptResult] = js.native
}

