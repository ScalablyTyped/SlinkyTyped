package typingsSlinky.reactResizeDetector.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactResizeDetector.anon.Leading
import typingsSlinky.reactResizeDetector.mod.ReactResizeDetectorDimensions
import typingsSlinky.reactResizeDetector.mod.ReactResizeDetectorProps
import typingsSlinky.reactResizeDetector.mod.default
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.debounce
import typingsSlinky.reactResizeDetector.reactResizeDetectorStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactResizeDetector {
  @JSImport("react-resize-detector", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def handleHeight(value: Boolean): this.type = set("handleHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def handleWidth(value: Boolean): this.type = set("handleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any): this.type = set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def onResize(value: (/* width */ Double, /* height */ Double) => Unit): this.type = set("onResize", js.Any.fromFunction2(value))
    @scala.inline
    def querySelector(value: String): this.type = set("querySelector", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshMode(value: throttle | debounce): this.type = set("refreshMode", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshOptions(value: Leading): this.type = set("refreshOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def refreshRate(value: Double): this.type = set("refreshRate", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: /* props */ ReactResizeDetectorDimensions => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
    @scala.inline
    def skipOnMount(value: Boolean): this.type = set("skipOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def targetDomEl(value: HTMLElement): this.type = set("targetDomEl", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactResizeDetectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactResizeDetector.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

