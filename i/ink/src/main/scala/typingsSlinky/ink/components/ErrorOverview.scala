package typingsSlinky.ink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.ink.errorOverviewMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorOverview {
  
  @JSImport("ink/build/components/ErrorOverview", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(error: js.Error): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
