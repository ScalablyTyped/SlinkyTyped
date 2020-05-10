package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishLayerVersionResponse extends js.Object {
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.CompatibleRuntimes] = js.native
  /**
    * Details about the layer version.
    */
  var Content: js.UndefOr[LayerVersionContentOutput] = js.native
  /**
    * The date that the layer version was created, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Description] = js.native
  /**
    * The ARN of the layer.
    */
  var LayerArn: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LayerArn] = js.native
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LayerVersionArn] = js.native
  /**
    * The layer's software license.
    */
  var LicenseInfo: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LicenseInfo] = js.native
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.native
}

object PublishLayerVersionResponse {
  @scala.inline
  def apply(): PublishLayerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishLayerVersionResponse]
  }
  @scala.inline
  implicit class PublishLayerVersionResponseOps[Self <: PublishLayerVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompatibleRuntimes(value: CompatibleRuntimes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleRuntimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibleRuntimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompatibleRuntimes")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: LayerVersionContentOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withLayerArn(value: LayerArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerVersionArn(value: LayerVersionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerVersionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerVersionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerVersionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseInfo(value: LicenseInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: LayerVersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

