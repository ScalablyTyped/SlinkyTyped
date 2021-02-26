package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.CustomXMLPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerData extends StObject {
  
  def Add(): CustomXMLPart = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Delete(Id: String): Unit = js.native
  
  def Item(Id: String): CustomXMLPart = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.CustomerData_typekey")
  var PowerPointDotCustomerData_typekey: CustomerData = js.native
}
object CustomerData {
  
  @scala.inline
  def apply(
    Add: () => CustomXMLPart,
    Application: Application,
    Count: Double,
    Delete: String => Unit,
    Item: String => CustomXMLPart,
    Parent: js.Any,
    PowerPointDotCustomerData_typekey: CustomerData
  ): CustomerData = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction0(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1(Delete), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.CustomerData_typekey")(PowerPointDotCustomerData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerData]
  }
  
  @scala.inline
  implicit class CustomerDataMutableBuilder[Self <: CustomerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: () => CustomXMLPart): Self = StObject.set(x, "Add", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: String => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: String => CustomXMLPart): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotCustomerData_typekey(value: CustomerData): Self = StObject.set(x, "PowerPoint.CustomerData_typekey", value.asInstanceOf[js.Any])
  }
}
