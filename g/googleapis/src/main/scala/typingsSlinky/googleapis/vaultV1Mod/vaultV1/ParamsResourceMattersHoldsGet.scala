package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMattersHoldsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The hold ID.
    */
  var holdId: js.UndefOr[String] = js.native
  
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
  
  /**
    * Specifies which parts of the Hold to return.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourceMattersHoldsGet {
  
  @scala.inline
  def apply(): ParamsResourceMattersHoldsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersHoldsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceMattersHoldsGetMutableBuilder[Self <: ParamsResourceMattersHoldsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHoldId(value: String): Self = StObject.set(x, "holdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldIdUndefined: Self = StObject.set(x, "holdId", js.undefined)
    
    @scala.inline
    def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
