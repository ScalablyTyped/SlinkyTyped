package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOriginEndpointRequest extends js.Object {
  var Authorization: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.Authorization] = js.native
  var CmafPackage: js.UndefOr[CmafPackageCreateOrUpdateParameters] = js.native
  var DashPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.DashPackage] = js.native
  /**
    * A short text description of the OriginEndpoint.
    */
  var Description: js.UndefOr[string] = js.native
  var HlsPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.HlsPackage] = js.native
  /**
    * The ID of the OriginEndpoint to update.
    */
  var Id: string = js.native
  /**
    * A short string that will be appended to the end of the Endpoint URL.
    */
  var ManifestName: js.UndefOr[string] = js.native
  var MssPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.MssPackage] = js.native
  /**
    * Control whether origination of video is allowed for this OriginEndpoint. If set to ALLOW, the OriginEndpoint
  may by requested, pursuant to any other form of access control. If set to DENY, the OriginEndpoint may not be
  requested. This can be helpful for Live to VOD harvesting, or for temporarily disabling origination
    */
  var Origination: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.Origination] = js.native
  /**
    * Maximum duration (in seconds) of content to retain for startover playback.
  If not specified, startover playback will be disabled for the OriginEndpoint.
    */
  var StartoverWindowSeconds: js.UndefOr[integer] = js.native
  /**
    * Amount of delay (in seconds) to enforce on the playback of live content.
  If not specified, there will be no time delay in effect for the OriginEndpoint.
    */
  var TimeDelaySeconds: js.UndefOr[integer] = js.native
  /**
    * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
    */
  var Whitelist: js.UndefOr[listOfString] = js.native
}

object UpdateOriginEndpointRequest {
  @scala.inline
  def apply(Id: string): UpdateOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOriginEndpointRequest]
  }
  @scala.inline
  implicit class UpdateOriginEndpointRequestOps[Self <: UpdateOriginEndpointRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorization(value: Authorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorization")(js.undefined)
        ret
    }
    @scala.inline
    def withCmafPackage(value: CmafPackageCreateOrUpdateParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmafPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmafPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CmafPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withDashPackage(value: DashPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsPackage(value: HlsPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestName")(js.undefined)
        ret
    }
    @scala.inline
    def withMssPackage(value: MssPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MssPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMssPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MssPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigination(value: Origination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Origination")(js.undefined)
        ret
    }
    @scala.inline
    def withStartoverWindowSeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartoverWindowSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartoverWindowSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartoverWindowSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeDelaySeconds(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeDelaySeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeDelaySeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeDelaySeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelist(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Whitelist")(js.undefined)
        ret
    }
  }
  
}

