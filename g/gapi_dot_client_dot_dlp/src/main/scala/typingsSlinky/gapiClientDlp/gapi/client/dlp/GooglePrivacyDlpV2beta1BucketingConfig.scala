package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1BucketingConfig extends js.Object {
  var buckets: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Bucket]] = js.native
}

object GooglePrivacyDlpV2beta1BucketingConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1BucketingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1BucketingConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1BucketingConfigOps[Self <: GooglePrivacyDlpV2beta1BucketingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[GooglePrivacyDlpV2beta1Bucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
        ret
    }
  }
  
}

