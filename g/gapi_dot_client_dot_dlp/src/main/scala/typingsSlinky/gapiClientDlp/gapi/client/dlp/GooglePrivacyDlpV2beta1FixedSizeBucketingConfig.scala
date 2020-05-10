package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1FixedSizeBucketingConfig extends js.Object {
  /**
    * Size of each bucket (except for minimum and maximum buckets). So if
    * `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the
    * following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60,
    * 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works. [Required].
    */
  var bucketSize: js.UndefOr[Double] = js.native
  /**
    * Lower bound value of buckets. All values less than `lower_bound` are
    * grouped together into a single bucket; for example if `lower_bound` = 10,
    * then all values less than 10 are replaced with the value “-10”. [Required].
    */
  var lowerBound: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
  /**
    * Upper bound value of buckets. All values greater than upper_bound are
    * grouped together into a single bucket; for example if `upper_bound` = 89,
    * then all values greater than 89 are replaced with the value “89+”.
    * [Required].
    */
  var upperBound: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.native
}

object GooglePrivacyDlpV2beta1FixedSizeBucketingConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1FixedSizeBucketingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1FixedSizeBucketingConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1FixedSizeBucketingConfigOps[Self <: GooglePrivacyDlpV2beta1FixedSizeBucketingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketSize(value: Double): Self = {
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
    def withLowerBound(value: GooglePrivacyDlpV2beta1Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperBound(value: GooglePrivacyDlpV2beta1Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(js.undefined)
        ret
    }
  }
  
}

