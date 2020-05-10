package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportVolumeTaskDetails extends js.Object {
  /**
    * The Availability Zone where the resulting volume will reside.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The number of bytes converted so far.
    */
  var BytesConverted: js.UndefOr[Long] = js.native
  /**
    * The description you provided when starting the import volume task.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The image.
    */
  var Image: js.UndefOr[DiskImageDescription] = js.native
  /**
    * The volume.
    */
  var Volume: js.UndefOr[DiskImageVolumeDescription] = js.native
}

object ImportVolumeTaskDetails {
  @scala.inline
  def apply(): ImportVolumeTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportVolumeTaskDetails]
  }
  @scala.inline
  implicit class ImportVolumeTaskDetailsOps[Self <: ImportVolumeTaskDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withBytesConverted(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesConverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesConverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BytesConverted")(js.undefined)
        ret
    }
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
    def withImage(value: DiskImageDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: DiskImageVolumeDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Volume")(js.undefined)
        ret
    }
  }
  
}

