package typingsSlinky.reactDashGoogleDashPlacesDashSuggest.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.googlemaps.google.maps.places.AutocompletionRequest
import typingsSlinky.reactDashGoogleDashPlacesDashSuggest.Typeofmaps
import typingsSlinky.reactDashGoogleDashPlacesDashSuggest.reactDashGoogleDashPlacesDashSuggestMod.ReactGooglePlacesSuggest.GeocodedPrediction
import typingsSlinky.reactDashGoogleDashPlacesDashSuggest.reactDashGoogleDashPlacesDashSuggestMod.ReactGooglePlacesSuggest.Prediction
import typingsSlinky.reactDashGoogleDashPlacesDashSuggest.reactDashGoogleDashPlacesDashSuggestMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashGoogleDashPlacesDashSuggest
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-google-places-suggest", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    autocompletionRequest: AutocompletionRequest,
    googleMaps: Typeofmaps,
    customContainerRender: /* predictions */ js.Array[Prediction] => typingsSlinky.react.reactMod._Global_.JSX.Element | String = null,
    customRender: /* prediction */ js.UndefOr[Prediction] => typingsSlinky.react.reactMod._Global_.JSX.Element | String = null,
    onSelectSuggest: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => _ = null,
    textNoResults: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(autocompletionRequest = autocompletionRequest.asInstanceOf[js.Any], googleMaps = googleMaps.asInstanceOf[js.Any])
    if (customContainerRender != null) __obj.updateDynamic("customContainerRender")(js.Any.fromFunction1(customContainerRender))
    if (customRender != null) __obj.updateDynamic("customRender")(js.Any.fromFunction1(customRender))
    if (onSelectSuggest != null) __obj.updateDynamic("onSelectSuggest")(js.Any.fromFunction2(onSelectSuggest))
    if (textNoResults != null) __obj.updateDynamic("textNoResults")(textNoResults.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashGoogleDashPlacesDashSuggest.reactDashGoogleDashPlacesDashSuggestMod.ReactGooglePlacesSuggest.Props
}

