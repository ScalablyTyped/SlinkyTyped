package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSigningProfileResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var arn: js.UndefOr[java.lang.String] = js.native
  /**
    * A list of overrides applied by the target signing profile for signing operations.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.native
  /**
    * The ID of the platform that is used by the target signing profile.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  /**
    * The name of the target signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  /**
    * The ARN of the certificate that the target profile uses for signing operations.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.native
  /**
    * A map of key-value pairs for signing operations that is attached to the target signing profile.
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.native
  /**
    * The status of the target signing profile.
    */
  var status: js.UndefOr[SigningProfileStatus] = js.native
  /**
    * A list of tags associated with the signing profile.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object GetSigningProfileResponse {
  @scala.inline
  def apply(): GetSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningProfileResponse]
  }
  @scala.inline
  implicit class GetSigningProfileResponseOps[Self <: GetSigningProfileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: SigningPlatformOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformId(value: PlatformId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformId")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileName(value: ProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningMaterial(value: SigningMaterial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingMaterial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingMaterial")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningParameters(value: SigningParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SigningProfileStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

