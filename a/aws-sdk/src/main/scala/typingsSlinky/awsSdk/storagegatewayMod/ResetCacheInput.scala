package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetCacheInput extends StObject {
  
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
}
object ResetCacheInput {
  
  @scala.inline
  def apply(GatewayARN: GatewayARN): ResetCacheInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetCacheInput]
  }
  
  @scala.inline
  implicit class ResetCacheInputMutableBuilder[Self <: ResetCacheInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
