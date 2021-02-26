package typingsSlinky.googleapis.fusiontablesV2Mod.fusiontablesV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTableCopy extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Whether to also copy tabs, styles, and templates. Default is false.
    */
  var copyPresentation: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of the table that is being copied.
    */
  var tableId: js.UndefOr[String] = js.native
}
object ParamsResourceTableCopy {
  
  @scala.inline
  def apply(): ParamsResourceTableCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTableCopy]
  }
  
  @scala.inline
  implicit class ParamsResourceTableCopyMutableBuilder[Self <: ParamsResourceTableCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCopyPresentation(value: Boolean): Self = StObject.set(x, "copyPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyPresentationUndefined: Self = StObject.set(x, "copyPresentation", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
