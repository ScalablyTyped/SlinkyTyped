package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResultRendererProperties extends WidgetProperties {
  /**
    * Indicates whether to display the `Show more results` link within the search result's popup. A value of `true` will not display the link in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchResultRenderer.html#showMoreResultsOpen)
    *
    * @default false
    */
  var showMoreResultsOpen: js.UndefOr[Boolean] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SearchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchResultRenderer.html#viewModel)
    */
  var viewModel: js.UndefOr[SearchViewModelProperties] = js.native
}

object SearchResultRendererProperties {
  @scala.inline
  def apply(): SearchResultRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResultRendererProperties]
  }
  @scala.inline
  implicit class SearchResultRendererPropertiesOps[Self <: SearchResultRendererProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowMoreResultsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMoreResultsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMoreResultsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMoreResultsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withViewModel(value: SearchViewModelProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewModel")(js.undefined)
        ret
    }
  }
  
}

