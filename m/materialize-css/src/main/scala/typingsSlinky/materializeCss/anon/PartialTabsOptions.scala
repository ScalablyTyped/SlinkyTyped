package typingsSlinky.materializeCss.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.Tabs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.TabsOptions> */
@js.native
trait PartialTabsOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.native
  
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ Tabs, /* newContent */ Element, Unit]] = js.native
  
  var responsiveThreshold: js.UndefOr[Double] = js.native
  
  var swipeable: js.UndefOr[Boolean] = js.native
}
object PartialTabsOptions {
  
  @scala.inline
  def apply(): PartialTabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTabsOptions]
  }
  
  @scala.inline
  implicit class PartialTabsOptionsMutableBuilder[Self <: PartialTabsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction1[/* this */ Tabs, /* newContent */ Element, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setResponsiveThreshold(value: Double): Self = StObject.set(x, "responsiveThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveThresholdUndefined: Self = StObject.set(x, "responsiveThreshold", js.undefined)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
  }
}
