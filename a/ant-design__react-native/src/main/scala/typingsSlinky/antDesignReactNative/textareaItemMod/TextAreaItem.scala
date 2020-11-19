package typingsSlinky.antDesignReactNative.textareaItemMod

import slinky.core.SyntheticEvent
import typingsSlinky.antDesignReactNative.anon.NativeEventContentSize
import typingsSlinky.antDesignReactNative.libStyleMod.Theme
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.TextInput
import typingsSlinky.reactNative.mod.TextInputChangeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaItem
  extends Component[TextareaItemProps, js.Any, js.Any] {
  
  def getHeight(theme: Theme): js.Any = js.native
  
  def onChange(event: SyntheticEvent[NodeHandle, TextInputChangeEventData]): Unit = js.native
  
  def onContentSizeChange(theme: Theme): js.Function1[/* event */ NativeEventContentSize, Unit] = js.native
  
  var textAreaRef: TextInput | Null = js.native
}
