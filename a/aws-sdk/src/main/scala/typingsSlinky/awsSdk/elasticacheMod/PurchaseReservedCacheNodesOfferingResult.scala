package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseReservedCacheNodesOfferingResult extends js.Object {
  var ReservedCacheNode: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ReservedCacheNode] = js.native
}

object PurchaseReservedCacheNodesOfferingResult {
  @scala.inline
  def apply(): PurchaseReservedCacheNodesOfferingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseReservedCacheNodesOfferingResult]
  }
  @scala.inline
  implicit class PurchaseReservedCacheNodesOfferingResultOps[Self <: PurchaseReservedCacheNodesOfferingResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReservedCacheNode(value: ReservedCacheNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedCacheNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedCacheNode")(js.undefined)
        ret
    }
  }
  
}

