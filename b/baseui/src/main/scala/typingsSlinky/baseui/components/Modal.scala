package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.CloseSource
import typingsSlinky.baseui.baseuiStrings.alertdialog
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.dialog
import typingsSlinky.baseui.baseuiStrings.full
import typingsSlinky.baseui.modalMod.ModalOverrides
import typingsSlinky.baseui.modalMod.ModalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal {
  @JSImport("baseui/modal", "Modal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.modalMod.Modal] {
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def closeable(value: Boolean): this.type = set("closeable", value.asInstanceOf[js.Any])
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: /* args */ CloseSource => _): this.type = set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: ModalOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: dialog | alertdialog): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: default_ | full | auto): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def unstable_ModalBackdropScroll(value: Boolean): this.type = set("unstable_ModalBackdropScroll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

