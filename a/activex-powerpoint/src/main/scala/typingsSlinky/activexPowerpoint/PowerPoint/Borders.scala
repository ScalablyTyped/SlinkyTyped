package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Borders extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(BorderType: PpBorderType): LineFormat = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Borders_typekey")
  var PowerPointDotBorders_typekey: Borders = js.native
}
object Borders {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: PpBorderType => LineFormat,
    Parent: js.Any,
    PowerPointDotBorders_typekey: Borders
  ): Borders = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Borders_typekey")(PowerPointDotBorders_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  
  @scala.inline
  implicit class BordersMutableBuilder[Self <: Borders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: PpBorderType => LineFormat): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotBorders_typekey(value: Borders): Self = StObject.set(x, "PowerPoint.Borders_typekey", value.asInstanceOf[js.Any])
  }
}
