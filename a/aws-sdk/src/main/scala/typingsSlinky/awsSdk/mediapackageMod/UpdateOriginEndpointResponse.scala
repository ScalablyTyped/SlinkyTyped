package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOriginEndpointResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the OriginEndpoint.
    */
  var Arn: js.UndefOr[string] = js.native
  var Authorization: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.Authorization] = js.native
  /**
    * The ID of the Channel the OriginEndpoint is associated with.
    */
  var ChannelId: js.UndefOr[string] = js.native
  var CmafPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.CmafPackage] = js.native
  var DashPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.DashPackage] = js.native
  /**
    * A short text description of the OriginEndpoint.
    */
  var Description: js.UndefOr[string] = js.native
  var HlsPackage: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.HlsPackage] = js.native
  /**
    * The ID of the OriginEndpoint.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * A short string appended to the end of the OriginEndpoint URL.
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
    * Maximum duration (seconds) of content to retain for startover playback.
  If not specified, startover playback will be disabled for the OriginEndpoint.
    */
  var StartoverWindowSeconds: js.UndefOr[integer] = js.native
  var Tags: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.Tags] = js.native
  /**
    * Amount of delay (seconds) to enforce on the playback of live content.
  If not specified, there will be no time delay in effect for the OriginEndpoint.
    */
  var TimeDelaySeconds: js.UndefOr[integer] = js.native
  /**
    * The URL of the packaged OriginEndpoint for consumption.
    */
  var Url: js.UndefOr[string] = js.native
  /**
    * A list of source IP CIDR blocks that will be allowed to access the OriginEndpoint.
    */
  var Whitelist: js.UndefOr[listOfString] = js.native
}

object UpdateOriginEndpointResponse {
  @scala.inline
  def apply(): UpdateOriginEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOriginEndpointResponse]
  }
  @scala.inline
  implicit class UpdateOriginEndpointResponseOps[Self <: UpdateOriginEndpointResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
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
    def withChannelId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelId")(js.undefined)
        ret
    }
    @scala.inline
    def withCmafPackage(value: CmafPackage): Self = {
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
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
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
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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
    def withUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
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

