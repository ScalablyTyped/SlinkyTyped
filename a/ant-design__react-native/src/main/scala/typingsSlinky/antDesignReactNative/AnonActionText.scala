package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActionText extends js.Object {
  var actionText: RegisteredStyle[TextStyle] = js.native
  var dismissText: RegisteredStyle[TextStyle] = js.native
  var header: RegisteredStyle[ViewStyle] = js.native
  var headerItem: RegisteredStyle[ViewStyle] = js.native
  var modal: RegisteredStyle[ViewStyle] = js.native
  var okText: RegisteredStyle[TextStyle] = js.native
  var title: RegisteredStyle[TextStyle] = js.native
}

object AnonActionText {
  @scala.inline
  def apply(
    actionText: RegisteredStyle[TextStyle],
    dismissText: RegisteredStyle[TextStyle],
    header: RegisteredStyle[ViewStyle],
    headerItem: RegisteredStyle[ViewStyle],
    modal: RegisteredStyle[ViewStyle],
    okText: RegisteredStyle[TextStyle],
    title: RegisteredStyle[TextStyle]
  ): AnonActionText = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionText]
  }
  @scala.inline
  implicit class AnonActionTextOps[Self <: AnonActionText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderItem(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModal(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOkText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

