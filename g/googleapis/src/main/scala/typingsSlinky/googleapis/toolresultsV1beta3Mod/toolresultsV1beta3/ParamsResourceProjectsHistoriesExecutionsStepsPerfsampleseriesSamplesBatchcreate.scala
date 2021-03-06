package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  
  /**
    * A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  
  /**
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchCreatePerfSamplesRequest] = js.native
  
  /**
    * A sample series id
    */
  var sampleSeriesId: js.UndefOr[String] = js.native
  
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreateMutableBuilder[Self <: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaBatchCreatePerfSamplesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSampleSeriesId(value: String): Self = StObject.set(x, "sampleSeriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSeriesIdUndefined: Self = StObject.set(x, "sampleSeriesId", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
