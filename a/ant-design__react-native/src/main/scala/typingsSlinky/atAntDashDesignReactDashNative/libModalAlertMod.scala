package typingsSlinky.atAntDashDesignReactDashNative

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.Action
import typingsSlinky.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Namespace)
@js.native
object libModalAlertMod extends js.Object {
  def default(title: TagMod[Any], content: TagMod[Any]): Unit = js.native
  def default(title: TagMod[Any], content: TagMod[Any], actions: js.Array[Action[TextStyle]]): Unit = js.native
  def default(
    title: TagMod[Any],
    content: TagMod[Any],
    actions: js.Array[Action[TextStyle]],
    onBackHandler: CallbackOnBackHandler
  ): Unit = js.native
}

