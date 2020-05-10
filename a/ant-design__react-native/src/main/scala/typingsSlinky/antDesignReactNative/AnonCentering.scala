package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCentering extends js.Object {
  var centering: RegisteredStyle[ViewStyle] = js.native
  var container: RegisteredStyle[ViewStyle] = js.native
  var content: RegisteredStyle[TextStyle] = js.native
  var iconToast: RegisteredStyle[ViewStyle] = js.native
  var image: RegisteredStyle[TextStyle] = js.native
  var innerContainer: RegisteredStyle[ViewStyle] = js.native
  var innerWrap: RegisteredStyle[ViewStyle] = js.native
  var textToast: RegisteredStyle[ViewStyle] = js.native
}

object AnonCentering {
  @scala.inline
  def apply(
    centering: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    content: RegisteredStyle[TextStyle],
    iconToast: RegisteredStyle[ViewStyle],
    image: RegisteredStyle[TextStyle],
    innerContainer: RegisteredStyle[ViewStyle],
    innerWrap: RegisteredStyle[ViewStyle],
    textToast: RegisteredStyle[ViewStyle]
  ): AnonCentering = {
    val __obj = js.Dynamic.literal(centering = centering.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], iconToast = iconToast.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], innerWrap = innerWrap.asInstanceOf[js.Any], textToast = textToast.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCentering]
  }
  @scala.inline
  implicit class AnonCenteringOps[Self <: AnonCentering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCentering(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centering")(value.asInstanceOf[js.Any])
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
    def withIconToast(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconToast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextToast(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToast")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

