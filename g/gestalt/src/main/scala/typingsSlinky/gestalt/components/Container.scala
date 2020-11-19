package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gestalt.mod.ContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Container {
  
  @JSImport("gestalt", "Container")
  @js.native
  object component extends js.Object
  
  def withProps(p: ContainerProps): Default[tag.type, typingsSlinky.gestalt.mod.Container] = new Default[tag.type, typingsSlinky.gestalt.mod.Container](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Container.type): Default[tag.type, typingsSlinky.gestalt.mod.Container] = new Default[tag.type, typingsSlinky.gestalt.mod.Container](js.Array(this.component, js.Dictionary.empty))()
}
