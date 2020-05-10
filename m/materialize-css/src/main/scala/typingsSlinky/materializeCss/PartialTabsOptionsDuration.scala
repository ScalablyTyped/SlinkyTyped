package typingsSlinky.materializeCss

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.Tabs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TabsOptions> */
@js.native
trait PartialTabsOptionsDuration extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ Tabs, /* newContent */ Element, Unit]] = js.native
  var responsiveThreshold: js.UndefOr[Double] = js.native
  var swipeable: js.UndefOr[Boolean] = js.native
}

object PartialTabsOptionsDuration {
  @scala.inline
  def apply(): PartialTabsOptionsDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTabsOptionsDuration]
  }
  @scala.inline
  implicit class PartialTabsOptionsDurationOps[Self <: PartialTabsOptionsDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: js.ThisFunction1[/* this */ Tabs, /* newContent */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeable")(js.undefined)
        ret
    }
  }
  
}

