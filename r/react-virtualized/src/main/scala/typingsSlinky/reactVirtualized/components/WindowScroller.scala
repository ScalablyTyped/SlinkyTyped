package typingsSlinky.reactVirtualized.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Window
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVirtualized.anon.Height
import typingsSlinky.reactVirtualized.anon.ScrollLeft
import typingsSlinky.reactVirtualized.esWindowScrollerMod.WindowScrollerChildProps
import typingsSlinky.reactVirtualized.esWindowScrollerMod.WindowScrollerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WindowScroller {
  
  @scala.inline
  def apply(children: WindowScrollerChildProps => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[WindowScrollerProps]))
  }
  
  @JSImport("react-virtualized", "WindowScroller")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.WindowScroller] {
    
    @scala.inline
    def onResize(value: /* params */ Height => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: /* params */ ScrollLeft => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def scrollElement(value: (Window with (/* globalThis */ js.Any)) | Element): this.type = set("scrollElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollElementElement(value: Element): this.type = set("scrollElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollingResetTimeInterval(value: Double): this.type = set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def serverHeight(value: Double): this.type = set("serverHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def serverWidth(value: Double): this.type = set("serverWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: WindowScrollerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
