package typingsSlinky.overlayscrollbars

import typingsSlinky.overlayscrollbars.mod.AutoHideBehavior
import typingsSlinky.overlayscrollbars.mod.VisibilityBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoHide extends js.Object {
  var autoHide: js.UndefOr[AutoHideBehavior] = js.native
  var autoHideDelay: js.UndefOr[Double] = js.native
  var clickScrolling: js.UndefOr[Boolean] = js.native
  var dragScrolling: js.UndefOr[Boolean] = js.native
  var snapHandle: js.UndefOr[Boolean] = js.native
  var touchSupport: js.UndefOr[Boolean] = js.native
  var visibility: js.UndefOr[VisibilityBehavior] = js.native
}

object AnonAutoHide {
  @scala.inline
  def apply(): AnonAutoHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutoHide]
  }
  @scala.inline
  implicit class AnonAutoHideOps[Self <: AnonAutoHide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHide(value: AutoHideBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withClickScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withDragScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapHandle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: VisibilityBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

