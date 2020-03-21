package typingsSlinky.antdMobileRn

import slinky.core.TagMod
import typingsSlinky.antdMobileRn.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile-rn/lib/modal/prompt.native", JSImport.Namespace)
@js.native
object promptNativeMod extends js.Object {
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
}

