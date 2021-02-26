package typingsSlinky.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BridgeIdString extends StObject {
  
  var bridgeId: String = js.native
}
object BridgeIdString {
  
  @scala.inline
  def apply(bridgeId: String): BridgeIdString = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeIdString]
  }
  
  @scala.inline
  implicit class BridgeIdStringMutableBuilder[Self <: BridgeIdString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
  }
}
