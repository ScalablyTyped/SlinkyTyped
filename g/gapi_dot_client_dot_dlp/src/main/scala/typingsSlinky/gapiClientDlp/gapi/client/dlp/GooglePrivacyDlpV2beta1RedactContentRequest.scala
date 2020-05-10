package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1RedactContentRequest extends js.Object {
  /** The configuration for specifying what content to redact from images. */
  var imageRedactionConfigs: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ImageRedactionConfig]] = js.native
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.native
  /** The list of items to inspect. Up to 100 are allowed per request. */
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.native
  /**
    * The strings to replace findings text findings with. Must specify at least
    * one of these or one ImageRedactionConfig if redacting images.
    */
  var replaceConfigs: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ReplaceConfig]] = js.native
}

object GooglePrivacyDlpV2beta1RedactContentRequest {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1RedactContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RedactContentRequest]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1RedactContentRequestOps[Self <: GooglePrivacyDlpV2beta1RedactContentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageRedactionConfigs(value: js.Array[GooglePrivacyDlpV2beta1ImageRedactionConfig]): Self = {
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
    def withInspectConfig(value: GooglePrivacyDlpV2beta1InspectConfig): Self = {
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
    @scala.inline
    def withItems(value: js.Array[GooglePrivacyDlpV2beta1ContentItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceConfigs(value: js.Array[GooglePrivacyDlpV2beta1ReplaceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceConfigs")(js.undefined)
        ret
    }
  }
  
}

