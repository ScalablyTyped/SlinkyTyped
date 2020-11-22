package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gestalt.anon.Children
import typingsSlinky.gestalt.mod.ModuleExpandableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Module {
  
  @JSImport("gestalt", "Module")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): SharedBuilder_Object_159303587[typingsSlinky.gestalt.mod.Module] = new SharedBuilder_Object_159303587[typingsSlinky.gestalt.mod.Module](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Module.type): SharedBuilder_Object_159303587[typingsSlinky.gestalt.mod.Module] = new SharedBuilder_Object_159303587[typingsSlinky.gestalt.mod.Module](js.Array(this.component, js.Dictionary.empty))()
  
  object Expandable {
    
    @JSImport("gestalt", "Module.Expandable")
    @js.native
    object component extends js.Object
    
    def withProps(p: ModuleExpandableProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(
      accessibilityCollapseLabel: String,
      accessibilityExpandLabel: String,
      id: String,
      items: js.Array[Children]
    ): Default[tag.type, js.Object] = {
      val __props = js.Dynamic.literal(accessibilityCollapseLabel = accessibilityCollapseLabel.asInstanceOf[js.Any], accessibilityExpandLabel = accessibilityExpandLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ModuleExpandableProps]))
    }
  }
}
