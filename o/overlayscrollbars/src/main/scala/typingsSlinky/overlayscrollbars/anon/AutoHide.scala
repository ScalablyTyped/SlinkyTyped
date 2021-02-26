package typingsSlinky.overlayscrollbars.anon

import typingsSlinky.overlayscrollbars.mod.AutoHideBehavior
import typingsSlinky.overlayscrollbars.mod.VisibilityBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoHide extends StObject {
  
  var autoHide: js.UndefOr[AutoHideBehavior] = js.native
  
  var autoHideDelay: js.UndefOr[Double] = js.native
  
  var clickScrolling: js.UndefOr[Boolean] = js.native
  
  var dragScrolling: js.UndefOr[Boolean] = js.native
  
  var snapHandle: js.UndefOr[Boolean] = js.native
  
  var touchSupport: js.UndefOr[Boolean] = js.native
  
  var visibility: js.UndefOr[VisibilityBehavior] = js.native
}
object AutoHide {
  
  @scala.inline
  def apply(): AutoHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoHide]
  }
  
  @scala.inline
  implicit class AutoHideMutableBuilder[Self <: AutoHide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoHide(value: AutoHideBehavior): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideDelay(value: Double): Self = StObject.set(x, "autoHideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideDelayUndefined: Self = StObject.set(x, "autoHideDelay", js.undefined)
    
    @scala.inline
    def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    @scala.inline
    def setClickScrolling(value: Boolean): Self = StObject.set(x, "clickScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickScrollingUndefined: Self = StObject.set(x, "clickScrolling", js.undefined)
    
    @scala.inline
    def setDragScrolling(value: Boolean): Self = StObject.set(x, "dragScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragScrollingUndefined: Self = StObject.set(x, "dragScrolling", js.undefined)
    
    @scala.inline
    def setSnapHandle(value: Boolean): Self = StObject.set(x, "snapHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapHandleUndefined: Self = StObject.set(x, "snapHandle", js.undefined)
    
    @scala.inline
    def setTouchSupport(value: Boolean): Self = StObject.set(x, "touchSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSupportUndefined: Self = StObject.set(x, "touchSupport", js.undefined)
    
    @scala.inline
    def setVisibility(value: VisibilityBehavior): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
