package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InspectOperationMetadata extends js.Object {
  /** The time which this request was started. */
  var createTime: js.UndefOr[String] = js.native
  var infoTypeStats: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeStatistics]] = js.native
  /** Total size in bytes that were processed. */
  var processedBytes: js.UndefOr[String] = js.native
  /** The inspect config used to create the Operation. */
  var requestInspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.native
  /** Optional location to store findings. */
  var requestOutputConfig: js.UndefOr[GooglePrivacyDlpV2beta1OutputStorageConfig] = js.native
  /** The storage config used to create the Operation. */
  var requestStorageConfig: js.UndefOr[GooglePrivacyDlpV2beta1StorageConfig] = js.native
  /** Estimate of the number of bytes to process. */
  var totalEstimatedBytes: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1InspectOperationMetadata {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InspectOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectOperationMetadata]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InspectOperationMetadataOps[Self <: GooglePrivacyDlpV2beta1InspectOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoTypeStats(value: js.Array[GooglePrivacyDlpV2beta1InfoTypeStatistics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypeStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoTypeStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypeStats")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessedBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestInspectConfig(value: GooglePrivacyDlpV2beta1InspectConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInspectConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestInspectConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInspectConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOutputConfig(value: GooglePrivacyDlpV2beta1OutputStorageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOutputConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOutputConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOutputConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestStorageConfig(value: GooglePrivacyDlpV2beta1StorageConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStorageConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestStorageConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStorageConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalEstimatedBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalEstimatedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalEstimatedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalEstimatedBytes")(js.undefined)
        ret
    }
  }
  
}

