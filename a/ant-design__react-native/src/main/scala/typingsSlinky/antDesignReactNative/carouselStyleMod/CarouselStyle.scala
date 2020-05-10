package typingsSlinky.antDesignReactNative.carouselStyleMod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselStyle extends js.Object {
  var pagination: ViewStyle = js.native
  var paginationX: ViewStyle = js.native
  var paginationY: ViewStyle = js.native
  var pointActiveStyle: ViewStyle = js.native
  var pointStyle: ViewStyle = js.native
  var spaceStyle: ViewStyle = js.native
}

object CarouselStyle {
  @scala.inline
  def apply(
    pagination: ViewStyle,
    paginationX: ViewStyle,
    paginationY: ViewStyle,
    pointActiveStyle: ViewStyle,
    pointStyle: ViewStyle,
    spaceStyle: ViewStyle
  ): CarouselStyle = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], paginationX = paginationX.asInstanceOf[js.Any], paginationY = paginationY.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselStyle]
  }
  @scala.inline
  implicit class CarouselStyleOps[Self <: CarouselStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPagination(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationX(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationY(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationY")(value.asInstanceOf[js.Any])
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
  }
  
}

