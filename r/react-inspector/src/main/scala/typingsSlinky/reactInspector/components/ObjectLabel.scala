package typingsSlinky.reactInspector.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactInspector.mod.ObjectLabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ObjectLabel {
  
  @JSImport("react-inspector", "ObjectLabel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def data(value: js.Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isNonenumerable(value: Boolean): this.type = set("isNonenumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ObjectLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ObjectLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
