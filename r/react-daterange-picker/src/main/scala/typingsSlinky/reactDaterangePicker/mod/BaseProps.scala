package typingsSlinky.reactDaterangePicker.mod

import slinky.core.ReactComponentClass
import typingsSlinky.moment.mod.Moment
import typingsSlinky.momentRange.mod.DateRange
import typingsSlinky.reactDaterangePicker.anon.MomentRangeNoneinpMomentI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProps[T]
  extends typingsSlinky.react.mod.Props[T] {
  var bemBlock: js.UndefOr[String] = js.native
  var bemNamespace: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var dateStates: js.UndefOr[js.Array[DateState]] = js.native
  var defaultState: js.UndefOr[String] = js.native
  var disableNavigation: js.UndefOr[Boolean] = js.native
  // Use Number Literal Types after TypeScript 2.0 GA released.
  var firstOfWeek: js.UndefOr[Double] = js.native
   // React.PropTypes.oneOf([0, 1, 2, 3, 4, 5, 6])
  var helpMessage: js.UndefOr[String] = js.native
  var initialDate: js.UndefOr[js.Date] = js.native
  var initialFromValue: js.UndefOr[Boolean] = js.native
  var initialMonth: js.UndefOr[Double] = js.native
  var initialRange: js.UndefOr[js.Object] = js.native
  var initialYear: js.UndefOr[Double] = js.native
  /**
    * @default moment().locale()
    */
  var locale: js.UndefOr[String] = js.native
  var maximumDate: js.UndefOr[js.Date] = js.native
  var minimumDate: js.UndefOr[js.Date] = js.native
  var numberOfCalendars: js.UndefOr[Double] = js.native
  var onHighlightDate: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
  var onHighlightRange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.native
  var onSelectStart: js.UndefOr[js.Function1[/* value */ MomentRangeNoneinpMomentI, Unit]] = js.native
  var paginationArrowComponent: js.UndefOr[ReactComponentClass[PaginationArrowProps[js.Object]]] = js.native
  var selectedLabel: js.UndefOr[String] = js.native
  var showLegend: js.UndefOr[Boolean] = js.native
  var singleDateRange: js.UndefOr[Boolean] = js.native
  var stateDefinitions: js.UndefOr[StateDefinitions] = js.native
  var value: js.UndefOr[MomentRangeNoneinpMomentI | DateRange | Moment] = js.native
}

object BaseProps {
  @scala.inline
  def apply[T](): BaseProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProps[T]]
  }
  @scala.inline
  implicit class BasePropsOps[Self[t] <: BaseProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBemBlock(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bemBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBemBlock: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bemBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withBemNamespace(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bemNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBemNamespace: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bemNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDateStates(value: js.Array[DateState]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateStates: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStates")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultState(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultState: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultState")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNavigation(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNavigation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstOfWeek(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstOfWeek: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpMessage(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpMessage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDate(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDate")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFromValue(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFromValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFromValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFromValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialMonth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialMonth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRange(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRange")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialYear(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialYear: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialYear")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumDate(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumDate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumDate(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumDate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfCalendars(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfCalendars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfCalendars: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfCalendars")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHighlightDate(value: /* date */ js.Date => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHighlightDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHighlightDate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHighlightDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHighlightRange(value: /* date */ js.Date => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHighlightRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHighlightRange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHighlightRange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectStart(value: /* value */ MomentRangeNoneinpMomentI => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectStart: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationArrowComponentFunctionComponent(value: ReactComponentClass[PaginationArrowProps[js.Object]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationArrowComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationArrowComponentComponentClass(value: ReactComponentClass[PaginationArrowProps[js.Object]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationArrowComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaginationArrowComponent(value: ReactComponentClass[PaginationArrowProps[js.Object]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationArrowComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationArrowComponent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationArrowComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedLabel(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLegend(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLegend: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleDateRange(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleDateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleDateRange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleDateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withStateDefinitions(value: StateDefinitions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateDefinitions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: MomentRangeNoneinpMomentI | DateRange | Moment): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

