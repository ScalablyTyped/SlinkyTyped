package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadingStyles extends StObject {
  
  def Add(Style: js.Any, Level: Double): HeadingStyle = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): HeadingStyle = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.HeadingStyles_typekey")
  var WordDotHeadingStyles_typekey: HeadingStyles = js.native
}
object HeadingStyles {
  
  @scala.inline
  def apply(
    Add: (js.Any, Double) => HeadingStyle,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => HeadingStyle,
    Parent: js.Any,
    WordDotHeadingStyles_typekey: HeadingStyles
  ): HeadingStyles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeadingStyles_typekey")(WordDotHeadingStyles_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingStyles]
  }
  
  @scala.inline
  implicit class HeadingStylesMutableBuilder[Self <: HeadingStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (js.Any, Double) => HeadingStyle): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => HeadingStyle): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotHeadingStyles_typekey(value: HeadingStyles): Self = StObject.set(x, "Word.HeadingStyles_typekey", value.asInstanceOf[js.Any])
  }
}
