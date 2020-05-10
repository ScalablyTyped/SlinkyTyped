package typingsSlinky.primereact.scrollableViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollableViewProps extends js.Object {
  var body: js.UndefOr[js.Any] = js.native
  var footer: js.UndefOr[js.Any] = js.native
  var frozen: js.UndefOr[Boolean] = js.native
  var frozenBody: js.UndefOr[js.Any] = js.native
  var frozenWidth: js.UndefOr[String] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var onVirtualScroll: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
  var rows: js.UndefOr[Double] = js.native
  var totalRcords: js.UndefOr[Double] = js.native
  var unfrozenWidth: js.UndefOr[String] = js.native
  var virtualScroll: js.UndefOr[Boolean] = js.native
}

object ScrollableViewProps {
  @scala.inline
  def apply(): ScrollableViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableViewProps]
  }
  @scala.inline
  implicit class ScrollableViewPropsOps[Self <: ScrollableViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozen")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenBody")(js.undefined)
        ret
    }
    @scala.inline
    def withFrozenWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrozenWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frozenWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVirtualScroll(value: /* page */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVirtualScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRcords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRcords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRcords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRcords")(js.undefined)
        ret
    }
    @scala.inline
    def withUnfrozenWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfrozenWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnfrozenWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfrozenWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScroll")(js.undefined)
        ret
    }
  }
  
}

