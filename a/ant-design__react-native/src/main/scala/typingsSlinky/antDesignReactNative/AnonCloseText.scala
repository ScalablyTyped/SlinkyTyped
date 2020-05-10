package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloseText extends js.Object {
  var closeText: RegisteredStyle[TextStyle] = js.native
  var closeWrap: RegisteredStyle[ViewStyle] = js.native
  var container: RegisteredStyle[ViewStyle] = js.native
  var image: RegisteredStyle[ImageStyle] = js.native
  var item: RegisteredStyle[ViewStyle] = js.native
  var plusText: RegisteredStyle[TextStyle] = js.native
  var plusWrap: RegisteredStyle[ViewStyle] = js.native
  var plusWrapHighlight: RegisteredStyle[ViewStyle] = js.native
  var plusWrapNormal: RegisteredStyle[ViewStyle] = js.native
  var size: RegisteredStyle[ImageStyle] = js.native
}

object AnonCloseText {
  @scala.inline
  def apply(
    closeText: RegisteredStyle[TextStyle],
    closeWrap: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    image: RegisteredStyle[ImageStyle],
    item: RegisteredStyle[ViewStyle],
    plusText: RegisteredStyle[TextStyle],
    plusWrap: RegisteredStyle[ViewStyle],
    plusWrapHighlight: RegisteredStyle[ViewStyle],
    plusWrapNormal: RegisteredStyle[ViewStyle],
    size: RegisteredStyle[ImageStyle]
  ): AnonCloseText = {
    val __obj = js.Dynamic.literal(closeText = closeText.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], plusText = plusText.asInstanceOf[js.Any], plusWrap = plusWrap.asInstanceOf[js.Any], plusWrapHighlight = plusWrapHighlight.asInstanceOf[js.Any], plusWrapNormal = plusWrapNormal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseText]
  }
  @scala.inline
  implicit class AnonCloseTextOps[Self <: AnonCloseText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: RegisteredStyle[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusWrapHighlight(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusWrapHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusWrapNormal(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusWrapNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: RegisteredStyle[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

