package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location where a voter can vote. This may be an early vote site, an
  * election day voting location, or a drop off location for a completed
  * ballot.
  */
@js.native
trait SchemaPollingLocation extends js.Object {
  /**
    * The address of the location.
    */
  var address: js.UndefOr[SchemaSimpleAddressType] = js.native
  /**
    * The last date that this early vote site or drop off location may be used.
    * This field is not populated for polling locations.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * An ID for this object. IDs may change in future requests and should not
    * be cached. Access to this field requires special access that can be
    * requested from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Latitude of the location, in degrees north of the equator. Only some
    * locations -- generally, ballot drop boxes for vote-by-mail elections --
    * will have this set; for others, use a geocoding service like the Google
    * Maps API to resolve the address to a geographic point.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude of the location, in degrees east of the Prime Meridian. Only
    * some locations -- generally, ballot drop boxes for vote-by-mail elections
    * -- will have this set; for others, use a geocoding service like the
    * Google Maps API to resolve the address to a geographic point.
    */
  var longitude: js.UndefOr[Double] = js.native
  /**
    * The name of the early vote site or drop off location. This field is not
    * populated for polling locations.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Notes about this location (e.g. accessibility ramp or entrance to use).
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * A description of when this location is open.
    */
  var pollingHours: js.UndefOr[String] = js.native
  /**
    * A list of sources for this location. If multiple sources are listed the
    * data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
  /**
    * The first date that this early vote site or drop off location may be
    * used. This field is not populated for polling locations.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * The services provided by this early vote site or drop off location. This
    * field is not populated for polling locations.
    */
  var voterServices: js.UndefOr[String] = js.native
}

object SchemaPollingLocation {
  @scala.inline
  def apply(): SchemaPollingLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollingLocation]
  }
  @scala.inline
  implicit class SchemaPollingLocationOps[Self <: SchemaPollingLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: SchemaSimpleAddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withPollingHours(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingHours")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[SchemaSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withVoterServices(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voterServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoterServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voterServices")(js.undefined)
        ret
    }
  }
  
}

