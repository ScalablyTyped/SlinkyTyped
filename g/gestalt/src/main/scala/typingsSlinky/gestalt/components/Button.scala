package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.Event
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.button
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.submit
import typingsSlinky.gestalt.gestaltStrings.transparent
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.mod.ButtonProps
import typingsSlinky.gestalt.mod.Icons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("gestalt", "Button")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Button] {
    @scala.inline
    def accessibilityExpanded(value: Boolean): this.type = set("accessibilityExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityHaspopup(value: Boolean): this.type = set("accessibilityHaspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: blue | gray | red | transparent | white): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def iconEnd(value: Icons): this.type = set("iconEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* args */ Event => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def size(value: sm | md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def textColor(value: blue | red | darkGray | white): this.type = set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: submit | button): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonProps]))
  }
}

