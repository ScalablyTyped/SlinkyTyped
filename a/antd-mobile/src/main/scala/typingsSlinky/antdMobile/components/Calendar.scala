package typingsSlinky.antdMobile.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.calendarMod.default
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

object Calendar {
  @JSImport("antd-mobile/lib/calendar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultTimeValue(value: js.Date): this.type = set("defaultTimeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: SelectDateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def enterDirection(value: horizontal | vertical): this.type = set("enterDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def getDateExtra(value: /* date */ js.Date => ExtraData): this.type = set("getDateExtra", js.Any.fromFunction1(value))
    @scala.inline
    def infiniteOpt(value: Boolean): this.type = set("infiniteOpt", value.asInstanceOf[js.Any])
    @scala.inline
    def initalMonths(value: Double): this.type = set("initalMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def onCancel(value: () => Unit): this.type = set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def onClear(value: () => Unit): this.type = set("onClear", js.Any.fromFunction0(value))
    @scala.inline
    def onConfirm(value: (/* startDateTime */ js.UndefOr[js.Date], /* endDateTime */ js.UndefOr[js.Date]) => Unit): this.type = set("onConfirm", js.Any.fromFunction2(value))
    @scala.inline
    def onSelect(
      value: (/* date */ js.Date, /* state */ js.UndefOr[js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]]) => SelectDateType | Unit
    ): this.type = set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def onSelectHasDisableDate(value: /* date */ js.Array[js.Date] => Unit): this.type = set("onSelectHasDisableDate", js.Any.fromFunction1(value))
    @scala.inline
    def pickTime(value: Boolean): this.type = set("pickTime", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def renderHeader(value: /* prop */ PropsType => TagMod[Any]): this.type = set("renderHeader", js.Any.fromFunction1(value))
    @scala.inline
    def renderShortcut(
      value: /* select */ js.Function2[/* startDate */ js.UndefOr[js.Date], /* endDate */ js.UndefOr[js.Date], Unit] => TagMod[Any]
    ): this.type = set("renderShortcut", js.Any.fromFunction1(value))
    @scala.inline
    def rowSize(value: normal | xl): this.type = set("rowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def showShortcut(value: Boolean): this.type = set("showShortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def timePickerPickerPrefixCls(value: String): this.type = set("timePickerPickerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def timePickerPrefixCls(value: String): this.type = set("timePickerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: one | range): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: typingsSlinky.rmcCalendar.calendarPropsMod.PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

