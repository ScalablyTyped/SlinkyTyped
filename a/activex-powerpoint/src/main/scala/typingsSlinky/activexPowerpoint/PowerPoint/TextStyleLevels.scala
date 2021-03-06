package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyleLevels extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Level: Double): TextStyleLevel = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.TextStyleLevels_typekey")
  var PowerPointDotTextStyleLevels_typekey: TextStyleLevels = js.native
}
object TextStyleLevels {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => TextStyleLevel,
    Parent: js.Any,
    PowerPointDotTextStyleLevels_typekey: TextStyleLevels
  ): TextStyleLevels = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextStyleLevels_typekey")(PowerPointDotTextStyleLevels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleLevels]
  }
  
  @scala.inline
  implicit class TextStyleLevelsMutableBuilder[Self <: TextStyleLevels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => TextStyleLevel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTextStyleLevels_typekey(value: TextStyleLevels): Self = StObject.set(x, "PowerPoint.TextStyleLevels_typekey", value.asInstanceOf[js.Any])
  }
}
