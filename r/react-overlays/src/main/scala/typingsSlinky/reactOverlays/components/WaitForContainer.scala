package typingsSlinky.reactOverlays.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOverlays.waitForContainerMod.WaitForContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WaitForContainer {
  
  @JSImport("react-overlays", "WaitForContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.WaitForContainer] {
    
    @scala.inline
    def containerReactElement(value: ReactElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: ReactElement | js.Function): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onContainerResolved(value: js.Function): this.type = set("onContainerResolved", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: WaitForContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: WaitForContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
