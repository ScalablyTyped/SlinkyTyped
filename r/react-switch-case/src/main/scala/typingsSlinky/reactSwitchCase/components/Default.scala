package typingsSlinky.reactSwitchCase.components

import slinky.web.html.`*`.tag
import typingsSlinky.reactSwitchCase.mod.Default_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Default {
  
  @JSImport("react-switch-case", "Default")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): typingsSlinky.StBuildingComponent.Default[tag.type, Default_] = new typingsSlinky.StBuildingComponent.Default[tag.type, Default_](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Default.type): typingsSlinky.StBuildingComponent.Default[tag.type, Default_] = new typingsSlinky.StBuildingComponent.Default[tag.type, Default_](js.Array(this.component, js.Dictionary.empty))()
}
