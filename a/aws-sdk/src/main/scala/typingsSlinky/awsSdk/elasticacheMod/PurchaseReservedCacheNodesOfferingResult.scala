package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseReservedCacheNodesOfferingResult extends StObject {
  
  var ReservedCacheNode: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ReservedCacheNode] = js.native
}
object PurchaseReservedCacheNodesOfferingResult {
  
  @scala.inline
  def apply(): PurchaseReservedCacheNodesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
  }
  
  @scala.inline
  implicit class PurchaseReservedCacheNodesOfferingResultMutableBuilder[Self <: PurchaseReservedCacheNodesOfferingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedCacheNode(value: ReservedCacheNode): Self = StObject.set(x, "ReservedCacheNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedCacheNodeUndefined: Self = StObject.set(x, "ReservedCacheNode", js.undefined)
  }
}
