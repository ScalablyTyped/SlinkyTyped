package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceDetailsRequest extends js.Object {
  /**
    * One or more fields, specifying the types of place data to return, separated by a comma.
    *
    * **Warning: If you do not specify at least one field with a request, or if you omit the **fields**
    * parameter from a request, ALL possible fields will be returned, and you will be billed accordingly.
    * This applies only to Place Details requests.
    */
  var fields: js.UndefOr[js.Array[PlaceDetailsRequestField]] = js.native
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Note that some fields may not be available in the requested language.
    * Note that we often update supported languages so this list may not be exhaustive.
    */
  var language: js.UndefOr[Language] = js.native
  /** A textual identifier that uniquely identifies a place, returned from a Place Search. */
  var placeid: String = js.native
  /**
    * The region code, specified as a ccTLD (country code top-level domain) two-character value.
    * Most ccTLD codes are identical to ISO 3166-1 codes, with some exceptions.
    * This parameter will only influence, not fully restrict, results.
    * If more relevant results exist outside of the specified region, they may be included.
    * When this parameter is used, the country name is omitted from the resulting `formatted_address`
    * for results in the specified region.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * A random string which identifies an autocomplete session for billing purposes.
    * Use this for Place Details requests that are called following an autocomplete request in the same user session
    */
  var sessiontoken: js.UndefOr[String] = js.native
}

object PlaceDetailsRequest {
  @scala.inline
  def apply(placeid: String): PlaceDetailsRequest = {
    val __obj = js.Dynamic.literal(placeid = placeid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceDetailsRequest]
  }
  @scala.inline
  implicit class PlaceDetailsRequestOps[Self <: PlaceDetailsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[PlaceDetailsRequestField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: Language): Self = {
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
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
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
  }
  
}

