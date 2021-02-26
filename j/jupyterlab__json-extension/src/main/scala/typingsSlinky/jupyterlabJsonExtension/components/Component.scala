package typingsSlinky.jupyterlabJsonExtension.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.jupyterlabJsonExtension.componentMod.IProps
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import typingsSlinky.luminoCoreutils.jsonMod.JSONValue
import typingsSlinky.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  @JSImport("@jupyterlab/json-extension/lib/component", "Component")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.jupyterlabJsonExtension.componentMod.Component] {
    
    @scala.inline
    def data(value: NonNullable[JSONValue]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataNull: this.type = set("data", null)
    
    @scala.inline
    def metadata(value: JSONObject): this.type = set("metadata", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Component.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
