package typingsSlinky.gatsbyCli.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gatsbyCli.spinnerMod.ISpinnerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spinner {
  
  @scala.inline
  def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ISpinnerProps]))
  }
  
  @JSImport("gatsby-cli/lib/reporter/loggers/ink/components/spinner", "Spinner")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def statusText(value: String): this.type = set("statusText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ISpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
