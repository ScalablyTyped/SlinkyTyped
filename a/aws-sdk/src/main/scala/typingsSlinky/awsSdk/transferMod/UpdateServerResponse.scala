package typingsSlinky.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServerResponse extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that the user account is assigned to.
    */
  var ServerId: typingsSlinky.awsSdk.transferMod.ServerId = js.native
}
object UpdateServerResponse {
  
  @scala.inline
  def apply(ServerId: ServerId): UpdateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerResponse]
  }
  
  @scala.inline
  implicit class UpdateServerResponseMutableBuilder[Self <: UpdateServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
