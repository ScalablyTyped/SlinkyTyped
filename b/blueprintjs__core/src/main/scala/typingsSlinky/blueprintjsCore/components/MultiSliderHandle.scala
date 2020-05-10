package typingsSlinky.blueprintjsCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleInteractionKind
import typingsSlinky.blueprintjsCore.handlePropsMod.HandleType
import typingsSlinky.blueprintjsCore.handlePropsMod.IHandleProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiSliderHandle {
  @JSImport("@blueprintjs/core", "MultiSlider.Handle")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def intentAfter(value: Intent): this.type = set("intentAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def intentBefore(value: Intent): this.type = set("intentBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def interactionKind(value: HandleInteractionKind): this.type = set("interactionKind", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* newValue */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onRelease(value: /* newValue */ Double => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
    @scala.inline
    def `type`(value: HandleType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IHandleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: Double): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IHandleProps]))
  }
}

