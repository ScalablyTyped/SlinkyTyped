package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResultRendererProperties extends WidgetProperties {
  
  /**
    * Indicates whether to display the `Show more results` link within the search result's popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchResultRenderer.html#showMoreResultsOpen)
    */
  var showMoreResultsOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * The view model for this Search widget.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setShowMoreResultsOpen(value: Boolean): Self = this.set("showMoreResultsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMoreResultsOpen: Self = this.set("showMoreResultsOpen", js.undefined)
    
    @scala.inline
    def setViewModel(value: SearchViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
