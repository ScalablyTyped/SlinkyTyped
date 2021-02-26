package typingsSlinky.jupyterlabApputils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.jupyterlabApputils.toolbarMod.CommandToolbarButtonComponent.IProps
import typingsSlinky.luminoCommands.mod.CommandRegistry
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CommandToolbarButtonComponent {
  
  @scala.inline
  def apply(commands: CommandRegistry, id: String): Builder = {
    val __props = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IProps]))
  }
  
  @JSImport("@jupyterlab/apputils", "CommandToolbarButtonComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def args(value: ReadonlyJSONObject): this.type = set("args", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
