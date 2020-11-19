package typingsSlinky.reactSwitchCase.components

import slinky.web.html.`*`.tag
import typingsSlinky.reactSwitchCase.mod.SwitchProps
import typingsSlinky.reactSwitchCase.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSwitchCase {
  
  @JSImport("react-switch-case", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SwitchProps): typingsSlinky.StBuildingComponent.Default[tag.type, default] = new typingsSlinky.StBuildingComponent.Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(condition: js.Any): typingsSlinky.StBuildingComponent.Default[tag.type, default] = {
    val __props = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[SwitchProps]))
  }
}
