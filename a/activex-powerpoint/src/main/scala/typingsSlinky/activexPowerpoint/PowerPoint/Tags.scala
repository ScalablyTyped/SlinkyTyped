package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tags extends StObject {
  
  def Add(Name: String, Value: String): Unit = js.native
  
  def AddBinary(Name: String, FilePath: String): Unit = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  def BinaryValue(Name: String): Double = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Name: String): String = js.native
  
  def Name(Index: Double): String = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Tags_typekey")
  var PowerPointDotTags_typekey: Tags = js.native
  
  def Value(Index: Double): String = js.native
}
object Tags {
  
  @scala.inline
  def apply(
    Add: (String, String) => Unit,
    AddBinary: (String, String) => Unit,
    Application: Application,
    BinaryValue: String => Double,
    Count: Double,
    Delete: String => Unit,
    Item: String => String,
    Name: Double => String,
    Parent: js.Any,
    PowerPointDotTags_typekey: Tags,
    Value: Double => String
  ): Tags = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddBinary = js.Any.fromFunction2(AddBinary), Application = Application.asInstanceOf[js.Any], BinaryValue = js.Any.fromFunction1(BinaryValue), Count = Count.asInstanceOf[js.Any], Delete = js.Any.fromFunction1(Delete), Item = js.Any.fromFunction1(Item), Name = js.Any.fromFunction1(Name), Parent = Parent.asInstanceOf[js.Any], Value = js.Any.fromFunction1(Value))
    __obj.updateDynamic("PowerPoint.Tags_typekey")(PowerPointDotTags_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tags]
  }
  
  @scala.inline
  implicit class TagsMutableBuilder[Self <: Tags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, String) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddBinary(value: (String, String) => Unit): Self = StObject.set(x, "AddBinary", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValue(value: String => Double): Self = StObject.set(x, "BinaryValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: String => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: String => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: Double => String): Self = StObject.set(x, "Name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTags_typekey(value: Tags): Self = StObject.set(x, "PowerPoint.Tags_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double => String): Self = StObject.set(x, "Value", js.Any.fromFunction1(value))
  }
}
