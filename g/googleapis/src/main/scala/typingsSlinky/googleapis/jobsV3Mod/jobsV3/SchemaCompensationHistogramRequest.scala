package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Compensation based histogram request.
  */
@js.native
trait SchemaCompensationHistogramRequest extends js.Object {
  /**
    * Required.  Numeric histogram options, like buckets, whether include min
    * or max value.
    */
  var bucketingOption: js.UndefOr[SchemaNumericBucketingOption] = js.native
  /**
    * Required.  Type of the request, representing which field the
    * histogramming should be performed over. A single request can only specify
    * one histogram of each `CompensationHistogramRequestType`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCompensationHistogramRequest {
  @scala.inline
  def apply(): SchemaCompensationHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompensationHistogramRequest]
  }
  @scala.inline
  implicit class SchemaCompensationHistogramRequestOps[Self <: SchemaCompensationHistogramRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketingOption(value: SchemaNumericBucketingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketingOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketingOption")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

