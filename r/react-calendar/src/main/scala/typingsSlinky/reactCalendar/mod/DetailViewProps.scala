package typingsSlinky.reactCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailViewProps extends js.Object {
  var activeStartDate: js.Date = js.native
  var calendarType: js.UndefOr[CalendarType] = js.native
  var hover: js.UndefOr[js.Date] = js.native
  var locale: js.UndefOr[String] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var onClick: js.UndefOr[DateCallback] = js.native
  var onMouseOver: js.UndefOr[DateCallback] = js.native
  var renderChildren: js.UndefOr[
    js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ]
  ] = js.native
   // For backwards compatibility
  var tileClassName: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
  ] = js.native
  var tileContent: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ])
  ] = js.native
  var tileDisabled: js.UndefOr[js.Function1[/* props */ CalendarTileProperties, Boolean]] = js.native
  var value: js.UndefOr[js.Date | js.Array[js.Date]] = js.native
}

object DetailViewProps {
  @scala.inline
  def apply(activeStartDate: js.Date): DetailViewProps = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailViewProps]
  }
  @scala.inline
  implicit class DetailViewPropsOps[Self <: DetailViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarType(value: CalendarType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarType")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: /* date */ js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderChildren(
      value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withTileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTileClassName(
      value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTileContentFunction1(
      value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTileContent(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
          /* props */ CalendarTileProperties, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTileDisabled(value: /* props */ CalendarTileProperties => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTileDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Date | js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

