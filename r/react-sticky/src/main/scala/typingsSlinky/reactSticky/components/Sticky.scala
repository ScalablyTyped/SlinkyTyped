package typingsSlinky.reactSticky.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSticky.mod.StickyChildArgs
import typingsSlinky.reactSticky.mod.StickyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sticky {
  @JSImport("react-sticky", "Sticky")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSticky.mod.Sticky] {
    @scala.inline
    def bottomOffset(value: Double): this.type = set("bottomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disableCompensation(value: Boolean): this.type = set("disableCompensation", value.asInstanceOf[js.Any])
    @scala.inline
    def disableHardwareAcceleration(value: Boolean): this.type = set("disableHardwareAcceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def onStickyStateChange(value: /* isSticky */ Boolean => Unit): this.type = set("onStickyStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def relative(value: Boolean): this.type = set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def stickyClassName(value: String): this.type = set("stickyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def stickyStyle(value: js.Any): this.type = set("stickyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def topOffset(value: Double): this.type = set("topOffset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StickyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: StickyChildArgs => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[StickyProps]))
  }
}

