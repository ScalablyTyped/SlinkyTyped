package typingsSlinky.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.googlemaps.google.maps.places.AutocompletionRequest
import typingsSlinky.reactGooglePlacesSuggest.anon.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var autocompletionRequest: AutocompletionRequest = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
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
    def withAutocompletionRequest(value: AutocompletionRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocompletionRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoogleMaps(value: Typeofmaps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomContainerRender(value: /* predictions */ js.Array[Prediction] => ReactElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContainerRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomContainerRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContainerRender")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRender(value: /* prediction */ js.UndefOr[Prediction] => ReactElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectSuggest(value: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectSuggest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelectSuggest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectSuggest")(js.undefined)
        ret
    }
    @scala.inline
    def withTextNoResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textNoResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textNoResults")(js.undefined)
        ret
    }
    @scala.inline
    def withTextNoResultsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textNoResults")(null)
        ret
    }
  }
  
}

