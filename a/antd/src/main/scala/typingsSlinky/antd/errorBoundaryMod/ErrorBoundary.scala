package typingsSlinky.antd.errorBoundaryMod

import typingsSlinky.antd.AnonError
import typingsSlinky.antd.AnonInfo
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorBoundary
  extends Component[ErrorBoundaryProps, AnonError, js.Any] {
  @JSName("state")
  var state_ErrorBoundary: AnonInfo = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: Null, info: js.Object): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: js.Error, info: js.Object): Unit = js.native
}

