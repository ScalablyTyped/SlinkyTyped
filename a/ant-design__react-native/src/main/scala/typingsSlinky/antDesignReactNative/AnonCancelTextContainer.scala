package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelTextContainer extends js.Object {
  var cancelText: RegisteredStyle[TextStyle] = js.native
  var cancelTextContainer: RegisteredStyle[ViewStyle] = js.native
  var input: RegisteredStyle[TextStyle] = js.native
  var inputWrapper: RegisteredStyle[ViewStyle] = js.native
  var search: RegisteredStyle[TextStyle] = js.native
  var wrapper: RegisteredStyle[ViewStyle] = js.native
}

object AnonCancelTextContainer {
  @scala.inline
  def apply(
    cancelText: RegisteredStyle[TextStyle],
    cancelTextContainer: RegisteredStyle[ViewStyle],
    input: RegisteredStyle[TextStyle],
    inputWrapper: RegisteredStyle[ViewStyle],
    search: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): AnonCancelTextContainer = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], cancelTextContainer = cancelTextContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelTextContainer]
  }
  @scala.inline
  implicit class AnonCancelTextContainerOps[Self <: AnonCancelTextContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelTextContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTextContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputWrapper(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
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

