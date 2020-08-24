package typingsSlinky.reactMdPortal.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdPortal.getContainerMod.PortalInto
import typingsSlinky.reactMdPortal.portalMod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal {
  @JSImport("@react-md/portal", "Portal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def intoHTMLElement(value: HTMLElement): this.type = set("into", value.asInstanceOf[js.Any])
    @scala.inline
    def intoFunction0(value: () => HTMLElement | Null): this.type = set("into", js.Any.fromFunction0(value))
    @scala.inline
    def into(value: PortalInto): this.type = set("into", value.asInstanceOf[js.Any])
    @scala.inline
    def intoNull: this.type = set("into", null)
    @scala.inline
    def intoId(value: String): this.type = set("intoId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

