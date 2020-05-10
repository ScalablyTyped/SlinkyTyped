package typingsSlinky.ejWebAll.ej.DropDownList

import typingsSlinky.ejWebAll.ej.FilterType_
import typingsSlinky.ejWebAll.ej.MultiSelectMode
import typingsSlinky.ejWebAll.ej.SortOrder_
import typingsSlinky.ejWebAll.ej.VirtualScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires the action before the XHR request.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Fires the action when the list of items is bound to the DropDownList by xhr post calling
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Fires the action when the xhr post calling failed on remote data binding with the DropDownList control.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Fires the action when the xhr post calling succeed on remote data binding with the DropDownList control
    */
  var actionSuccess: js.UndefOr[js.Function1[/* e */ ActionSuccessEventArgs, Unit]] = js.native
  /** The Virtual Scrolling(lazy loading) feature is used to display a large amount of data that you require without buffering the entire load of a huge database records in the
    * DropDownList, that is, when scrolling, an AJAX request is sent to fetch some amount of data from the server dynamically. To achieve this scenario with DropDownList, set the
    * allowVirtualScrolling to true.
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** Fires the action before the popup is ready to hide.
    */
  var beforePopupHide: js.UndefOr[js.Function1[/* e */ BeforePopupHideEventArgs, Unit]] = js.native
  /** Fires the action before the popup is ready to be displayed.
    */
  var beforePopupShown: js.UndefOr[js.Function1[/* e */ BeforePopupShownEventArgs, Unit]] = js.native
  /** Fires when the cascading happens between two DropDownList exactly after the value changes in the first dropdown and before filtering in the second Dropdown.
    */
  var cascade: js.UndefOr[js.Function1[/* e */ CascadeEventArgs, Unit]] = js.native
  /** The cascading DropDownLists is a series of two or more DropDownLists in which each DropDownList is filtered according to the previous DropDownListâ€™s value.
    * @Default {null}
    */
  var cascadeTo: js.UndefOr[String] = js.native
  /** Sets the case sensitivity of the search operation. It supports both enableFilterSearch and enableIncrementalSearch property.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.native
  /** Fires the action when the DropDownList controlâ€™s value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires the action when the list item checkbox value is changed.
    */
  var checkChange: js.UndefOr[js.Function1[/* e */ CheckChangeEventArgs, Unit]] = js.native
  /** Fires the action once the DropDownList is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Dropdown widget's style and appearance can be controlled based on 13 different default built-in themes.You can customize the appearance of the dropdown by using the cssClass
    * property. You need to specify a class name in the cssClass property and the same class name is used before the class definitions wherever the custom styles are applied.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires the action when the list items is bound to the DropDownList.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.native
  /** This property is used to serve data from the data services based on the query provided. To bind the data to the dropdown widget, the dataSource property is assigned with the
    * instance of the ej.DataManager.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled with the dropdown. When you enter the delimiter value, the texts after the delimiter are
    * considered as a separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,) or semi-colon (;) or
    * any other special character.
    * @Default {','}
    */
  var delimiterChar: js.UndefOr[String] = js.native
  /** Fires the action when the DropDownList is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** The enabled Animation property uses the easeOutQuad animation to SlideDown and SlideUp the Popup list in 200 and 100 milliseconds, respectively.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** This property selects the item in the DropDownList when the item is entered in the Search textbox.
    * @Default {false}
    */
  var enableFilterSearch: js.UndefOr[Boolean] = js.native
  /** Specifies to perform incremental search for the selection of items from the DropDownList with the help of this property. This helps in selecting the item by using the typed
    * character.
    * @Default {true}
    */
  var enableIncrementalSearch: js.UndefOr[Boolean] = js.native
  /** Saves the current model value to the browser cookies for state maintenance. While refreshing the DropDownList control page, it retains the model value and it is applied from the
    * browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** This enables the resize handler to resize the popup to any size.
    * @Default {false}
    */
  var enablePopupResize: js.UndefOr[Boolean] = js.native
  /** Sets the DropDownList textbox direction from right to left align.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** The serverfiltering is to perform filter action when text is typed in the search box and filtering will be done based on the collection which contains the matched item from entire
    * datasource. Serverfiltering will be done based on the entire items in DataSource.
    * @Default {false}
    */
  var enableServerFiltering: js.UndefOr[Boolean] = js.native
  /** This property is used to sort the Items in the DropDownList. By default, it sorts the items in an ascending order.
    * @Default {false}
    */
  var enableSorting: js.UndefOr[Boolean] = js.native
  /** This property is used to indicate whether the DropDownList control responds to the user interaction or not. By default, the control is in the enabled mode and you can disable it
    * by setting it to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies the mapping fields for the data items of the DropDownList.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** When the enableFilterSearch property value is set to true, the values in the DropDownList shows the items starting with or containing the key word/letter typed in the Search
    * textbox.
    * @Default {ej.FilterType.Contains}
    */
  var filterType: js.UndefOr[FilterType_ | String] = js.native
  /** Fires the action when the DropDownList is focused.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  /** Fires the action when the DropDownList is about to lose focus.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  /** Used to create visualized header for dropdown items
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /** Defines the height of the DropDownList textbox.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** It sets the given HTML attributes for the DropDownList control such as ID, name, disabled, etc.
    * @Default {null}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Data can be fetched in the DropDownList control by using the DataSource, specifying the number of items.
    * @Default {5}
    */
  var itemsCount: js.UndefOr[Double] = js.native
  /** The property is used to determine whether the popup list is generated dynamically.
    * @Default {false}
    */
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  /** Allows the user to set the particular country or region language for the DropDownList.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Defines the maximum height of the suggestion box. This property restricts the maximum height of the popup when resize is enabled.
    * @Default {null}
    */
  var maxPopupHeight: js.UndefOr[String | Double] = js.native
  /** Defines the maximum width of the suggestion box. This property restricts the maximum width of the popup when resize is enabled.
    * @Default {null}
    */
  var maxPopupWidth: js.UndefOr[String | Double] = js.native
  /** Defines the minimum height of the suggestion box. This property restricts the minimum height of the popup when resize is enabled.
    * @Default {null}
    */
  var minPopupHeight: js.UndefOr[String | Double] = js.native
  /** Defines the minimum height of the suggestion box. This property restricts the minimum height of the popup when resize is enabled.
    * @Default {0}
    */
  var minPopupWidth: js.UndefOr[String | Double] = js.native
  /** With the help of this property, you can make a single or multi selection with the DropDownList and display the text in two modes, delimiter and visual mode. In delimiter mode, you
    * can separate the items by using the delimiter character such as comma (,) or semi-colon (;) or any other special character. In the visual mode, the items are showcased like boxes
    * with close icon in the textbox.
    * @Default {ej.MultiSelectMode.None}
    */
  var multiSelectMode: js.UndefOr[MultiSelectMode | String] = js.native
  /** Defines the height of the suggestion popup box in the DropDownList control.
    * @Default {152px}
    */
  var popupHeight: js.UndefOr[String | Double] = js.native
  /** Fires the action, once the popup is closed
    */
  var popupHide: js.UndefOr[js.Function1[/* e */ PopupHideEventArgs, Unit]] = js.native
  /** Fires the action, when the popup is resized.
    */
  var popupResize: js.UndefOr[js.Function1[/* e */ PopupResizeEventArgs, Unit]] = js.native
  /** Fires the action, when resizing a popup starts.
    */
  var popupResizeStart: js.UndefOr[js.Function1[/* e */ PopupResizeStartEventArgs, Unit]] = js.native
  /** Fires the action, when the popup resizing is stopped.
    */
  var popupResizeStop: js.UndefOr[js.Function1[/* e */ PopupResizeStopEventArgs, Unit]] = js.native
  /** Fires the action, once the popup is opened.
    */
  var popupShown: js.UndefOr[js.Function1[/* e */ PopupShownEventArgs, Unit]] = js.native
  /** Defines the width of the suggestion popup box in the DropDownList control.
    * @Default {auto}
    */
  var popupWidth: js.UndefOr[String | Double] = js.native
  /** Specifies the query to retrieve the data from the DataSource.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Specifies that the DropDownList textbox values should be read-only.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Fires the action before filtering the list items that starts in the DropDownList when the enableFilterSearch is enabled.
    */
  var search: js.UndefOr[js.Function1[/* e */ SearchEventArgs, Unit]] = js.native
  /** Fires the action, when the list of item is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** Specifies an item to be selected in the DropDownList.
    * @Default {null}
    */
  var selectedIndex: js.UndefOr[Double] = js.native
  /** Specifies the selectedItems for the DropDownList.
    * @Default {[]}
    */
  var selectedIndices: js.UndefOr[js.Array[_]] = js.native
  /** Selects multiple items in the DropDownList with the help of the checkbox control. To achieve this, enable the showCheckbox option to true.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /** DropDownList control is displayed with the popup seen.
    * @Default {false}
    */
  var showPopupOnLoad: js.UndefOr[Boolean] = js.native
  /** DropDownList textbox displayed with the rounded corner style.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** When the enableSorting property value is set to true, this property helps to sort the items either in ascending or descending order
    * @Default {ej.SortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[SortOrder_ | String] = js.native
  /** Specifies the targetID for the DropDownListâ€™s items.
    * @Default {null}
    */
  var targetID: js.UndefOr[String] = js.native
  /** By default, you can add any text or image to the DropDownList item. To customize the item layout or to create your own visualized elements, you can use this template support.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Defines the text value that is displayed in the DropDownList textbox.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Sets the jQuery validation error message in the DropDownList
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  /** Sets the jQuery validation rules in the Dropdownlist.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** Specifies the value (text content) for the DropDownList control.
    * @Default {null}
    */
  var value: js.UndefOr[String | Double] = js.native
  /** The Virtual Scrolling feature is used to display a large amount of records in the DropDownList, that is, when scrolling, an AJAX request is sent to fetch some amount of data from
    * the server dynamically. To achieve this scenario with DropDownList, set the allowVirtualScrolling to true. You can set the itemsCount property that represents the number of items
    * to be fetched from the server on every AJAX request.
    * @Default {normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.native
  /** Specifies a short hint that describes the expected value of the DropDownList control.
    * @Default {null}
    */
  var watermarkText: js.UndefOr[String] = js.native
  /** Defines the width of the DropDownList textbox.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
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
    def withBeforePopupHide(value: /* e */ BeforePopupHideEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePopupHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforePopupHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePopupHide")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePopupShown(value: /* e */ BeforePopupShownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePopupShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforePopupShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePopupShown")(js.undefined)
        ret
    }
    @scala.inline
    def withCascade(value: /* e */ CascadeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCascade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(js.undefined)
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
    def withDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
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
    def withDelimiterChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterChar")(js.undefined)
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
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFilterSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFilterSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFilterSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFilterSearch")(js.undefined)
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
    def withEnablePopupResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePopupResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePopupResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePopupResize")(js.undefined)
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
    def withEnableServerFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableServerFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableServerFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableServerFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(js.undefined)
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
    def withFilterType(value: FilterType_ | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
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
    def withHeaderTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
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
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
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
    def withLoadOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemand")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPopupHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPopupHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPopupHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPopupHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPopupWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPopupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPopupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPopupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPopupHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPopupHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPopupHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPopupHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPopupWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPopupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPopupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPopupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelectMode(value: MultiSelectMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupHide(value: /* e */ PopupHideEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopupHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupHide")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupResize(value: /* e */ PopupResizeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopupResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupResize")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupResizeStart(value: /* e */ PopupResizeStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupResizeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopupResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupResizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupResizeStop(value: /* e */ PopupResizeStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupResizeStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopupResizeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupResizeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupShown(value: /* e */ PopupShownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopupShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupShown")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
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
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: /* e */ SearchEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
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
    def withShowPopupOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopupOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupOnLoad")(js.undefined)
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
    def withSortOrder(value: SortOrder_ | String): Self = {
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
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
    def withWatermarkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermarkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
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

