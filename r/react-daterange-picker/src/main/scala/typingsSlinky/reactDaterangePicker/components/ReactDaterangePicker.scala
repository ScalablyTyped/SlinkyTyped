package typingsSlinky.reactDaterangePicker.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.moment.mod.Moment
import typingsSlinky.momentRange.mod.DateRange
import typingsSlinky.reactDaterangePicker.MomentRangeNoneinpMomentI
import typingsSlinky.reactDaterangePicker.mod.DateRangePicker
import typingsSlinky.reactDaterangePicker.mod.DateState
import typingsSlinky.reactDaterangePicker.mod.OnSelectCallbackParam
import typingsSlinky.reactDaterangePicker.mod.PaginationArrowProps
import typingsSlinky.reactDaterangePicker.mod.StateDefinitions
import typingsSlinky.reactDaterangePicker.mod.default
import typingsSlinky.reactDaterangePicker.reactDaterangePickerStrings.range
import typingsSlinky.reactDaterangePicker.reactDaterangePickerStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDaterangePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-daterange-picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def RangeProps(
    bemBlock: String = null,
    bemNamespace: String = null,
    dateStates: js.Array[DateState] = null,
    defaultState: String = null,
    disableNavigation: js.UndefOr[Boolean] = js.undefined,
    firstOfWeek: Int | Double = null,
    helpMessage: String = null,
    initialDate: js.Date = null,
    initialFromValue: js.UndefOr[Boolean] = js.undefined,
    initialMonth: Int | Double = null,
    initialRange: js.Object = null,
    initialYear: Int | Double = null,
    maximumDate: js.Date = null,
    minimumDate: js.Date = null,
    numberOfCalendars: Int | Double = null,
    onHighlightDate: /* date */ js.Date => Unit = null,
    onHighlightRange: /* date */ js.Date => Unit = null,
    onSelect: /* value */ OnSelectCallbackParam => Unit = null,
    onSelectStart: /* value */ MomentRangeNoneinpMomentI => Unit = null,
    paginationArrowComponent: ReactComponentClass[PaginationArrowProps[js.Object]] = null,
    selectedLabel: String = null,
    selectionType: range = null,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    singleDateRange: js.UndefOr[Boolean] = js.undefined,
    stateDefinitions: StateDefinitions = null,
    value: MomentRangeNoneinpMomentI | DateRange | Moment = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (bemBlock != null) __obj.updateDynamic("bemBlock")(bemBlock.asInstanceOf[js.Any])
    if (bemNamespace != null) __obj.updateDynamic("bemNamespace")(bemNamespace.asInstanceOf[js.Any])
    if (dateStates != null) __obj.updateDynamic("dateStates")(dateStates.asInstanceOf[js.Any])
    if (defaultState != null) __obj.updateDynamic("defaultState")(defaultState.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNavigation)) __obj.updateDynamic("disableNavigation")(disableNavigation.asInstanceOf[js.Any])
    if (firstOfWeek != null) __obj.updateDynamic("firstOfWeek")(firstOfWeek.asInstanceOf[js.Any])
    if (helpMessage != null) __obj.updateDynamic("helpMessage")(helpMessage.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFromValue)) __obj.updateDynamic("initialFromValue")(initialFromValue.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (initialRange != null) __obj.updateDynamic("initialRange")(initialRange.asInstanceOf[js.Any])
    if (initialYear != null) __obj.updateDynamic("initialYear")(initialYear.asInstanceOf[js.Any])
    if (maximumDate != null) __obj.updateDynamic("maximumDate")(maximumDate.asInstanceOf[js.Any])
    if (minimumDate != null) __obj.updateDynamic("minimumDate")(minimumDate.asInstanceOf[js.Any])
    if (numberOfCalendars != null) __obj.updateDynamic("numberOfCalendars")(numberOfCalendars.asInstanceOf[js.Any])
    if (onHighlightDate != null) __obj.updateDynamic("onHighlightDate")(js.Any.fromFunction1(onHighlightDate))
    if (onHighlightRange != null) __obj.updateDynamic("onHighlightRange")(js.Any.fromFunction1(onHighlightRange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectStart != null) __obj.updateDynamic("onSelectStart")(js.Any.fromFunction1(onSelectStart))
    if (paginationArrowComponent != null) __obj.updateDynamic("paginationArrowComponent")(paginationArrowComponent.asInstanceOf[js.Any])
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDateRange)) __obj.updateDynamic("singleDateRange")(singleDateRange.asInstanceOf[js.Any])
    if (stateDefinitions != null) __obj.updateDynamic("stateDefinitions")(stateDefinitions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def SingleProps(
    bemBlock: String = null,
    bemNamespace: String = null,
    dateStates: js.Array[DateState] = null,
    defaultState: String = null,
    disableNavigation: js.UndefOr[Boolean] = js.undefined,
    firstOfWeek: Int | Double = null,
    helpMessage: String = null,
    initialDate: js.Date = null,
    initialFromValue: js.UndefOr[Boolean] = js.undefined,
    initialMonth: Int | Double = null,
    initialRange: js.Object = null,
    initialYear: Int | Double = null,
    maximumDate: js.Date = null,
    minimumDate: js.Date = null,
    numberOfCalendars: Int | Double = null,
    onHighlightDate: /* date */ js.Date => Unit = null,
    onHighlightRange: /* date */ js.Date => Unit = null,
    onSelect: /* value */ Moment => Unit = null,
    onSelectStart: /* value */ MomentRangeNoneinpMomentI => Unit = null,
    paginationArrowComponent: ReactComponentClass[PaginationArrowProps[js.Object]] = null,
    selectedLabel: String = null,
    selectionType: single = null,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    singleDateRange: js.UndefOr[Boolean] = js.undefined,
    stateDefinitions: StateDefinitions = null,
    value: MomentRangeNoneinpMomentI | DateRange | Moment = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (bemBlock != null) __obj.updateDynamic("bemBlock")(bemBlock.asInstanceOf[js.Any])
    if (bemNamespace != null) __obj.updateDynamic("bemNamespace")(bemNamespace.asInstanceOf[js.Any])
    if (dateStates != null) __obj.updateDynamic("dateStates")(dateStates.asInstanceOf[js.Any])
    if (defaultState != null) __obj.updateDynamic("defaultState")(defaultState.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNavigation)) __obj.updateDynamic("disableNavigation")(disableNavigation.asInstanceOf[js.Any])
    if (firstOfWeek != null) __obj.updateDynamic("firstOfWeek")(firstOfWeek.asInstanceOf[js.Any])
    if (helpMessage != null) __obj.updateDynamic("helpMessage")(helpMessage.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFromValue)) __obj.updateDynamic("initialFromValue")(initialFromValue.asInstanceOf[js.Any])
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (initialRange != null) __obj.updateDynamic("initialRange")(initialRange.asInstanceOf[js.Any])
    if (initialYear != null) __obj.updateDynamic("initialYear")(initialYear.asInstanceOf[js.Any])
    if (maximumDate != null) __obj.updateDynamic("maximumDate")(maximumDate.asInstanceOf[js.Any])
    if (minimumDate != null) __obj.updateDynamic("minimumDate")(minimumDate.asInstanceOf[js.Any])
    if (numberOfCalendars != null) __obj.updateDynamic("numberOfCalendars")(numberOfCalendars.asInstanceOf[js.Any])
    if (onHighlightDate != null) __obj.updateDynamic("onHighlightDate")(js.Any.fromFunction1(onHighlightDate))
    if (onHighlightRange != null) __obj.updateDynamic("onHighlightRange")(js.Any.fromFunction1(onHighlightRange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectStart != null) __obj.updateDynamic("onSelectStart")(js.Any.fromFunction1(onSelectStart))
    if (paginationArrowComponent != null) __obj.updateDynamic("paginationArrowComponent")(paginationArrowComponent.asInstanceOf[js.Any])
    if (selectedLabel != null) __obj.updateDynamic("selectedLabel")(selectedLabel.asInstanceOf[js.Any])
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(singleDateRange)) __obj.updateDynamic("singleDateRange")(singleDateRange.asInstanceOf[js.Any])
    if (stateDefinitions != null) __obj.updateDynamic("stateDefinitions")(stateDefinitions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDaterangePicker.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDaterangePicker.mod.Props[DateRangePicker]
}

