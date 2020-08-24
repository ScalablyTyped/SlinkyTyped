package typingsSlinky.rmcCalendar.anon

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

/* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> & std.Readonly<rmc-calendar.rmc-calendar/lib/CalendarProps.default> */
@js.native
trait ReadonlychildrenReactNode extends js.Object {
  val children: js.UndefOr[ReactElement] = js.native
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
  val renderHeader: js.UndefOr[js.Function1[/* prop */ PropsType, ReactElement]] = js.native
  val renderShortcut: js.UndefOr[
    js.Function1[
      /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit], 
      ReactElement
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDefaultDate(value: js.Date): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    @scala.inline
    def setDefaultTimeValue(value: js.Date): Self = this.set("defaultTimeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTimeValue: Self = this.set("defaultTimeValue", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: js.Date*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: SelectDateType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setEnterDirection(value: horizontal | vertical): Self = this.set("enterDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterDirection: Self = this.set("enterDirection", js.undefined)
    @scala.inline
    def setGetDateExtra(value: /* date */ js.Date => ExtraData): Self = this.set("getDateExtra", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDateExtra: Self = this.set("getDateExtra", js.undefined)
    @scala.inline
    def setInfiniteOpt(value: Boolean): Self = this.set("infiniteOpt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfiniteOpt: Self = this.set("infiniteOpt", js.undefined)
    @scala.inline
    def setInitalMonths(value: Double): Self = this.set("initalMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitalMonths: Self = this.set("initalMonths", js.undefined)
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    @scala.inline
    def setOnConfirm(value: (/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date]) => Unit): Self = this.set("onConfirm", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnConfirm: Self = this.set("onConfirm", js.undefined)
    @scala.inline
    def setOnSelect(
      value: (/* date */ js.Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => SelectDateType | Unit
    ): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectHasDisableDate(value: /* date */ js.Array[js.Date] => Unit): Self = this.set("onSelectHasDisableDate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectHasDisableDate: Self = this.set("onSelectHasDisableDate", js.undefined)
    @scala.inline
    def setPickTime(value: Boolean): Self = this.set("pickTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickTime: Self = this.set("pickTime", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRenderHeader(value: /* prop */ PropsType => ReactElement): Self = this.set("renderHeader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
    @scala.inline
    def setRenderShortcut(
      value: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => ReactElement
    ): Self = this.set("renderShortcut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderShortcut: Self = this.set("renderShortcut", js.undefined)
    @scala.inline
    def setRowSize(value: normal | xl): Self = this.set("rowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSize: Self = this.set("rowSize", js.undefined)
    @scala.inline
    def setShowShortcut(value: Boolean): Self = this.set("showShortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowShortcut: Self = this.set("showShortcut", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTimePickerPickerPrefixCls(value: String): Self = this.set("timePickerPickerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerPickerPrefixCls: Self = this.set("timePickerPickerPrefixCls", js.undefined)
    @scala.inline
    def setTimePickerPrefixCls(value: String): Self = this.set("timePickerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePickerPrefixCls: Self = this.set("timePickerPrefixCls", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: one | range): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

