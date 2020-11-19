package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.TimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.CreateAnimationOptions> */
@js.native
trait PartialCreateAnimationOpt extends js.Object {
  
  var delay: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var timeFunction: js.UndefOr[TimingFunction] = js.native
  
  var transformOrigin: js.UndefOr[String] = js.native
}
object PartialCreateAnimationOpt {
  
  @scala.inline
  def apply(): PartialCreateAnimationOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateAnimationOpt]
  }
  
  @scala.inline
  implicit class PartialCreateAnimationOptOps[Self <: PartialCreateAnimationOpt] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setTimeFunction(value: TimingFunction): Self = this.set("timeFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFunction: Self = this.set("timeFunction", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
  }
}
