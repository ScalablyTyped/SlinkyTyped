package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2KAnonymityResult extends StObject {
  
  /** Histogram of k-anonymity equivalence classes. */
  var equivalenceClassHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2KAnonymityHistogramBucket]] = js.native
}
object GooglePrivacyDlpV2KAnonymityResult {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KAnonymityResult]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2KAnonymityResultMutableBuilder[Self <: GooglePrivacyDlpV2KAnonymityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquivalenceClassHistogramBuckets(value: js.Array[GooglePrivacyDlpV2KAnonymityHistogramBucket]): Self = StObject.set(x, "equivalenceClassHistogramBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquivalenceClassHistogramBucketsUndefined: Self = StObject.set(x, "equivalenceClassHistogramBuckets", js.undefined)
    
    @scala.inline
    def setEquivalenceClassHistogramBucketsVarargs(value: GooglePrivacyDlpV2KAnonymityHistogramBucket*): Self = StObject.set(x, "equivalenceClassHistogramBuckets", js.Array(value :_*))
  }
}
