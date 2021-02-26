package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterationResult extends StObject {
  
  var arimaResult: js.UndefOr[ArimaResult] = js.native
  
  /** Information about top clusters for clustering models. */
  var clusterInfos: js.UndefOr[js.Array[ClusterInfo]] = js.native
  
  /** Time taken to run the iteration in milliseconds. */
  var durationMs: js.UndefOr[String] = js.native
  
  /** Loss computed on the eval data at the end of iteration. */
  var evalLoss: js.UndefOr[Double] = js.native
  
  /** Index of the iteration, 0 based. */
  var index: js.UndefOr[Double] = js.native
  
  /** Learn rate used for this iteration. */
  var learnRate: js.UndefOr[Double] = js.native
  
  /** Loss computed on the training data at the end of iteration. */
  var trainingLoss: js.UndefOr[Double] = js.native
}
object IterationResult {
  
  @scala.inline
  def apply(): IterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterationResult]
  }
  
  @scala.inline
  implicit class IterationResultMutableBuilder[Self <: IterationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArimaResult(value: ArimaResult): Self = StObject.set(x, "arimaResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArimaResultUndefined: Self = StObject.set(x, "arimaResult", js.undefined)
    
    @scala.inline
    def setClusterInfos(value: js.Array[ClusterInfo]): Self = StObject.set(x, "clusterInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterInfosUndefined: Self = StObject.set(x, "clusterInfos", js.undefined)
    
    @scala.inline
    def setClusterInfosVarargs(value: ClusterInfo*): Self = StObject.set(x, "clusterInfos", js.Array(value :_*))
    
    @scala.inline
    def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    @scala.inline
    def setEvalLoss(value: Double): Self = StObject.set(x, "evalLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalLossUndefined: Self = StObject.set(x, "evalLoss", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    @scala.inline
    def setTrainingLoss(value: Double): Self = StObject.set(x, "trainingLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingLossUndefined: Self = StObject.set(x, "trainingLoss", js.undefined)
  }
}
