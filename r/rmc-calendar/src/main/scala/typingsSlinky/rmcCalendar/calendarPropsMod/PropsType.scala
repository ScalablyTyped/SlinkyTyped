package typingsSlinky.rmcCalendar.calendarPropsMod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.rmcCalendarStrings.horizontal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.normal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.one
import typingsSlinky.rmcCalendar.rmcCalendarStrings.range
import typingsSlinky.rmcCalendar.rmcCalendarStrings.vertical
import typingsSlinky.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType extends js.Object {
  /** 显示开始日期，default: today */
  var defaultDate: js.UndefOr[js.Date] = js.native
  /** 默认时间选择值 */
  var defaultTimeValue: js.UndefOr[js.Date] = js.native
  /** 默认选择值，开始时间、结束时间 */
  var defaultValue: js.UndefOr[SelectDateType] = js.native
  /** 入场方向，default: vertical，vertical: 垂直，horizontal: 水平 */
  var enterDirection: js.UndefOr[horizontal | vertical] = js.native
  /** 日期扩展数据 */
  var getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.native
  /** 无限滚动优化（大范围选择），default: false */
  var infiniteOpt: js.UndefOr[Boolean] = js.native
  /** 初始化月个数，default: 6 */
  var initalMonths: js.UndefOr[Double] = js.native
  /** 本地化 */
  var locale: js.UndefOr[Locale] = js.native
  /** 最大日期 */
  var maxDate: js.UndefOr[js.Date] = js.native
  /** 最小日期 */
  var minDate: js.UndefOr[js.Date] = js.native
  /** 关闭时回调 */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  /** 清除时回调 */
  var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  /** 确认时回调 */
  var onConfirm: js.UndefOr[
    js.Function2[/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date], Unit]
  ] = js.native
  /** 选择日期回调，如果有返回值，选择范围将使用返回值 */
  var onSelect: js.UndefOr[
    js.Function2[
      /* date */ js.Date, 
      /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]], 
      SelectDateType | Unit
    ]
  ] = js.native
  /** 选择区间包含不可用日期 */
  var onSelectHasDisableDate: js.UndefOr[js.Function1[/* date */ js.Array[js.Date], Unit]] = js.native
  /** 是否选择时间，default: false */
  var pickTime: js.UndefOr[Boolean] = js.native
  /** (web only) 样式前缀，default: rmc-calendar */
  var prefixCls: js.UndefOr[String] = js.native
  /** 替换标题栏 */
  var renderHeader: js.UndefOr[
    js.Function1[/* prop */ typingsSlinky.rmcCalendar.headerMod.PropsType, TagMod[Any]]
  ] = js.native
  /** 替换快捷选择栏，需要设置showShortcut: true */
  var renderShortcut: js.UndefOr[
    js.Function1[
      /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit], 
      TagMod[Any]
    ]
  ] = js.native
  /** 行大小，default: normal */
  var rowSize: js.UndefOr[normal | xl] = js.native
  /** 快捷日期选择， default: false */
  var showShortcut: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var timePickerPickerPrefixCls: js.UndefOr[String] = js.native
  var timePickerPrefixCls: js.UndefOr[String] = js.native
  /** header title, default: {locale.title} */
  var title: js.UndefOr[String] = js.native
  /** 选择类型，default: range，one: 单日，range: 日期区间 */
  var `type`: js.UndefOr[one | range] = js.native
  /** 是否显示，default: false */
  var visible: js.UndefOr[Boolean] = js.native
}

object PropsType {
  @scala.inline
  def apply(): PropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRenderHeader(value: /* prop */ typingsSlinky.rmcCalendar.headerMod.PropsType => TagMod[Any]): Self = {
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

