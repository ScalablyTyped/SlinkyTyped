package typingsSlinky.activexInfopath.global.InfoPath

import typingsSlinky.activexInfopath.InfoPath.XdSignatureRelation
import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignedDataBlockObject")
@js.native
class SignedDataBlockObject protected ()
  extends typingsSlinky.activexInfopath.InfoPath.SignedDataBlockObject {
  /* CompleteClass */
  override val Caption: String = js.native
  /* CompleteClass */
  @JSName("InfoPath.SignedDataBlockObject_typekey")
  override var InfoPathDotSignedDataBlockObject_typekey: typingsSlinky.activexInfopath.InfoPath.SignedDataBlockObject = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val SignatureContainer: IXMLDOMNode = js.native
  /* CompleteClass */
  override val SignatureRelation: XdSignatureRelation = js.native
  /* CompleteClass */
  override val Signatures: typingsSlinky.activexInfopath.InfoPath.SignaturesCollection = js.native
  /* CompleteClass */
  override val XPath: String = js.native
  /* CompleteClass */
  override val XPathNamespaceDeclarations: String = js.native
  /* CompleteClass */
  override def Sign(): Unit = js.native
}

