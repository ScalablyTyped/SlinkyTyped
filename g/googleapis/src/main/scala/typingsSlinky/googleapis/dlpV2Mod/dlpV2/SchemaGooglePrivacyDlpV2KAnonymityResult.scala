package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the k-anonymity computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KAnonymityResult extends js.Object {
  /**
    * Histogram of k-anonymity equivalence classes.
    */
  var equivalenceClassHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]] = js.native
}

object SchemaGooglePrivacyDlpV2KAnonymityResult {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityResult]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KAnonymityResultOps[Self <: SchemaGooglePrivacyDlpV2KAnonymityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquivalenceClassHistogramBuckets(value: js.Array[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]): Self = {
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

