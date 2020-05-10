package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of redacting an image.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RedactImageResponse extends js.Object {
  /**
    * If an image was being inspected and the InspectConfig&#39;s include_quote
    * was set to true, then this field will include all text, if any, that was
    * found in the image.
    */
  var extractedText: js.UndefOr[String] = js.native
  /**
    * The findings. Populated when include_findings in the request is true.
    */
  var inspectResult: js.UndefOr[SchemaGooglePrivacyDlpV2InspectResult] = js.native
  /**
    * The redacted image. The type will be the same as the original image.
    */
  var redactedImage: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2RedactImageResponse {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RedactImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RedactImageResponse]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RedactImageResponseOps[Self <: SchemaGooglePrivacyDlpV2RedactImageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtractedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractedText")(js.undefined)
        ret
    }
    @scala.inline
    def withInspectResult(value: SchemaGooglePrivacyDlpV2InspectResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspectResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectResult")(js.undefined)
        ret
    }
    @scala.inline
    def withRedactedImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactedImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedactedImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redactedImage")(js.undefined)
        ret
    }
  }
  
}

