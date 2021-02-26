package typingsSlinky.miniprogram.anon

import typingsSlinky.miniprogram.EmptyFn
import typingsSlinky.miniprogram.OnPullDownRefresh
import typingsSlinky.miniprogram.OnTabItemTap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeTabItemTap extends StObject {
  
  var beforeTabItemTap: js.UndefOr[EmptyFn] = js.native
  
  var onBack: js.UndefOr[EmptyFn] = js.native
  
  var onKeyboardHeight: js.UndefOr[EmptyFn] = js.native
  
  var onOptionMenuClick: js.UndefOr[EmptyFn] = js.native
  
  var onPopMenuClick: js.UndefOr[EmptyFn] = js.native
  
  var onPullDownRefresh: js.UndefOr[OnPullDownRefresh] = js.native
  
  var onPullIntercept: js.UndefOr[EmptyFn] = js.native
  
  var onResize: js.UndefOr[js.Function1[/* opts */ SizeWindowHeight, Unit]] = js.native
  
  var onTabItemTap: js.UndefOr[OnTabItemTap] = js.native
  
  var onTitleClick: js.UndefOr[EmptyFn] = js.native
}
object BeforeTabItemTap {
  
  @scala.inline
  def apply(): BeforeTabItemTap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeTabItemTap]
  }
  
  @scala.inline
  implicit class BeforeTabItemTapMutableBuilder[Self <: BeforeTabItemTap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeTabItemTap(value: () => Unit): Self = StObject.set(x, "beforeTabItemTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeTabItemTapUndefined: Self = StObject.set(x, "beforeTabItemTap", js.undefined)
    
    @scala.inline
    def setOnBack(value: () => Unit): Self = StObject.set(x, "onBack", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBackUndefined: Self = StObject.set(x, "onBack", js.undefined)
    
    @scala.inline
    def setOnKeyboardHeight(value: () => Unit): Self = StObject.set(x, "onKeyboardHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnKeyboardHeightUndefined: Self = StObject.set(x, "onKeyboardHeight", js.undefined)
    
    @scala.inline
    def setOnOptionMenuClick(value: () => Unit): Self = StObject.set(x, "onOptionMenuClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOptionMenuClickUndefined: Self = StObject.set(x, "onOptionMenuClick", js.undefined)
    
    @scala.inline
    def setOnPopMenuClick(value: () => Unit): Self = StObject.set(x, "onPopMenuClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPopMenuClickUndefined: Self = StObject.set(x, "onPopMenuClick", js.undefined)
    
    @scala.inline
    def setOnPullDownRefresh(value: /* opts */ Form => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnPullIntercept(value: () => Unit): Self = StObject.set(x, "onPullIntercept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPullInterceptUndefined: Self = StObject.set(x, "onPullIntercept", js.undefined)
    
    @scala.inline
    def setOnResize(value: /* opts */ SizeWindowHeight => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    @scala.inline
    def setOnTabItemTap(value: /* obj */ From => Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
    
    @scala.inline
    def setOnTitleClick(value: () => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
  }
}
