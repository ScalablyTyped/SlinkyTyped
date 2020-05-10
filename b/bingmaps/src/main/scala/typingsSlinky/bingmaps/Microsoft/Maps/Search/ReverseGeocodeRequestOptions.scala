package typingsSlinky.bingmaps.Microsoft.Maps.Search

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseGeocodeRequestOptions extends js.Object {
  /**
    * A reference to a function to call when the request is returned with an error. The error callback function will receive
    * an object containing the geocode request options used in the request.
    */
  var errorCallback: js.UndefOr[
    js.Function1[/* reverseGeocodeRequestOptions */ ReverseGeocodeRequestOptions, Unit]
  ] = js.native
  /** Specifies to include the two-letter ISO country code. Default: false */
  var includeCountryIso2: js.UndefOr[Boolean] = js.native
  /**
    *  An array of entity types selected from the following options.
    * • Address
    * • Neighborhood
    * • PopulatedPlace
    * • Postcode1
    * • AdminDivision1
    * • AdminDivision2
    * • CountryRegion
    * These entity types are ordered from the most specific entity to the least specific entity. When entities of more than one entity type are found, only the most specific
    * entity is returned. For example, if you specify Address and AdminDistrict1 as entity types and entities were found for both types, only the Address entity information is
    * returned in the response. One exception to this rule is when both PopulatedPlace and Neighborhood entity types are specified and information is found for both. In this case,
    * the information for both entity types is returned. Also, more than one Neighborhood may be returned because the area covered by two different neighborhoods can overlap.
    */
  var includeEntityTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies to include the neighborhood in the response when it is available. Note: This feature isn’t
    * available in all locations.
    */
  var includeNeighborhood: js.UndefOr[Boolean] = js.native
  /** The location to use to match to geographic entities and addresses. */
  var location: Location = js.native
  /** A number indicating how long to wait, in seconds, for the reverse geocode request to  return. The default value is 5 seconds. */
  var timeout: js.UndefOr[Double] = js.native
  /** An object containing any data that needs to be passed to the callback when the request is completed. */
  var userData: js.UndefOr[js.Any] = js.native
  /**
    * A reference to a function to call when a successful result is returned from the geocode request. The callback function
    * will receive a PlaceResult object as an argument.
    */
  def callback(placeResult: IPlaceResult, userData: js.Any): Unit = js.native
}

object ReverseGeocodeRequestOptions {
  @scala.inline
  def apply(callback: (IPlaceResult, js.Any) => Unit, location: Location): ReverseGeocodeRequestOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseGeocodeRequestOptions]
  }
  @scala.inline
  implicit class ReverseGeocodeRequestOptionsOps[Self <: ReverseGeocodeRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: (IPlaceResult, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCallback(value: /* reverseGeocodeRequestOptions */ ReverseGeocodeRequestOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutErrorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeCountryIso2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCountryIso2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCountryIso2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCountryIso2")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeEntityTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEntityTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeEntityTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEntityTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNeighborhood(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNeighborhood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNeighborhood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNeighborhood")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
  }
  
}

