package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsSearchProperties extends Object {
  /**
    * Number index indicating the current selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var activeSourceIndex: js.UndefOr[Double] = js.native
  /**
    * String value used as a hint for input text when searching on multiple sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var allPlaceholder: js.UndefOr[String] = js.native
  /**
    * Indicates whether to automatically navigate to the selected result once selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var autoNavigate: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  /**
    * Define the type of location, either `"street"` or `"rooftop"`. The default value will be `"street"` for any locator source that does not define a locationType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var locationType: js.UndefOr[String] = js.native
  /**
    * Indicates the maximum number of search results to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Indicates the maximum number of suggestions to return for the widget's input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var maxSuggestions: js.UndefOr[Double] = js.native
  /**
    * Indicates the minimum number of characters required before querying for a suggestion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var minSuggestCharacters: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a selected result is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to show the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) when a result is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var popupOpenOnSelect: js.UndefOr[Boolean] = js.native
  /**
    * A customized PopupTemplate for the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var popupTemplate: js.UndefOr[PopupTemplate] = js.native
  /**
    * Indicates whether to show a graphic on the map for the selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var resultGraphicEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to display the option to search all sources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var searchAllEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var searchTerm: js.UndefOr[String] = js.native
  /**
    * Specifies the sources to search in the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var sources: js.UndefOr[Collection[LayerSearchSource | LocatorSearchSource]] = js.native
  /**
    * Indicates whether to display suggestions as the user enters input text in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var suggestionsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The view of the widget.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[MapView | SceneView] = js.native
  /**
    * The Search widget's view model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties)
    */
  var viewModel: js.UndefOr[SearchViewModel] = js.native
}

object DirectionsSearchProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DirectionsSearchProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DirectionsSearchProperties]
  }
  @scala.inline
  implicit class DirectionsSearchPropertiesOps[Self <: DirectionsSearchProperties] (val x: Self) extends AnyVal {
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
    def withLocationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(js.undefined)
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
    def withPopupOpenOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupOpenOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupOpenOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupOpenOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupTemplate(value: PopupTemplate): Self = {
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
    def withSources(value: Collection[LayerSearchSource | LocatorSearchSource]): Self = {
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
    def withView(value: MapView | SceneView): Self = {
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
    @scala.inline
    def withViewModel(value: SearchViewModel): Self = {
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

