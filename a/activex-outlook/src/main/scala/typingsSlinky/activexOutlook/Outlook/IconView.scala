package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconView extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  def Apply(): Unit = js.native
  
  val Class: OlObjectClass = js.native
  
  def Copy(Name: String, SaveOption: OlViewSaveOption): View = js.native
  
  def Delete(): Unit = js.native
  
  var Filter: String = js.native
  
  def GoToDate(Date: VarDate): Unit = js.native
  
  var IconPlacement: OlIconViewPlacement = js.native
  
  var IconViewType: OlIconViewType = js.native
  
  var Language: String = js.native
  
  var LockUserChanges: Boolean = js.native
  
  var Name: String = js.native
  
  @JSName("Outlook.IconView_typekey")
  var OutlookDotIconView_typekey: IconView = js.native
  
  val Parent: js.Any = js.native
  
  def Reset(): Unit = js.native
  
  def Save(): Unit = js.native
  
  val SaveOption: OlViewSaveOption = js.native
  
  val Session: NameSpace = js.native
  
  val SortFields: OrderFields = js.native
  
  val Standard: Boolean = js.native
  
  val ViewType: OlViewType = js.native
  
  var XML: String = js.native
}
object IconView {
  
  @scala.inline
  def apply(
    Application: Application,
    Apply: () => Unit,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    Delete: () => Unit,
    Filter: String,
    GoToDate: VarDate => Unit,
    IconPlacement: OlIconViewPlacement,
    IconViewType: OlIconViewType,
    Language: String,
    LockUserChanges: Boolean,
    Name: String,
    OutlookDotIconView_typekey: IconView,
    Parent: js.Any,
    Reset: () => Unit,
    Save: () => Unit,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    SortFields: OrderFields,
    Standard: Boolean,
    ViewType: OlViewType,
    XML: String
  ): IconView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1(GoToDate), IconPlacement = IconPlacement.asInstanceOf[js.Any], IconViewType = IconViewType.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Save = js.Any.fromFunction0(Save), SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.IconView_typekey")(OutlookDotIconView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconView]
  }
  
  @scala.inline
  implicit class IconViewMutableBuilder[Self <: IconView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "Apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: (String, OlViewSaveOption) => View): Self = StObject.set(x, "Copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToDate(value: VarDate => Unit): Self = StObject.set(x, "GoToDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIconPlacement(value: OlIconViewPlacement): Self = StObject.set(x, "IconPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconViewType(value: OlIconViewType): Self = StObject.set(x, "IconViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockUserChanges(value: Boolean): Self = StObject.set(x, "LockUserChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotIconView_typekey(value: IconView): Self = StObject.set(x, "Outlook.IconView_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveOption(value: OlViewSaveOption): Self = StObject.set(x, "SaveOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFields(value: OrderFields): Self = StObject.set(x, "SortFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: OlViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
