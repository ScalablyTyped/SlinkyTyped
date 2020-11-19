package typingsSlinky.rcSteps.stepMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step
  extends Component[StepProps, js.Object, js.Any] {
  
  var onClick: MouseEventHandler[HTMLDivElement] = js.native
  
  def renderIconNode(): js.Any = js.native
}
