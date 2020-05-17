package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon extends js.Object {
  var icon: RegisteredStyle[ImageStyle] = js.native
  var radioItem: RegisteredStyle[ViewStyle] = js.native
  var radioItemContent: RegisteredStyle[TextStyle] = js.native
  var radioItemContentDisable: RegisteredStyle[TextStyle] = js.native
  var radioItemRadio: RegisteredStyle[ViewStyle] = js.native
  var wrapper: RegisteredStyle[ViewStyle] = js.native
}

object Icon {
  @scala.inline
  def apply(
    icon: RegisteredStyle[ImageStyle],
    radioItem: RegisteredStyle[ViewStyle],
    radioItemContent: RegisteredStyle[TextStyle],
    radioItemContentDisable: RegisteredStyle[TextStyle],
    radioItemRadio: RegisteredStyle[ViewStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], radioItem = radioItem.asInstanceOf[js.Any], radioItemContent = radioItemContent.asInstanceOf[js.Any], radioItemContentDisable = radioItemContentDisable.asInstanceOf[js.Any], radioItemRadio = radioItemRadio.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: RegisteredStyle[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioItem(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioItemContent(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioItemContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioItemContentDisable(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioItemContentDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioItemRadio(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioItemRadio")(value.asInstanceOf[js.Any])
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

