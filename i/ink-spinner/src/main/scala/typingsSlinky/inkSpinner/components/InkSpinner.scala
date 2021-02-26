package typingsSlinky.inkSpinner.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cliSpinners.mod.SpinnerName
import typingsSlinky.inkSpinner.mod.SpinnerProps
import typingsSlinky.inkSpinner.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkSpinner {
  
  @JSImport("ink-spinner", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def `type`(value: SpinnerName): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InkSpinner.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
