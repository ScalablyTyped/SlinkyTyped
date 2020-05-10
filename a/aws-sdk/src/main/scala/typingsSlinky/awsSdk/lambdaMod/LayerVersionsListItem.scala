package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerVersionsListItem extends js.Object {
  /**
    * The layer's compatible runtimes.
    */
  var CompatibleRuntimes: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.CompatibleRuntimes] = js.native
  /**
    * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000.
    */
  var CreatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Description] = js.native
  /**
    * The ARN of the layer version.
    */
  var LayerVersionArn: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LayerVersionArn] = js.native
  /**
    * The layer's open-source license.
    */
  var LicenseInfo: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LicenseInfo] = js.native
  /**
    * The version number.
    */
  var Version: js.UndefOr[LayerVersionNumber] = js.native
}

object LayerVersionsListItem {
  @scala.inline
  def apply(): LayerVersionsListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionsListItem]
  }
  @scala.inline
  implicit class LayerVersionsListItemOps[Self <: LayerVersionsListItem] (val x: Self) extends AnyVal {
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

