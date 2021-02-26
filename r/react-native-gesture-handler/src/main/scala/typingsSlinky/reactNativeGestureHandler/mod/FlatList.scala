package typingsSlinky.reactNativeGestureHandler.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.FlatListProperties
import typingsSlinky.reactNativeGestureHandler.anon.Index
import typingsSlinky.reactNativeGestureHandler.anon.Item
import typingsSlinky.reactNativeGestureHandler.anon.Offset
import typingsSlinky.reactNativeGestureHandler.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-gesture-handler", "FlatList")
@js.native
class FlatList[ItemT] protected ()
  extends Component[NativeViewGestureHandlerProperties with FlatListProperties[ItemT], js.Object, js.Any] {
  def this(props: NativeViewGestureHandlerProperties with FlatListProperties[ItemT]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: NativeViewGestureHandlerProperties with FlatListProperties[ItemT], context: js.Any) = this()
  
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(params: `0`): Unit = js.native
  
  def scrollToIndex(params: Index): Unit = js.native
  
  def scrollToItem(params: Item[ItemT]): Unit = js.native
  
  def scrollToOffset(params: Offset): Unit = js.native
}
