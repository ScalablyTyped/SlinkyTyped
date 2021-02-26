package typingsSlinky.materialUiCore.components

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.portalPortalMod.PortalProps
import typingsSlinky.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("@material-ui/core", "Portal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUiCore.mod.Portal] {
    
    @scala.inline
    def container(value: ReactInstance | js.Function0[ReactInstance]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerComponent(value: ReactComponentClass[js.Any]): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerElement(value: Element): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerFunction0(value: () => ReactInstance): this.type = set("container", js.Any.fromFunction0(value))
    
    @scala.inline
    def containerNull: this.type = set("container", null)
    
    @scala.inline
    def disablePortal(value: Boolean): this.type = set("disablePortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRendered(value: () => Unit): this.type = set("onRendered", js.Any.fromFunction0(value))
  }
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
