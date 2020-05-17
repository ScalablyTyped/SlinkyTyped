package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination extends js.Object {
  var pagination: RegisteredStyle[ViewStyle] = js.native
  var paginationX: RegisteredStyle[ViewStyle] = js.native
  var paginationY: RegisteredStyle[ViewStyle] = js.native
  var pointActiveStyle: RegisteredStyle[ViewStyle] = js.native
  var pointStyle: RegisteredStyle[ViewStyle] = js.native
  var spaceStyle: RegisteredStyle[ViewStyle] = js.native
}

object Pagination {
  @scala.inline
  def apply(
    pagination: RegisteredStyle[ViewStyle],
    paginationX: RegisteredStyle[ViewStyle],
    paginationY: RegisteredStyle[ViewStyle],
    pointActiveStyle: RegisteredStyle[ViewStyle],
    pointStyle: RegisteredStyle[ViewStyle],
    spaceStyle: RegisteredStyle[ViewStyle]
  ): Pagination = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], paginationX = paginationX.asInstanceOf[js.Any], paginationY = paginationY.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
  @scala.inline
  implicit class PaginationOps[Self <: Pagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPagination(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationX(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationY(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationY")(value.asInstanceOf[js.Any])
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
  }
  
}

