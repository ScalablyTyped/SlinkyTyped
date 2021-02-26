package typingsSlinky.activexInfopath.InfoPath

import typingsSlinky.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedDataBlockObject extends StObject {
  
  val Caption: String = js.native
  
  @JSName("InfoPath.SignedDataBlockObject_typekey")
  var InfoPathDotSignedDataBlockObject_typekey: SignedDataBlockObject = js.native
  
  val Name: String = js.native
  
  def Sign(): Unit = js.native
  
  val SignatureContainer: IXMLDOMNode = js.native
  
  val SignatureRelation: XdSignatureRelation = js.native
  
  val Signatures: SignaturesCollection = js.native
  
  val XPath: String = js.native
  
  val XPathNamespaceDeclarations: String = js.native
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
  implicit class SignedDataBlockObjectMutableBuilder[Self <: SignedDataBlockObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSignedDataBlockObject_typekey(value: SignedDataBlockObject): Self = StObject.set(x, "InfoPath.SignedDataBlockObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign(value: () => Unit): Self = StObject.set(x, "Sign", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignatureContainer(value: IXMLDOMNode): Self = StObject.set(x, "SignatureContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureRelation(value: XdSignatureRelation): Self = StObject.set(x, "SignatureRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: SignaturesCollection): Self = StObject.set(x, "Signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPath(value: String): Self = StObject.set(x, "XPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPathNamespaceDeclarations(value: String): Self = StObject.set(x, "XPathNamespaceDeclarations", value.asInstanceOf[js.Any])
  }
}
