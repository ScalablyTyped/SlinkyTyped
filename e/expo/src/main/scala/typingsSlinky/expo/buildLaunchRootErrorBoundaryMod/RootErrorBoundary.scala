package typingsSlinky.expo.buildLaunchRootErrorBoundaryMod

import typingsSlinky.expo.Anon_ErrorNull
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootErrorBoundary
  extends Component[Props, State, js.Any] {
  var _appLoadingIsMounted: Boolean = js.native
  @JSName("state")
  var state_RootErrorBoundary: Anon_ErrorNull = js.native
  def _subscribeToGlobalErrors(): Unit = js.native
  def _unsubscribeFromGlobalErrors(): Unit = js.native
  @JSName("componentDidCatch")
  def componentDidCatch_MRootErrorBoundary(error: js.Error): Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MRootErrorBoundary(): Unit = js.native
}

