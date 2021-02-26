package typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceReportsGetfile extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The index of the report fragment to download.
    */
  var reportFragment: js.UndefOr[Double] = js.native
  
  /**
    * ID of the report.
    */
  var reportId: js.UndefOr[String] = js.native
}
object ParamsResourceReportsGetfile {
  
  @scala.inline
  def apply(): ParamsResourceReportsGetfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsGetfile]
  }
  
  @scala.inline
  implicit class ParamsResourceReportsGetfileMutableBuilder[Self <: ParamsResourceReportsGetfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setReportFragment(value: Double): Self = StObject.set(x, "reportFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportFragmentUndefined: Self = StObject.set(x, "reportFragment", js.undefined)
    
    @scala.inline
    def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
