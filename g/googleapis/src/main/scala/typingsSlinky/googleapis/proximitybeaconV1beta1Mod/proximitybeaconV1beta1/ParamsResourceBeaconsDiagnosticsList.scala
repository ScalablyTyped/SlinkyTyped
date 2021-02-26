package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceBeaconsDiagnosticsList extends StandardParameters {
  
  /**
    * Requests only beacons that have the given alert. For example, to find
    * beacons that have low batteries use `alert_filter=LOW_BATTERY`.
    */
  var alertFilter: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Beacon that the diagnostics are for.
    */
  var beaconName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the maximum number of results to return. Defaults to 10.
    * Maximum 1000. Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Requests results that occur after the `page_token`, obtained from the
    * response to a previous request. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Requests only diagnostic records for the given project id. If not set,
    * then the project making the request will be used for looking up
    * diagnostic records. Optional.
    */
  var projectId: js.UndefOr[String] = js.native
}
object ParamsResourceBeaconsDiagnosticsList {
  
  @scala.inline
  def apply(): ParamsResourceBeaconsDiagnosticsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBeaconsDiagnosticsList]
  }
  
  @scala.inline
  implicit class ParamsResourceBeaconsDiagnosticsListMutableBuilder[Self <: ParamsResourceBeaconsDiagnosticsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertFilter(value: String): Self = StObject.set(x, "alertFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertFilterUndefined: Self = StObject.set(x, "alertFilter", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBeaconName(value: String): Self = StObject.set(x, "beaconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconNameUndefined: Self = StObject.set(x, "beaconName", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
