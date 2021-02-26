package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorEffect extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val By: ColorFormat = js.native
  
  val From: ColorFormat = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.ColorEffect_typekey")
  var PowerPointDotColorEffect_typekey: ColorEffect = js.native
  
  val To: ColorFormat = js.native
}
object ColorEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    By: ColorFormat,
    From: ColorFormat,
    Parent: js.Any,
    PowerPointDotColorEffect_typekey: ColorEffect,
    To: ColorFormat
  ): ColorEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorEffect_typekey")(PowerPointDotColorEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorEffect]
  }
  
  @scala.inline
  implicit class ColorEffectMutableBuilder[Self <: ColorEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBy(value: ColorFormat): Self = StObject.set(x, "By", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: ColorFormat): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotColorEffect_typekey(value: ColorEffect): Self = StObject.set(x, "PowerPoint.ColorEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: ColorFormat): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
