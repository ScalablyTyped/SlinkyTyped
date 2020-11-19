package typingsSlinky.reactBootstrap.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactBootstrap.mediaBodyMod.MediaBodyProps
import typingsSlinky.reactBootstrap.mediaBodyMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaBody {
  
  @JSImport("react-bootstrap/lib/MediaBody", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def componentClassFunctionComponent(value: ReactComponentClass[_]): this.type = set("componentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentClassComponentClass(value: ReactComponentClass[_]): this.type = set("componentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentClass(value: ReactType[_]): this.type = set("componentClass", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MediaBodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MediaBody.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
