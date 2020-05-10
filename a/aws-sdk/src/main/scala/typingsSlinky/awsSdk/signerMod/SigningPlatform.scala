package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningPlatform extends js.Object {
  /**
    * The category of a code signing platform.
    */
  var category: js.UndefOr[Category] = js.native
  /**
    * The display name of a code signing platform.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The maximum size (in MB) of code that can be signed by a code signing platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.native
  /**
    * Any partner entities linked to a code signing platform.
    */
  var partner: js.UndefOr[String] = js.native
  /**
    * The ID of a code signing; platform.
    */
  var platformId: js.UndefOr[String] = js.native
  /**
    * The configuration of a code signing platform. This includes the designated hash algorithm and encryption algorithm of a signing platform.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.native
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.native
  /**
    * The types of targets that can be signed by a code signing platform.
    */
  var target: js.UndefOr[String] = js.native
}

object SigningPlatform {
  @scala.inline
  def apply(): SigningPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningPlatform]
  }
  @scala.inline
  implicit class SigningPlatformOps[Self <: SigningPlatform] (val x: Self) extends AnyVal {
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
    def withDisplayName(value: String): Self = {
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
    def withPlatformId(value: String): Self = {
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

