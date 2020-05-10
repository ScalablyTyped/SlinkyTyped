package typingsSlinky.reactDaterangePicker.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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

object ReactDaterangePicker {
  object RangeProps {
    @JSImport("react-daterange-picker", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, default] {
      @scala.inline
      def bemBlock(value: String): this.type = set("bemBlock", value.asInstanceOf[js.Any])
      @scala.inline
      def bemNamespace(value: String): this.type = set("bemNamespace", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def dateStates(value: js.Array[DateState]): this.type = set("dateStates", value.asInstanceOf[js.Any])
      @scala.inline
      def defaultState(value: String): this.type = set("defaultState", value.asInstanceOf[js.Any])
      @scala.inline
      def disableNavigation(value: Boolean): this.type = set("disableNavigation", value.asInstanceOf[js.Any])
      @scala.inline
      def firstOfWeek(value: Double): this.type = set("firstOfWeek", value.asInstanceOf[js.Any])
      @scala.inline
      def helpMessage(value: String): this.type = set("helpMessage", value.asInstanceOf[js.Any])
      @scala.inline
      def initialDate(value: js.Date): this.type = set("initialDate", value.asInstanceOf[js.Any])
      @scala.inline
      def initialFromValue(value: Boolean): this.type = set("initialFromValue", value.asInstanceOf[js.Any])
      @scala.inline
      def initialMonth(value: Double): this.type = set("initialMonth", value.asInstanceOf[js.Any])
      @scala.inline
      def initialRange(value: js.Object): this.type = set("initialRange", value.asInstanceOf[js.Any])
      @scala.inline
      def initialYear(value: Double): this.type = set("initialYear", value.asInstanceOf[js.Any])
      @scala.inline
      def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
      @scala.inline
      def maximumDate(value: js.Date): this.type = set("maximumDate", value.asInstanceOf[js.Any])
      @scala.inline
      def minimumDate(value: js.Date): this.type = set("minimumDate", value.asInstanceOf[js.Any])
      @scala.inline
      def numberOfCalendars(value: Double): this.type = set("numberOfCalendars", value.asInstanceOf[js.Any])
      @scala.inline
      def onHighlightDate(value: /* date */ js.Date => Unit): this.type = set("onHighlightDate", js.Any.fromFunction1(value))
      @scala.inline
      def onHighlightRange(value: /* date */ js.Date => Unit): this.type = set("onHighlightRange", js.Any.fromFunction1(value))
      @scala.inline
      def onSelect(value: /* value */ OnSelectCallbackParam => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      @scala.inline
      def onSelectStart(value: /* value */ MomentRangeNoneinpMomentI => Unit): this.type = set("onSelectStart", js.Any.fromFunction1(value))
      @scala.inline
      def paginationArrowComponentFunctionComponent(value: ReactComponentClass[PaginationArrowProps[js.Object]]): this.type = set("paginationArrowComponent", value.asInstanceOf[js.Any])
      @scala.inline
      def paginationArrowComponentComponentClass(value: ReactComponentClass[PaginationArrowProps[js.Object]]): this.type = set("paginationArrowComponent", value.asInstanceOf[js.Any])
      @scala.inline
      def paginationArrowComponent(value: ReactComponentClass[PaginationArrowProps[js.Object]]): this.type = set("paginationArrowComponent", value.asInstanceOf[js.Any])
      @scala.inline
      def selectedLabel(value: String): this.type = set("selectedLabel", value.asInstanceOf[js.Any])
      @scala.inline
      def selectionType(value: range): this.type = set("selectionType", value.asInstanceOf[js.Any])
      @scala.inline
      def showLegend(value: Boolean): this.type = set("showLegend", value.asInstanceOf[js.Any])
      @scala.inline
      def singleDateRange(value: Boolean): this.type = set("singleDateRange", value.asInstanceOf[js.Any])
      @scala.inline
      def stateDefinitions(value: StateDefinitions): this.type = set("stateDefinitions", value.asInstanceOf[js.Any])
      @scala.inline
      def value(value: MomentRangeNoneinpMomentI | DateRange | Moment): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactDaterangePicker.mod.RangeProps[DateRangePicker]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: RangeProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object SingleProps {
    @JSImport("react-daterange-picker", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, default] {
      @scala.inline
      def bemBlock(value: String): this.type = set("bemBlock", value.asInstanceOf[js.Any])
      @scala.inline
      def bemNamespace(value: String): this.type = set("bemNamespace", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def dateStates(value: js.Array[DateState]): this.type = set("dateStates", value.asInstanceOf[js.Any])
      @scala.inline
      def defaultState(value: String): this.type = set("defaultState", value.asInstanceOf[js.Any])
      @scala.inline
      def disableNavigation(value: Boolean): this.type = set("disableNavigation", value.asInstanceOf[js.Any])
      @scala.inline
      def firstOfWeek(value: Double): this.type = set("firstOfWeek", value.asInstanceOf[js.Any])
      @scala.inline
      def helpMessage(value: String): this.type = set("helpMessage", value.asInstanceOf[js.Any])
      @scala.inline
      def initialDate(value: js.Date): this.type = set("initialDate", value.asInstanceOf[js.Any])
      @scala.inline
      def initialFromValue(value: Boolean): this.type = set("initialFromValue", value.asInstanceOf[js.Any])
      @scala.inline
      def initialMonth(value: Double): this.type = set("initialMonth", value.asInstanceOf[js.Any])
      @scala.inline
      def initialRange(value: js.Object): this.type = set("initialRange", value.asInstanceOf[js.Any])
      @scala.inline
      def initialYear(value: Double): this.type = set("initialYear", value.asInstanceOf[js.Any])
      @scala.inline
      def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
      @scala.inline
      def maximumDate(value: js.Date): this.type = set("maximumDate", value.asInstanceOf[js.Any])
      @scala.inline
      def minimumDate(value: js.Date): this.type = set("minimumDate", value.asInstanceOf[js.Any])
      @scala.inline
      def numberOfCalendars(value: Double): this.type = set("numberOfCalendars", value.asInstanceOf[js.Any])
      @scala.inline
      def onHighlightDate(value: /* date */ js.Date => Unit): this.type = set("onHighlightDate", js.Any.fromFunction1(value))
      @scala.inline
      def onHighlightRange(value: /* date */ js.Date => Unit): this.type = set("onHighlightRange", js.Any.fromFunction1(value))
      @scala.inline
      def onSelect(value: /* value */ Moment => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
      @scala.inline
      def onSelectStart(value: /* value */ MomentRangeNoneinpMomentI => Unit): this.type = set("onSelectStart", js.Any.fromFunction1(value))
      @scala.inline
      def paginationArrowComponentFunctionComponent(value: ReactComponentClass[PaginationArrowProps[js.Object]]): this.type = set("paginationArrowComponent", value.asInstanceOf[js.Any])
      @scala.inline
      def paginationArrowComponentComponentClass(value: ReactComponentClass[PaginationArrowProps[js.Object]]): this.type = set("paginationArrowComponent", value.asInstanceOf[js.Any])
      @scala.inline
      def paginationArrowComponent(value: ReactComponentClass[PaginationArrowProps[js.Object]]): this.type = set("paginationArrowComponent", value.asInstanceOf[js.Any])
      @scala.inline
      def selectedLabel(value: String): this.type = set("selectedLabel", value.asInstanceOf[js.Any])
      @scala.inline
      def selectionType(value: single): this.type = set("selectionType", value.asInstanceOf[js.Any])
      @scala.inline
      def showLegend(value: Boolean): this.type = set("showLegend", value.asInstanceOf[js.Any])
      @scala.inline
      def singleDateRange(value: Boolean): this.type = set("singleDateRange", value.asInstanceOf[js.Any])
      @scala.inline
      def stateDefinitions(value: StateDefinitions): this.type = set("stateDefinitions", value.asInstanceOf[js.Any])
      @scala.inline
      def value(value: MomentRangeNoneinpMomentI | DateRange | Moment): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactDaterangePicker.mod.SingleProps[DateRangePicker]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: SingleProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

