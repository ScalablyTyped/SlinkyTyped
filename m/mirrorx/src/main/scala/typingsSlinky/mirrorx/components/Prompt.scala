package typingsSlinky.mirrorx.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.mirrorx.mod.PromptProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Prompt {
  
  @scala.inline
  def apply(message: String | (js.Function1[/* location */ Location[LocationState], String | Boolean])): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PromptProps]))
  }
  
  @JSImport("mirrorx", "Prompt")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mirrorx.mod.Prompt] {
    
    @scala.inline
    def when(value: Boolean): this.type = set("when", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PromptProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
