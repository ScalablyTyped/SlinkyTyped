package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryAggregator extends js.Object {
  /**
    * Nested aggregators to further refine aggregation for an inventory type.
    */
  var Aggregators: js.UndefOr[InventoryAggregatorList] = js.native
  /**
    * The inventory type and attribute name for aggregation.
    */
  var Expression: js.UndefOr[InventoryAggregatorExpression] = js.native
  /**
    * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources that match and don't match the specified criteria.
    */
  var Groups: js.UndefOr[InventoryGroupList] = js.native
}

object InventoryAggregator {
  @scala.inline
  def apply(): InventoryAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryAggregator]
  }
  @scala.inline
  implicit class InventoryAggregatorOps[Self <: InventoryAggregator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregators(value: InventoryAggregatorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregators")(js.undefined)
        ret
    }
    @scala.inline
    def withExpression(value: InventoryAggregatorExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expression")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: InventoryGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
  }
  
}

