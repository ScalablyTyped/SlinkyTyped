package typingsSlinky.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentProperty[TApplication] extends StObject {
  
  var Application: TApplication = js.native
  
  var Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var LinkSource: String = js.native
  
  var LinkToContent: Boolean = js.native
  
  var Name: String = js.native
  
  @JSName("Office.DocumentProperty_typekey")
  var OfficeDotDocumentProperty_typekey: DocumentProperty[TApplication] = js.native
  
  var Parent: js.Any = js.native
  
  var Type: MsoDocProperties = js.native
  
  var Value: js.Any = js.native
}
object DocumentProperty {
  
  @scala.inline
  def apply[TApplication](
    Application: TApplication,
    Creator: Double,
    Delete: () => Unit,
    LinkSource: String,
    LinkToContent: Boolean,
    Name: String,
    OfficeDotDocumentProperty_typekey: DocumentProperty[TApplication],
    Parent: js.Any,
    Type: MsoDocProperties,
    Value: js.Any
  ): DocumentProperty[TApplication] = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), LinkSource = LinkSource.asInstanceOf[js.Any], LinkToContent = LinkToContent.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.DocumentProperty_typekey")(OfficeDotDocumentProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProperty[TApplication]]
  }
  
  @scala.inline
  implicit class DocumentPropertyMutableBuilder[Self <: DocumentProperty[_], TApplication] (val x: Self with DocumentProperty[TApplication]) extends AnyVal {
    
    @scala.inline
    def setApplication(value: TApplication): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLinkSource(value: String): Self = StObject.set(x, "LinkSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkToContent(value: Boolean): Self = StObject.set(x, "LinkToContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotDocumentProperty_typekey(value: DocumentProperty[TApplication]): Self = StObject.set(x, "Office.DocumentProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoDocProperties): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
