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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait animationConfig extends StObject {
  
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
  implicit class animationConfigMutableBuilder[Self <: animationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: (/* $element */ dxElement, /* config */ js.Any) => _): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDirection(value: bottom | left | right | top): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setFrom(value: Double | String | js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setStaggerDelay(value: Double): Self = StObject.set(x, "staggerDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaggerDelayUndefined: Self = StObject.set(x, "staggerDelay", js.undefined)
    
    @scala.inline
    def setStart(value: (/* $element */ dxElement, /* config */ js.Any) => _): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTo(value: Double | String | js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setType(value: css | fade | fadeIn | fadeOut | pop | slide | slideIn | slideOut): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
