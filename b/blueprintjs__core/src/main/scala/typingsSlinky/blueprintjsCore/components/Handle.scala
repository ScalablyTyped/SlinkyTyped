package typingsSlinky.blueprintjsCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.handleMod.IInternalHandleProps
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleInteractionKind
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleType
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Handle {
  @JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.handleMod.Handle] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def intentAfter(value: Intent): this.type = set("intentAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def intentBefore(value: Intent): this.type = set("intentBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def interactionKind(value: HandleInteractionKind): this.type = set("interactionKind", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* newValue */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onRelease(value: /* newValue */ Double => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
    @scala.inline
    def stepSize(value: Double): this.type = set("stepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def tickSize(value: Double): this.type = set("tickSize", value.asInstanceOf[js.Any])
    @scala.inline
    def tickSizeRatio(value: Double): this.type = set("tickSizeRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: HandleType): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IInternalHandleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(label: ReactChild, value: Double): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IInternalHandleProps]))
  }
}

