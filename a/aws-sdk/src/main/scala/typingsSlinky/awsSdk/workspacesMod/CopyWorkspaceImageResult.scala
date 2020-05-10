package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyWorkspaceImageResult extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
}

object CopyWorkspaceImageResult {
  @scala.inline
  def apply(): CopyWorkspaceImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyWorkspaceImageResult]
  }
  @scala.inline
  implicit class CopyWorkspaceImageResultOps[Self <: CopyWorkspaceImageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageId(value: WorkspaceImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
  }
  
}

