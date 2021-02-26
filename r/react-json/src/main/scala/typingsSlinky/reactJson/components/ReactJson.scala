package typingsSlinky.reactJson.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactJson.mod.JsonProperties
import typingsSlinky.reactJson.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactJson {
  
  @scala.inline
  def apply(value: js.Any): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[JsonProperties]))
  }
  
  @JSImport("react-json", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def onChange(value: /* value */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  }
  
  def withProps(p: JsonProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
