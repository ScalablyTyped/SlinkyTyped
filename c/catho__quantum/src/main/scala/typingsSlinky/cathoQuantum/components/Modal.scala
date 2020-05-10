package typingsSlinky.cathoQuantum.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.AnonBreakpointsColors
import typingsSlinky.cathoQuantum.modalMod.ModalProps
import typingsSlinky.cathoQuantum.modalMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  @JSImport("@catho/quantum/Modal", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def theme(value: AnonBreakpointsColors): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

