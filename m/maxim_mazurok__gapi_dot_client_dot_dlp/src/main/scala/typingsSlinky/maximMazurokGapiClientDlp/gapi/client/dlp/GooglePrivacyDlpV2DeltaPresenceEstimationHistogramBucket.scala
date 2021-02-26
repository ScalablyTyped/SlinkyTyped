package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket extends StObject {
  
  /** Number of records within these probability bounds. */
  var bucketSize: js.UndefOr[String] = js.native
  
  /** Total number of distinct quasi-identifier tuple values in this bucket. */
  var bucketValueCount: js.UndefOr[String] = js.native
  
  /** Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20. */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]] = js.native
  
  /** Always greater than or equal to min_probability. */
  var maxProbability: js.UndefOr[Double] = js.native
  
  /** Between 0 and 1. */
  var minProbability: js.UndefOr[Double] = js.native
}
object GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketMutableBuilder[Self <: GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketSize(value: String): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    @scala.inline
    def setBucketValueCount(value: String): Self = StObject.set(x, "bucketValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketValueCountUndefined: Self = StObject.set(x, "bucketValueCount", js.undefined)
    
    @scala.inline
    def setBucketValues(value: js.Array[GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]): Self = StObject.set(x, "bucketValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketValuesUndefined: Self = StObject.set(x, "bucketValues", js.undefined)
    
    @scala.inline
    def setBucketValuesVarargs(value: GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues*): Self = StObject.set(x, "bucketValues", js.Array(value :_*))
    
    @scala.inline
    def setMaxProbability(value: Double): Self = StObject.set(x, "maxProbability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxProbabilityUndefined: Self = StObject.set(x, "maxProbability", js.undefined)
    
    @scala.inline
    def setMinProbability(value: Double): Self = StObject.set(x, "minProbability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinProbabilityUndefined: Self = StObject.set(x, "minProbability", js.undefined)
  }
}
