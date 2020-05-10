package typingsSlinky.reactNativeSortableList.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableListProps[T, K] extends js.Object {
  /**
    * determines the height for vertical list and the width for horizontal list of the area at the begining and
    * the end of the list that will trigger autoscrolling. Defaults to 60.
    */
  var autoscrollAreaSize: js.UndefOr[Double] = js.native
  /**
    * these styles will be applied to the inner scroll view content container
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * data source
    */
  var data: DataByNumber[T] | DataByString[T] = js.native
  /**
    * when true, the SortableList's children are arranged horizontally in a row instead of vertically in a column.
    * The default value is false.
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * these styles will be applied to the inner scroll view content container, excluding the header and footer
    */
  var innerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * whether you intend to use the toggleRowActive method to activate a row or use the out of box solution.
    */
  var manuallyActivateRows: js.UndefOr[Boolean] = js.native
  /**
    * Called when a row was activated (user long tapped).
    */
  var onActivateRow: js.UndefOr[js.Function1[/* key */ K, Unit]] = js.native
  /**
    * Called when rows were reordered, takes an array of rows keys of the next rows order.
    */
  var onChangeOrder: js.UndefOr[js.Function1[/* nextOrder */ js.Array[K], Unit]] = js.native
  /**
    * Called when a row was pressed.
    */
  var onPressRow: js.UndefOr[js.Function1[/* key */ K, Unit]] = js.native
  /**
    * Called when the active row was released.
    */
  var onReleaseRow: js.UndefOr[js.Function2[/* key */ K, /* currentOrder */ js.Array[K], Unit]] = js.native
  /**
    * an array of keys from data, the order of keys from the array will be used to initial rows order
    */
  var order: js.UndefOr[js.Array[K]] = js.native
  /**
    * A RefreshControl that works the same way as a ScrollView's refreshControl.
    */
  var refreshControl: js.UndefOr[ReactElement] = js.native
  /**
    * Renders returned component at the bottom of the list.
    */
  var renderFooter: js.UndefOr[js.Function0[ReactElement]] = js.native
  /**
    * Renders returned component at the top of the list.
    */
  var renderHeader: js.UndefOr[js.Function0[ReactElement]] = js.native
  /**
    * determines time delay in ms before pressed row becomes active. Defaults to 200 ms.
    */
  var rowActivationTime: js.UndefOr[Double] = js.native
  /**
    * when false, the content does not scrollable. The default value is true.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  /**
    * when false, the horizontal scroll indicator will not be visible. The default value is true.
    */
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.native
  /**
    * when false, the vertical scroll indicator will not be visible. The default value is true.
    */
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  /**
    * when false, rows are not sortable. The default value is true.
    */
  var sortingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * style of HOC
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Takes a row key, row index, data entry from the data source and its statuses disabled, active and should
    * return a renderable component to be rendered as the row. The child component will receive a method called
    * toggleRowActive (only if manuallyActivateRows={true}) to manually activate the row. Useful if you have
    * multiple touch responders in your view.
    */
  def renderRow(props: RowProps[T, K]): ReactElement | Null = js.native
}

object SortableListProps {
  @scala.inline
  def apply[T, K](data: DataByNumber[T] | DataByString[T], renderRow: RowProps[T, K] => ReactElement | Null): SortableListProps[T, K] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], renderRow = js.Any.fromFunction1(renderRow))
    __obj.asInstanceOf[SortableListProps[T, K]]
  }
  @scala.inline
  implicit class SortableListPropsOps[Self[t, k] <: SortableListProps[t, k], T, K] (val x: Self[T, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, K]) with Other]
    @scala.inline
    def withData(value: DataByNumber[T] | DataByString[T]): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderRow(value: RowProps[T, K] => ReactElement | Null): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAutoscrollAreaSize(value: Double): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscrollAreaSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscrollAreaSize: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscrollAreaSize")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyle(value: StyleProp[ViewStyle]): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentContainerStyle: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentContainerStyleNull: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentContainerStyle")(null)
        ret
    }
    @scala.inline
    def withHorizontal(value: Boolean): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerContainerStyle(value: StyleProp[ViewStyle]): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerContainerStyle: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerContainerStyleNull: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerContainerStyle")(null)
        ret
    }
    @scala.inline
    def withManuallyActivateRows(value: Boolean): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manuallyActivateRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManuallyActivateRows: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manuallyActivateRows")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivateRow(value: /* key */ K => Unit): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivateRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActivateRow: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivateRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeOrder(value: /* nextOrder */ js.Array[K] => Unit): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeOrder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeOrder: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressRow(value: /* key */ K => Unit): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressRow: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReleaseRow(value: (/* key */ K, /* currentOrder */ js.Array[K]) => Unit): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReleaseRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReleaseRow: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReleaseRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: js.Array[K]): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshControl(value: ReactElement): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshControl: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshControl")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFooter(value: () => ReactElement): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderFooter: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderHeader(value: () => ReactElement): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderHeader: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRowActivationTime(value: Double): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowActivationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowActivationTime: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowActivationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: Boolean): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsHorizontalScrollIndicator(value: Boolean): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsHorizontalScrollIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsHorizontalScrollIndicator: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsHorizontalScrollIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowsVerticalScrollIndicator(value: Boolean): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsVerticalScrollIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowsVerticalScrollIndicator: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showsVerticalScrollIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withSortingEnabled(value: Boolean): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortingEnabled: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
  }
  
}

