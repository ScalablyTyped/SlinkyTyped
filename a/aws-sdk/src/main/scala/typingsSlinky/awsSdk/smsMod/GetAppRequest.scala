package typingsSlinky.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
}
object GetAppRequest {
  
  @scala.inline
  def apply(): GetAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppRequest]
  }
  
  @scala.inline
  implicit class GetAppRequestMutableBuilder[Self <: GetAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
