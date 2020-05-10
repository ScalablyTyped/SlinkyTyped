package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom attributes histogram request. An error will be thrown if neither
  * string_value_histogram or long_value_histogram_bucketing_option has been
  * defined.
  */
@js.native
trait SchemaCustomAttributeHistogramRequest extends js.Object {
  /**
    * Required.  Specifies the custom field key to perform a histogram on. If
    * specified without `long_value_histogram_bucketing_option`, histogram on
    * string values of the given `key` is triggered, otherwise histogram is
    * performed on long values.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Optional.  Specifies buckets used to perform a range histogram on
    * Job&#39;s filterable long custom field values, or min/max value
    * requirements.
    */
  var longValueHistogramBucketingOption: js.UndefOr[SchemaNumericBucketingOption] = js.native
  /**
    * Optional. If set to true, the response will include the histogram value
    * for each key as a string.
    */
  var stringValueHistogram: js.UndefOr[Boolean] = js.native
}

object SchemaCustomAttributeHistogramRequest {
  @scala.inline
  def apply(): SchemaCustomAttributeHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttributeHistogramRequest]
  }
  @scala.inline
  implicit class SchemaCustomAttributeHistogramRequestOps[Self <: SchemaCustomAttributeHistogramRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLongValueHistogramBucketingOption(value: SchemaNumericBucketingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValueHistogramBucketingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongValueHistogramBucketingOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValueHistogramBucketingOption")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValueHistogram(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValueHistogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValueHistogram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValueHistogram")(js.undefined)
        ret
    }
  }
  
}

