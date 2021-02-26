package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationEffect extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  var By: Double = js.native
  
  var From: Double = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.RotationEffect_typekey")
  var PowerPointDotRotationEffect_typekey: RotationEffect = js.native
  
  var To: Double = js.native
}
object RotationEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    By: Double,
    From: Double,
    Parent: js.Any,
    PowerPointDotRotationEffect_typekey: RotationEffect,
    To: Double
  ): RotationEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RotationEffect_typekey")(PowerPointDotRotationEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationEffect]
  }
  
  @scala.inline
  implicit class RotationEffectMutableBuilder[Self <: RotationEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBy(value: Double): Self = StObject.set(x, "By", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotRotationEffect_typekey(value: RotationEffect): Self = StObject.set(x, "PowerPoint.RotationEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
