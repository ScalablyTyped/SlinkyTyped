package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelArchivalInput extends StObject {
  
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape you want to cancel archiving for.
    */
  var TapeARN: typingsSlinky.awsSdk.storagegatewayMod.TapeARN = js.native
}
object CancelArchivalInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN, TapeARN: TapeARN): CancelArchivalInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelArchivalInput]
  }
  
  @scala.inline
  implicit class CancelArchivalInputMutableBuilder[Self <: CancelArchivalInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
  }
}
