package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceVpngatewaysGetstatus extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Name of the region for this request.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Name of the VPN gateway to return.
    */
  var vpnGateway: js.UndefOr[String] = js.native
}
object ParamsResourceVpngatewaysGetstatus {
  
  @scala.inline
  def apply(): ParamsResourceVpngatewaysGetstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVpngatewaysGetstatus]
  }
  
  @scala.inline
  implicit class ParamsResourceVpngatewaysGetstatusMutableBuilder[Self <: ParamsResourceVpngatewaysGetstatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setVpnGateway(value: String): Self = StObject.set(x, "vpnGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnGatewayUndefined: Self = StObject.set(x, "vpnGateway", js.undefined)
  }
}
