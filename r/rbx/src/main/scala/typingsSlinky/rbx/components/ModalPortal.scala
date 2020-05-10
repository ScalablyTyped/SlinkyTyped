package typingsSlinky.rbx.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rbx.modalPortalMod.ModalPortalModifierProps
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModalPortal {
  @JSImport("rbx/components/modal/modal-portal", "ModalPortal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rbx.modalPortalMod.ModalPortal] {
    @scala.inline
    def asFunctionComponent(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def asComponentClass(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clipped(value: Boolean): this.type = set("clipped", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnBlur(value: Boolean): this.type = set("closeOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnEsc(value: Boolean): this.type = set("closeOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefRefObject(value: ReactRef[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefFunction1(value: /* instance */ HTMLElement | SVGElement | ReactComponentClass[js.Object] | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
  }
  
  def withProps(p: ModalPortalModifierProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(document: Document_): Builder = {
    val __props = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ModalPortalModifierProps]))
  }
}

