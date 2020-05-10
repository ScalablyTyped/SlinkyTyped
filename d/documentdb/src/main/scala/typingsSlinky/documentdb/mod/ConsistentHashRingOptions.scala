package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsistentHashRingOptions extends js.Object {
  /** Function to compute the hash for a given link or partition key */
  var computeHash: js.UndefOr[js.Function2[/* key */ String | Double, /* seed */ Double, Double]] = js.native
  /** Number of points in the ring to assign to each collection link */
  var numberOfVirtualNodesPerCollection: js.UndefOr[Double] = js.native
}

object ConsistentHashRingOptions {
  @scala.inline
  def apply(): ConsistentHashRingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsistentHashRingOptions]
  }
  @scala.inline
  implicit class ConsistentHashRingOptionsOps[Self <: ConsistentHashRingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeHash(value: (/* key */ String | Double, /* seed */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeHash")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComputeHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeHash")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfVirtualNodesPerCollection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfVirtualNodesPerCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfVirtualNodesPerCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfVirtualNodesPerCollection")(js.undefined)
        ret
    }
  }
  
}

