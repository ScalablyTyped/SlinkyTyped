package typingsSlinky.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaFileSystemMetadata extends js.Object {
  /** If the media gallery is on a removable device, a unique id for the device while the device is online. */
  var deviceId: js.UndefOr[String] = js.native
  /** A unique and persistent id for the media gallery. */
  var galleryId: String = js.native
  /** True if the device is currently available. */
  var isAvailable: Boolean = js.native
  /** True if the device the media gallery is on was detected as a media device. i.e. a PTP or MTP device, or a DCIM directory is present. */
  var isMediaDevice: Boolean = js.native
  /** True if the media gallery is on a removable device. */
  var isRemovable: Boolean = js.native
  /** The name of the file system. */
  var name: String = js.native
}

object MediaFileSystemMetadata {
  @scala.inline
  def apply(
    galleryId: String,
    isAvailable: Boolean,
    isMediaDevice: Boolean,
    isRemovable: Boolean,
    name: String
  ): MediaFileSystemMetadata = {
    val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], isMediaDevice = isMediaDevice.asInstanceOf[js.Any], isRemovable = isRemovable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFileSystemMetadata]
  }
  @scala.inline
  implicit class MediaFileSystemMetadataOps[Self <: MediaFileSystemMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGalleryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMediaDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMediaDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRemovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
  }
  
}

