package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Views extends StObject {
  
  def Add(Name: String, ViewType: OlViewType, SaveOption: OlViewSaveOption): View = js.native
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): View = js.native
  
  @JSName("Outlook.Views_typekey")
  var OutlookDotViews_typekey: Views = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: js.Any): Unit = js.native
  
  val Session: NameSpace = js.native
}
object Views {
  
  @scala.inline
  def apply(
    Add: (String, OlViewType, OlViewSaveOption) => View,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => View,
    OutlookDotViews_typekey: Views,
    Parent: js.Any,
    Remove: js.Any => Unit,
    Session: NameSpace
  ): Views = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction3(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Views_typekey")(OutlookDotViews_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Views]
  }
  
  @scala.inline
  implicit class ViewsMutableBuilder[Self <: Views] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, OlViewType, OlViewSaveOption) => View): Self = StObject.set(x, "Add", js.Any.fromFunction3(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => View): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotViews_typekey(value: Views): Self = StObject.set(x, "Outlook.Views_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
