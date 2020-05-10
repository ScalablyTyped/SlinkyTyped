package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response that contains list beacon results and pagination help.
  */
@js.native
trait SchemaListBeaconsResponse extends js.Object {
  /**
    * The beacons that matched the search criteria.
    */
  var beacons: js.UndefOr[js.Array[SchemaBeacon]] = js.native
  /**
    * An opaque pagination token that the client may provide in their next
    * request to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Estimate of the total number of beacons matched by the query. Higher
    * values may be less accurate.
    */
  var totalCount: js.UndefOr[String] = js.native
}

object SchemaListBeaconsResponse {
  @scala.inline
  def apply(): SchemaListBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBeaconsResponse]
  }
  @scala.inline
  implicit class SchemaListBeaconsResponseOps[Self <: SchemaListBeaconsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeacons(value: js.Array[SchemaBeacon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeacons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacons")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(js.undefined)
        ret
    }
  }
  
}

