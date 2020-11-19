package typingsSlinky.expo.rootErrorBoundaryMod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootErrorBoundary
  extends Component[Props, State, js.Any] {
  
  def _subscribeToGlobalErrors(): Unit = js.native
  
  def _unsubscribeFromGlobalErrors(): Unit = js.native
  
  @JSName("componentDidCatch")
  def componentDidCatch_MRootErrorBoundary(error: js.Error, _errorInfo: js.Any): Unit = js.native
}
