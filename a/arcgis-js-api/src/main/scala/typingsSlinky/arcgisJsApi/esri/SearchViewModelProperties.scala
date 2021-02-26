package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchViewModelProperties extends GoToProperties {
  
  /**
    * The selected source's index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSourceIndex)
    */
  var activeSourceIndex: js.UndefOr[Double] = js.native
  
  /**
    * String value used as a hint for input text when searching on multiple sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allPlaceholder)
    */
  var allPlaceholder: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#autoSelect)
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * The default [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the search result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSymbol)
    */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.native
  
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#includeDefaultSources)
    */
  var includeDefaultSources: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * Indicates whether location services are enabled within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#locationEnabled)
    */
  var locationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum character length of the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxInputLength)
    */
  var maxInputLength: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxResults)
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxSuggestions)
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#minSuggestCharacters)
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  
  /**
    * It is possible to search a specified portal instance's [locator services](http://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm) Use this property to set this [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) instance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphic) will display at the location of the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphicEnabled)
    */
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to display the option to search all sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchAllEnabled)
    */
  var searchAllEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchTerm)
    */
  var searchTerm: js.UndefOr[String] = js.native
  
  /**
    * The Search widget may be used to search features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or geocode locations with a [Locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources)
    */
  var sources: js.UndefOr[
    CollectionProperties[LayerSearchSourceProperties | LocatorSearchSourceProperties]
  ] = js.native
  
  /**
    * The millisecond delay after keyup and before making a [suggest](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggest) network request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionDelay)
    */
  var suggestionDelay: js.UndefOr[Double] = js.native
  
  /**
    * Enable suggestions for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionsEnabled)
    */
  var suggestionsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object SearchViewModelProperties {
  
  @scala.inline
  def apply(): SearchViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchViewModelProperties]
  }
  
  @scala.inline
  implicit class SearchViewModelPropertiesMutableBuilder[Self <: SearchViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSourceIndex(value: Double): Self = StObject.set(x, "activeSourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSourceIndexUndefined: Self = StObject.set(x, "activeSourceIndex", js.undefined)
    
    @scala.inline
    def setAllPlaceholder(value: String): Self = StObject.set(x, "allPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllPlaceholderUndefined: Self = StObject.set(x, "allPlaceholder", js.undefined)
    
    @scala.inline
    def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
    
    @scala.inline
    def setDefaultSymbol(value: SymbolProperties): Self = StObject.set(x, "defaultSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSymbolUndefined: Self = StObject.set(x, "defaultSymbol", js.undefined)
    
    @scala.inline
    def setIncludeDefaultSources(value: Boolean | js.Function): Self = StObject.set(x, "includeDefaultSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDefaultSourcesUndefined: Self = StObject.set(x, "includeDefaultSources", js.undefined)
    
    @scala.inline
    def setLocationEnabled(value: Boolean): Self = StObject.set(x, "locationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationEnabledUndefined: Self = StObject.set(x, "locationEnabled", js.undefined)
    
    @scala.inline
    def setMaxInputLength(value: Double): Self = StObject.set(x, "maxInputLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInputLengthUndefined: Self = StObject.set(x, "maxInputLength", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMaxSuggestions(value: Double): Self = StObject.set(x, "maxSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSuggestionsUndefined: Self = StObject.set(x, "maxSuggestions", js.undefined)
    
    @scala.inline
    def setMinSuggestCharacters(value: Double): Self = StObject.set(x, "minSuggestCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSuggestCharactersUndefined: Self = StObject.set(x, "minSuggestCharacters", js.undefined)
    
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    @scala.inline
    def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    @scala.inline
    def setResultGraphicEnabled(value: Boolean): Self = StObject.set(x, "resultGraphicEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultGraphicEnabledUndefined: Self = StObject.set(x, "resultGraphicEnabled", js.undefined)
    
    @scala.inline
    def setSearchAllEnabled(value: Boolean): Self = StObject.set(x, "searchAllEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchAllEnabledUndefined: Self = StObject.set(x, "searchAllEnabled", js.undefined)
    
    @scala.inline
    def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    
    @scala.inline
    def setSources(value: CollectionProperties[LayerSearchSourceProperties | LocatorSearchSourceProperties]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: (LayerSearchSourceProperties | LocatorSearchSourceProperties)*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setSuggestionDelay(value: Double): Self = StObject.set(x, "suggestionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionDelayUndefined: Self = StObject.set(x, "suggestionDelay", js.undefined)
    
    @scala.inline
    def setSuggestionsEnabled(value: Boolean): Self = StObject.set(x, "suggestionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsEnabledUndefined: Self = StObject.set(x, "suggestionsEnabled", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
