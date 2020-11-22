package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.css
import typingsSlinky.devextreme.devextremeStrings.fade
import typingsSlinky.devextreme.devextremeStrings.fadeIn
import typingsSlinky.devextreme.devextremeStrings.fadeOut
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.pop
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.slide
import typingsSlinky.devextreme.devextremeStrings.slideIn
import typingsSlinky.devextreme.devextremeStrings.slideOut
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait animationConfig extends js.Object {
  
  /**
    * [descr:animationConfig.complete]
    */
  var complete: js.UndefOr[js.Function2[/* $element */ dxElement, /* config */ js.Any, _]] = js.native
  
  /**
    * [descr:animationConfig.delay]
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * [descr:animationConfig.direction]
    */
  var direction: js.UndefOr[bottom | left | right | top] = js.native
  
  /**
    * [descr:animationConfig.duration]
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * [descr:animationConfig.easing]
    */
  var easing: js.UndefOr[String] = js.native
  
  /**
    * [descr:animationConfig.from]
    */
  var from: js.UndefOr[Double | String | js.Any] = js.native
  
  /**
    * [descr:animationConfig.staggerDelay]
    */
  var staggerDelay: js.UndefOr[Double] = js.native
  
  /**
    * [descr:animationConfig.start]
    */
  var start: js.UndefOr[js.Function2[/* $element */ dxElement, /* config */ js.Any, _]] = js.native
  
  /**
    * [descr:animationConfig.to]
    */
  var to: js.UndefOr[Double | String | js.Any] = js.native
  
  /**
    * [descr:animationConfig.type]
    */
  var `type`: js.UndefOr[css | fade | fadeIn | fadeOut | pop | slide | slideIn | slideOut] = js.native
}
object animationConfig {
  
  @scala.inline
  def apply(): animationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[animationConfig]
  }
  
  @scala.inline
  implicit class animationConfigOps[Self <: animationConfig] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: (/* $element */ dxElement, /* config */ js.Any) => _): Self = this.set("complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDirection(value: bottom | left | right | top): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setFrom(value: Double | String | js.Any): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setStaggerDelay(value: Double): Self = this.set("staggerDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaggerDelay: Self = this.set("staggerDelay", js.undefined)
    
    @scala.inline
    def setStart(value: (/* $element */ dxElement, /* config */ js.Any) => _): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTo(value: Double | String | js.Any): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setType(value: css | fade | fadeIn | fadeOut | pop | slide | slideIn | slideOut): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
