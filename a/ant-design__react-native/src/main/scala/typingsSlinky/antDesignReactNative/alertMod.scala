package typingsSlinky.antDesignReactNative

import slinky.core.TagMod
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Namespace)
@js.native
object alertMod extends js.Object {
  def default(title: TagMod[Any], content: TagMod[Any]): Double = js.native
  def default(title: TagMod[Any], content: TagMod[Any], actions: js.Array[Action[TextStyle]]): Double = js.native
  def default(
    title: TagMod[Any],
    content: TagMod[Any],
    actions: js.Array[Action[TextStyle]],
    onBackHandler: CallbackOnBackHandler
  ): Double = js.native
}

