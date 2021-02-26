package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2LikelihoodAdjustment extends StObject {
  
  /** Set the likelihood of a finding to a fixed value. */
  var fixedLikelihood: js.UndefOr[String] = js.native
  
  /**
    * Increase or decrease the likelihood by the specified number of levels. For example, if a finding would be `POSSIBLE` without the detection rule and `relative_likelihood` is 1, then
    * it is upgraded to `LIKELY`, while a value of -1 would downgrade it to `UNLIKELY`. Likelihood may never drop below `VERY_UNLIKELY` or exceed `VERY_LIKELY`, so applying an adjustment
    * of 1 followed by an adjustment of -1 when base likelihood is `VERY_LIKELY` will result in a final likelihood of `LIKELY`.
    */
  var relativeLikelihood: js.UndefOr[Double] = js.native
}
object GooglePrivacyDlpV2LikelihoodAdjustment {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2LikelihoodAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LikelihoodAdjustment]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LikelihoodAdjustmentMutableBuilder[Self <: GooglePrivacyDlpV2LikelihoodAdjustment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixedLikelihood(value: String): Self = StObject.set(x, "fixedLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedLikelihoodUndefined: Self = StObject.set(x, "fixedLikelihood", js.undefined)
    
    @scala.inline
    def setRelativeLikelihood(value: Double): Self = StObject.set(x, "relativeLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeLikelihoodUndefined: Self = StObject.set(x, "relativeLikelihood", js.undefined)
  }
}
