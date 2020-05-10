package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceAutocompleteRequest extends js.Object {
  /**
    * A grouping of places to which you would like to restrict your results.
    * Currently, you can use `components` to filter by up to 5 countries.
    * Countries must be passed as a two character, ISO 3166-1 Alpha-2 compatible country code.
    * For example: `components=country:fr` would restrict your results to places within France.
    * Multiple countries must be passed as multiple `country:XX` filters, with the pipe character (`|`) as a separator.
    * For example: `components=country:us|country:pr|country:vi|country:gu|country:mp` would restrict your results
    * to places within the United States and its unincorporated organized territories.
    */
  var components: js.UndefOr[js.Array[String]] = js.native
  /**
    * The text string on which to search. The Place Autocomplete service will return candidate matches
    * based on this string and order results based on their perceived relevance.
    */
  var input: String = js.native
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking.
    * See the list of supported languages and their codes.
    * Note that we often update supported languages so this list may not be exhaustive.
    * If language is not supplied, the Place Autocomplete service will attempt to use the native language
    * of the domain from which the request is sent.
    */
  var language: js.UndefOr[String] = js.native
  /** The point around which you wish to retrieve place information. */
  var location: js.UndefOr[LatLng] = js.native
  /**
    * The position, in the input term, of the last character that the service uses to match predictions.
    * For example, if the input is 'Google' and the `offset` is 3, the service will match on 'Goo'.
    * The string determined by the `offset` is matched against the first word in the input term only.
    * For example, if the input term is 'Google abc' and the offset is 3, the service will attempt to match against 'Goo abc'.
    * If no `offset` is supplied, the service will use the whole term.
    * The `offset` should generally be set to the position of the text caret.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The distance (in meters) within which to return place results. Note that setting a radius biases results to the indicated area,
    * but may not fully restrict results to the specified area.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * A random string which identifies an autocomplete
    * [session](https://developers.google.com/places/web-service/autocomplete#session_tokens) for billing purposes.
    * If this parameter is omitted from an autocomplete request, the request is billed independently
    */
  var sessiontoken: js.UndefOr[String] = js.native
  /**
    * Returns only those places that are strictly within the region defined by `location` and `radius`.
    * This is a restriction, rather than a bias, meaning that results outside this region
    * will not be returned even if they match the user input.
    */
  var strictbounds: js.UndefOr[Boolean] = js.native
  /** The types of place results to return. */
  var types: js.UndefOr[PlaceAutocompleteType] = js.native
}

object PlaceAutocompleteRequest {
  @scala.inline
  def apply(input: String): PlaceAutocompleteRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAutocompleteRequest]
  }
  @scala.inline
  implicit class PlaceAutocompleteRequestOps[Self <: PlaceAutocompleteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withSessiontoken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessiontoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessiontoken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessiontoken")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictbounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictbounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictbounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictbounds")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: PlaceAutocompleteType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

