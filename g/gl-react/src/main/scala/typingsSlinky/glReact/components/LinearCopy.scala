package typingsSlinky.glReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.glReact.mod.LinearCopyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearCopy {
  
  @JSImport("gl-react", "LinearCopy")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.glReact.mod.LinearCopy] {
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinearCopyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LinearCopy.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
