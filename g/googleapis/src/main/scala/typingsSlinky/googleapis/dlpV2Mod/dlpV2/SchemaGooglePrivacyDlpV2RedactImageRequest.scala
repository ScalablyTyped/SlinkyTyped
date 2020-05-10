package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to search for potentially sensitive info in an image and redact it
  * by covering it with a colored rectangle.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RedactImageRequest extends js.Object {
  /**
    * The content must be PNG, JPEG, SVG or BMP.
    */
  var byteItem: js.UndefOr[SchemaGooglePrivacyDlpV2ByteContentItem] = js.native
  /**
    * The configuration for specifying what content to redact from images.
    */
  var imageRedactionConfigs: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ImageRedactionConfig]] = js.native
  /**
    * Whether the response should include findings along with the redacted
    * image.
    */
  var includeFindings: js.UndefOr[Boolean] = js.native
  /**
    * Configuration for the inspector.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
}

object SchemaGooglePrivacyDlpV2RedactImageRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RedactImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RedactImageRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RedactImageRequestOps[Self <: SchemaGooglePrivacyDlpV2RedactImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteItem(value: SchemaGooglePrivacyDlpV2ByteContentItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteItem")(js.undefined)
        ret
    }
    @scala.inline
    def withImageRedactionConfigs(value: js.Array[SchemaGooglePrivacyDlpV2ImageRedactionConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRedactionConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageRedactionConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRedactionConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFindings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFindings")(js.undefined)
        ret
    }
    @scala.inline
    def withInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspectConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectConfig")(js.undefined)
        ret
    }
  }
  
}

