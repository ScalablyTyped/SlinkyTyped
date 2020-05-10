package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DeltaPresenceEstimationHistogramBucket message with the following values:
  * min_probability: 0.1   max_probability: 0.2   frequency: 42 means that
  * there are 42 records for which δ is in [0.1, 0.2). An important particular
  * case is when min_probability = max_probability = 1: then, every individual
  * who shares this quasi-identifier combination is in the dataset.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket extends js.Object {
  /**
    * Number of records within these probability bounds.
    */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Total number of distinct quasi-identifier tuple values in this bucket.
    */
  var bucketValueCount: js.UndefOr[String] = js.native
  /**
    * Sample of quasi-identifier tuple values in this bucket. The total number
    * of classes returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]] = js.native
  /**
    * Always greater than or equal to min_probability.
    */
  var maxProbability: js.UndefOr[Double] = js.native
  /**
    * Between 0 and 1.
    */
  var minProbability: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketOps[Self <: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket] (val x: Self) extends AnyVal {
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
    def withBucketValues(value: js.Array[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]): Self = {
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
    def withMaxProbability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProbability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxProbability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProbability")(js.undefined)
        ret
    }
    @scala.inline
    def withMinProbability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProbability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinProbability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minProbability")(js.undefined)
        ret
    }
  }
  
}

