package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChangeTokenStatusResponse extends StObject {
  
  /**
    * The status of the change token.
    */
  var ChangeTokenStatus: js.UndefOr[typingsSlinky.awsSdk.wafMod.ChangeTokenStatus] = js.native
}
object GetChangeTokenStatusResponse {
  
  @scala.inline
  def apply(): GetChangeTokenStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChangeTokenStatusResponse]
  }
  
  @scala.inline
  implicit class GetChangeTokenStatusResponseMutableBuilder[Self <: GetChangeTokenStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeTokenStatus(value: ChangeTokenStatus): Self = StObject.set(x, "ChangeTokenStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenStatusUndefined: Self = StObject.set(x, "ChangeTokenStatus", js.undefined)
  }
}
