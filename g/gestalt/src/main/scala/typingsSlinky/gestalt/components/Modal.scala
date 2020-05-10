package typingsSlinky.gestalt.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.gestaltStrings.alertdialog
import typingsSlinky.gestalt.gestaltStrings.dialog
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import typingsSlinky.gestalt.mod.ModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  @JSImport("gestalt", "Modal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Modal] {
    @scala.inline
    def closeOnOutsideClick(value: Boolean): this.type = set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def footer(value: TagMod[Any]): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def headingReactElement(value: ReactElement): this.type = set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def heading(value: String | TagMod[Any]): this.type = set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: alertdialog | dialog): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: sm | md | lg | Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(accessibilityModalLabel: String, onDismiss: () => Unit): Builder = {
    val __props = js.Dynamic.literal(accessibilityModalLabel = accessibilityModalLabel.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    new Builder(js.Array(this.component, __props.asInstanceOf[ModalProps]))
  }
}

