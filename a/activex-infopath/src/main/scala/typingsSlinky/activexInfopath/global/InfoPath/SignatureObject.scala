package typingsSlinky.activexInfopath.global.InfoPath

import typingsSlinky.activexInfopath.InfoPath.XdSignatureStatus
import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignatureObject")
@js.native
class SignatureObject protected ()
  extends typingsSlinky.activexInfopath.InfoPath.SignatureObject {
  /* CompleteClass */
  override val Certificate: typingsSlinky.activexInfopath.InfoPath.CertificateObject = js.native
  /* CompleteClass */
  override val Comment: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.SignatureObject_typekey")
  override var InfoPathDotSignatureObject_typekey: typingsSlinky.activexInfopath.InfoPath.SignatureObject = js.native
  /* CompleteClass */
  override val SignatureBlockXmlNode: IXMLDOMNode = js.native
  /* CompleteClass */
  override val Status: XdSignatureStatus = js.native
  /* CompleteClass */
  override def Sign(): Unit = js.native
}

