package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All result fields mentioned below are updated while the job is processing.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Result extends js.Object {
  /**
    * Statistics of how many instances of each info type were found during
    * inspect job.
    */
  var infoTypeStats: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeStats]] = js.native
  /**
    * Total size in bytes that were processed.
    */
  var processedBytes: js.UndefOr[String] = js.native
  /**
    * Estimate of the number of bytes to process.
    */
  var totalEstimatedBytes: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2Result {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Result]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ResultOps[Self <: SchemaGooglePrivacyDlpV2Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoTypeStats(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeStats]): Self = {
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

