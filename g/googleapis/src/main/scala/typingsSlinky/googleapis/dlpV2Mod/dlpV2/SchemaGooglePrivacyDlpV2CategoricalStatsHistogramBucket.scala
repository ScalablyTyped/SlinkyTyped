package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket extends js.Object {
  /**
    * Total number of values in this bucket.
    */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Total number of distinct values in this bucket.
    */
  var bucketValueCount: js.UndefOr[String] = js.native
  /**
    * Sample of value frequencies in this bucket. The total number of values
    * returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]] = js.native
  /**
    * Lower bound on the value frequency of the values in this bucket.
    */
  var valueFrequencyLowerBound: js.UndefOr[String] = js.native
  /**
    * Upper bound on the value frequency of the values in this bucket.
    */
  var valueFrequencyUpperBound: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucketOps[Self <: SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket] (val x: Self) extends AnyVal {
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
    def withBucketValueCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketValueCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketValueCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketValueCount")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketValues(value: js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]): Self = {
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

