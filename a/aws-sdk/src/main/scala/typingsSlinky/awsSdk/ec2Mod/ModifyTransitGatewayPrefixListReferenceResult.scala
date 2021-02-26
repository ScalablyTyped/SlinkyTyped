package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTransitGatewayPrefixListReferenceResult extends StObject {
  
  /**
    * Information about the prefix list reference.
    */
  var TransitGatewayPrefixListReference: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayPrefixListReference] = js.native
}
object ModifyTransitGatewayPrefixListReferenceResult {
  
  @scala.inline
  def apply(): ModifyTransitGatewayPrefixListReferenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayPrefixListReferenceResult]
  }
  
  @scala.inline
  implicit class ModifyTransitGatewayPrefixListReferenceResultMutableBuilder[Self <: ModifyTransitGatewayPrefixListReferenceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayPrefixListReference(value: TransitGatewayPrefixListReference): Self = StObject.set(x, "TransitGatewayPrefixListReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayPrefixListReferenceUndefined: Self = StObject.set(x, "TransitGatewayPrefixListReference", js.undefined)
  }
}
