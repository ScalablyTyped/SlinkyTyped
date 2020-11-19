package typingsSlinky.reactOverlays.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.portalMod.PortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("react-overlays", "Portal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.Portal] {
    
    @scala.inline
    def containerReactElement(value: ReactElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: ReactElement | js.Function): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRendered(value: js.Function): this.type = set("onRendered", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
