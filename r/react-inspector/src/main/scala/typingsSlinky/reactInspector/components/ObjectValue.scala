package typingsSlinky.reactInspector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInspector.mod.ObjectValueProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ObjectValue {
  
  @JSImport("react-inspector", "ObjectValue")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def `object`(value: js.Any): this.type = set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: js.Object): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ObjectValue.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ObjectValueProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
