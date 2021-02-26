package typingsSlinky.gitlab

import typingsSlinky.gitlab.anon.scopeJobScopeSudo
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipelinesMod {
  
  @JSImport("gitlab/dist/types/core/services/Pipelines", "Pipelines")
  @js.native
  class Pipelines () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def allVariables(projectId: String, pipelineId: Double): js.Promise[GetResponse] = js.native
    def allVariables(projectId: String, pipelineId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def allVariables(projectId: Double, pipelineId: Double): js.Promise[GetResponse] = js.native
    def allVariables(projectId: Double, pipelineId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def cancel(projectId: String, pipelineId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: String, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, pipelineId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def create(projectId: String, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: String, ref: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, ref: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def delete(projectId: String, pipelineId: Double): js.Promise[js.Object] = js.native
    def delete(projectId: String, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def delete(projectId: Double, pipelineId: Double): js.Promise[js.Object] = js.native
    def delete(projectId: Double, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def retry(projectId: String, pipelineId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: String, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def retry(projectId: Double, pipelineId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: Double, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, pipelineId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, pipelineId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, pipelineId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, pipelineId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def showJobs(projectId: String, pipelineId: Double): js.Promise[GetResponse] = js.native
    def showJobs(projectId: String, pipelineId: Double, options: scopeJobScopeSudo): js.Promise[GetResponse] = js.native
    def showJobs(projectId: Double, pipelineId: Double): js.Promise[GetResponse] = js.native
    def showJobs(projectId: Double, pipelineId: Double, options: scopeJobScopeSudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  trait PipelineSchema extends StObject {
    
    var created_at: js.Date = js.native
    
    var id: Double = js.native
    
    var ref: String = js.native
    
    var sha: String = js.native
    
    var status: String = js.native
    
    var updated_at: js.Date = js.native
    
    var web_url: String = js.native
  }
  object PipelineSchema {
    
    @scala.inline
    def apply(
      created_at: js.Date,
      id: Double,
      ref: String,
      sha: String,
      status: String,
      updated_at: js.Date,
      web_url: String
    ): PipelineSchema = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipelineSchema]
    }
    
    @scala.inline
    implicit class PipelineSchemaMutableBuilder[Self <: PipelineSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_at(value: js.Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeb_url(value: String): Self = StObject.set(x, "web_url", value.asInstanceOf[js.Any])
    }
  }
}
