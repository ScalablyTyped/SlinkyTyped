package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the l-diversity computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2LDiversityResult extends js.Object {
  /**
    * Histogram of l-diversity equivalence class sensitive value frequencies.
    */
  var sensitiveValueFrequencyHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2LDiversityHistogramBucket]] = js.native
}

object SchemaGooglePrivacyDlpV2LDiversityResult {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2LDiversityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityResult]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LDiversityResultOps[Self <: SchemaGooglePrivacyDlpV2LDiversityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSensitiveValueFrequencyHistogramBuckets(value: js.Array[SchemaGooglePrivacyDlpV2LDiversityHistogramBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveValueFrequencyHistogramBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitiveValueFrequencyHistogramBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveValueFrequencyHistogramBuckets")(js.undefined)
        ret
    }
  }
  
}

