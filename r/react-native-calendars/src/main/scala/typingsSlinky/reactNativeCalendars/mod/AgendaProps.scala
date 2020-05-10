package typingsSlinky.reactNativeCalendars.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgendaProps[TItem] extends js.Object {
  /**
    *  Display loading indicator. Default = false
    */
  var displayLoadingIndicator: js.UndefOr[Boolean] = js.native
  /**
    *  If firstDay = 1 week starts from Monday. Note that dayNames and dayNamesShort should still start from Sunday.
    */
  var firstDay: js.UndefOr[Double] = js.native
  /**
    *  Max amount of months allowed to scroll to the future. Default = 50
    */
  var futureScrollRange: js.UndefOr[Double] = js.native
  /**
    *  Hide knob button. Default = false
    */
  var hideKnob: js.UndefOr[Boolean] = js.native
  /**
    *  The list of items that have to be displayed in agenda. If you want to render item as empty date
    *  the value of date key kas to be an empty array []. If there exists no value for date key it is
    *  considered that the date in question is not yet loaded
    */
  var items: js.UndefOr[AgendaItemsMap[TItem]] = js.native
  /**
    * callback that gets called when items for a certain month should be loaded (month became visible)
    */
  var loadItemsForMonth: js.UndefOr[js.Function1[/* date */ DateObject, Unit]] = js.native
  /**
    * Maximum date that can be selected, dates after maxDate will be grayed out. Default = undefined
    */
  var maxDate: js.UndefOr[TCalendarDate] = js.native
  /**
    * Minimum date that can be selected, dates before minDate will be grayed out. Default = undefined
    */
  var minDate: js.UndefOr[TCalendarDate] = js.native
  /**
    *  Month format in calendar title. Formatting values: http://arshaw.com/xdate/#Formatting
    */
  var monthFormat: js.UndefOr[String] = js.native
  /**
    *  Handler which gets executed when the calendar is opened or closed. Default = undefined
    */
  var onCalendarToggled: js.UndefOr[js.Function1[/* calendarOpened */ Boolean, Unit]] = js.native
  /**
    *  Handler that gets called when day changes while scrolling agenda list. Default = undefined
    */
  var onDayChange: js.UndefOr[DateCallbackHandler] = js.native
  /**
    *  Handler which gets executed on day press. Default = undefined
    */
  var onDayPress: js.UndefOr[DateCallbackHandler] = js.native
  /**
    *  If provided, a standard RefreshControl will be added for "Pull to Refresh" functionality.
    *  Make sure to also set the refreshing prop correctly. Default = undefined
    */
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    *  Max amount of months allowed to scroll to the past. Default = 50
    */
  var pastScrollRange: js.UndefOr[Double] = js.native
  /**
    *  A RefreshControl component, used to provide pull-to-refresh funtionality for the ScrollView.
    */
  var refreshControl: js.UndefOr[TagMod[Any]] = js.native
  /**
    *  Set this true while waiting for new data from a refresh.
    */
  var refreshing: js.UndefOr[Boolean] = js.native
  /**
    *  Specify how each day should be rendered.
    *  Date can be undefined if the item has not property date.
    */
  var renderDay: js.UndefOr[js.Function2[/* date */ js.UndefOr[DateObject], /* item */ TItem, TagMod[Any]]] = js.native
  /**
    *  Specify what should be rendered instead of ActivityIndicator
    */
  var renderEmptyData: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  /**
    *  Specify how agenda knob should look like.
    */
  var renderKnob: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  /**
    *  Initially visible month. Default = Date()
    */
  var selected: js.UndefOr[TCalendarDate] = js.native
  /**
    *  Agenda container style.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    *  Specify theme properties to override specific styles for agenda parts. Default = {}
    */
  var theme: js.UndefOr[AgendaThemeStyle] = js.native
  /**
    *  Specify how empty date content with no items should be rendered.
    */
  def renderEmptyDate(): TagMod[Any] = js.native
  /**
    *  Specify how each item should be rendered in agenda.
    */
  def renderItem(item: TItem, firstDayInDay: Boolean): TagMod[Any] = js.native
  /**
    * specify your item comparison function for increased performance
    */
  def rowHasChanged(r1: TItem, r2: TItem): Boolean = js.native
}

object AgendaProps {
  @scala.inline
  def apply[TItem](
    renderEmptyDate: () => TagMod[Any],
    renderItem: (TItem, Boolean) => TagMod[Any],
    rowHasChanged: (TItem, TItem) => Boolean
  ): AgendaProps[TItem] = {
    val __obj = js.Dynamic.literal(renderEmptyDate = js.Any.fromFunction0(renderEmptyDate), renderItem = js.Any.fromFunction2(renderItem), rowHasChanged = js.Any.fromFunction2(rowHasChanged))
    __obj.asInstanceOf[AgendaProps[TItem]]
  }
  @scala.inline
  implicit class AgendaPropsOps[Self[titem] <: AgendaProps[titem], TItem] (val x: Self[TItem]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TItem] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TItem]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TItem] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TItem] with Other]
    @scala.inline
    def withRenderEmptyDate(value: () => TagMod[Any]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderEmptyDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderItem(value: (TItem, Boolean) => TagMod[Any]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowHasChanged(value: (TItem, TItem) => Boolean): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHasChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDisplayLoadingIndicator(value: Boolean): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLoadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLoadingIndicator: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLoadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDay(value: Double): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDay: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(js.undefined)
        ret
    }
    @scala.inline
    def withFutureScrollRange(value: Double): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureScrollRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFutureScrollRange: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureScrollRange")(js.undefined)
        ret
    }
    @scala.inline
    def withHideKnob(value: Boolean): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideKnob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideKnob: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideKnob")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: AgendaItemsMap[TItem]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadItemsForMonth(value: /* date */ DateObject => Unit): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadItemsForMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadItemsForMonth: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadItemsForMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDateDate(value: js.Date): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDate(value: TCalendarDate): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDateDate(value: js.Date): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: TCalendarDate): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthFormat(value: String): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthFormat: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCalendarToggled(value: /* calendarOpened */ Boolean => Unit): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCalendarToggled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCalendarToggled: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCalendarToggled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayChange(value: /* date */ DateObject => Unit): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDayChange: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDayPress(value: /* date */ DateObject => Unit): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDayPress: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDayPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRefresh(value: () => Unit): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRefresh: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withPastScrollRange(value: Double): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastScrollRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPastScrollRange: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastScrollRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshControlReactElement(value: ReactElement): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshControl(value: TagMod[Any]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshControl: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshControl")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshing(value: Boolean): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshing: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshing")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderDay(value: (/* date */ js.UndefOr[DateObject], /* item */ TItem) => TagMod[Any]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderDay: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDay")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderEmptyData(value: () => TagMod[Any]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderEmptyData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderEmptyData: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderEmptyData")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderKnob(value: () => TagMod[Any]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderKnob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderKnob: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderKnob")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDate(value: js.Date): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: TCalendarDate): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withTheme(value: AgendaThemeStyle): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

