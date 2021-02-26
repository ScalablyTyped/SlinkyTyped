package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewaySoftwareNowOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
}
object UpdateGatewaySoftwareNowOutput {
  
  @scala.inline
  def apply(): UpdateGatewaySoftwareNowOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGatewaySoftwareNowOutput]
  }
  
  @scala.inline
  implicit class UpdateGatewaySoftwareNowOutputMutableBuilder[Self <: UpdateGatewaySoftwareNowOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
