package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of the l-diversity computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2LDiversityResult extends StObject {
  
  /**
    * Histogram of l-diversity equivalence class sensitive value frequencies.
    */
  var sensitiveValueFrequencyHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2LDiversityHistogramBucket]] = js.native
}
object SchemaGooglePrivacyDlpV2LDiversityResult {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2LDiversityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityResult]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LDiversityResultMutableBuilder[Self <: SchemaGooglePrivacyDlpV2LDiversityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSensitiveValueFrequencyHistogramBuckets(value: js.Array[SchemaGooglePrivacyDlpV2LDiversityHistogramBucket]): Self = StObject.set(x, "sensitiveValueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveValueFrequencyHistogramBucketsUndefined: Self = StObject.set(x, "sensitiveValueFrequencyHistogramBuckets", js.undefined)
    
    @scala.inline
    def setSensitiveValueFrequencyHistogramBucketsVarargs(value: SchemaGooglePrivacyDlpV2LDiversityHistogramBucket*): Self = StObject.set(x, "sensitiveValueFrequencyHistogramBuckets", js.Array(value :_*))
  }
}
