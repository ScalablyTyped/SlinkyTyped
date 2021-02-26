package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoRGBType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraColors extends StObject {
  
  def Add(Type: MsoRGBType): Unit = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): MsoRGBType = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ExtraColors_typekey")
  var PowerPointDotExtraColors_typekey: ExtraColors = js.native
}
object ExtraColors {
  
  @scala.inline
  def apply(
    Add: MsoRGBType => Unit,
    Application: Application,
    Clear: () => Unit,
    Count: Double,
    Item: Double => MsoRGBType,
    Parent: js.Any,
    PowerPointDotExtraColors_typekey: ExtraColors
  ): ExtraColors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ExtraColors_typekey")(PowerPointDotExtraColors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraColors]
  }
  
  @scala.inline
  implicit class ExtraColorsMutableBuilder[Self <: ExtraColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: MsoRGBType => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => MsoRGBType): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotExtraColors_typekey(value: ExtraColors): Self = StObject.set(x, "PowerPoint.ExtraColors_typekey", value.asInstanceOf[js.Any])
  }
}
