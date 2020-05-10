package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsRegistriesGroupsDevicesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A list of device string IDs. For example, `['device0', 'device12']`. If
    * empty, this field is ignored. Maximum IDs: 10,000
    */
  var deviceIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of device numeric IDs. If empty, this field is ignored. Maximum
    * IDs: 10,000.
    */
  var deviceNumIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fields of the `Device` resource to be returned in the response. The
    * fields `id` and `num_id` are always returned, along with any other fields
    * specified.
    */
  var fieldMask: js.UndefOr[String] = js.native
  /**
    * If set, returns only the gateways with which the specified device is
    * associated. The device ID can be numeric (`num_id`) or the user-defined
    * string (`id`). For example, if `456` is specified, returns only the
    * gateways to which the device with `num_id` 456 is bound.
    */
  @JSName("gatewayListOptions.associationsDeviceId")
  var gatewayListOptionsDotassociationsDeviceId: js.UndefOr[String] = js.native
  /**
    * If set, only devices associated with the specified gateway are returned.
    * The gateway ID can be numeric (`num_id`) or the user-defined string
    * (`id`). For example, if `123` is specified, only devices bound to the
    * gateway with `num_id` 123 are returned.
    */
  @JSName("gatewayListOptions.associationsGatewayId")
  var gatewayListOptionsDotassociationsGatewayId: js.UndefOr[String] = js.native
  /**
    * If `GATEWAY` is specified, only gateways are returned. If `NON_GATEWAY`
    * is specified, only non-gateway devices are returned. If
    * `GATEWAY_TYPE_UNSPECIFIED` is specified, all devices are returned.
    */
  @JSName("gatewayListOptions.gatewayType")
  var gatewayListOptionsDotgatewayType: js.UndefOr[String] = js.native
  /**
    * The maximum number of devices to return in the response. If this value is
    * zero, the service will select a default size. A call may return fewer
    * objects than requested. A non-empty `next_page_token` in the response
    * indicates that more data is available.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListDevicesResponse`; indicates that this
    * is a continuation of a prior `ListDevices` call and the system should
    * return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The device registry path. Required. For example,
    * `projects/my-project/locations/us-central1/registries/my-registry`.
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsRegistriesGroupsDevicesList {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRegistriesGroupsDevicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesGroupsDevicesList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRegistriesGroupsDevicesListOps[Self <: ParamsResourceProjectsLocationsRegistriesGroupsDevicesList] (val x: Self) extends AnyVal {
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
    def withDeviceIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceNumIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceNumIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceNumIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceNumIds")(js.undefined)
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
    def withGatewayListOptionsDotassociationsDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayListOptions.associationsDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayListOptionsDotassociationsDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayListOptions.associationsDeviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayListOptionsDotassociationsGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayListOptions.associationsGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayListOptionsDotassociationsGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayListOptions.associationsGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayListOptionsDotgatewayType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayListOptions.gatewayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayListOptionsDotgatewayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayListOptions.gatewayType")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

