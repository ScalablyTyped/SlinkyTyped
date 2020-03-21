package typingsSlinky.rcPicker.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcPicker.datetimePanelMod.DatetimePanelProps
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.DisabledTimes
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.NullableDateType
import typingsSlinky.rcPicker.interfaceMod.PanelMode
import typingsSlinky.rcPicker.interfaceMod.PanelRefProps
import typingsSlinky.rcPicker.rcPickerStrings.key
import typingsSlinky.rcPicker.rcPickerStrings.mouse
import typingsSlinky.rcPicker.rcPickerStrings.submit
import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import typingsSlinky.rcPicker.uiUtilMod.KeyboardConfig
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatetimePanel
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("rc-picker/lib/panels/DatetimePanel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onPanelChange: (/* mode */ PanelMode | Null, DateType) => Unit,
    onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
    onViewDateChange: DateType => Unit,
    operationRef: MutableRefObject[PanelRefProps],
    prefixCls: String,
    viewDate: DateType,
    active: js.UndefOr[Boolean] = js.undefined,
    dateRender: (DateType, DateType) => TagMod[Any] = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    disabledDate: DateType => Boolean = null,
    disabledTime: /* date */ DateType | Null => DisabledTimes = null,
    keyboardConfig: KeyboardConfig = null,
    nextIcon: TagMod[Any] = null,
    panelName: String = null,
    prefixColumn: DateType => TagMod[Any] = null,
    prevIcon: TagMod[Any] = null,
    rowClassName: DateType => String = null,
    showTime: Boolean | SharedTimeProps[DateType] = null,
    superNextIcon: TagMod[Any] = null,
    superPrevIcon: TagMod[Any] = null,
    value: NullableDateType[DateType] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onPanelChange = js.Any.fromFunction2(onPanelChange), onSelect = js.Any.fromFunction2(onSelect), onViewDateChange = js.Any.fromFunction1(onViewDateChange), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1(disabledTime))
    if (keyboardConfig != null) __obj.updateDynamic("keyboardConfig")(keyboardConfig.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (panelName != null) __obj.updateDynamic("panelName")(panelName.asInstanceOf[js.Any])
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1(prefixColumn))
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object]]
  }
  type Props = DatetimePanelProps[js.Any]
}

