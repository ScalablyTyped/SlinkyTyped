package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInventoryDeletionsResult extends js.Object {
  /**
    * A list of status items for deleted inventory.
    */
  var InventoryDeletions: js.UndefOr[InventoryDeletionsList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInventoryDeletionsResult {
  @scala.inline
  def apply(): DescribeInventoryDeletionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInventoryDeletionsResult]
  }
  @scala.inline
  implicit class DescribeInventoryDeletionsResultOps[Self <: DescribeInventoryDeletionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInventoryDeletions(value: InventoryDeletionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryDeletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryDeletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryDeletions")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

