package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Custom numeric bucketing result.
  */
@js.native
trait SchemaNumericBucketingResult extends js.Object {
  /**
    * Count within each bucket. Its size is the length of
    * NumericBucketingOption.bucket_bounds plus 1.
    */
  var counts: js.UndefOr[js.Array[SchemaBucketizedCount]] = js.native
  /**
    * Stores the maximum value of the numeric field. Will be populated only if
    * [NumericBucketingOption.requires_min_max] is set to true.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * Stores the minimum value of the numeric field. Will be populated only if
    * [NumericBucketingOption.requires_min_max] is set to true.
    */
  var minValue: js.UndefOr[Double] = js.native
}

object SchemaNumericBucketingResult {
  @scala.inline
  def apply(): SchemaNumericBucketingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumericBucketingResult]
  }
  @scala.inline
  implicit class SchemaNumericBucketingResultOps[Self <: SchemaNumericBucketingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounts(value: js.Array[SchemaBucketizedCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
  }
  
}

