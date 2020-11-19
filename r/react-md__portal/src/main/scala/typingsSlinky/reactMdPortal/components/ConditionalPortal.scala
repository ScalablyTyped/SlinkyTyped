package typingsSlinky.reactMdPortal.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdPortal.conditionalPortalMod.ConditionalPortalProps
import typingsSlinky.reactMdPortal.getContainerMod.PortalInto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConditionalPortal {
  
  @JSImport("@react-md/portal", "ConditionalPortal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def portalIntoHTMLElement(value: HTMLElement): this.type = set("portalInto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def portalIntoFunction0(value: () => HTMLElement | Null): this.type = set("portalInto", js.Any.fromFunction0(value))
    
    @scala.inline
    def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def portalIntoNull: this.type = set("portalInto", null)
    
    @scala.inline
    def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConditionalPortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ConditionalPortal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
