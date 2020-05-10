package typingsSlinky.rcPicker.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.NullableDateType
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.PanelRefProps
import typingsSlinky.rcPicker.rcPickerStrings.key
import typingsSlinky.rcPicker.rcPickerStrings.mouse
import typingsSlinky.rcPicker.rcPickerStrings.submit
import typingsSlinky.rcPicker.timePanelMod.TimePanelProps
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePanel {
  @JSImport("rc-picker/lib/panels/TimePanel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[DateType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultPickerValue(value: DateType): this.type = set("defaultPickerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: DateType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
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
    def hourStep(value: Double): this.type = set("hourStep", value.asInstanceOf[js.Any])
    @scala.inline
    def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def nextIconReactElement(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def nextIcon(value: TagMod[Any]): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def prevIconReactElement(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def prevIcon(value: TagMod[Any]): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def secondStep(value: Double): this.type = set("secondStep", value.asInstanceOf[js.Any])
    @scala.inline
    def showHour(value: Boolean): this.type = set("showHour", value.asInstanceOf[js.Any])
    @scala.inline
    def showMinute(value: Boolean): this.type = set("showMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def showSecond(value: Boolean): this.type = set("showSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def superNextIconReactElement(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def superNextIcon(value: TagMod[Any]): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def superPrevIconReactElement(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def superPrevIcon(value: TagMod[Any]): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: NullableDateType[DateType]): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps[DateType](p: TimePanelProps[DateType]): Builder[DateType] = new Builder[DateType](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onPanelChange: (Null | PanelMode, DateType) => Unit,
    onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
    onViewDateChange: DateType => Unit,
    operationRef: MutableRefObject[PanelRefProps],
    prefixCls: String,
    viewDate: DateType
  ): Builder[DateType] = {
    val __props = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onPanelChange = js.Any.fromFunction2(onPanelChange), onSelect = js.Any.fromFunction2(onSelect), onViewDateChange = js.Any.fromFunction1(onViewDateChange), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    new Builder[DateType](js.Array(this.component, __props.asInstanceOf[TimePanelProps[DateType]]))
  }
}

