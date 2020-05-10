package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportWorkspaceImageRequest extends js.Object {
  /**
    * The identifier of the EC2 image.
    */
  var Ec2ImageId: typingsSlinky.awsSdk.workspacesMod.Ec2ImageId = js.native
  /**
    * The description of the WorkSpace image.
    */
  var ImageDescription: WorkspaceImageDescription = js.native
  /**
    * The name of the WorkSpace image.
    */
  var ImageName: WorkspaceImageName = js.native
  /**
    * The ingestion process to be used when importing the image.
    */
  var IngestionProcess: WorkspaceImageIngestionProcess = js.native
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ImportWorkspaceImageRequest {
  @scala.inline
  def apply(
    Ec2ImageId: Ec2ImageId,
    ImageDescription: WorkspaceImageDescription,
    ImageName: WorkspaceImageName,
    IngestionProcess: WorkspaceImageIngestionProcess
  ): ImportWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Ec2ImageId = Ec2ImageId.asInstanceOf[js.Any], ImageDescription = ImageDescription.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any], IngestionProcess = IngestionProcess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportWorkspaceImageRequest]
  }
  @scala.inline
  implicit class ImportWorkspaceImageRequestOps[Self <: ImportWorkspaceImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEc2ImageId(value: Ec2ImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageDescription(value: WorkspaceImageDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageName(value: WorkspaceImageName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIngestionProcess(value: WorkspaceImageIngestionProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestionProcess")(value.asInstanceOf[js.Any])
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

