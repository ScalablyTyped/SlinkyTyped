package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket extends js.Object {
  /** Total number of records in this bucket. */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Sample of value frequencies in this bucket. The total number of
    * values returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ValueFrequency]] = js.native
  /** Lower bound on the value frequency of the values in this bucket. */
  var valueFrequencyLowerBound: js.UndefOr[String] = js.native
  /** Upper bound on the value frequency of the values in this bucket. */
  var valueFrequencyUpperBound: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucketOps[Self <: GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket] (val x: Self) extends AnyVal {
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
    def withBucketValues(value: js.Array[GooglePrivacyDlpV2beta1ValueFrequency]): Self = {
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
    def withValueFrequencyLowerBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFrequencyLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFrequencyLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFrequencyLowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFrequencyUpperBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFrequencyUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFrequencyUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFrequencyUpperBound")(js.undefined)
        ret
    }
  }
  
}

