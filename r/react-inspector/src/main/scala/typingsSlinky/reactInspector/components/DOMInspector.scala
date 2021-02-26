package typingsSlinky.reactInspector.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInspector.mod.DOMInspectorProps
import typingsSlinky.reactInspector.mod.InspectorNodeParams
import typingsSlinky.reactInspector.mod.InspectorTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DOMInspector {
  
  @scala.inline
  def apply(data: js.Object): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DOMInspectorProps]))
  }
  
  @JSImport("react-inspector", "DOMInspector")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def expandLevel(value: Double): this.type = set("expandLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandPaths(value: String | js.Array[String]): this.type = set("expandPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandPathsVarargs(value: String*): this.type = set("expandPaths", js.Array(value :_*))
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeRenderer(value: /* params */ InspectorNodeParams => ReactElement): this.type = set("nodeRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: InspectorTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DOMInspectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
