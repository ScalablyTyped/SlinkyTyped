package typingsSlinky.antDesignReactNative.listViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UltimateListViewProps extends js.Object {
  var allLoadedText: js.UndefOr[js.Any] = js.native
  var arrowImageSource: js.UndefOr[js.Any] = js.native
  var arrowImageStyle: js.UndefOr[js.Any] = js.native
  var autoPagination: js.UndefOr[js.Any] = js.native
  var customRefreshControl: js.UndefOr[js.Any] = js.native
  var customRefreshView: js.UndefOr[js.Any] = js.native
  var dateFormat: js.UndefOr[js.Any] = js.native
  var dateStyle: js.UndefOr[js.Any] = js.native
  var dateTitle: js.UndefOr[js.Any] = js.native
  var displayDate: js.UndefOr[js.Any] = js.native
  var emptyView: js.UndefOr[js.Any] = js.native
  var enableEmptySections: js.UndefOr[js.Any] = js.native
  var fetchingSpinnerSize: js.UndefOr[js.Any] = js.native
  var firstLoader: js.UndefOr[js.Any] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var horizontal: js.UndefOr[js.Any] = js.native
  var initialNumToRender: js.UndefOr[js.Any] = js.native
  var numColumns: js.UndefOr[js.Any] = js.native
  var pagination: js.UndefOr[js.Any] = js.native
  var paginationAllLoadedView: js.UndefOr[js.Any] = js.native
  var paginationBtnText: js.UndefOr[js.Any] = js.native
  var paginationFetchingView: js.UndefOr[js.Any] = js.native
  var paginationWaitingView: js.UndefOr[js.Any] = js.native
  var refreshViewHeight: js.UndefOr[js.Any] = js.native
  var refreshViewStyle: js.UndefOr[js.Any] = js.native
  var refreshable: js.UndefOr[js.Any] = js.native
  var refreshableColors: js.UndefOr[js.Any] = js.native
  var refreshableMode: js.UndefOr[js.Any] = js.native
  var refreshableProgressBackgroundColor: js.UndefOr[js.Any] = js.native
  var refreshableSize: js.UndefOr[js.Any] = js.native
  var refreshableTintColor: js.UndefOr[js.Any] = js.native
  var refreshableTitle: js.UndefOr[js.Any] = js.native
  var refreshableTitlePull: js.UndefOr[js.Any] = js.native
  var refreshableTitleRefreshing: js.UndefOr[js.Any] = js.native
  var refreshableTitleRelease: js.UndefOr[js.Any] = js.native
  var scrollEnabled: js.UndefOr[js.Any] = js.native
  var separator: js.UndefOr[js.Any] = js.native
  var spinnerColor: js.UndefOr[js.Any] = js.native
  var waitingSpinnerSize: js.UndefOr[js.Any] = js.native
  var waitingSpinnerText: js.UndefOr[js.Any] = js.native
}

object UltimateListViewProps {
  @scala.inline
  def apply(): UltimateListViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UltimateListViewProps]
  }
  @scala.inline
  implicit class UltimateListViewPropsOps[Self <: UltimateListViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllLoadedText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allLoadedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllLoadedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allLoadedText")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowImageSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowImageSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowImageSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowImageSource")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowImageStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowImageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowImageStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowImageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPagination(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPagination")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRefreshControl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRefreshControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRefreshControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRefreshControl")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRefreshView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRefreshView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRefreshView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRefreshView")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDateStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyView")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableEmptySections(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEmptySections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableEmptySections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEmptySections")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchingSpinnerSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchingSpinnerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchingSpinnerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchingSpinnerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLoader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialNumToRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialNumToRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialNumToRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialNumToRender")(js.undefined)
        ret
    }
    @scala.inline
    def withNumColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationAllLoadedView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationAllLoadedView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationAllLoadedView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationAllLoadedView")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationBtnText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationBtnText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationBtnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationBtnText")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationFetchingView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationFetchingView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationFetchingView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationFetchingView")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationWaitingView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationWaitingView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationWaitingView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationWaitingView")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshViewHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshViewHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshViewHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshViewHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshViewStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshViewStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshViewStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshViewStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshable")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshableColors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshableColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableColors")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshableMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshableMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshableProgressBackgroundColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableProgressBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshableProgressBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableProgressBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshableSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshableSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshableTintColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshableTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshableTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshableTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshableTitlePull(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitlePull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshableTitlePull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitlePull")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshableTitleRefreshing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitleRefreshing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshableTitleRefreshing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitleRefreshing")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshableTitleRelease(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitleRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshableTitleRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshableTitleRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinnerColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinnerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinnerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitingSpinnerSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingSpinnerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitingSpinnerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingSpinnerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitingSpinnerText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingSpinnerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitingSpinnerText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingSpinnerText")(js.undefined)
        ret
    }
  }
  
}

