package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomProperties extends StObject {
  
  def Add(Name: String, Value: String): CustomProperty = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): CustomProperty = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.CustomProperties_typekey")
  var WordDotCustomProperties_typekey: CustomProperties = js.native
}
object CustomProperties {
  
  @scala.inline
  def apply(
    Add: (String, String) => CustomProperty,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => CustomProperty,
    Parent: js.Any,
    WordDotCustomProperties_typekey: CustomProperties
  ): CustomProperties = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CustomProperties_typekey")(WordDotCustomProperties_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperties]
  }
  
  @scala.inline
  implicit class CustomPropertiesMutableBuilder[Self <: CustomProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, String) => CustomProperty): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => CustomProperty): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotCustomProperties_typekey(value: CustomProperties): Self = StObject.set(x, "Word.CustomProperties_typekey", value.asInstanceOf[js.Any])
  }
}
