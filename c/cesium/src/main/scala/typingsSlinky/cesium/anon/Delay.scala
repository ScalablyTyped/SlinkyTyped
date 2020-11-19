package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.JulianDate
import typingsSlinky.cesium.mod.ModelAnimationLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay extends js.Object {
  
  var delay: js.UndefOr[Double] = js.native
  
  var loop: js.UndefOr[ModelAnimationLoop] = js.native
  
  var name: String = js.native
  
  var removeOnStop: js.UndefOr[Boolean] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var speedup: js.UndefOr[Double] = js.native
  
  var startTime: js.UndefOr[JulianDate] = js.native
  
  var stopTime: js.UndefOr[JulianDate] = js.native
}
object Delay {
  
  @scala.inline
  def apply(name: String): Delay = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayOps[Self <: Delay] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setLoop(value: ModelAnimationLoop): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setRemoveOnStop(value: Boolean): Self = this.set("removeOnStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveOnStop: Self = this.set("removeOnStop", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setSpeedup(value: Double): Self = this.set("speedup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeedup: Self = this.set("speedup", js.undefined)
    
    @scala.inline
    def setStartTime(value: JulianDate): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStopTime(value: JulianDate): Self = this.set("stopTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopTime: Self = this.set("stopTime", js.undefined)
  }
}
