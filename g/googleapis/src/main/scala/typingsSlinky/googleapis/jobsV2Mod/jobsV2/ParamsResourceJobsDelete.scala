package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceJobsDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Deprecated. This field is not working anymore.  Optional.  If set to
    * true, this call waits for all processing steps to complete before the job
    * is cleaned up. Otherwise, the call returns while some steps are still
    * taking place asynchronously, hence faster.
    */
  var disableFastProcess: js.UndefOr[Boolean] = js.native
  
  /**
    * Required.  The resource name of the job to be deleted, such as
    * "jobs/11111111".
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceJobsDelete {
  
  @scala.inline
  def apply(): ParamsResourceJobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceJobsDeleteMutableBuilder[Self <: ParamsResourceJobsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDisableFastProcess(value: Boolean): Self = StObject.set(x, "disableFastProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFastProcessUndefined: Self = StObject.set(x, "disableFastProcess", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
