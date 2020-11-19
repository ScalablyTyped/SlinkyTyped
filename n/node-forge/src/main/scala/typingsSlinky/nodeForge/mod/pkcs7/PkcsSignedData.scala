package typingsSlinky.nodeForge.mod.pkcs7

import typingsSlinky.nodeForge.anon.AuthenticatedAttributes
import typingsSlinky.nodeForge.anon.Detached
import typingsSlinky.nodeForge.anon.Value
import typingsSlinky.nodeForge.mod.asn1.Asn1
import typingsSlinky.nodeForge.mod.pki.Certificate
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PkcsSignedData extends js.Object {
  
  def addCertificate(certificate: String): Unit = js.native
  def addCertificate(certificate: Certificate): Unit = js.native
  
  def addSigner(options: AuthenticatedAttributes): Unit = js.native
  
  var content: js.UndefOr[String | ByteBuffer] = js.native
  
  var contentInfo: js.UndefOr[Value] = js.native
  
  def sign(): Unit = js.native
  def sign(options: Detached): Unit = js.native
  
  def toAsn1(): Asn1 = js.native
}
