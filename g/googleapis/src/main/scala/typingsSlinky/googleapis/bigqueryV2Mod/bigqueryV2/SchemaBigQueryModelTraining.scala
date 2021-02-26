package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaBigQueryModelTraining extends StObject {
  
  /**
    * [Output-only, Beta] Index of current ML training iteration. Updated
    * during create model query job to show job progress.
    */
  var currentIteration: js.UndefOr[Double] = js.native
  
  /**
    * [Output-only, Beta] Expected number of iterations for the create model
    * query job specified as num_iterations in the input query. The actual
    * total number of iterations may be less than this number due to early
    * stop.
    */
  var expectedTotalIterations: js.UndefOr[String] = js.native
}
object SchemaBigQueryModelTraining {
  
  @scala.inline
  def apply(): SchemaBigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryModelTraining]
  }
  
  @scala.inline
  implicit class SchemaBigQueryModelTrainingMutableBuilder[Self <: SchemaBigQueryModelTraining] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
    
    @scala.inline
    def setExpectedTotalIterations(value: String): Self = StObject.set(x, "expectedTotalIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedTotalIterationsUndefined: Self = StObject.set(x, "expectedTotalIterations", js.undefined)
  }
}
