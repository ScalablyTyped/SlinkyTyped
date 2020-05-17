package typingsSlinky.rmcCalendar.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.rmcCalendar.calendarPropsMod.SelectDateType
import typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.headerMod.PropsType
import typingsSlinky.rmcCalendar.rmcCalendarStrings.horizontal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.normal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.one
import typingsSlinky.rmcCalendar.rmcCalendarStrings.range
import typingsSlinky.rmcCalendar.rmcCalendarStrings.vertical
import typingsSlinky.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> & std.Readonly<rmc-calendar.rmc-calendar/lib/CalendarProps.default> */
@js.native
trait ReadonlychildrenReactNode extends js.Object {
  val children: js.UndefOr[TagMod[Any]] = js.native
  val defaultDate: js.UndefOr[js.Date] = js.native
  val defaultTimeValue: js.UndefOr[js.Date] = js.native
  val defaultValue: js.UndefOr[SelectDateType] = js.native
  val enterDirection: js.UndefOr[horizontal | vertical] = js.native
  val getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.native
  val infiniteOpt: js.UndefOr[Boolean] = js.native
  val initalMonths: js.UndefOr[Double] = js.native
  val locale: js.UndefOr[Locale] = js.native
  val maxDate: js.UndefOr[js.Date] = js.native
  val minDate: js.UndefOr[js.Date] = js.native
  val onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  val onClear: js.UndefOr[js.Function0[Unit]] = js.native
  val onConfirm: js.UndefOr[
    js.Function2[/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date], Unit]
  ] = js.native
  val onSelect: js.UndefOr[
    js.Function2[
      /* date */ js.Date, 
      /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]], 
      SelectDateType | Unit
    ]
  ] = js.native
  val onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[js.Date], Unit]] = js.native
  val pickTime: js.UndefOr[Boolean] = js.native
  val prefixCls: js.UndefOr[String] = js.native
  val renderHeader: js.UndefOr[js.Function1[/* prop */ PropsType, TagMod[Any]]] = js.native
  val renderShortcut: js.UndefOr[
    js.Function1[
      /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit], 
      TagMod[Any]
    ]
  ] = js.native
  val rowSize: js.UndefOr[normal | xl] = js.native
  val showShortcut: js.UndefOr[Boolean] = js.native
  val style: js.UndefOr[CSSProperties] = js.native
  val timePickerPickerPrefixCls: js.UndefOr[String] = js.native
  val timePickerPrefixCls: js.UndefOr[String] = js.native
  val title: js.UndefOr[String] = js.native
  val `type`: js.UndefOr[one | range] = js.native
  val visible: js.UndefOr[Boolean] = js.native
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
  @scala.inline
  implicit class ReadonlychildrenReactNodeOps[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTimeValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTimeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: SelectDateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterDirection(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDateExtra(value: /* date */ js.Date => ExtraData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateExtra")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDateExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateExtra")(js.undefined)
        ret
    }
    @scala.inline
    def withInfiniteOpt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteOpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfiniteOpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteOpt")(js.undefined)
        ret
    }
    @scala.inline
    def withInitalMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initalMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitalMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initalMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Locale): Self = {
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
    def withOnCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConfirm(value: (/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(
      value: (/* date */ js.Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => SelectDateType | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectHasDisableDate(value: /* date */ js.Array[js.Date] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectHasDisableDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectHasDisableDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectHasDisableDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPickTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderHeader(value: /* prop */ PropsType => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderShortcut(
      value: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderShortcut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderShortcut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderShortcut")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSize(value: normal | xl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShowShortcut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowShortcut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShortcut")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePickerPickerPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerPickerPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePickerPickerPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerPickerPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePickerPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePickerPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: one | range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

