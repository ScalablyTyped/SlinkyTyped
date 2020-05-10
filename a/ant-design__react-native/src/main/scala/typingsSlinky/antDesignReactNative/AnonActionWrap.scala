package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActionWrap extends js.Object {
  var actionWrap: RegisteredStyle[ViewStyle] = js.native
  var close: RegisteredStyle[TextStyle] = js.native
  var container: RegisteredStyle[ViewStyle] = js.native
  var content: RegisteredStyle[TextStyle] = js.native
  var left15: RegisteredStyle[ViewStyle] = js.native
  var left6: RegisteredStyle[ViewStyle] = js.native
  var link: RegisteredStyle[TextStyle] = js.native
  var notice: RegisteredStyle[ViewStyle] = js.native
}

object AnonActionWrap {
  @scala.inline
  def apply(
    actionWrap: RegisteredStyle[ViewStyle],
    close: RegisteredStyle[TextStyle],
    container: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[TextStyle],
    left15: RegisteredStyle[ViewStyle],
    left6: RegisteredStyle[ViewStyle],
    link: RegisteredStyle[TextStyle],
    notice: RegisteredStyle[ViewStyle]
  ): AnonActionWrap = {
    val __obj = js.Dynamic.literal(actionWrap = actionWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], left15 = left15.asInstanceOf[js.Any], left6 = left6.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionWrap]
  }
  @scala.inline
  implicit class AnonActionWrapOps[Self <: AnonActionWrap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft15(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left15")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft6(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotice(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

