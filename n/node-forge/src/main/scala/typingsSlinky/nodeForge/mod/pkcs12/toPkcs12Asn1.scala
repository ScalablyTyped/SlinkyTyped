package typingsSlinky.nodeForge.mod.pkcs12

import typingsSlinky.nodeForge.anon.Algorithm
import typingsSlinky.nodeForge.mod.asn1.Asn1
import typingsSlinky.nodeForge.mod.pki.Certificate
import typingsSlinky.nodeForge.mod.pki.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pkcs12.toPkcs12Asn1")
@js.native
object toPkcs12Asn1 extends js.Object {
  
  def apply(key: PrivateKey, cert: js.Array[Certificate]): Asn1 = js.native
  def apply(key: PrivateKey, cert: js.Array[Certificate], password: String): Asn1 = js.native
  def apply(key: PrivateKey, cert: js.Array[Certificate], password: String, options: Algorithm): Asn1 = js.native
  def apply(key: PrivateKey, cert: js.Array[Certificate], password: Null, options: Algorithm): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate, password: String): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate, password: String, options: Algorithm): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate, password: Null, options: Algorithm): Asn1 = js.native
}
