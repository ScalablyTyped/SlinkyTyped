package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RankingMetrics extends StObject {
  
  /** Determines the goodness of a ranking by computing the percentile rank from the predicted confidence and dividing it by the original rank. */
  var averageRank: js.UndefOr[Double] = js.native
  
  /** Calculates a precision per user for all the items by ranking them and then averages all the precisions across all the users. */
  var meanAveragePrecision: js.UndefOr[Double] = js.native
  
  /**
    * Similar to the mean squared error computed in regression and explicit recommendation models except instead of computing the rating directly, the output from evaluate is computed
    * against a preference which is 1 or 0 depending on if the rating exists or not.
    */
  var meanSquaredError: js.UndefOr[Double] = js.native
  
  /** A metric to determine the goodness of a ranking calculated from the predicted confidence by comparing it to an ideal rank measured by the original ratings. */
  var normalizedDiscountedCumulativeGain: js.UndefOr[Double] = js.native
}
object RankingMetrics {
  
  @scala.inline
  def apply(): RankingMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RankingMetrics]
  }
  
  @scala.inline
  implicit class RankingMetricsMutableBuilder[Self <: RankingMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageRank(value: Double): Self = StObject.set(x, "averageRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageRankUndefined: Self = StObject.set(x, "averageRank", js.undefined)
    
    @scala.inline
    def setMeanAveragePrecision(value: Double): Self = StObject.set(x, "meanAveragePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanAveragePrecisionUndefined: Self = StObject.set(x, "meanAveragePrecision", js.undefined)
    
    @scala.inline
    def setMeanSquaredError(value: Double): Self = StObject.set(x, "meanSquaredError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanSquaredErrorUndefined: Self = StObject.set(x, "meanSquaredError", js.undefined)
    
    @scala.inline
    def setNormalizedDiscountedCumulativeGain(value: Double): Self = StObject.set(x, "normalizedDiscountedCumulativeGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedDiscountedCumulativeGainUndefined: Self = StObject.set(x, "normalizedDiscountedCumulativeGain", js.undefined)
  }
}
