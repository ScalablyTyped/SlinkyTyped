package typingsSlinky.officeUiFabricReact.calendarYearMod

import slinky.core.TagMod
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarYearProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var maxYear: js.UndefOr[Double] = js.native
  var minYear: js.UndefOr[Double] = js.native
  var navigatedYear: js.UndefOr[Double] = js.native
  var navigationIcons: js.UndefOr[ICalendarIconStrings] = js.native
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.native
  var onRenderTitle: js.UndefOr[js.Function1[/* props */ ICalendarYearHeaderProps, TagMod[Any]]] = js.native
  var onRenderYear: js.UndefOr[js.Function1[/* year */ Double, TagMod[Any]]] = js.native
  var onSelectYear: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.native
  var selectedYear: js.UndefOr[Double] = js.native
  var strings: js.UndefOr[ICalendarYearStrings] = js.native
}

object ICalendarYearProps {
  @scala.inline
  def apply(): ICalendarYearProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarYearProps]
  }
  @scala.inline
  implicit class ICalendarYearPropsOps[Self <: ICalendarYearProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxYear")(js.undefined)
        ret
    }
    @scala.inline
    def withMinYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minYear")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatedYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatedYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedYear")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationIcons(value: ICalendarIconStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHeaderSelect(value: /* focus */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHeaderSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeaderSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderTitle(value: /* props */ ICalendarYearHeaderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRenderTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderYear(value: /* year */ Double => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRenderYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderYear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectYear(value: /* year */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectYear")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedYear")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: ICalendarYearStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
  }
  
}

