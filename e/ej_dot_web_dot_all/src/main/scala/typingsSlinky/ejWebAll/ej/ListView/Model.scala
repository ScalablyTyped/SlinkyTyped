package typingsSlinky.ejWebAll.ej.ListView

import typingsSlinky.ejWebAll.ej.VirtualScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Event triggers before the AJAX request happens.
    */
  var ajaxBeforeLoad: js.UndefOr[js.Function1[/* e */ AjaxBeforeLoadEventArgs, Unit]] = js.native
  /** Event triggers after the AJAX content loaded completely.
    */
  var ajaxComplete: js.UndefOr[js.Function1[/* e */ AjaxCompleteEventArgs, Unit]] = js.native
  /** Event triggers when the AJAX request failed.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.native
  /** Specifies the ajaxSettings option to load the items to the ListView control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.native
  /** Event triggers after the AJAX content loaded successfully.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.native
  /** Loads the list data on demand via scrolling behavior to improve the applicationâ€™s performance. There are two ways to load data which can be defined using virtualScrollMode
    * property.
    * @Default {false}
    */
  var allowVirtualScrolling: js.UndefOr[Boolean] = js.native
  /** Set the index values to be selected on initial loading. This works only when enableCheckMark is set true.
    * @Default {[]}
    */
  var checkedIndices: js.UndefOr[js.Array[_]] = js.native
  /** Sets the root class for ListView theme. This cssClass API helps to use custom skinning option for ListView control. By defining the root class using this API, we need to include
    * this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Contains the list of data for generating the ListView items.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  /** Specifies whether to load AJAX content while selecting item.
    * @Default {false}
    */
  var enableAjax: js.UndefOr[Boolean] = js.native
  /** Specifies whether to enable caching the content.
    * @Default {false}
    */
  var enableCache: js.UndefOr[Boolean] = js.native
  /** Specifies whether to enable check mark for the item.
    * @Default {false}
    */
  var enableCheckMark: js.UndefOr[Boolean] = js.native
  /** Specifies whether to enable the filtering feature to filter the item.
    * @Default {false}
    */
  var enableFiltering: js.UndefOr[Boolean] = js.native
  /** Specifies whether to group the list item.
    * @Default {false}
    */
  var enableGroupList: js.UndefOr[Boolean] = js.native
  /** Specifies to maintain the current model value to browser cookies for state maintenance. While refresh the page, the model value will get apply to the control from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Specifies the field settings to map the datasource.
    */
  var fieldSettings: js.UndefOr[FieldSettings] = js.native
  /** Specifies the text of the back button in the header.
    * @Default {null}
    */
  var headerBackButtonText: js.UndefOr[String] = js.native
  /** Specifies the title of the header.
    * @Default {Title}
    */
  var headerTitle: js.UndefOr[String] = js.native
  /** Specifies the height.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the number of items to be fetched on each scroll. Note: This property works only with Virtual scrolling.
    * @Default {5}
    */
  var itemRequestCount: js.UndefOr[Double] = js.native
  /** Contains the array of items to be added in ListView.
    * @Default {[]}
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  /** Event triggers before the items loaded.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Event triggers after the items loaded.
    */
  var loadComplete: js.UndefOr[js.Function1[/* e */ LoadCompleteEventArgs, Unit]] = js.native
  /** Set the localization culture for ListView Widget.
    */
  var locale: js.UndefOr[String] = js.native
  /** Event triggers when mouse down happens on the item.
    */
  var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, Unit]] = js.native
  /** Event triggers when mouse up happens on the item.
    */
  var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, Unit]] = js.native
  /** Specifies whether to retain the selection of the item.
    * @Default {false}
    */
  var persistSelection: js.UndefOr[Boolean] = js.native
  /** Specifies whether to prevent the selection of the item.
    * @Default {false}
    */
  var preventSelection: js.UndefOr[Boolean] = js.native
  /** Specifies the query to execute with the datasource.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Specifies whether need to render the control with the template contents.
    * @Default {false}
    */
  var renderTemplate: js.UndefOr[Boolean] = js.native
  /** Specifies the index of item which need to be in selected state initially while loading.
    * @Default {0}
    */
  var selectedItemIndex: js.UndefOr[Double] = js.native
  /** Specifies whether to show the header.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /** Specifies whether to show the back button header.
    * @Default {false}
    */
  var showHeaderBackButton: js.UndefOr[Boolean] = js.native
  /** Specifies ID of the element contains template contents.
    * @Default {null}
    */
  var templateId: js.UndefOr[String] = js.native
  /** Specifies the maximum number of items to be fetched. Note: This will work only with Virtual scrolling
    * @Default {5}
    */
  var totalItemsCount: js.UndefOr[Double] = js.native
  /** Specifies the virtual scroll mode to load the list data on demand via scrolling behavior. There are two types of mode.
    * @Default {ej.VirtualScrollMode.Normal}
    */
  var virtualScrollMode: js.UndefOr[VirtualScrollMode | String] = js.native
  /** Specifies the width.
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
    def withAjaxBeforeLoad(value: /* e */ AjaxBeforeLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxBeforeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxBeforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxComplete(value: /* e */ AjaxCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxError(value: /* e */ AjaxErrorEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxSettings(value: AjaxSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxSuccess(value: /* e */ AjaxSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAjaxSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSuccess")(js.undefined)
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
    def withDataSource(value: js.Array[_]): Self = {
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
    def withEnableAjax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAjax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAjax")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCache")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCheckMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCheckMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCheckMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCheckMark")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroupList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupList")(js.undefined)
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
    def withFieldSettings(value: FieldSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBackButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBackButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(js.undefined)
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
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadComplete(value: /* e */ LoadCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadComplete")(js.undefined)
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
    def withMouseDown(value: /* e */ MouseDownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseUp(value: /* e */ MouseUpEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSelection")(js.undefined)
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
    def withRenderTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeaderBackButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderBackButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeaderBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderBackButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateId")(js.undefined)
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

