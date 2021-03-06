package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappedDataFields extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: WdMappedDataFields): MappedDataField = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.MappedDataFields_typekey")
  var WordDotMappedDataFields_typekey: MappedDataFields = js.native
}
object MappedDataFields {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdMappedDataFields => MappedDataField,
    Parent: js.Any,
    WordDotMappedDataFields_typekey: MappedDataFields
  ): MappedDataFields = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MappedDataFields_typekey")(WordDotMappedDataFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedDataFields]
  }
  
  @scala.inline
  implicit class MappedDataFieldsMutableBuilder[Self <: MappedDataFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: WdMappedDataFields => MappedDataField): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotMappedDataFields_typekey(value: MappedDataFields): Self = StObject.set(x, "Word.MappedDataFields_typekey", value.asInstanceOf[js.Any])
  }
}
