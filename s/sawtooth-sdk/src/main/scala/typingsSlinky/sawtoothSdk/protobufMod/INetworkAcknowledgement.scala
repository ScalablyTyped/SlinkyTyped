package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INetworkAcknowledgement extends StObject {
  
  /** NetworkAcknowledgement status */
  var status: js.UndefOr[Status | Null] = js.native
}
object INetworkAcknowledgement {
  
  @scala.inline
  def apply(): INetworkAcknowledgement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INetworkAcknowledgement]
  }
  
  @scala.inline
  implicit class INetworkAcknowledgementMutableBuilder[Self <: INetworkAcknowledgement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
