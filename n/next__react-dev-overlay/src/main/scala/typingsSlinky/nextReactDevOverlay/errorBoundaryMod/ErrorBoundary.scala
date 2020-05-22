package typingsSlinky.nextReactDevOverlay.errorBoundaryMod

import typingsSlinky.nextReactDevOverlay.anon.ComponentStack
import typingsSlinky.nextReactDevOverlay.anon.Error
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@next/react-dev-overlay/lib/internal/ErrorBoundary", "ErrorBoundary")
@js.native
class ErrorBoundary ()
  extends Component[ErrorBoundaryProps, ErrorBoundaryState, js.Any] {
  @JSName("state")
  var state_ErrorBoundary: Error = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: js.Error): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: js.Error, errorInfo: ComponentStack): Unit = js.native
}

