package typingsSlinky.reactContentLoader.svgMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactContentLoader.anon.Offset
import typingsSlinky.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeSvg
  extends Component[RequiredIContentLoaderProps, State, js.Any] {
  var animatedValue: Value = js.native
  var idClip: String = js.native
  var idGradient: String = js.native
  @JSName("state")
  var state_NativeSvg: Offset = js.native
  @JSName("componentDidMount")
  def componentDidMount_MNativeSvg(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MNativeSvg(): Unit = js.native
  def setAnimation(): Unit = js.native
}

