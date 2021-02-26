package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentSelection extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def GetSelection(SelectionContents: OlSelectionContents): Selection = js.native
  
  def Item(Index: js.Any): Attachment = js.native
  
  val Location: OlSelectionLocation = js.native
  
  @JSName("Outlook.AttachmentSelection_typekey")
  var OutlookDotAttachmentSelection_typekey: AttachmentSelection = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object AttachmentSelection {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    GetSelection: OlSelectionContents => Selection,
    Item: js.Any => Attachment,
    Location: OlSelectionLocation,
    OutlookDotAttachmentSelection_typekey: AttachmentSelection,
    Parent: js.Any,
    Session: NameSpace
  ): AttachmentSelection = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], GetSelection = js.Any.fromFunction1(GetSelection), Item = js.Any.fromFunction1(Item), Location = Location.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AttachmentSelection_typekey")(OutlookDotAttachmentSelection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentSelection]
  }
  
  @scala.inline
  implicit class AttachmentSelectionMutableBuilder[Self <: AttachmentSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSelection(value: OlSelectionContents => Selection): Self = StObject.set(x, "GetSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: js.Any => Attachment): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocation(value: OlSelectionLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotAttachmentSelection_typekey(value: AttachmentSelection): Self = StObject.set(x, "Outlook.AttachmentSelection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
