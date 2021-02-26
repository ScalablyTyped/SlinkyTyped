package typingsSlinky.reactInspector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInspector.mod.ObjectNameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ObjectName {
  
  @JSImport("react-inspector", "ObjectName")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def dimmed(value: Boolean): this.type = set("dimmed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: js.Object): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ObjectName.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ObjectNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
