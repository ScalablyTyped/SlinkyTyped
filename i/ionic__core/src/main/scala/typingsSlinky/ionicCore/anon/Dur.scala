package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dur extends js.Object {
  
  var circles: Double = js.native
  
  var dur: Double = js.native
  
  var elmDuration: Boolean = js.native
  
  def fn(): Cx = js.native
}
object Dur {
  
  @scala.inline
  def apply(circles: Double, dur: Double, elmDuration: Boolean, fn: () => Cx): Dur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], elmDuration = elmDuration.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
    __obj.asInstanceOf[Dur]
  }
  
  @scala.inline
  implicit class DurOps[Self <: Dur] (val x: Self) extends AnyVal {
    
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
    def setCircles(value: Double): Self = this.set("circles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDur(value: Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElmDuration(value: Boolean): Self = this.set("elmDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: () => Cx): Self = this.set("fn", js.Any.fromFunction0(value))
  }
}
