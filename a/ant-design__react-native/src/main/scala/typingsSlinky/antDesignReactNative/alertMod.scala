package typingsSlinky.antDesignReactNative

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/modal/alert", JSImport.Namespace)
@js.native
object alertMod extends js.Object {
  
  def default(title: ReactElement, content: ReactElement): Double = js.native
  def default(
    title: ReactElement,
    content: ReactElement,
    actions: js.UndefOr[scala.Nothing],
    onBackHandler: CallbackOnBackHandler
  ): Double = js.native
  def default(title: ReactElement, content: ReactElement, actions: js.Array[Action[TextStyle]]): Double = js.native
  def default(
    title: ReactElement,
    content: ReactElement,
    actions: js.Array[Action[TextStyle]],
    onBackHandler: CallbackOnBackHandler
  ): Double = js.native
}
