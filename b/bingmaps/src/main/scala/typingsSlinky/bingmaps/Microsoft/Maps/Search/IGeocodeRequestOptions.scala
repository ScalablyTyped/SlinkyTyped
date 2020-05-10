package typingsSlinky.bingmaps.Microsoft.Maps.Search

import typingsSlinky.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeocodeRequestOptions extends js.Object {
  /** 
    * A location rectangle that defines the boundaries of the area in which to search for 
    * location results. The default is the bounds of the map view associated with this 
    * instance of the SearchManager, which is usually the current map view.
    */
  var bounds: js.UndefOr[LocationRect] = js.native
  /** The maximum number of results to return. Required. The maximum number than can be returned is 20. */
  var count: js.UndefOr[Double] = js.native
  /**
    * The name of the function to call when the request is returned with an error. The 
    * error callback function must accept an IGeocodeRequestOptions object.
    */
  var errorCallback: js.UndefOr[js.Function1[/* geocodeRequestOptions */ IGeocodeRequestOptions, Unit]] = js.native
  /** Specifies to include the two-letter ISO country code. */
  var includeCountryIso2: js.UndefOr[Boolean] = js.native
  /** Specifies to include the neighborhood in the response when it is available. */
  var includeNeighborhood: js.UndefOr[Boolean] = js.native
  /** A number indicating how long to wait, in seconds, for the geocode request to return. The default value is 5 seconds. */
  var timeout: js.UndefOr[Double] = js.native
  /** An object containing any data that needs to be passed to the callback when the request is completed. */
  var userData: js.UndefOr[js.Any] = js.native
  /** A string containing the address or place to be matched to a location on the map.  */
  var where: String = js.native
  /**
    * The name of the function to call when a successful result is returned from the 
    * geocode request. The callback function must accept two parameters: result, which is 
    * a GeocodeResult type, and a userData object.
    */
  def callback(geocodeResult: IGeocodeResult, userData: js.Any): Unit = js.native
}

object IGeocodeRequestOptions {
  @scala.inline
  def apply(callback: (IGeocodeResult, js.Any) => Unit, where: String): IGeocodeRequestOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeocodeRequestOptions]
  }
  @scala.inline
  implicit class IGeocodeRequestOptionsOps[Self <: IGeocodeRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: (IGeocodeResult, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWhere(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("where")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: LocationRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCallback(value: /* geocodeRequestOptions */ IGeocodeRequestOptions => Unit): Self = {
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

