package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSourceProperties extends js.Object {
  /**
    * Indicates whether to automatically navigate to the selected result once selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#autoNavigate)
    *
    * @default true
    */
  var autoNavigate: js.UndefOr[Boolean] = js.native
  /**
    * This property replaces the now deprecated `searchQueryParams`, `suggestQueryParams`, and `searchExtent` properties. Please see the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var filter: js.UndefOr[SearchSourceFilter] = js.native
  /**
    * Function used to get search results. See [GetResultsHandler](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetResultsHandler) for the function definition. When resolved, returns an object containing an array of [search results](esri-widgets-Search.html#SearchResult).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getResults)
    *
    * @default null
    */
  var getResults: js.UndefOr[GetResultsHandler] = js.native
  /**
    * Function used to get search suggestions. See [GetSuggestionsParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#GetSuggestionsParameters) for the function definition. When resolved, returns an object containing an array of [suggest results](esri-widgets-Search.html#SuggestResult).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#getSuggestions)
    *
    * @default null
    */
  var getSuggestions: js.UndefOr[GetSuggestionsParameters] = js.native
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxResults)
    *
    * @default 6
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#maxSuggestions)
    *
    * @default 6
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  /**
    * Indicates the minimum number of characters required before querying for a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#minSuggestCharacters)
    *
    * @default 1
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.native
  /**
    * Specifies the fields returned with the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * Used as a hint for the source input text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#placeholder)
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The popup template used to display search results. If no popup is needed, set the source's popupTemplate to `null`.
    * > This property should be set in instances where there is no existing [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) configured. For example, [feature sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html) will default to any existing [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) configured on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * Specify this to prefix the user's input of the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#prefix)
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Indicates whether to show a graphic on the map for the selected source using the [resultSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The symbol used to display the result.
    * > **Known Limitations**  This property only applies when the layer/locator/source is not part of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#resultSymbol)
    */
  var resultSymbol: js.UndefOr[SymbolProperties] = js.native
  /**
    * Specify this to add a suffix to the user's input for the search value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suffix)
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Indicates whether to display suggestions as the user enters input text in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#suggestionsEnabled)
    *
    * @default true
    */
  var suggestionsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to constrain the search results to the view's extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#withinViewEnabled)
    *
    * @default false
    */
  var withinViewEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The set zoom scale for the resulting search result. This scale is automatically honored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#zoomScale)
    */
  var zoomScale: js.UndefOr[Double] = js.native
}

object SearchSourceProperties {
  @scala.inline
  def apply(): SearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSourceProperties]
  }
  @scala.inline
  implicit class SearchSourcePropertiesOps[Self <: SearchSourceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoNavigate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNavigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNavigate")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: SearchSourceFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResults(value: /* params */ js.Any => js.Promise[js.Array[SearchResult]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResults")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSuggestions(value: /* params */ js.Any => js.Promise[js.Array[SuggestResult]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuggestions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSuggestions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSuggestCharacters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSuggestCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSuggestCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSuggestCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withOutFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outFields")(js.undefined)
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
    def withPopupEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupTemplate(value: PopupTemplateProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withResultGraphicEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultGraphicEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultGraphicEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultGraphicEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withResultSymbol(value: SymbolProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWithinViewEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinViewEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithinViewEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withinViewEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScale")(js.undefined)
        ret
    }
  }
  
}

