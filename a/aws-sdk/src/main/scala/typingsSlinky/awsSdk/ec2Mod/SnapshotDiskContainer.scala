package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotDiskContainer extends js.Object {
  /**
    * The description of the disk image being imported.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The format of the disk image being imported. Valid values: VHD | VMDK 
    */
  var Format: js.UndefOr[String] = js.native
  /**
    * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..).
    */
  var Url: js.UndefOr[String] = js.native
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.UserBucket] = js.native
}

object SnapshotDiskContainer {
  @scala.inline
  def apply(): SnapshotDiskContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotDiskContainer]
  }
  @scala.inline
  implicit class SnapshotDiskContainerOps[Self <: SnapshotDiskContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(js.undefined)
        ret
    }
    @scala.inline
    def withUserBucket(value: UserBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserBucket")(js.undefined)
        ret
    }
  }
  
}

