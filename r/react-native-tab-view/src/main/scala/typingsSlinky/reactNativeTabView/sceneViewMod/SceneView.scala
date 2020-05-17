package typingsSlinky.reactNativeTabView.sceneViewMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeTabView.anon.Loading
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneView[T /* <: Route */]
  extends Component[Props[T], State, js.Any] {
  var handleEnter: js.Any = js.native
  @JSName("state")
  var state_SceneView: Loading = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSceneView(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSceneView(prevProps: Props[T], prevState: State): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSceneView(): Unit = js.native
}

