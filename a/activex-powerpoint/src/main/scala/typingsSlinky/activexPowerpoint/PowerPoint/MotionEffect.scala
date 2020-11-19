package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionEffect extends js.Object {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  var ByX: Double = js.native
  
  var ByY: Double = js.native
  
  var FromX: Double = js.native
  
  var FromY: Double = js.native
  
  val Parent: js.Any = js.native
  
  var Path: String = js.native
  
  @JSName("PowerPoint.MotionEffect_typekey")
  var PowerPointDotMotionEffect_typekey: MotionEffect = js.native
  
  var ToX: Double = js.native
  
  var ToY: Double = js.native
}
object MotionEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    ByX: Double,
    ByY: Double,
    FromX: Double,
    FromY: Double,
    Parent: js.Any,
    Path: String,
    PowerPointDotMotionEffect_typekey: MotionEffect,
    ToX: Double,
    ToY: Double
  ): MotionEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ByX = ByX.asInstanceOf[js.Any], ByY = ByY.asInstanceOf[js.Any], FromX = FromX.asInstanceOf[js.Any], FromY = FromY.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ToX = ToX.asInstanceOf[js.Any], ToY = ToY.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.MotionEffect_typekey")(PowerPointDotMotionEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionEffect]
  }
  
  @scala.inline
  implicit class MotionEffectOps[Self <: MotionEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByX(value: Double): Self = this.set("ByX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByY(value: Double): Self = this.set("ByY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromX(value: Double): Self = this.set("FromX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromY(value: Double): Self = this.set("FromY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotMotionEffect_typekey(value: MotionEffect): Self = this.set("PowerPoint.MotionEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToX(value: Double): Self = this.set("ToX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToY(value: Double): Self = this.set("ToY", value.asInstanceOf[js.Any])
  }
}
