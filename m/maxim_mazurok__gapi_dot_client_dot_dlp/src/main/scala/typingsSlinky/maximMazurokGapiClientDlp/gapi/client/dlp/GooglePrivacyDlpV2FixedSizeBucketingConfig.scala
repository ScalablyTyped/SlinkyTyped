package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2FixedSizeBucketingConfig extends StObject {
  
  /**
    * Required. Size of each bucket (except for minimum and maximum buckets). So if `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the following buckets would be
    * used: -10, 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works.
    */
  var bucketSize: js.UndefOr[Double] = js.native
  
  /**
    * Required. Lower bound value of buckets. All values less than `lower_bound` are grouped together into a single bucket; for example if `lower_bound` = 10, then all values less than 10
    * are replaced with the value "-10".
    */
  var lowerBound: js.UndefOr[GooglePrivacyDlpV2Value] = js.native
  
  /**
    * Required. Upper bound value of buckets. All values greater than upper_bound are grouped together into a single bucket; for example if `upper_bound` = 89, then all values greater
    * than 89 are replaced with the value "89+".
    */
  var upperBound: js.UndefOr[GooglePrivacyDlpV2Value] = js.native
}
object GooglePrivacyDlpV2FixedSizeBucketingConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2FixedSizeBucketingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2FixedSizeBucketingConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2FixedSizeBucketingConfigMutableBuilder[Self <: GooglePrivacyDlpV2FixedSizeBucketingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketSize(value: Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    @scala.inline
    def setLowerBound(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    @scala.inline
    def setUpperBound(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}
