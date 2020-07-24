package typingsSlinky.reactNativeGestureHandler.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.FlatListProperties
import typingsSlinky.reactNativeGestureHandler.anon.Index
import typingsSlinky.reactNativeGestureHandler.anon.Item
import typingsSlinky.reactNativeGestureHandler.anon.Offset
import typingsSlinky.reactNativeGestureHandler.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-gesture-handler", "FlatList")
@js.native
class FlatList[ItemT] ()
  extends Component[NativeViewGestureHandlerProperties with FlatListProperties[ItemT], js.Object, js.Any] {
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(params: `0`): Unit = js.native
  def scrollToIndex(params: Index): Unit = js.native
  def scrollToItem(params: Item[ItemT]): Unit = js.native
  def scrollToOffset(params: Offset): Unit = js.native
}

