package typingsSlinky.reactNativeNavigation.touchablePreviewMod

import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNativeNavigation.anon.Children
import typingsSlinky.reactNativeNavigation.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
@js.native
class TouchablePreview ()
  extends Component[Props, js.Object, js.Any] {
  
  def onPress(): Unit = js.native
  
  def onPressIn(): Unit | Null = js.native
  
  var onRef: js.Any = js.native
  
  def onTouchEnd(): Unit = js.native
  
  def onTouchMove(event: SyntheticEvent[NodeHandle, NativeTouchEventWithForce]): Unit = js.native
  
  def onTouchStart(event: SyntheticEvent[NodeHandle, NativeTouchEvent]): Unit = js.native
  
  var timeout: js.Any = js.native
  
  var touchStartedAt: js.Any = js.native
}
/* static members */
@JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
@js.native
object TouchablePreview extends js.Object {
  
  var defaultProps: `0` = js.native
  
  var peeking: Boolean = js.native
  
  var propTypes: Children = js.native
}
