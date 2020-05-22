package typingsSlinky.antd.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.OnChange
import typingsSlinky.antd.generateCalendarMod.CalendarMode
import typingsSlinky.antd.generateCalendarMod.CalendarProps
import typingsSlinky.antd.generatePickerMod.PickerLocale
import typingsSlinky.moment.mod.Moment
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  @JSImport("antd", "Calendar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def dateCellRender(value: Moment => TagMod[Any]): this.type = set("dateCellRender", js.Any.fromFunction1(value))
    @scala.inline
    def dateFullCellRender(value: Moment => TagMod[Any]): this.type = set("dateFullCellRender", js.Any.fromFunction1(value))
    @scala.inline
    def defaultValue(value: Moment): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledDate(value: Moment => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
    @scala.inline
    def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRender(value: /* config */ OnChange[Moment] => TagMod[Any]): this.type = set("headerRender", js.Any.fromFunction1(value))
    @scala.inline
    def locale(value: PickerLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: CalendarMode): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def monthCellRender(value: Moment => TagMod[Any]): this.type = set("monthCellRender", js.Any.fromFunction1(value))
    @scala.inline
    def monthFullCellRender(value: Moment => TagMod[Any]): this.type = set("monthFullCellRender", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: Moment => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onPanelChange(value: (Moment, /* mode */ CalendarMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
    @scala.inline
    def onSelect(value: Moment => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def validRange(value: js.Tuple2[Moment, Moment]): this.type = set("validRange", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: Moment): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CalendarProps[Moment]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

