package typingsSlinky.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMagellanOptions extends StObject {
  
  var activeClass: js.UndefOr[String] = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationEasing: js.UndefOr[String] = js.native
  
  var barOffset: js.UndefOr[Double] = js.native
  
  var deepLinking: js.UndefOr[Boolean] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object IMagellanOptions {
  
  @scala.inline
  def apply(): IMagellanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMagellanOptions]
  }
  
  @scala.inline
  implicit class IMagellanOptionsMutableBuilder[Self <: IMagellanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: String): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
    
    @scala.inline
    def setBarOffset(value: Double): Self = StObject.set(x, "barOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarOffsetUndefined: Self = StObject.set(x, "barOffset", js.undefined)
    
    @scala.inline
    def setDeepLinking(value: Boolean): Self = StObject.set(x, "deepLinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepLinkingUndefined: Self = StObject.set(x, "deepLinking", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
