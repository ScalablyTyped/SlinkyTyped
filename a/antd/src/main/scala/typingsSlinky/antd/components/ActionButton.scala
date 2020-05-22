package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.actionButtonMod.ActionButtonProps
import typingsSlinky.antd.actionButtonMod.default
import typingsSlinky.antd.buttonButtonMod.ButtonProps
import typingsSlinky.antd.buttonButtonMod.LegacyButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionButton {
  @JSImport("antd/lib/modal/ActionButton", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def actionFn(value: /* repeated */ js.Any => _ | js.Thenable[_]): this.type = set("actionFn", js.Any.fromFunction1(value))
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonProps(value: ButtonProps): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: LegacyButtonType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActionButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(closeModal: js.Function): Builder = {
    val __props = js.Dynamic.literal(closeModal = closeModal.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionButtonProps]))
  }
}

