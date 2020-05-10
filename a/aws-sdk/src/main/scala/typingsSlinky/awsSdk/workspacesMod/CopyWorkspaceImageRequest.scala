package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyWorkspaceImageRequest extends js.Object {
  /**
    * A description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.native
  /**
    * The name of the image.
    */
  var Name: WorkspaceImageName = js.native
  /**
    * The identifier of the source image.
    */
  var SourceImageId: WorkspaceImageId = js.native
  /**
    * The identifier of the source Region.
    */
  var SourceRegion: Region = js.native
  /**
    * The tags for the image.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CopyWorkspaceImageRequest {
  @scala.inline
  def apply(Name: WorkspaceImageName, SourceImageId: WorkspaceImageId, SourceRegion: Region): CopyWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceImageId = SourceImageId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWorkspaceImageRequest]
  }
  @scala.inline
  implicit class CopyWorkspaceImageRequestOps[Self <: CopyWorkspaceImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: WorkspaceImageName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceImageId(value: WorkspaceImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: WorkspaceImageDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

