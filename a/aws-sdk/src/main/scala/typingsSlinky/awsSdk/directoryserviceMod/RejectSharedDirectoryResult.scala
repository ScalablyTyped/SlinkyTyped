package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectSharedDirectoryResult extends js.Object {
  /**
    * Identifier of the shared directory in the directory consumer account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.native
}

object RejectSharedDirectoryResult {
  @scala.inline
  def apply(): RejectSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectSharedDirectoryResult]
  }
  @scala.inline
  implicit class RejectSharedDirectoryResultOps[Self <: RejectSharedDirectoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSharedDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedDirectoryId")(js.undefined)
        ret
    }
  }
  
}

