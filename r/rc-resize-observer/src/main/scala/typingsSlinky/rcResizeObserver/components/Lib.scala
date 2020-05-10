package typingsSlinky.rcResizeObserver.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcResizeObserver.AnonHeight
import typingsSlinky.rcResizeObserver.mod.ResizeObserverProps
import typingsSlinky.rcResizeObserver.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  @JSImport("rc-resize-observer/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def onResize(value: /* size */ AnonHeight => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ResizeObserverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Lib.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

