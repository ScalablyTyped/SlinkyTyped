package typingsSlinky.nodeDashForge.nodeDashForgeMod

import typingsSlinky.nodeDashForge.Anon_AuthenticatedAttributes
import typingsSlinky.nodeDashForge.Anon_Detached
import typingsSlinky.nodeDashForge.Anon_Value
import typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Asn1
import typingsSlinky.nodeDashForge.nodeDashForgeMod.pkcs7.PkcsSignedData
import typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.Certificate
import typingsSlinky.nodeDashForge.nodeDashForgeMod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs7")
@js.native
object pkcs7 extends js.Object {
  @js.native
  trait PkcsSignedData extends js.Object {
    var content: js.UndefOr[String | ByteBuffer] = js.native
    var contentInfo: js.UndefOr[Anon_Value] = js.native
    def addCertificate(certificate: String): Unit = js.native
    def addCertificate(certificate: Certificate): Unit = js.native
    def addSigner(options: Anon_AuthenticatedAttributes): Unit = js.native
    def sign(): Unit = js.native
    def sign(options: Anon_Detached): Unit = js.native
    def toAsn1(): Asn1 = js.native
  }
  
  def createSignedData(): PkcsSignedData = js.native
}

