package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainer extends js.Object {
  var container: RegisteredStyle[ViewStyle] = js.native
  var innerContainer: RegisteredStyle[ViewStyle] = js.native
  var spinner: RegisteredStyle[ViewStyle] = js.native
  var tip: RegisteredStyle[TextStyle] = js.native
  var toast: RegisteredStyle[TextStyle] = js.native
  var wrapper: RegisteredStyle[ViewStyle] = js.native
}

object AnonContainer {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    innerContainer: RegisteredStyle[ViewStyle],
    spinner: RegisteredStyle[ViewStyle],
    tip: RegisteredStyle[TextStyle],
    toast: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
  @scala.inline
  implicit class AnonContainerOps[Self <: AnonContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpinner(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTip(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToast(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

