package typingsSlinky.antd.errorBoundaryMod

import typingsSlinky.antd.anon.Error
import typingsSlinky.antd.anon.Info
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorBoundary
  extends Component[ErrorBoundaryProps, Error, js.Any] {
  @JSName("state")
  var state_ErrorBoundary: Info = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: Null, info: js.Object): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MErrorBoundary(error: js.Error, info: js.Object): Unit = js.native
}

