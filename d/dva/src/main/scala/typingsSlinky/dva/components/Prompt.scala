package typingsSlinky.dva.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.Action
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.PromptProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Prompt {
  
  @JSImport("dva/router", "Prompt")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.dva.routerMod.Prompt] {
    
    @scala.inline
    def when(value: Boolean): this.type = set("when", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PromptProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
  ): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PromptProps]))
  }
}
