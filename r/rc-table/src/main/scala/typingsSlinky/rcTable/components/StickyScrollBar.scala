package typingsSlinky.rcTable.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactRef
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcTable.anon.`0`
import typingsSlinky.rcTable.stickyScrollBarMod.StickyScrollBarProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StickyScrollBar {
  
  @JSImport("rc-table/lib/stickyScrollBar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: StickyScrollBarProps with RefAttributes[js.Any]): Default[tag.type, js.Any with js.Object] = new Default[tag.type, js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    container: HTMLElement | Window,
    offsetScroll: Double,
    onScroll: `0` => Unit,
    scrollBodyRef: ReactRef[HTMLDivElement]
  ): Default[tag.type, js.Any with js.Object] = {
    val __props = js.Dynamic.literal(container = container.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), scrollBodyRef = scrollBodyRef.asInstanceOf[js.Any])
    new Default[tag.type, js.Any with js.Object](js.Array(this.component, __props.asInstanceOf[StickyScrollBarProps with RefAttributes[js.Any]]))
  }
}
