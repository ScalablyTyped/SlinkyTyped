package typingsSlinky.reactFrontload.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFrontload.mod.FrontloadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Frontload {
  
  @JSImport("react-frontload", "Frontload")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFrontload.mod.Frontload] {
    
    @scala.inline
    def noServerRender(value: Boolean): this.type = set("noServerRender", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FrontloadProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Frontload.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
