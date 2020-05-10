package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductionBranch extends js.Object {
  /**
    *  Branch Name for Production Branch. 
    */
  var branchName: js.UndefOr[BranchName] = js.native
  /**
    *  Last Deploy Time of Production Branch. 
    */
  var lastDeployTime: js.UndefOr[js.Date] = js.native
  /**
    *  Status of Production Branch. 
    */
  var status: js.UndefOr[Status] = js.native
  /**
    *  Thumbnail URL for Production Branch. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.native
}

object ProductionBranch {
  @scala.inline
  def apply(): ProductionBranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductionBranch]
  }
  @scala.inline
  implicit class ProductionBranchOps[Self <: ProductionBranch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchName(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranchName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDeployTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDeployTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDeployTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastDeployTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailUrl(value: ThumbnailUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(js.undefined)
        ret
    }
  }
  
}

