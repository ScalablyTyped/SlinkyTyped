package typingsSlinky.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamPolicyAnalysis extends StObject {
  
  /** The analysis query. */
  var analysisQuery: js.UndefOr[IamPolicyAnalysisQuery] = js.native
  
  /** A list of IamPolicyAnalysisResult that matches the analysis query, or empty if no result is found. */
  var analysisResults: js.UndefOr[js.Array[IamPolicyAnalysisResult]] = js.native
  
  /** Represents whether all entries in the analysis_results have been fully explored to answer the query. */
  var fullyExplored: js.UndefOr[Boolean] = js.native
  
  /** A list of non-critical errors happened during the query handling. */
  var nonCriticalErrors: js.UndefOr[js.Array[IamPolicyAnalysisState]] = js.native
}
object IamPolicyAnalysis {
  
  @scala.inline
  def apply(): IamPolicyAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicyAnalysis]
  }
  
  @scala.inline
  implicit class IamPolicyAnalysisMutableBuilder[Self <: IamPolicyAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisQuery(value: IamPolicyAnalysisQuery): Self = StObject.set(x, "analysisQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisQueryUndefined: Self = StObject.set(x, "analysisQuery", js.undefined)
    
    @scala.inline
    def setAnalysisResults(value: js.Array[IamPolicyAnalysisResult]): Self = StObject.set(x, "analysisResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisResultsUndefined: Self = StObject.set(x, "analysisResults", js.undefined)
    
    @scala.inline
    def setAnalysisResultsVarargs(value: IamPolicyAnalysisResult*): Self = StObject.set(x, "analysisResults", js.Array(value :_*))
    
    @scala.inline
    def setFullyExplored(value: Boolean): Self = StObject.set(x, "fullyExplored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyExploredUndefined: Self = StObject.set(x, "fullyExplored", js.undefined)
    
    @scala.inline
    def setNonCriticalErrors(value: js.Array[IamPolicyAnalysisState]): Self = StObject.set(x, "nonCriticalErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonCriticalErrorsUndefined: Self = StObject.set(x, "nonCriticalErrors", js.undefined)
    
    @scala.inline
    def setNonCriticalErrorsVarargs(value: IamPolicyAnalysisState*): Self = StObject.set(x, "nonCriticalErrors", js.Array(value :_*))
  }
}
