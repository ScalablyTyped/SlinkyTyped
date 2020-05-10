package typingsSlinky.antDesignReactNative.imagePickerStyleMod

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePickerStyle extends js.Object {
  var closeText: TextStyle = js.native
  var closeWrap: ViewStyle = js.native
  var container: ViewStyle = js.native
  var image: ImageStyle = js.native
  var item: ViewStyle = js.native
  var plusText: TextStyle = js.native
  var plusWrap: ViewStyle = js.native
  var plusWrapHighlight: ViewStyle = js.native
  var plusWrapNormal: ViewStyle = js.native
  var size: ImageStyle = js.native
}

object ImagePickerStyle {
  @scala.inline
  def apply(
    closeText: TextStyle,
    closeWrap: ViewStyle,
    container: ViewStyle,
    image: ImageStyle,
    item: ViewStyle,
    plusText: TextStyle,
    plusWrap: ViewStyle,
    plusWrapHighlight: ViewStyle,
    plusWrapNormal: ViewStyle,
    size: ImageStyle
  ): ImagePickerStyle = {
    val __obj = js.Dynamic.literal(closeText = closeText.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], plusText = plusText.asInstanceOf[js.Any], plusWrap = plusWrap.asInstanceOf[js.Any], plusWrapHighlight = plusWrapHighlight.asInstanceOf[js.Any], plusWrapNormal = plusWrapNormal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePickerStyle]
  }
  @scala.inline
  implicit class ImagePickerStyleOps[Self <: ImagePickerStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusWrapHighlight(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusWrapHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlusWrapNormal(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plusWrapNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

