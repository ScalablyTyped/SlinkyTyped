package typingsSlinky.rcResizeObserver.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcResizeObserver.anon.Height
import typingsSlinky.rcResizeObserver.mod.ResizeObserverProps
import typingsSlinky.rcResizeObserver.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcResizeObserver {
  
  @JSImport("rc-resize-observer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResize(value: /* size */ Height => Unit): this.type = set("onResize", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: RcResizeObserver.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ResizeObserverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
