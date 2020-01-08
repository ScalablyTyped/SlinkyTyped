package typingsSlinky.reactDashInputDashCalendar.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashInputDashCalendar.reactInputCalendar.ReactInputCalendarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInputCalendar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashInputDashCalendar.reactInputCalendar.ReactInputCalendar
    ] {
  @JSGlobal("reactInputCalendar.ReactInputCalendar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, onChange, onFocus, placeholder */
  def apply(
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    computableFormat: String = null,
    date: String | js.Date = null,
    format: String = null,
    inputFieldClass: String = null,
    inputFieldId: String = null,
    maxDate: String | js.Date = null,
    minDate: String | js.Date = null,
    minView: Int | Double = null,
    onBlur: (/* event */ SyntheticEvent[
      Event, 
      typingsSlinky.reactDashInputDashCalendar.reactInputCalendar.ReactInputCalendar
    ], /* computableDate */ String) => Unit = null,
    openOnInputFocus: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashInputDashCalendar.reactInputCalendar.ReactInputCalendar
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (computableFormat != null) __obj.updateDynamic("computableFormat")(computableFormat.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputFieldClass != null) __obj.updateDynamic("inputFieldClass")(inputFieldClass.asInstanceOf[js.Any])
    if (inputFieldId != null) __obj.updateDynamic("inputFieldId")(inputFieldId.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minView != null) __obj.updateDynamic("minView")(minView.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (!js.isUndefined(openOnInputFocus)) __obj.updateDynamic("openOnInputFocus")(openOnInputFocus.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashInputDashCalendar.reactInputCalendar.ReactInputCalendar
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashInputDashCalendar.reactInputCalendar.ReactInputCalendar](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactInputCalendarProps
}

