package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIns extends StObject {
  
  def Add(FileName: String): AddIn = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): AddIn = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.AddIns_typekey")
  var PowerPointDotAddIns_typekey: AddIns = js.native
  
  def Remove(Index: js.Any): Unit = js.native
}
object AddIns {
  
  @scala.inline
  def apply(
    Add: String => AddIn,
    Application: Application,
    Count: Double,
    Item: js.Any => AddIn,
    Parent: js.Any,
    PowerPointDotAddIns_typekey: AddIns,
    Remove: js.Any => Unit
  ): AddIns = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.updateDynamic("PowerPoint.AddIns_typekey")(PowerPointDotAddIns_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIns]
  }
  
  @scala.inline
  implicit class AddInsMutableBuilder[Self <: AddIns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: String => AddIn): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => AddIn): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotAddIns_typekey(value: AddIns): Self = StObject.set(x, "PowerPoint.AddIns_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
