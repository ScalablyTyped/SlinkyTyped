package typingsSlinky.geoipLite.mod

import typingsSlinky.geoipLite.geoipLiteStrings.`0`
import typingsSlinky.geoipLite.geoipLiteStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lookup_ extends js.Object {
  /** The approximate accuracy radius (km), around the latitude and longitude */
  var area: Double = js.native
  /** This is the full city name */
  var city: String = js.native
  /** 2 letter ISO-3166-1 country code https://www.iban.com/country-codes */
  var country: String = js.native
  /** 1 if the country is a member state of the European Union, 0 otherwise. */
  var eu: `1` | `0` = js.native
  /** The latitude and longitude of the city */
  var ll: js.Tuple2[Double, Double] = js.native
  /** Metro code */
  var metro: Double = js.native
  /** [ <low bound of IP block>, <high bound of IP block> ] */
  var range: js.Tuple2[Double, Double] = js.native
  /**
    * Up to 3 alphanumeric variable length characters as ISO 3166-2 code
    * For US states this is the 2 letter state
    * For the United Kingdom this could be ENG as a country like “England
    * FIPS 10-4 subcountry code
    */
  var region: String = js.native
  /** "Country/Zone" Timezone from IANA Time Zone Database */
  var timezone: String = js.native
}

object Lookup_ {
  @scala.inline
  def apply(
    area: Double,
    city: String,
    country: String,
    eu: `1` | `0`,
    ll: js.Tuple2[Double, Double],
    metro: Double,
    range: js.Tuple2[Double, Double],
    region: String,
    timezone: String
  ): Lookup_ = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], eu = eu.asInstanceOf[js.Any], ll = ll.asInstanceOf[js.Any], metro = metro.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lookup_]
  }
  @scala.inline
  implicit class Lookup_Ops[Self <: Lookup_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEu(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLl(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetro(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

