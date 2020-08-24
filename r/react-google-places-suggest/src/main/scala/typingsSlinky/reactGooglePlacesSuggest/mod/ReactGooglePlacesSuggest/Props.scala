package typingsSlinky.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest

import slinky.core.facade.ReactElement
import typingsSlinky.googlemaps.google.maps.places.AutocompletionRequest
import typingsSlinky.reactGooglePlacesSuggest.anon.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var autocompletionRequest: AutocompletionRequest = js.native
  var children: js.UndefOr[ReactElement] = js.native
  var customContainerRender: js.UndefOr[js.Function1[/* predictions */ js.Array[Prediction], ReactElement | String]] = js.native
  var customRender: js.UndefOr[js.Function1[/* prediction */ js.UndefOr[Prediction], ReactElement | String]] = js.native
  var googleMaps: Typeofmaps = js.native
  var onSelectSuggest: js.UndefOr[
    js.Function2[/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction, _]
  ] = js.native
  var textNoResults: js.UndefOr[String | Null] = js.native
}

object Props {
  @scala.inline
  def apply(autocompletionRequest: AutocompletionRequest, googleMaps: Typeofmaps): Props = {
    val __obj = js.Dynamic.literal(autocompletionRequest = autocompletionRequest.asInstanceOf[js.Any], googleMaps = googleMaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setAutocompletionRequest(value: AutocompletionRequest): Self = this.set("autocompletionRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoogleMaps(value: Typeofmaps): Self = this.set("googleMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCustomContainerRender(value: /* predictions */ js.Array[Prediction] => ReactElement | String): Self = this.set("customContainerRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomContainerRender: Self = this.set("customContainerRender", js.undefined)
    @scala.inline
    def setCustomRender(value: /* prediction */ js.UndefOr[Prediction] => ReactElement | String): Self = this.set("customRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomRender: Self = this.set("customRender", js.undefined)
    @scala.inline
    def setOnSelectSuggest(value: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => _): Self = this.set("onSelectSuggest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelectSuggest: Self = this.set("onSelectSuggest", js.undefined)
    @scala.inline
    def setTextNoResults(value: String): Self = this.set("textNoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextNoResults: Self = this.set("textNoResults", js.undefined)
    @scala.inline
    def setTextNoResultsNull: Self = this.set("textNoResults", null)
  }
  
}

