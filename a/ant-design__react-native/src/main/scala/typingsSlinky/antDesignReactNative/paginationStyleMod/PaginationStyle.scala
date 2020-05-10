package typingsSlinky.antDesignReactNative.paginationStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationStyle extends js.Object {
  var activeTextStyle: TextStyle = js.native
  var container: ViewStyle = js.native
  var indicatorStyle: ViewStyle = js.native
  var numberStyle: ViewStyle = js.native
  var pointActiveStyle: ViewStyle = js.native
  var pointStyle: ViewStyle = js.native
  var spaceStyle: ViewStyle = js.native
  var totalStyle: TextStyle = js.native
}

object PaginationStyle {
  @scala.inline
  def apply(
    activeTextStyle: TextStyle,
    container: ViewStyle,
    indicatorStyle: ViewStyle,
    numberStyle: ViewStyle,
    pointActiveStyle: ViewStyle,
    pointStyle: ViewStyle,
    spaceStyle: ViewStyle,
    totalStyle: TextStyle
  ): PaginationStyle = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], numberStyle = numberStyle.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any], totalStyle = totalStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationStyle]
  }
  @scala.inline
  implicit class PaginationStyleOps[Self <: PaginationStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTextStyle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointActiveStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointActiveStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalStyle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

