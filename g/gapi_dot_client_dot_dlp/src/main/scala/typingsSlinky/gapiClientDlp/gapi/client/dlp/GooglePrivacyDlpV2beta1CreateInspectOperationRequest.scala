package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CreateInspectOperationRequest extends js.Object {
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.native
  /** Additional configuration settings for long running operations. */
  var operationConfig: js.UndefOr[GooglePrivacyDlpV2beta1OperationConfig] = js.native
  /** Optional location to store findings. */
  var outputConfig: js.UndefOr[GooglePrivacyDlpV2beta1OutputStorageConfig] = js.native
  /** Specification of the data set to process. */
  var storageConfig: js.UndefOr[GooglePrivacyDlpV2beta1StorageConfig] = js.native
}

object GooglePrivacyDlpV2beta1CreateInspectOperationRequest {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CreateInspectOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CreateInspectOperationRequest]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CreateInspectOperationRequestOps[Self <: GooglePrivacyDlpV2beta1CreateInspectOperationRequest] (val x: Self) extends AnyVal {
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
    def withOperationConfig(value: GooglePrivacyDlpV2beta1OperationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputConfig(value: GooglePrivacyDlpV2beta1OutputStorageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageConfig(value: GooglePrivacyDlpV2beta1StorageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageConfig")(js.undefined)
        ret
    }
  }
  
}

