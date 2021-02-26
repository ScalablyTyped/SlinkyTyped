package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues extends StObject {
  
  /**
    * The estimated probability that a given individual sharing these quasi-identifier values is in the dataset. This value, typically called δ, is the ratio between the number of records
    * in the dataset with these quasi-identifier values, and the total number of individuals (inside *and* outside the dataset) with these quasi-identifier values. For example, if there
    * are 15 individuals in the dataset who share the same quasi-identifier values, and an estimated 100 people in the entire population with these values, then δ is 0.15.
    */
  var estimatedProbability: js.UndefOr[Double] = js.native
  
  /** The quasi-identifier values. */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2Value]] = js.native
}
object GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesMutableBuilder[Self <: GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedProbability(value: Double): Self = StObject.set(x, "estimatedProbability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedProbabilityUndefined: Self = StObject.set(x, "estimatedProbability", js.undefined)
    
    @scala.inline
    def setQuasiIdsValues(value: js.Array[GooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    @scala.inline
    def setQuasiIdsValuesVarargs(value: GooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value :_*))
  }
}
