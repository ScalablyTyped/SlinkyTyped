package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedDataBlockObject extends js.Object {
  val Caption: String = js.native
  @JSName("InfoPath.SignedDataBlockObject_typekey")
  var InfoPathDotSignedDataBlockObject_typekey: SignedDataBlockObject = js.native
  val Name: String = js.native
  val SignatureContainer: IXMLDOMNode = js.native
  val SignatureRelation: XdSignatureRelation = js.native
  val Signatures: SignaturesCollection = js.native
  val XPath: String = js.native
  val XPathNamespaceDeclarations: String = js.native
  def Sign(): Unit = js.native
}

object SignedDataBlockObject {
  @scala.inline
  def apply(
    Caption: String,
    InfoPathDotSignedDataBlockObject_typekey: SignedDataBlockObject,
    Name: String,
    Sign: () => Unit,
    SignatureContainer: IXMLDOMNode,
    SignatureRelation: XdSignatureRelation,
    Signatures: SignaturesCollection,
    XPath: String,
    XPathNamespaceDeclarations: String
  ): SignedDataBlockObject = {
    val __obj = js.Dynamic.literal(Caption = Caption.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Sign = js.Any.fromFunction0(Sign), SignatureContainer = SignatureContainer.asInstanceOf[js.Any], SignatureRelation = SignatureRelation.asInstanceOf[js.Any], Signatures = Signatures.asInstanceOf[js.Any], XPath = XPath.asInstanceOf[js.Any], XPathNamespaceDeclarations = XPathNamespaceDeclarations.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SignedDataBlockObject_typekey")(InfoPathDotSignedDataBlockObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedDataBlockObject]
  }
  @scala.inline
  implicit class SignedDataBlockObjectOps[Self <: SignedDataBlockObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotSignedDataBlockObject_typekey(value: SignedDataBlockObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.SignedDataBlockObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSign(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSignatureContainer(value: IXMLDOMNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureRelation(value: XdSignatureRelation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignatureRelation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatures(value: SignaturesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXPathNamespaceDeclarations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XPathNamespaceDeclarations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

