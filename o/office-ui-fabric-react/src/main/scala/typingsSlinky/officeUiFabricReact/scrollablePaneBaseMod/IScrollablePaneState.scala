package typingsSlinky.officeUiFabricReact.scrollablePaneBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollablePaneState extends js.Object {
  var scrollbarHeight: Double = js.native
  var scrollbarWidth: Double = js.native
  var stickyBottomHeight: Double = js.native
  var stickyTopHeight: Double = js.native
}

object IScrollablePaneState {
  @scala.inline
  def apply(
    scrollbarHeight: Double,
    scrollbarWidth: Double,
    stickyBottomHeight: Double,
    stickyTopHeight: Double
  ): IScrollablePaneState = {
    val __obj = js.Dynamic.literal(scrollbarHeight = scrollbarHeight.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any], stickyBottomHeight = stickyBottomHeight.asInstanceOf[js.Any], stickyTopHeight = stickyTopHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneState]
  }
  @scala.inline
  implicit class IScrollablePaneStateOps[Self <: IScrollablePaneState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollbarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStickyBottomHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyBottomHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStickyTopHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickyTopHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

