package typingsSlinky.antDesignReactNative.noticeBarStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoticeBarStyle extends js.Object {
  var actionWrap: ViewStyle = js.native
  var close: TextStyle = js.native
  var container: ViewStyle = js.native
  var content: TextStyle = js.native
  var left15: ViewStyle = js.native
  var left6: ViewStyle = js.native
  var link: TextStyle = js.native
  var notice: ViewStyle = js.native
}

object NoticeBarStyle {
  @scala.inline
  def apply(
    actionWrap: ViewStyle,
    close: TextStyle,
    container: ViewStyle,
    content: TextStyle,
    left15: ViewStyle,
    left6: ViewStyle,
    link: TextStyle,
    notice: ViewStyle
  ): NoticeBarStyle = {
    val __obj = js.Dynamic.literal(actionWrap = actionWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], left15 = left15.asInstanceOf[js.Any], left6 = left6.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeBarStyle]
  }
  @scala.inline
  implicit class NoticeBarStyleOps[Self <: NoticeBarStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft15(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left15")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft6(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotice(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

