package typingsSlinky.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateAppRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
}
object TerminateAppRequest {
  
  @scala.inline
  def apply(): TerminateAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateAppRequest]
  }
  
  @scala.inline
  implicit class TerminateAppRequestMutableBuilder[Self <: TerminateAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
