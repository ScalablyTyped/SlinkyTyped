package typingsSlinky.nodeForge.mod.pki.rsa

import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.jsbn.BigInteger
import typingsSlinky.nodeForge.mod.md.MessageDigest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateKey extends js.Object {
  
  var d: BigInteger = js.native
  
  var dP: BigInteger = js.native
  
  var dQ: BigInteger = js.native
  
  def decrypt(data: Bytes): Bytes = js.native
  def decrypt(data: Bytes, scheme: js.UndefOr[EncryptionScheme], schemeOptions: js.Any): Bytes = js.native
  def decrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
  
  var e: BigInteger = js.native
  
  var n: BigInteger = js.native
  
  var p: BigInteger = js.native
  
  var q: BigInteger = js.native
  
  var qInv: BigInteger = js.native
  
  def sign(md: MessageDigest): Bytes = js.native
  def sign(md: MessageDigest, scheme: SignatureScheme): Bytes = js.native
}
