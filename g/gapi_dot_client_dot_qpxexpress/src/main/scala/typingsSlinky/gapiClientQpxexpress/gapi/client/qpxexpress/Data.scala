package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  /** The aircraft that is flying between an origin and destination. */
  var aircraft: js.UndefOr[js.Array[AircraftData]] = js.native
  /** The airport of an origin or destination. */
  var airport: js.UndefOr[js.Array[AirportData]] = js.native
  /** The airline carrier of the aircraft flying between an origin and destination. Allowed values are IATA carrier codes. */
  var carrier: js.UndefOr[js.Array[CarrierData]] = js.native
  /** The city that is either the origin or destination of part of a trip. */
  var city: js.UndefOr[js.Array[CityData]] = js.native
  /**
    * Identifies this as QPX Express response resource, including a trip's airport, city, taxes, airline, and aircraft. Value: the fixed string
    * qpxexpress#data.
    */
  var kind: js.UndefOr[String] = js.native
  /** The taxes due for flying between an origin and a destination. */
  var tax: js.UndefOr[js.Array[TaxData]] = js.native
}

object Data {
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAircraft(value: js.Array[AircraftData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aircraft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAircraft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aircraft")(js.undefined)
        ret
    }
    @scala.inline
    def withAirport(value: js.Array[AirportData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAirport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airport")(js.undefined)
        ret
    }
    @scala.inline
    def withCarrier(value: js.Array[CarrierData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carrier")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: js.Array[CityData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withTax(value: js.Array[TaxData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax")(js.undefined)
        ret
    }
  }
  
}

