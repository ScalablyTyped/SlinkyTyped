package typingsSlinky.reactPortal.components

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPortal.mod.PortalWithStateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortalWithState {
  @JSImport("react-portal", "PortalWithState")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPortal.mod.PortalWithState] {
    @scala.inline
    def closeOnEsc(value: Boolean): this.type = set("closeOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnOutsideClick(value: Boolean): this.type = set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def node(value: Element): this.type = set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeNull: this.type = set("node", null)
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def onOpen(value: () => Unit): this.type = set("onOpen", js.Any.fromFunction0(value))
    @scala.inline
    def openByClickOn(value: ReactElement): this.type = set("openByClickOn", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PortalWithStateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PortalWithState.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

