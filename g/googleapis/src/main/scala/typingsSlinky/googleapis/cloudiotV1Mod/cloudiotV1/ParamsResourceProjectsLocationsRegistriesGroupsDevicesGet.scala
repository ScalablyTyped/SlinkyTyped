package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsRegistriesGroupsDevicesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The fields of the `Device` resource to be returned in the response. If
    * the field mask is unset or empty, all fields are returned.
    */
  var fieldMask: js.UndefOr[String] = js.native
  /**
    * The name of the device. For example,
    * `projects/p0/locations/us-central1/registries/registry0/devices/device0`
    * or
    * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
    */
  var name: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsRegistriesGroupsDevicesGet {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRegistriesGroupsDevicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesGroupsDevicesGet]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRegistriesGroupsDevicesGetOps[Self <: ParamsResourceProjectsLocationsRegistriesGroupsDevicesGet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMask")(js.undefined)
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
  }
  
}

