package typingsSlinky.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateExpirationForHITRequest extends StObject {
  
  /**
    *  The date and time at which you want the HIT to expire 
    */
  var ExpireAt: js.Date = js.native
  
  /**
    *  The HIT to update. 
    */
  var HITId: EntityId = js.native
}
object UpdateExpirationForHITRequest {
  
  @scala.inline
  def apply(ExpireAt: js.Date, HITId: EntityId): UpdateExpirationForHITRequest = {
    val __obj = js.Dynamic.literal(ExpireAt = ExpireAt.asInstanceOf[js.Any], HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpirationForHITRequest]
  }
  
  @scala.inline
  implicit class UpdateExpirationForHITRequestMutableBuilder[Self <: UpdateExpirationForHITRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpireAt(value: js.Date): Self = StObject.set(x, "ExpireAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
  }
}
