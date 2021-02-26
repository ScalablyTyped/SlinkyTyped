package typingsSlinky.reactAlbus.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAlbus.mod.StepObject
import typingsSlinky.reactAlbus.mod.StepsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Steps {
  
  @JSImport("react-albus", "Steps")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def step(value: StepObject): this.type = set("step", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Steps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
