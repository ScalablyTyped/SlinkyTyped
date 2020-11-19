package typingsSlinky.materialUiCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CreateGenerateClassName {
  
  @JSImport("@material-ui/core/styles/createGenerateClassName", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CreateGenerateClassName.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
