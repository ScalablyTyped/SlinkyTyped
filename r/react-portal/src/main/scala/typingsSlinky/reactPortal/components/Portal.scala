package typingsSlinky.reactPortal.components

import org.scalajs.dom.raw.Element
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPortal.mod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("react-portal", "Portal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPortal.mod.Portal] {
    
    @scala.inline
    def node(value: Element): this.type = set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeNull: this.type = set("node", null)
  }
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
