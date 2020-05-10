package typingsSlinky.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for BigtableInstanceAdmin.ListAppProfiles.
  */
@js.native
trait SchemaListAppProfilesResponse extends js.Object {
  /**
    * The list of requested app profiles.
    */
  var appProfiles: js.UndefOr[js.Array[SchemaAppProfile]] = js.native
  /**
    * Locations from which AppProfile information could not be retrieved, due
    * to an outage or some other transient condition. AppProfiles from these
    * locations may be missing from `app_profiles`. Values are of the form
    * `projects/&lt;project&gt;/locations/&lt;zone_id&gt;`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set if not all app profiles could be returned in a single response. Pass
    * this value to `page_token` in another request to get the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAppProfilesResponse {
  @scala.inline
  def apply(): SchemaListAppProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAppProfilesResponse]
  }
  @scala.inline
  implicit class SchemaListAppProfilesResponseOps[Self <: SchemaListAppProfilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppProfiles(value: js.Array[SchemaAppProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appProfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appProfiles")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedLocations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedLocations")(js.undefined)
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
  }
  
}

