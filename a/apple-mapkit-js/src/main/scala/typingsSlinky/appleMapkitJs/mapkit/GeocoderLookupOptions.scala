package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that constrain geocoder lookup results to a specific area or set a
  * language for results.
  */
@js.native
trait GeocoderLookupOptions extends js.Object {
  /**
    * Coordinates used to constrain the lookup results.
    */
  var coordinate: js.UndefOr[Coordinate] = js.native
  /**
    * The language in which to display the lookup results.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * A list of countries in which to constrain the lookup results.
    */
  var limitToCountries: js.UndefOr[String] = js.native
  /**
    * A region in which to constrain lookup results.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
}

object GeocoderLookupOptions {
  @scala.inline
  def apply(): GeocoderLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderLookupOptions]
  }
  @scala.inline
  implicit class GeocoderLookupOptionsOps[Self <: GeocoderLookupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinate(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(js.undefined)
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
    def withLimitToCountries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitToCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitToCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitToCountries")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: CoordinateRegion): Self = {
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
  }
  
}

