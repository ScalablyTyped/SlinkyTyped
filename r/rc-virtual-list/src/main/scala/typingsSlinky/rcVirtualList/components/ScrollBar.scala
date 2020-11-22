package typingsSlinky.rcVirtualList.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcVirtualList.scrollBarMod.ScrollBarProps
import typingsSlinky.rcVirtualList.scrollBarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollBar {
  
  @JSImport("rc-virtual-list/es/ScrollBar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ScrollBarProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    count: Double,
    height: Double,
    onScroll: Double => Unit,
    onStartMove: () => Unit,
    onStopMove: () => Unit,
    prefixCls: String,
    scrollHeight: Double,
    scrollTop: Double
  ): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(count = count.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), onStartMove = js.Any.fromFunction0(onStartMove), onStopMove = js.Any.fromFunction0(onStopMove), prefixCls = prefixCls.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[ScrollBarProps]))
  }
}
