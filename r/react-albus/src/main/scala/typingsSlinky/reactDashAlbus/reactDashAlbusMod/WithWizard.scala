package typingsSlinky.reactDashAlbus.reactDashAlbusMod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-albus", "WithWizard")
@js.native
class WithWizard protected ()
  extends Component[WizardContextRenderProps, ComponentState, js.Any] {
  def this(props: WizardContextRenderProps) = this()
  def this(props: WizardContextRenderProps, context: js.Any) = this()
}

@JSImport("react-albus", "WithWizard")
@js.native
object WithWizard extends TopLevel[ComponentType[WizardContextRenderProps]]

@JSImport("react-albus", "withWizard")
@js.native
object withWizard extends js.Object {
  def apply[P](component: ReactComponentClass[P with WizardComponentProps]): ReactComponentClass[P] = js.native
}

