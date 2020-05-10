package typingsSlinky.reactVirtualized.components

import org.scalajs.dom.raw.Element
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVirtualized.AnonHeight
import typingsSlinky.reactVirtualized.AnonScrollLeft
import typingsSlinky.reactVirtualized.esWindowScrollerMod.WindowScrollerProps
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WindowScroller {
  @JSImport("react-virtualized", "WindowScroller")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.WindowScroller] {
    @scala.inline
    def onResize(value: /* params */ AnonHeight => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def onScroll(value: /* params */ AnonScrollLeft => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def scrollElementElement(value: Element): this.type = set("scrollElement", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollElement(value: (Window_ with (/* globalThis */ js.Any)) | Element): this.type = set("scrollElement", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollingResetTimeInterval(value: Double): this.type = set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def serverHeight(value: Double): this.type = set("serverHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def serverWidth(value: Double): this.type = set("serverWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: WindowScrollerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: WindowScroller.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

