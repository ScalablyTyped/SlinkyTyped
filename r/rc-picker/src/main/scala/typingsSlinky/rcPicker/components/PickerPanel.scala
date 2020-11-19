package typingsSlinky.rcPicker.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Components
import typingsSlinky.rcPicker.interfaceMod.DisabledTimes
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.PickerMode
import typingsSlinky.rcPicker.rcPickerStrings.date
import typingsSlinky.rcPicker.rcPickerStrings.ltr
import typingsSlinky.rcPicker.rcPickerStrings.rtl
import typingsSlinky.rcPicker.rcPickerStrings.time
import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerPanel {
  
  object PickerPanelBaseProps {
    
    @JSImport("rc-picker", "PickerPanel")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder[DateType] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (DateType, DateType) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def onChange(value: DateType => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: DateType => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onPickerValueChange(value: DateType => Unit): this.type = set("onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: DateType => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def pickerValue(value: DateType): this.type = set("pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsSlinky.rcPicker.pickerPanelMod.PickerPanelBaseProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: Exclude[PickerMode, date | time]): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsSlinky.rcPicker.pickerPanelMod.PickerPanelBaseProps[DateType]]))
    }
  }
  
  object PickerPanelDateProps {
    
    @JSImport("rc-picker", "PickerPanel")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder[DateType] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (DateType, DateType) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledTime(value: /* date */ DateType | Null => DisabledTimes): this.type = set("disabledTime", js.Any.fromFunction1(value))
      
      @scala.inline
      def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def onChange(value: DateType => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: DateType => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onPickerValueChange(value: DateType => Unit): this.type = set("onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: DateType => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def picker(value: date): this.type = set("picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def pickerValue(value: DateType): this.type = set("pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showTime(value: Boolean | SharedTimeProps[DateType]): this.type = set("showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showToday(value: Boolean): this.type = set("showToday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsSlinky.rcPicker.pickerPanelMod.PickerPanelDateProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsSlinky.rcPicker.pickerPanelMod.PickerPanelDateProps[DateType]]))
    }
  }
  
  object PickerPanelTimeProps {
    
    @JSImport("rc-picker", "PickerPanel")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder[DateType] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dateRender(value: (DateType, DateType) => ReactElement): this.type = set("dateRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledDate(value: DateType => Boolean): this.type = set("disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledHours(value: () => js.Array[Double]): this.type = set("disabledHours", js.Any.fromFunction0(value))
      
      @scala.inline
      def disabledMinutes(value: /* hour */ Double => js.Array[Double]): this.type = set("disabledMinutes", js.Any.fromFunction1(value))
      
      @scala.inline
      def disabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): this.type = set("disabledSeconds", js.Any.fromFunction2(value))
      
      @scala.inline
      def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hideDisabledOptions(value: Boolean): this.type = set("hideDisabledOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hideHeader(value: Boolean): this.type = set("hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hourStep(value: Double): this.type = set("hourStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def mode(value: PanelMode): this.type = set("mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def monthCellRender(value: (DateType, /* locale */ Locale) => ReactElement): this.type = set("monthCellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def onChange(value: DateType => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def onOk(value: DateType => Unit): this.type = set("onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def onPanelChange(value: (DateType, /* mode */ PanelMode) => Unit): this.type = set("onPanelChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def onPickerValueChange(value: DateType => Unit): this.type = set("onPickerValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelect(value: DateType => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def pickerValue(value: DateType): this.type = set("pickerValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderExtraFooter(value: /* mode */ PanelMode => ReactElement): this.type = set("renderExtraFooter", js.Any.fromFunction1(value))
      
      @scala.inline
      def secondStep(value: Double): this.type = set("secondStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showNow(value: Boolean): this.type = set("showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: DateType): this.type = set("value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def valueNull: this.type = set("value", null)
    }
    
    def withProps[DateType](p: typingsSlinky.rcPicker.pickerPanelMod.PickerPanelTimeProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply[DateType](generateConfig: GenerateConfig[DateType], locale: Locale, picker: time): Builder[DateType] = {
      val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      new Builder[DateType](js.Array(this.component, __props.asInstanceOf[typingsSlinky.rcPicker.pickerPanelMod.PickerPanelTimeProps[DateType]]))
    }
  }
}
