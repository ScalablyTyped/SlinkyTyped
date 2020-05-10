package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1LDiversityHistogramBucket extends js.Object {
  /** Total number of records in this bucket. */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Sample of equivalence classes in this bucket. The total number of
    * classes returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1LDiversityEquivalenceClass]] = js.native
  /**
    * Lower bound on the sensitive value frequencies of the equivalence
    * classes in this bucket.
    */
  var sensitiveValueFrequencyLowerBound: js.UndefOr[String] = js.native
  /**
    * Upper bound on the sensitive value frequencies of the equivalence
    * classes in this bucket.
    */
  var sensitiveValueFrequencyUpperBound: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1LDiversityHistogramBucket {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1LDiversityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1LDiversityHistogramBucket]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1LDiversityHistogramBucketOps[Self <: GooglePrivacyDlpV2beta1LDiversityHistogramBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketValues(value: js.Array[GooglePrivacyDlpV2beta1LDiversityEquivalenceClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketValues")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitiveValueFrequencyLowerBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveValueFrequencyLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitiveValueFrequencyLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveValueFrequencyLowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitiveValueFrequencyUpperBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveValueFrequencyUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitiveValueFrequencyUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitiveValueFrequencyUpperBound")(js.undefined)
        ret
    }
  }
  
}

