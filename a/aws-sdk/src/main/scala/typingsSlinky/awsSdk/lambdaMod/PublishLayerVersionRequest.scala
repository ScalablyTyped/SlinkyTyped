package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishLayerVersionRequest extends js.Object {
  /**
    * A list of compatible function runtimes. Used for filtering with ListLayers and ListLayerVersions.
    */
  var CompatibleRuntimes: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.CompatibleRuntimes] = js.native
  /**
    * The function layer archive.
    */
  var Content: LayerVersionContentInput = js.native
  /**
    * The description of the version.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Description] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typingsSlinky.awsSdk.lambdaMod.LayerName = js.native
  /**
    * The layer's software license. It can be any of the following:   An SPDX license identifier. For example, MIT.   The URL of a license hosted on the internet. For example, https://opensource.org/licenses/MIT.   The full text of the license.  
    */
  var LicenseInfo: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.LicenseInfo] = js.native
}

object PublishLayerVersionRequest {
  @scala.inline
  def apply(Content: LayerVersionContentInput, LayerName: LayerName): PublishLayerVersionRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishLayerVersionRequest]
  }
  @scala.inline
  implicit class PublishLayerVersionRequestOps[Self <: PublishLayerVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: LayerVersionContentInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerName(value: LayerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerName")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

