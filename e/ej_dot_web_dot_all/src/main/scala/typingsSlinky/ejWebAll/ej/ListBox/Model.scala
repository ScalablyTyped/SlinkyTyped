package typingsSlinky.ejWebAll.ej.ListBox

import typingsSlinky.ejWebAll.ej.Query
import typingsSlinky.ejWebAll.ej.VirtualScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Event will be triggered before the requested data via AJAX once loaded in successfully.
    */
  var actionBeforeSuccess: js.UndefOr[js.Function1[/* e */ ActionBeforeSuccessEventArgs, Unit]] = js.native
  /** Triggers before the AJAX request begins to load data in the ListBox widget.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggers when the AJAX requests complete. The request may get failed or succeed.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Triggers when the data requested from AJAX get failed.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Triggers after the data requested via AJAX is successfully loaded in the ListBox widget.
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.native
  /** Enables/disables the dragging behavior of the items in ListBox widget.
    * @Default {false}
    */
  var allowDrag: js.UndefOr[Boolean] = js.native
  /** Accepts the items which are dropped in to it, when it is set to true.
    * @Default {false}
    */
  var allowDrop: js.UndefOr[Boolean] = js.native
  /** Enables or disables multiple selection.
    * @Default {false}
    */
  var allowMultiSelection: js.UndefOr[Boolean] = js.native
  /** Loads the list data on demand via scrolling behavior to improve the applicationâ€™s performance. There are two ways to load data which can be defined using â€œvirtualScrollModeâ€
    * property.
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** Dynamically populate data of a list box while selecting an item in another list box i.e. rendering child list box based on the item selection in parent list box. This property
    * accepts the id of the child ListBox widget to populate the data.
    * @Default {null}
    */
  var cascadeTo: js.UndefOr[String] = js.native
  /** Enables or disables the case sensitive search for list item by typing the text (search) value.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.native
  /** Triggers when the item selection is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Triggers when the list item is checked or unchecked.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.native
  /** Set of list items to be checked by default using its index. It works only when the showCheckbox property is set to true.
    * @Default {null}
    */
  var checkedIndices: js.UndefOr[js.Array[_]] = js.native
  /** Triggers when the ListBox widget is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** The root class for the ListBox widget to customize the existing theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Contains the list of data for generating the list items.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Triggers when the ListBox widget is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Enables or disables the search behavior to find the specific list item by typing the text value.
    * @Default {false}
    */
  var enableIncrementalSearch: js.UndefOr[Boolean] = js.native
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Displays the ListBox widgetâ€™s content from right to left when enabled.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Specifies ellipsis (&quot;...&quot;) representation in an overflowed list item content when it is set to false.
    * @Default {true}
    */
  var enableWordWrap: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ListBox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Mapping fields for the data items of the ListBox widget.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** Triggers when focus the listbox items.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  /** Triggers when focus out from listbox items.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  /** Defines the height of the ListBox widget.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.native
  /** Triggers when the list item is being dragged.
    */
  var itemDrag: js.UndefOr[js.Function1[/* e */ ItemDragEventArgs, Unit]] = js.native
  /** Triggers when the list item is ready to be dragged.
    */
  var itemDragStart: js.UndefOr[js.Function1[/* e */ ItemDragStartEventArgs, Unit]] = js.native
  /** Triggers when the list item stops dragging.
    */
  var itemDragStop: js.UndefOr[js.Function1[/* e */ ItemDragStopEventArgs, Unit]] = js.native
  /** Triggers when the list item is dropped.
    */
  var itemDrop: js.UndefOr[js.Function1[/* e */ ItemDropEventArgs, Unit]] = js.native
  /** Defines the height for individual ListBox item.
    * @Default {null}
    */
  var itemHeight: js.UndefOr[String] = js.native
  /** The number of list items to be loaded in the list box while enabling virtual scrolling and when virtualScrollMode is set to continuous.
    * @Default {5}
    */
  var itemRequestCount: js.UndefOr[Double] = js.native
  /** The number of list items to be shown in the ListBox widget. The remaining list items will be scrollable.
    * @Default {null}
    */
  var itemsCount: js.UndefOr[Double] = js.native
  /** Loads data for the listbox by default (i.e. on initialization) when it is set to true. It creates empty ListBox if it is set to false.
    * @Default {true}
    */
  var loadDataOnInit: js.UndefOr[Boolean] = js.native
  /** The query to retrieve required data from the data source.
    * @Default {ej.Query()}
    */
  var query: js.UndefOr[Query] = js.native
  /** Triggers when a list item gets selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** The list item to be selected by default using its index.
    * @Default {null}
    */
  var selectedIndex: js.UndefOr[Double] = js.native
  /** The list items to be selected by default using its indices. To use this property allowMultiSelection should be enabled.
    * @Default {[]}
    */
  var selectedIndices: js.UndefOr[js.Array[_]] = js.native
  /** Enables/Disables the multi selection option with the help of checkbox control.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /** To display the ListBox container with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Set to sort ListBox items either by Ascending or Descending order. By default sortOrder is set as enum type of &quot;None&quot;.You can use only below mentioned type for sorting
    * purpose.
    * @Default {ej.SortOrder.None}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.native
  /** Specifies the targetID for the listbox items.
    * @Default {null}
    */
  var targetID: js.UndefOr[String] = js.native
  /** The template to display the ListBox widget with customized appearance.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** The total number of list items to be rendered in the ListBox widget.
    * @Default {null}
    */
  var totalItemsCount: js.UndefOr[Double] = js.native
  /** Triggers when a list item gets unselected.
    */
  var unselect: js.UndefOr[js.Function1[/* e */ UnselectEventArgs, Unit]] = js.native
  /** Holds the selected items values and used to bind value to the list item using AngularJS and KnockoutJS.
    * @Default {â€œâ€}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specifies the virtual scroll mode to load the list data on demand via scrolling behavior. There are two types of mode.
    * @Default {ej.VirtualScrollMode.Normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.native
  /** Defines the width of the ListBox widget.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionBeforeSuccess(value: /* e */ ActionBeforeSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBeforeSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionBeforeSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBeforeSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withActionSuccess(value: /* e */ ActionSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowVirtualScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVirtualScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowVirtualScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVirtualScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withCascadeTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascadeTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeTo")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitiveSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitiveSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitiveSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitiveSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckChange(value: /* e */ CheckChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCheckChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkChange")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedIndices(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableIncrementalSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIncrementalSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableIncrementalSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIncrementalSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableWordWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDrag(value: /* e */ ItemDragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDragStart(value: /* e */ ItemDragStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDragStop(value: /* e */ ItemDragStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDrop(value: /* e */ ItemDropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRequestCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRequestCount")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadDataOnInit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadDataOnInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadDataOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadDataOnInit")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ SelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIndices(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: SortOrder | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetID")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItemsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItemsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItemsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselect(value: /* e */ UnselectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualScrollMode(value: VirtualScrollMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScrollMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualScrollMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualScrollMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

