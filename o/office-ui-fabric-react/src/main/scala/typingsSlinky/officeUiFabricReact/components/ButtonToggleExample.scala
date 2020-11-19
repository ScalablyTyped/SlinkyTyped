package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.buttonToggleExampleMod.IButtonExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonToggleExample {
  
  @JSImport("office-ui-fabric-react/lib/components/Button/examples/Button.Toggle.Example", "ButtonToggleExample")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IButtonExampleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ButtonToggleExample.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
