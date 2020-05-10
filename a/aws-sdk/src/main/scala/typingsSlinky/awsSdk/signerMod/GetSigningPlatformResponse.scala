package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSigningPlatformResponse extends js.Object {
  /**
    * The category type of the target signing platform.
    */
  var category: js.UndefOr[Category] = js.native
  /**
    * The display name of the target signing platform.
    */
  var displayName: js.UndefOr[DisplayName] = js.native
  /**
    * The maximum size (in MB) of the payload that can be signed by the target platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.native
  /**
    * A list of partner entities that use the target signing platform.
    */
  var partner: js.UndefOr[String] = js.native
  /**
    * The ID of the target signing platform.
    */
  var platformId: js.UndefOr[PlatformId] = js.native
  /**
    * A list of configurations applied to the target platform at signing.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.native
  /**
    * The format of the target platform's signing image.
    */
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.native
  /**
    * The validation template that is used by the target signing platform.
    */
  var target: js.UndefOr[String] = js.native
}

object GetSigningPlatformResponse {
  @scala.inline
  def apply(): GetSigningPlatformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningPlatformResponse]
  }
  @scala.inline
  implicit class GetSigningPlatformResponseOps[Self <: GetSigningPlatformResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: Category): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSizeInMB(value: MaxSizeInMB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizeInMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSizeInMB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSizeInMB")(js.undefined)
        ret
    }
    @scala.inline
    def withPartner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partner")(js.undefined)
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
    def withSigningConfiguration(value: SigningConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSigningImageFormat(value: SigningImageFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingImageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigningImageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingImageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

