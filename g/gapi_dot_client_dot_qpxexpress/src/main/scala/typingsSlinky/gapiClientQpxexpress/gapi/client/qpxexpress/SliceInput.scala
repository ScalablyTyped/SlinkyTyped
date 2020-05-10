package typingsSlinky.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceInput extends js.Object {
  /**
    * Slices with only the carriers in this alliance should be returned; do not use this field with permittedCarrier. Allowed values are ONEWORLD, SKYTEAM,
    * and STAR.
    */
  var alliance: js.UndefOr[String] = js.native
  /** Departure date in YYYY-MM-DD format. */
  var date: js.UndefOr[String] = js.native
  /** Airport or city IATA designator of the destination. */
  var destination: js.UndefOr[String] = js.native
  /** Identifies this as a slice input object, representing the criteria a desired slice must satisfy. Value: the fixed string qpxexpress#sliceInput. */
  var kind: js.UndefOr[String] = js.native
  /** The longest connection between two legs, in minutes, you are willing to accept. */
  var maxConnectionDuration: js.UndefOr[Double] = js.native
  /** The maximum number of stops you are willing to accept in this slice. */
  var maxStops: js.UndefOr[Double] = js.native
  /** Airport or city IATA designator of the origin. */
  var origin: js.UndefOr[String] = js.native
  /** A list of 2-letter IATA airline designators. Slices with only these carriers should be returned. */
  var permittedCarrier: js.UndefOr[js.Array[String]] = js.native
  /** Slices must depart in this time of day range, local to the point of departure. */
  var permittedDepartureTime: js.UndefOr[TimeOfDayRange] = js.native
  /** Prefer solutions that book in this cabin for this slice. Allowed values are COACH, PREMIUM_COACH, BUSINESS, and FIRST. */
  var preferredCabin: js.UndefOr[String] = js.native
  /** A list of 2-letter IATA airline designators. Exclude slices that use these carriers. */
  var prohibitedCarrier: js.UndefOr[js.Array[String]] = js.native
}

object SliceInput {
  @scala.inline
  def apply(): SliceInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceInput]
  }
  @scala.inline
  implicit class SliceInputOps[Self <: SliceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlliance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alliance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlliance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alliance")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
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
    def withMaxConnectionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnectionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnectionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnectionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStops(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStops")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withPermittedCarrier(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedCarrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermittedCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedCarrier")(js.undefined)
        ret
    }
    @scala.inline
    def withPermittedDepartureTime(value: TimeOfDayRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedDepartureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermittedDepartureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permittedDepartureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredCabin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredCabin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredCabin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredCabin")(js.undefined)
        ret
    }
    @scala.inline
    def withProhibitedCarrier(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prohibitedCarrier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProhibitedCarrier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prohibitedCarrier")(js.undefined)
        ret
    }
  }
  
}

