package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1KAnonymityHistogramBucket extends js.Object {
  /** Total number of records in this bucket. */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Sample of equivalence classes in this bucket. The total number of
    * classes returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass]] = js.native
  /** Lower bound on the size of the equivalence classes in this bucket. */
  var equivalenceClassSizeLowerBound: js.UndefOr[String] = js.native
  /** Upper bound on the size of the equivalence classes in this bucket. */
  var equivalenceClassSizeUpperBound: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1KAnonymityHistogramBucket {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1KAnonymityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityHistogramBucket]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1KAnonymityHistogramBucketOps[Self <: GooglePrivacyDlpV2beta1KAnonymityHistogramBucket] (val x: Self) extends AnyVal {
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
    def withBucketValues(value: js.Array[GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass]): Self = {
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
    def withEquivalenceClassSizeLowerBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalenceClassSizeLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquivalenceClassSizeLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalenceClassSizeLowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withEquivalenceClassSizeUpperBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalenceClassSizeUpperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquivalenceClassSizeUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalenceClassSizeUpperBound")(js.undefined)
        ret
    }
  }
  
}

