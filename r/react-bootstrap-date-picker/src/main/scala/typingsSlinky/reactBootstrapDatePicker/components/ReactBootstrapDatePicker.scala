package typingsSlinky.reactBootstrapDatePicker.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrapDatePicker.mod.DatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactBootstrapDatePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-bootstrap-date-picker", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className, disabled */
  def apply(
    calendarContainer: js.Any = null,
    calendarPlacement: String = null,
    cellPadding: String = null,
    clearButtonElement: TagMod[Any] = null,
    customControl: ReactComponentClass[_] = null,
    dateFormat: String = null,
    dayLabels: js.Array[String] = null,
    defaultValue: String = null,
    maxDate: String = null,
    minDate: String = null,
    monthLabels: js.Array[String] = null,
    nextButtonElement: TagMod[Any] = null,
    onBlur: SyntheticFocusEvent[_] => Unit = null,
    onChange: (/* value */ String, /* formattedValue */ String) => Unit = null,
    onClear: () => Unit = null,
    onFocus: SyntheticFocusEvent[_] => Unit = null,
    previousButtonElement: TagMod[Any] = null,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showTodayButton: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    todayButtonLabel: String = null,
    value: String = null,
    weekStartsOnMonday: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (calendarContainer != null) __obj.updateDynamic("calendarContainer")(calendarContainer.asInstanceOf[js.Any])
    if (calendarPlacement != null) __obj.updateDynamic("calendarPlacement")(calendarPlacement.asInstanceOf[js.Any])
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (clearButtonElement != null) __obj.updateDynamic("clearButtonElement")(clearButtonElement.asInstanceOf[js.Any])
    if (customControl != null) __obj.updateDynamic("customControl")(customControl.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayLabels != null) __obj.updateDynamic("dayLabels")(dayLabels.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthLabels != null) __obj.updateDynamic("monthLabels")(monthLabels.asInstanceOf[js.Any])
    if (nextButtonElement != null) __obj.updateDynamic("nextButtonElement")(nextButtonElement.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (previousButtonElement != null) __obj.updateDynamic("previousButtonElement")(previousButtonElement.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (todayButtonLabel != null) __obj.updateDynamic("todayButtonLabel")(todayButtonLabel.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(weekStartsOnMonday)) __obj.updateDynamic("weekStartsOnMonday")(weekStartsOnMonday.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DatePickerProps
}

