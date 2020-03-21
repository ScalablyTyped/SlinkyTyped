package typingsSlinky.antDesignReactNative

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/prompt", JSImport.Namespace)
@js.native
object promptMod extends js.Object {
  def default(title: TagMod[Any], message: TagMod[Any], callbackOrActions: CallbackOrActions[TextStyle]): js.UndefOr[Double] = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String
  ): js.UndefOr[Double] = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String
  ): js.UndefOr[Double] = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String]
  ): js.UndefOr[Double] = js.native
  def default(
    title: TagMod[Any],
    message: TagMod[Any],
    callbackOrActions: CallbackOrActions[TextStyle],
    `type`: String,
    defaultValue: String,
    placeholders: js.Array[String],
    onBackHandler: CallbackOnBackHandler
  ): js.UndefOr[Double] = js.native
}

