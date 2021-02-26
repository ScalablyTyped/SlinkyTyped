package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandshakeFilter extends StObject {
  
  /**
    * Specifies the type of handshake action. If you specify ActionType, you cannot also specify ParentHandshakeId.
    */
  var ActionType: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.ActionType] = js.native
  
  /**
    * Specifies the parent handshake. Only used for handshake types that are a child of another type. If you specify ParentHandshakeId, you cannot also specify ActionType. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var ParentHandshakeId: js.UndefOr[HandshakeId] = js.native
}
object HandshakeFilter {
  
  @scala.inline
  def apply(): HandshakeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandshakeFilter]
  }
  
  @scala.inline
  implicit class HandshakeFilterMutableBuilder[Self <: HandshakeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    @scala.inline
    def setParentHandshakeId(value: HandshakeId): Self = StObject.set(x, "ParentHandshakeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentHandshakeIdUndefined: Self = StObject.set(x, "ParentHandshakeId", js.undefined)
  }
}
