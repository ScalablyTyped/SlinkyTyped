package typingsSlinky.antd.motionMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TransitionEvent
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Motion extends js.Object {
  
  var leavedClassName: js.UndefOr[String] = js.native
  
  var motionAppear: js.UndefOr[Boolean] = js.native
  
  var motionDeadline: js.UndefOr[Double] = js.native
  
  var motionEnter: js.UndefOr[Boolean] = js.native
  
  var motionLeave: js.UndefOr[Boolean] = js.native
  
  var motionLeaveImmediately: js.UndefOr[Boolean] = js.native
  
  var motionName: js.UndefOr[String] = js.native
  
  var onAppearActive: js.UndefOr[MotionFunc] = js.native
  
  var onAppearEnd: js.UndefOr[MotionEndFunc] = js.native
  
  var onAppearStart: js.UndefOr[MotionFunc] = js.native
  
  var onEnterActive: js.UndefOr[MotionFunc] = js.native
  
  var onEnterEnd: js.UndefOr[MotionEndFunc] = js.native
  
  var onEnterStart: js.UndefOr[MotionFunc] = js.native
  
  var onLeaveActive: js.UndefOr[MotionFunc] = js.native
  
  var onLeaveEnd: js.UndefOr[MotionEndFunc] = js.native
  
  var onLeaveStart: js.UndefOr[MotionFunc] = js.native
  
  var removeOnLeave: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object Motion {
  
  @scala.inline
  def apply(): Motion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Motion]
  }
  
  @scala.inline
  implicit class MotionOps[Self <: Motion] (val x: Self) extends AnyVal {
    
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
    def setLeavedClassName(value: String): Self = this.set("leavedClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeavedClassName: Self = this.set("leavedClassName", js.undefined)
    
    @scala.inline
    def setMotionAppear(value: Boolean): Self = this.set("motionAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionAppear: Self = this.set("motionAppear", js.undefined)
    
    @scala.inline
    def setMotionDeadline(value: Double): Self = this.set("motionDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionDeadline: Self = this.set("motionDeadline", js.undefined)
    
    @scala.inline
    def setMotionEnter(value: Boolean): Self = this.set("motionEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionEnter: Self = this.set("motionEnter", js.undefined)
    
    @scala.inline
    def setMotionLeave(value: Boolean): Self = this.set("motionLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionLeave: Self = this.set("motionLeave", js.undefined)
    
    @scala.inline
    def setMotionLeaveImmediately(value: Boolean): Self = this.set("motionLeaveImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionLeaveImmediately: Self = this.set("motionLeaveImmediately", js.undefined)
    
    @scala.inline
    def setMotionName(value: String): Self = this.set("motionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionName: Self = this.set("motionName", js.undefined)
    
    @scala.inline
    def setOnAppearActive(value: /* element */ HTMLElement => CSSProperties): Self = this.set("onAppearActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppearActive: Self = this.set("onAppearActive", js.undefined)
    
    @scala.inline
    def setOnAppearEnd(value: (/* element */ HTMLElement, /* event */ TransitionEvent) => Boolean): Self = this.set("onAppearEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAppearEnd: Self = this.set("onAppearEnd", js.undefined)
    
    @scala.inline
    def setOnAppearStart(value: /* element */ HTMLElement => CSSProperties): Self = this.set("onAppearStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAppearStart: Self = this.set("onAppearStart", js.undefined)
    
    @scala.inline
    def setOnEnterActive(value: /* element */ HTMLElement => CSSProperties): Self = this.set("onEnterActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnterActive: Self = this.set("onEnterActive", js.undefined)
    
    @scala.inline
    def setOnEnterEnd(value: (/* element */ HTMLElement, /* event */ TransitionEvent) => Boolean): Self = this.set("onEnterEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEnterEnd: Self = this.set("onEnterEnd", js.undefined)
    
    @scala.inline
    def setOnEnterStart(value: /* element */ HTMLElement => CSSProperties): Self = this.set("onEnterStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnterStart: Self = this.set("onEnterStart", js.undefined)
    
    @scala.inline
    def setOnLeaveActive(value: /* element */ HTMLElement => CSSProperties): Self = this.set("onLeaveActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLeaveActive: Self = this.set("onLeaveActive", js.undefined)
    
    @scala.inline
    def setOnLeaveEnd(value: (/* element */ HTMLElement, /* event */ TransitionEvent) => Boolean): Self = this.set("onLeaveEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLeaveEnd: Self = this.set("onLeaveEnd", js.undefined)
    
    @scala.inline
    def setOnLeaveStart(value: /* element */ HTMLElement => CSSProperties): Self = this.set("onLeaveStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLeaveStart: Self = this.set("onLeaveStart", js.undefined)
    
    @scala.inline
    def setRemoveOnLeave(value: Boolean): Self = this.set("removeOnLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveOnLeave: Self = this.set("removeOnLeave", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
