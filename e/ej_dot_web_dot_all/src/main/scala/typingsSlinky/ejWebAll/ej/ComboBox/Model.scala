package typingsSlinky.ejWebAll.ej.ComboBox

import typingsSlinky.ejWebAll.ej.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers before fetching data from the remote server.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggers after data is fetched successfully from the remote server.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Triggers when the data fetch request from the remote server fails.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Accepts the template and assigns it to the popup list content of the component when the data fetch request from the remote server fails.
    * @Default {The Request Failed}
    */
  var actionFailureTemplate: js.UndefOr[String] = js.native
  /** Specifies whether the component allows user defined value which does not exist in data source.
    * @Default {true}
    */
  var allowCustom: js.UndefOr[Boolean] = js.native
  /** When allowFiltering is set to true, show the filter bar (search box) of the component. The filter action retrieves matched items through the filtering event based on the
    * characters typed in the search TextBox. If no match is found, the value of the noRecordsTemplate property will be displayed.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Specifies whether suggest a first matched item in input when searching. No action happens when no matches found.
    * @Default {false}
    */
  var autofill: js.UndefOr[Boolean] = js.native
  /** Triggers when an item in a popup is selected or when the model value is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Triggers when the popup is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  /** Triggers when ComboBox widget is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets CSS classes to the root element of the component that helps customize the UI styles.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Triggers on set a custom value to this component.
    */
  var customValueSpecifier: js.UndefOr[js.Function1[/* e */ CustomValueSpecifierEventArgs, Unit]] = js.native
  /** Accepts the list items either through local or remote service and binds it to the component. It can be an array of JSON objects or an instance of DataManager.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
  /** When set to true, enables RTL mode of the component that displays the content in the right-to-left direction.
    * @Default {false}
    */
  var enableRtl: js.UndefOr[Boolean] = js.native
  /** Specifies a value that indicates whether the component is enabled or not.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** The fields property maps the columns of the data table and binds the data to the component.
    */
  var fields: js.UndefOr[Fields] = js.native
  /** Triggers on typing a character in the component.
    */
  var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, Unit]] = js.native
  /** Triggers when the component is focused.
    */
  var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, Unit]] = js.native
  /** Accepts the template design and assigns it to the footer container of the popup list.
    * @Default {null}
    */
  var footerTemplate: js.UndefOr[String] = js.native
  /** Accepts the template design and assigns it to the group headers present in the popup list.
    * @Default {null}
    */
  var groupTemplate: js.UndefOr[String] = js.native
  /** Accepts the template design and assigns it to the header container of the popup list.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /** Allows additional HTML attributes such as title, name, etc., and accepts n number of attributes in a key-value pair format.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Gets or sets the index of the selected item in the component.
    * @Default {null}
    */
  var index: js.UndefOr[Double] = js.native
  /** Accepts the template design and assigns it to each list item present in the popup.
    * @Default {null}
    */
  var itemTemplate: js.UndefOr[String] = js.native
  /** Overrides the global culture and localization value for this component. Default global culture is 'en-US'.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Accepts the template design and assigns it to popup list of component when no data is available on the component.
    * @Default {No Records Found}
    */
  var noRecordsTemplate: js.UndefOr[String] = js.native
  /** Triggers after the suggestion list is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** Accepts the value to be displayed as a watermark text on the component input.
    * @Default {null}
    */
  var placeholder: js.UndefOr[String] = js.native
  /** Specifies the height of the popup list.
    * @Default {300px}
    */
  var popupHeight: js.UndefOr[String | Double] = js.native
  /** Specifies the width of the popup list. By default, the popup width sets based on the width of the component.
    * @Default {100%}
    */
  var popupWidth: js.UndefOr[String | Double] = js.native
  /** The query to retrieve the data from the data source.
    * @Default {null}
    */
  var query: js.UndefOr[Query] = js.native
  /** When set to true, the user interactions on the component are disabled.
    * @Default {false}
    */
  var readonly: js.UndefOr[Boolean] = js.native
  /** Triggers when an item in the popup is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** Specifies whether to show or hide the clear button. When the clear button is clicked, value, text, and index properties are reset to null.
    * @Default {true}
    */
  var showClearButton: js.UndefOr[Boolean] = js.native
  /** Specifies the sortOrder to sort the data source. The available type of sort orders are
    * @Default {ej.SortOrder.None}
    */
  var sortOrder: js.UndefOr[SortOrder | String] = js.native
  /** Gets or sets the display text of the selected item in the component.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Gets or sets the value of the selected item in the component.
    * @Default {null}
    */
  var value: js.UndefOr[Double | String] = js.native
  /** Specifies the width of the component. By default, the component width sets based on the width of its parent container. You can also set the width in pixel values.
    * @Default {100%}
    */
  var width: js.UndefOr[Double | String] = js.native
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
    def withActionFailureTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailureTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionFailureTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailureTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCustom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCustom")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withAutofill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofill")(js.undefined)
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
    def withClose(value: /* e */ CloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
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
    def withCustomValueSpecifier(value: /* e */ CustomValueSpecifierEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customValueSpecifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomValueSpecifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customValueSpecifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | js.Array[_]): Self = {
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
    def withEnableRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRtl")(js.undefined)
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
    def withFiltering(value: /* e */ FilteringEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtering")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: /* e */ FocusEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(js.undefined)
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
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.undefined)
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
    def withNoRecordsTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRecordsTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRecordsTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRecordsTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: /* e */ OpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
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
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
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
    def withShowClearButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClearButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClearButton")(js.undefined)
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
    def withValue(value: Double | String): Self = {
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
    def withWidth(value: Double | String): Self = {
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

