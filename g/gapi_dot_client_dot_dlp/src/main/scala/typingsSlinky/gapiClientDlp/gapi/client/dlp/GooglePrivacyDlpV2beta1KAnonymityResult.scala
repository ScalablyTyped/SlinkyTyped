package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1KAnonymityResult extends js.Object {
  /** Histogram of k-anonymity equivalence classes. */
  var equivalenceClassHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1KAnonymityHistogramBucket]] = js.native
}

object GooglePrivacyDlpV2beta1KAnonymityResult {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityResult]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1KAnonymityResultOps[Self <: GooglePrivacyDlpV2beta1KAnonymityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquivalenceClassHistogramBuckets(value: js.Array[GooglePrivacyDlpV2beta1KAnonymityHistogramBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalenceClassHistogramBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquivalenceClassHistogramBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalenceClassHistogramBuckets")(js.undefined)
        ret
    }
  }
  
}

