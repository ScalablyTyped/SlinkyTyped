package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InspectContentRequest extends js.Object {
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.native
  /**
    * The list of items to inspect. Items in a single request are
    * considered "related" unless inspect_config.independent_inputs is true.
    * Up to 100 are allowed per request.
    */
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.native
}

object GooglePrivacyDlpV2beta1InspectContentRequest {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InspectContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectContentRequest]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InspectContentRequestOps[Self <: GooglePrivacyDlpV2beta1InspectContentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

