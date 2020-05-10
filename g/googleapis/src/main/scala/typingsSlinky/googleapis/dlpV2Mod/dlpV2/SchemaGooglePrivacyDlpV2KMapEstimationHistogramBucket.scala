package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A KMapEstimationHistogramBucket message with the following values:
  * min_anonymity: 3   max_anonymity: 5   frequency: 42 means that there are 42
  * records whose quasi-identifier values correspond to 3, 4 or 5 people in the
  * overlying population. An important particular case is when min_anonymity =
  * max_anonymity = 1: the frequency field then corresponds to the number of
  * uniquely identifiable records.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket extends js.Object {
  /**
    * Number of records within these anonymity bounds.
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
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]] = js.native
  /**
    * Always greater than or equal to min_anonymity.
    */
  var maxAnonymity: js.UndefOr[String] = js.native
  /**
    * Always positive.
    */
  var minAnonymity: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucketOps[Self <: SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket] (val x: Self) extends AnyVal {
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
    def withBucketValues(value: js.Array[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]): Self = {
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
    def withMaxAnonymity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAnonymity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAnonymity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAnonymity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAnonymity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAnonymity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAnonymity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAnonymity")(js.undefined)
        ret
    }
  }
  
}

