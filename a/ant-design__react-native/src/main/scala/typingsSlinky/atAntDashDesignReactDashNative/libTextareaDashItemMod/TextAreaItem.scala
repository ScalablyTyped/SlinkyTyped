package typingsSlinky.atAntDashDesignReactDashNative.libTextareaDashItemMod

import typingsSlinky.atAntDashDesignReactDashNative.Anon_NativeEventAnonContentSize
import typingsSlinky.atAntDashDesignReactDashNative.libStyleMod.Theme
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInput
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputChangeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaItem
  extends Component[TextareaItemProps, js.Any, js.Any] {
  var textAreaRef: TextInput | Null = js.native
  def getHeight(theme: Theme): js.Any = js.native
  def onChange(event: NativeSyntheticEvent[TextInputChangeEventData]): Unit = js.native
  def onContentSizeChange(theme: Theme): js.Function1[/* event */ Anon_NativeEventAnonContentSize, Unit] = js.native
}

