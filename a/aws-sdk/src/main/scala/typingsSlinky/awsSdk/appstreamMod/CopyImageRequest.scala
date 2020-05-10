package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyImageRequest extends js.Object {
  /**
    * The description that the image will have when it is copied to the destination.
    */
  var DestinationImageDescription: js.UndefOr[Description] = js.native
  /**
    * The name that the image will have when it is copied to the destination.
    */
  var DestinationImageName: Name = js.native
  /**
    * The destination region to which the image will be copied. This parameter is required, even if you are copying an image within the same region.
    */
  var DestinationRegion: RegionName = js.native
  /**
    * The name of the image to copy.
    */
  var SourceImageName: Name = js.native
}

object CopyImageRequest {
  @scala.inline
  def apply(DestinationImageName: Name, DestinationRegion: RegionName, SourceImageName: Name): CopyImageRequest = {
    val __obj = js.Dynamic.literal(DestinationImageName = DestinationImageName.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any], SourceImageName = SourceImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyImageRequest]
  }
  @scala.inline
  implicit class CopyImageRequestOps[Self <: CopyImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationImageName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationImageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationRegion(value: RegionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceImageName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceImageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationImageDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationImageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationImageDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationImageDescription")(js.undefined)
        ret
    }
  }
  
}

