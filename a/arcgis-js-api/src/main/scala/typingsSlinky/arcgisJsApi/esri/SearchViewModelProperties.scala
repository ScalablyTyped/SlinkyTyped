package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchViewModelProperties extends GoToProperties {
  /**
    * The selected source's index. This value is `-1` when all sources are selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#activeSourceIndex)
    *
    * @default 0
    */
  var activeSourceIndex: js.UndefOr[Double] = js.native
  /**
    * String value used as a hint for input text when searching on multiple sources. See the image below to view the location and style of this text in the context of the widget.  ![search-allPlaceholder](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-allplaceholder.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allPlaceholder)
    *
    * @default "Find address or place"
    */
  var allPlaceholder: js.UndefOr[String] = js.native
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result. If `false`, the [findAddressCandidates](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-find-address-candidates.htm) operation will still geocode the input string, but the top result will not be selected. To work with the geocoded results, you can set up a [search-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#event-search-complete) event handler and get the results through the event object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#autoSelect)
    *
    * @default true
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  /**
    * The default [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) for the search result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSymbol)
    *
    * @default PictureMarkerSymbol
    */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.native
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI. This can be a boolean value or a function that returns an array of Search [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#includeDefaultSources)
    *
    * @default true
    */
  var includeDefaultSources: js.UndefOr[Boolean | js.Function] = js.native
  /**
    * Indicates whether location services are enabled within the widget.  ![locationEnabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-locationEnabled.png)
    * > The use of this property is only supported on secure origins. To use it, switch your application to a secure origin, such as HTTPS. Note that localhost is considered "potentially secure" and can be used for easy testing in browsers that supports [Window.isSecureContext](https://developer.mozilla.org/en-US/docs/Web/API/Window/isSecureContext#Browser_compatibility) (currently Chrome and Firefox).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#locationEnabled)
    */
  var locationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The maximum character length of the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxInputLength)
    *
    * @default 128
    */
  var maxInputLength: js.UndefOr[Double] = js.native
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxResults)
    *
    * @default 6
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.  If working with the default [ArcGIS Online Geocoding service](https://developers.arcgis.com/rest/geocode/api-reference/overview-world-geocoding-service.htm), the default remains at `5`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#maxSuggestions)
    *
    * @default 6
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#minSuggestCharacters)
    *
    * @default 1
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click. The graphic can be clicked to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A customized [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) for the selected feature. Note that any [templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) defined on [allSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#allSources) take precedence over those defined directly on the template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#popupTemplate)
    *
    * @default null
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
    * A graphic will be placed in the View's [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics) for [layer views](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) that do not support the `highlight` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#resultGraphicEnabled)
    *
    * @default true
    */
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to display the option to search all sources. When `true`, the "All" option is displayed by default:  ![search-searchAllEnabled-true](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-true.png)  When `false`, no option to search all sources at once is available:  ![search-searchAllEnabled-true-false](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-false.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchAllEnabled)
    *
    * @default true
    */
  var searchAllEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#searchTerm)
    */
  var searchTerm: js.UndefOr[String] = js.native
  /**
    * The Search widget may be used to search features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or geocode locations with a [Locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html). The `sources` property defines the sources from which to search for the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#view) specified by the Search widget instance. There are two types of sources:
    *   * [LayerSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html)
    *   * [LocatorSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html)
    *
    *
    * Any combination of these sources may be used together in the same instance of the Search widget.
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
    *
    * @default 150
    */
  var suggestionDelay: js.UndefOr[Double] = js.native
  /**
    * Enable suggestions for the widget.  This is only available if working with a 10.3 or greater geocoding service that has [suggest capability loaded] (https://developers.arcgis.com/rest/geocode/api-reference/geocoding-suggest.htm) or a 10.3 or greater feature layer that supports pagination, i.e. `supportsPagination = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#suggestionsEnabled)
    *
    * @default true
    */
  var suggestionsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#view)
    *
    * @default null
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
  implicit class SearchViewModelPropertiesOps[Self <: SearchViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveSourceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSourceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveSourceIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSourceIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAllPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSymbol(value: SymbolProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDefaultSources(value: Boolean | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDefaultSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultSources")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInputLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInputLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInputLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInputLength")(js.undefined)
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
    def withPortal(value: PortalProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portal")(js.undefined)
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
    def withSearchAllEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchAllEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchAllEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchAllEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTerm")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: CollectionProperties[LayerSearchSourceProperties | LocatorSearchSourceProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionDelay")(js.undefined)
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
    def withView(value: MapViewProperties | SceneViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

