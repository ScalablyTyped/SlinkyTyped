package typingsSlinky.reactNavigationNative

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.reactNavigationNative.anon.Animated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollToTopMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useScrollToTop", JSImport.Default)
  @js.native
  def default(ref: ReactRef[ScrollableWrapper]): Unit = js.native
  
  @js.native
  trait ScrollOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object ScrollOptions {
    
    @scala.inline
    def apply(): ScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollOptions]
    }
    
    @scala.inline
    implicit class ScrollOptionsMutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNavigationNative.anon.ScrollToTop
    - typingsSlinky.reactNavigationNative.anon.ScrollTo
    - typingsSlinky.reactNavigationNative.anon.ScrollToOffset
    - typingsSlinky.reactNavigationNative.anon.ScrollResponderScrollTo
  */
  trait ScrollableView extends ScrollableWrapper
  object ScrollableView {
    
    @scala.inline
    def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): typingsSlinky.reactNavigationNative.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.ScrollResponderScrollTo]
    }
    
    @scala.inline
    def ScrollTo(scrollTo: ScrollOptions => Unit): typingsSlinky.reactNavigationNative.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.ScrollTo]
    }
    
    @scala.inline
    def ScrollToOffset(scrollToOffset: Animated => Unit): typingsSlinky.reactNavigationNative.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.ScrollToOffset]
    }
    
    @scala.inline
    def ScrollToTop(scrollToTop: () => Unit): typingsSlinky.reactNavigationNative.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.ScrollToTop]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNavigationNative.anon.GetScrollResponder
    - typingsSlinky.reactNavigationNative.anon.GetNode
    - typingsSlinky.reactNavigationNative.useScrollToTopMod.ScrollableView
  */
  trait ScrollableWrapper extends StObject
  object ScrollableWrapper {
    
    @scala.inline
    def GetNode(getNode: () => ScrollableView): typingsSlinky.reactNavigationNative.anon.GetNode = {
      val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.GetNode]
    }
    
    @scala.inline
    def GetScrollResponder(getScrollResponder: () => ReactElement): typingsSlinky.reactNavigationNative.anon.GetScrollResponder = {
      val __obj = js.Dynamic.literal(getScrollResponder = js.Any.fromFunction0(getScrollResponder))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.GetScrollResponder]
    }
    
    @scala.inline
    def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): typingsSlinky.reactNavigationNative.anon.ScrollResponderScrollTo = {
      val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.ScrollResponderScrollTo]
    }
    
    @scala.inline
    def ScrollTo(scrollTo: ScrollOptions => Unit): typingsSlinky.reactNavigationNative.anon.ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.ScrollTo]
    }
    
    @scala.inline
    def ScrollToOffset(scrollToOffset: Animated => Unit): typingsSlinky.reactNavigationNative.anon.ScrollToOffset = {
      val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.ScrollToOffset]
    }
    
    @scala.inline
    def ScrollToTop(scrollToTop: () => Unit): typingsSlinky.reactNavigationNative.anon.ScrollToTop = {
      val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
      __obj.asInstanceOf[typingsSlinky.reactNavigationNative.anon.ScrollToTop]
    }
  }
}
