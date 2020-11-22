package typingsSlinky.popmotion.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecayOptions extends js.Object {
  
  var from: js.UndefOr[Double] = js.native
  
  var modifyTarget: js.UndefOr[js.Function1[/* target */ Double, Double]] = js.native
  
  var power: js.UndefOr[Double] = js.native
  
  var restDelta: js.UndefOr[Double] = js.native
  
  var timeConstant: js.UndefOr[Double] = js.native
  
  var to: js.UndefOr[Double] = js.native
  
  var velocity: js.UndefOr[Double] = js.native
}
object DecayOptions {
  
  @scala.inline
  def apply(): DecayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecayOptions]
  }
  
  @scala.inline
  implicit class DecayOptionsOps[Self <: DecayOptions] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setModifyTarget(value: /* target */ Double => Double): Self = this.set("modifyTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteModifyTarget: Self = this.set("modifyTarget", js.undefined)
    
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    
    @scala.inline
    def setRestDelta(value: Double): Self = this.set("restDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestDelta: Self = this.set("restDelta", js.undefined)
    
    @scala.inline
    def setTimeConstant(value: Double): Self = this.set("timeConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeConstant: Self = this.set("timeConstant", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
}
