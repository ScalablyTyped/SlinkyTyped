package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDistributionsByWebACLIdResult extends js.Object {
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.DistributionList] = js.native
}

object ListDistributionsByWebACLIdResult {
  @scala.inline
  def apply(): ListDistributionsByWebACLIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByWebACLIdResult]
  }
  @scala.inline
  implicit class ListDistributionsByWebACLIdResultOps[Self <: ListDistributionsByWebACLIdResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistributionList(value: DistributionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributionList")(js.undefined)
        ret
    }
  }
  
}

