package typingsSlinky.reactDashVirtualized

import org.scalajs.dom.raw.Window
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`0`
import typingsSlinky.reactDashVirtualized.reactDashVirtualizedNumbers.`150`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0150OnResize extends js.Object {
  var scrollElement: js.UndefOr[Window] = js.undefined
  var scrollingResetTimeInterval: `150`
  var serverHeight: `0`
  var serverWidth: `0`
  def onResize(): Unit
  def onScroll(): Unit
}

object Anon_0150OnResize {
  @scala.inline
  def apply(
    onResize: () => Unit,
    onScroll: () => Unit,
    scrollingResetTimeInterval: `150`,
    serverHeight: `0`,
    serverWidth: `0`,
    scrollElement: Window = null
  ): Anon_0150OnResize = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction0(onResize), onScroll = js.Any.fromFunction0(onScroll), scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], serverHeight = serverHeight.asInstanceOf[js.Any], serverWidth = serverWidth.asInstanceOf[js.Any])
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0150OnResize]
  }
}

