package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recipients extends StObject {
  
  def Add(Name: String): Recipient = js.native
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): Recipient = js.native
  
  @JSName("Outlook.Recipients_typekey")
  var OutlookDotRecipients_typekey: Recipients = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  def ResolveAll(): Boolean = js.native
  
  val Session: NameSpace = js.native
}
object Recipients {
  
  @scala.inline
  def apply(
    Add: String => Recipient,
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Item: js.Any => Recipient,
    OutlookDotRecipients_typekey: Recipients,
    Parent: js.Any,
    Remove: Double => Unit,
    ResolveAll: () => Boolean,
    Session: NameSpace
  ): Recipients = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove), ResolveAll = js.Any.fromFunction0(ResolveAll), Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Recipients_typekey")(OutlookDotRecipients_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recipients]
  }
  
  @scala.inline
  implicit class RecipientsMutableBuilder[Self <: Recipients] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => Recipient): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => Recipient): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutlookDotRecipients_typekey(value: Recipients): Self = StObject.set(x, "Outlook.Recipients_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveAll(value: () => Boolean): Self = StObject.set(x, "ResolveAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
