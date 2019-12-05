package typingsSlinky.atAntDashDesignReactDashNative

import typingsSlinky.reactDashNative.reactDashNativeMod.RegisteredStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerCount extends js.Object {
  var container: RegisteredStyle[ViewStyle]
  var count: RegisteredStyle[ViewStyle]
  var errorIcon: RegisteredStyle[ViewStyle]
  var icon: RegisteredStyle[ViewStyle]
  var input: RegisteredStyle[TextStyle]
}

object Anon_ContainerCount {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    count: RegisteredStyle[ViewStyle],
    errorIcon: RegisteredStyle[ViewStyle],
    icon: RegisteredStyle[ViewStyle],
    input: RegisteredStyle[TextStyle]
  ): Anon_ContainerCount = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContainerCount]
  }
}

