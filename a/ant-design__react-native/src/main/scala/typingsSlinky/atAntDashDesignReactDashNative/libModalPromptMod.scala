package typingsSlinky.atAntDashDesignReactDashNative

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOrActions
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/prompt", JSImport.Namespace)
@js.native
object libModalPromptMod extends js.Object {
  def default(title: TagMod[Any], message: TagMod[Any], callbackOrActions: CallbackOrActions[TextStyle]): Unit = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String
  ): Unit = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String
  ): Unit = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): Unit = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String],
    onBackHandler: CallbackOnBackHandler
  ): Unit = js.native
}

