package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.AnonEvent
import typingsSlinky.gestalt.AnonPath
import typingsSlinky.gestalt.gestaltStrings.blue
import typingsSlinky.gestalt.gestaltStrings.darkGray
import typingsSlinky.gestalt.gestaltStrings.gray
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.lightGray
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.orange
import typingsSlinky.gestalt.gestaltStrings.red
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.gestaltStrings.transparent
import typingsSlinky.gestalt.gestaltStrings.transparentDarkGray
import typingsSlinky.gestalt.gestaltStrings.white
import typingsSlinky.gestalt.gestaltStrings.xl
import typingsSlinky.gestalt.gestaltStrings.xs
import typingsSlinky.gestalt.mod.IconButtonProps
import typingsSlinky.gestalt.mod.Icons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconButton {
  @JSImport("gestalt", "IconButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.IconButton] {
    @scala.inline
    def accessibilityExpanded(value: Boolean): this.type = set("accessibilityExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityHaspopup(value: Boolean): this.type = set("accessibilityHaspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def bgColor(value: transparent | transparentDarkGray | gray | lightGray | white | blue): this.type = set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def dangerouslySetSvgPath(value: AnonPath): this.type = set("dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: Icons): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconColor(value: blue | darkGray | gray | red | white | orange): this.type = set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* args */ AnonEvent => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: xs | sm | md | lg | xl): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(accessibilityLabel: String): Builder = {
    val __props = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconButtonProps]))
  }
}

