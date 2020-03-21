package typingsSlinky.dayzed.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.dayzed.dayzedNumbers.`0`
import typingsSlinky.dayzed.dayzedNumbers.`1`
import typingsSlinky.dayzed.dayzedNumbers.`2`
import typingsSlinky.dayzed.dayzedNumbers.`3`
import typingsSlinky.dayzed.dayzedNumbers.`4`
import typingsSlinky.dayzed.dayzedNumbers.`5`
import typingsSlinky.dayzed.dayzedNumbers.`6`
import typingsSlinky.dayzed.mod.DateObj
import typingsSlinky.dayzed.mod.RenderProps
import typingsSlinky.dayzed.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dayzed
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("dayzed", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onDateSelected: DateObj => Unit,
    date: js.Date = null,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    monthsToDisplay: Int | Double = null,
    offset: Int | Double = null,
    onOffsetChanged: /* offset */ Double => Unit = null,
    render: /* renderProps */ RenderProps => TagMod[Any] = null,
    selected: js.Date | js.Array[js.Date] = null,
    showOutsideDays: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onDateSelected = js.Any.fromFunction1(onDateSelected))
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (monthsToDisplay != null) __obj.updateDynamic("monthsToDisplay")(monthsToDisplay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onOffsetChanged != null) __obj.updateDynamic("onOffsetChanged")(js.Any.fromFunction1(onOffsetChanged))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutsideDays)) __obj.updateDynamic("showOutsideDays")(showOutsideDays.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.dayzed.mod.Props
}

