package typingsSlinky.antd.generateCalendarMod

import slinky.core.TagMod
import typingsSlinky.antd.anon.Lang
import typingsSlinky.antd.anon.OnChange
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarProps[DateType] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var dateCellRender: js.UndefOr[js.Function1[/* date */ DateType, TagMod[Any]]] = js.native
  var dateFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, TagMod[Any]]] = js.native
  var defaultValue: js.UndefOr[DateType] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  var fullscreen: js.UndefOr[Boolean] = js.native
  var headerRender: js.UndefOr[HeaderRender[DateType]] = js.native
  var locale: js.UndefOr[Lang] = js.native
  var mode: js.UndefOr[CalendarMode] = js.native
  var monthCellRender: js.UndefOr[js.Function1[/* date */ DateType, TagMod[Any]]] = js.native
  var monthFullCellRender: js.UndefOr[js.Function1[/* date */ DateType, TagMod[Any]]] = js.native
  var onChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
  var onPanelChange: js.UndefOr[js.Function2[/* date */ DateType, /* mode */ CalendarMode, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var validRange: js.UndefOr[js.Tuple2[DateType, DateType]] = js.native
  var value: js.UndefOr[DateType] = js.native
}

object CalendarProps {
  @scala.inline
  def apply[DateType](): CalendarProps[DateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps[DateType]]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self[datetype] <: CalendarProps[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withClassName(value: String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCellRender(value: /* date */ DateType => TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDateCellRender: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFullCellRender(value: /* date */ DateType => TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFullCellRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDateFullCellRender: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFullCellRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDate(value: /* date */ DateType => Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledDate: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRender(value: /* config */ OnChange[DateType] => TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderRender: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRender")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Lang): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: CalendarMode): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthCellRender(value: /* date */ DateType => TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthCellRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMonthCellRender: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthCellRender")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthFullCellRender(value: /* date */ DateType => TagMod[Any]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFullCellRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMonthFullCellRender: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFullCellRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* date */ DateType => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPanelChange(value: (/* date */ DateType, /* mode */ CalendarMode) => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanelChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPanelChange: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPanelChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* date */ DateType => Unit): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withValidRange(value: js.Tuple2[DateType, DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidRange: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validRange")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

