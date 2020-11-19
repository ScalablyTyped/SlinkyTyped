package typingsSlinky.reactSwitchCase.components

import slinky.web.html.`*`.tag
import typingsSlinky.reactSwitchCase.mod.CaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Case {
  
  @JSImport("react-switch-case", "Case")
  @js.native
  object component extends js.Object
  
  def withProps(p: CaseProps): typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.reactSwitchCase.mod.Case] = new typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.reactSwitchCase.mod.Case](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: js.Any): typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.reactSwitchCase.mod.Case] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new typingsSlinky.StBuildingComponent.Default[tag.type, typingsSlinky.reactSwitchCase.mod.Case](js.Array(this.component, __props.asInstanceOf[CaseProps]))
  }
}
