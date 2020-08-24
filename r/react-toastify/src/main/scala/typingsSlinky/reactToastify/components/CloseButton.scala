package typingsSlinky.reactToastify.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToastify.closeButtonMod.CloseButtonProps
import typingsSlinky.reactToastify.typesMod.TypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CloseButton {
  @JSImport("react-toastify/dist/components", "CloseButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CloseButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(closeToast: SyntheticMouseEvent[HTMLElement] => Unit, `type`: TypeOptions): Builder = {
    val __props = js.Dynamic.literal(closeToast = js.Any.fromFunction1(closeToast))
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CloseButtonProps]))
  }
}

