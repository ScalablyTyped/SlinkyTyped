package typingsSlinky.reactNavigationNative.useScrollToTopMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNavigationNative.anon.Animated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigationNative.anon.GetScrollResponder
  - typingsSlinky.reactNavigationNative.anon.GetNode
  - typingsSlinky.reactNavigationNative.useScrollToTopMod.ScrollableView
*/
trait ScrollableWrapper extends js.Object
object ScrollableWrapper {
  
  @scala.inline
  def ScrollToTop(scrollToTop: () => Unit): ScrollableWrapper = {
    val __obj = js.Dynamic.literal(scrollToTop = js.Any.fromFunction0(scrollToTop))
    __obj.asInstanceOf[ScrollableWrapper]
  }
  
  @scala.inline
  def GetNode(getNode: () => ScrollableView): ScrollableWrapper = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
    __obj.asInstanceOf[ScrollableWrapper]
  }
  
  @scala.inline
  def ScrollToOffset(scrollToOffset: Animated => Unit): ScrollableWrapper = {
    val __obj = js.Dynamic.literal(scrollToOffset = js.Any.fromFunction1(scrollToOffset))
    __obj.asInstanceOf[ScrollableWrapper]
  }
  
  @scala.inline
  def GetScrollResponder(getScrollResponder: () => ReactElement): ScrollableWrapper = {
    val __obj = js.Dynamic.literal(getScrollResponder = js.Any.fromFunction0(getScrollResponder))
    __obj.asInstanceOf[ScrollableWrapper]
  }
  
  @scala.inline
  def ScrollResponderScrollTo(scrollResponderScrollTo: ScrollOptions => Unit): ScrollableWrapper = {
    val __obj = js.Dynamic.literal(scrollResponderScrollTo = js.Any.fromFunction1(scrollResponderScrollTo))
    __obj.asInstanceOf[ScrollableWrapper]
  }
  
  @scala.inline
  def ScrollTo(scrollTo: ScrollOptions => Unit): ScrollableWrapper = {
    val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
    __obj.asInstanceOf[ScrollableWrapper]
  }
}
