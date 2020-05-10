package typingsSlinky.reactGooglePlacesSuggest.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.googlemaps.google.maps.places.AutocompletionRequest
import typingsSlinky.reactGooglePlacesSuggest.Typeofmaps
import typingsSlinky.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.GeocodedPrediction
import typingsSlinky.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Prediction
import typingsSlinky.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Props
import typingsSlinky.reactGooglePlacesSuggest.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGooglePlacesSuggest {
  @JSImport("react-google-places-suggest", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def customContainerRender(value: /* predictions */ js.Array[Prediction] => ReactElement | String): this.type = set("customContainerRender", js.Any.fromFunction1(value))
    @scala.inline
    def customRender(value: /* prediction */ js.UndefOr[Prediction] => ReactElement | String): this.type = set("customRender", js.Any.fromFunction1(value))
    @scala.inline
    def onSelectSuggest(value: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => _): this.type = set("onSelectSuggest", js.Any.fromFunction2(value))
    @scala.inline
    def textNoResults(value: String): this.type = set("textNoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def textNoResultsNull: this.type = set("textNoResults", null)
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(autocompletionRequest: AutocompletionRequest, googleMaps: Typeofmaps): Builder = {
    val __props = js.Dynamic.literal(autocompletionRequest = autocompletionRequest.asInstanceOf[js.Any], googleMaps = googleMaps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

