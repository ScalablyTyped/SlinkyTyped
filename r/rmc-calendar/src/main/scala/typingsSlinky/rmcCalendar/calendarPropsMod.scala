package typingsSlinky.rmcCalendar

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import typingsSlinky.rmcCalendar.rmcCalendarStrings.horizontal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.normal
import typingsSlinky.rmcCalendar.rmcCalendarStrings.one
import typingsSlinky.rmcCalendar.rmcCalendarStrings.range
import typingsSlinky.rmcCalendar.rmcCalendarStrings.vertical
import typingsSlinky.rmcCalendar.rmcCalendarStrings.xl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarPropsMod {
  
  @js.native
  trait PropsType extends StObject {
    
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
    var renderHeader: js.UndefOr[js.Function1[/* prop */ this.type, ReactElement]] = js.native
    
    /** 替换快捷选择栏，需要设置showShortcut: true */
    var renderShortcut: js.UndefOr[
        js.Function1[
          /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit], 
          ReactElement
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
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      @scala.inline
      def setDefaultTimeValue(value: js.Date): Self = StObject.set(x, "defaultTimeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTimeValueUndefined: Self = StObject.set(x, "defaultTimeValue", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: SelectDateType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: js.Date*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setEnterDirection(value: horizontal | vertical): Self = StObject.set(x, "enterDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDirectionUndefined: Self = StObject.set(x, "enterDirection", js.undefined)
      
      @scala.inline
      def setGetDateExtra(value: /* date */ js.Date => ExtraData): Self = StObject.set(x, "getDateExtra", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDateExtraUndefined: Self = StObject.set(x, "getDateExtra", js.undefined)
      
      @scala.inline
      def setInfiniteOpt(value: Boolean): Self = StObject.set(x, "infiniteOpt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteOptUndefined: Self = StObject.set(x, "infiniteOpt", js.undefined)
      
      @scala.inline
      def setInitalMonths(value: Double): Self = StObject.set(x, "initalMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitalMonthsUndefined: Self = StObject.set(x, "initalMonths", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: (/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date]) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      @scala.inline
      def setOnSelect(
        value: (/* date */ js.Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => SelectDateType | Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectHasDisableDate(value: /* date */ js.Array[js.Date] => Unit): Self = StObject.set(x, "onSelectHasDisableDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectHasDisableDateUndefined: Self = StObject.set(x, "onSelectHasDisableDate", js.undefined)
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPickTime(value: Boolean): Self = StObject.set(x, "pickTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickTimeUndefined: Self = StObject.set(x, "pickTime", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderHeader(value: PropsType => ReactElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
      
      @scala.inline
      def setRenderShortcut(
        value: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => ReactElement
      ): Self = StObject.set(x, "renderShortcut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderShortcutUndefined: Self = StObject.set(x, "renderShortcut", js.undefined)
      
      @scala.inline
      def setRowSize(value: normal | xl): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
      
      @scala.inline
      def setShowShortcut(value: Boolean): Self = StObject.set(x, "showShortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowShortcutUndefined: Self = StObject.set(x, "showShortcut", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTimePickerPickerPrefixCls(value: String): Self = StObject.set(x, "timePickerPickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerPickerPrefixClsUndefined: Self = StObject.set(x, "timePickerPickerPrefixCls", js.undefined)
      
      @scala.inline
      def setTimePickerPrefixCls(value: String): Self = StObject.set(x, "timePickerPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerPrefixClsUndefined: Self = StObject.set(x, "timePickerPrefixCls", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: one | range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type SelectDateType = (js.Tuple2[js.Date, js.Date]) | js.Array[js.Date]
}
