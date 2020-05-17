package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arrow extends js.Object {
  var arrow: RegisteredStyle[TextStyle] = js.native
  var container: RegisteredStyle[ViewStyle] = js.native
  var content: RegisteredStyle[ViewStyle] = js.native
  var contentText: RegisteredStyle[TextStyle] = js.native
  var header: RegisteredStyle[ViewStyle] = js.native
  var headerText: RegisteredStyle[TextStyle] = js.native
  var headerWrap: RegisteredStyle[ViewStyle] = js.native
}

object Arrow {
  @scala.inline
  def apply(
    arrow: RegisteredStyle[TextStyle],
    container: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[ViewStyle],
    contentText: RegisteredStyle[TextStyle],
    header: RegisteredStyle[ViewStyle],
    headerText: RegisteredStyle[TextStyle],
    headerWrap: RegisteredStyle[ViewStyle]
  ): Arrow = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentText = contentText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerText = headerText.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
  @scala.inline
  implicit class ArrowOps[Self <: Arrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

