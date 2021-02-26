package typingsSlinky.reactNavigationNative.anon

import typingsSlinky.reactNavigationNative.useScrollToTopMod.ScrollableView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollToOffset extends ScrollableView {
  
  def scrollToOffset(options: Animated): Unit = js.native
}
object ScrollToOffset {
  
  @scala.inline
  def apply(scrollToOffset: Animated => Unit): ScrollToOffset = {
    val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
    __obj.asInstanceOf[ScrollToOffset]
  }
  
  @scala.inline
  implicit class ScrollToOffsetMutableBuilder[Self <: ScrollToOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollToOffset(value: Animated => Unit): Self = StObject.set(x, "scrollToOffset", js.Any.fromFunction1(value))
  }
}
