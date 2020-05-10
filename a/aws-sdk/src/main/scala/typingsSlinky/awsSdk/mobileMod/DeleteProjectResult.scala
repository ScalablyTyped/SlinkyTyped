package typingsSlinky.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectResult extends js.Object {
  /**
    *  Resources which were deleted. 
    */
  var deletedResources: js.UndefOr[Resources] = js.native
  /**
    *  Resources which were not deleted, due to a risk of losing potentially important data or files. 
    */
  var orphanedResources: js.UndefOr[Resources] = js.native
}

object DeleteProjectResult {
  @scala.inline
  def apply(): DeleteProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectResult]
  }
  @scala.inline
  implicit class DeleteProjectResultOps[Self <: DeleteProjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedResources(value: Resources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedResources")(js.undefined)
        ret
    }
    @scala.inline
    def withOrphanedResources(value: Resources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphanedResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrphanedResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orphanedResources")(js.undefined)
        ret
    }
  }
  
}

