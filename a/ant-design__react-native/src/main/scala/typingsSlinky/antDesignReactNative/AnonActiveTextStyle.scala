package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveTextStyle extends js.Object {
  var activeTextStyle: RegisteredStyle[TextStyle] = js.native
  var container: RegisteredStyle[ViewStyle] = js.native
  var indicatorStyle: RegisteredStyle[ViewStyle] = js.native
  var numberStyle: RegisteredStyle[ViewStyle] = js.native
  var pointActiveStyle: RegisteredStyle[ViewStyle] = js.native
  var pointStyle: RegisteredStyle[ViewStyle] = js.native
  var spaceStyle: RegisteredStyle[ViewStyle] = js.native
  var totalStyle: RegisteredStyle[TextStyle] = js.native
}

object AnonActiveTextStyle {
  @scala.inline
  def apply(
    activeTextStyle: RegisteredStyle[TextStyle],
    container: RegisteredStyle[ViewStyle],
    indicatorStyle: RegisteredStyle[ViewStyle],
    numberStyle: RegisteredStyle[ViewStyle],
    pointActiveStyle: RegisteredStyle[ViewStyle],
    pointStyle: RegisteredStyle[ViewStyle],
    spaceStyle: RegisteredStyle[ViewStyle],
    totalStyle: RegisteredStyle[TextStyle]
  ): AnonActiveTextStyle = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], numberStyle = numberStyle.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any], totalStyle = totalStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveTextStyle]
  }
  @scala.inline
  implicit class AnonActiveTextStyleOps[Self <: AnonActiveTextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTextStyle(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorStyle(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberStyle(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointActiveStyle(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointActiveStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointStyle(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceStyle(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalStyle(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

