package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.EntryPathRequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataRequestedEventOptions extends EntryPathRequestedEventOptions {
  /**
    * Set to true if is_directory value is requested
    * @since Chrome 49.
    */
  var isDirectory: Boolean = js.native
  /**
    * Set to true if mimeType value is requested.
    * @since Chrome 49.
    */
  var mimeType: Boolean = js.native
  /**
    * Set to true if modificationTime value is requested
    * @since Chrome 49.
    */
  var modificationTime: Boolean = js.native
  /**
    * Set to true if is_directory value is requested.
    * @since Chrome 49.
    */
  var name: Boolean = js.native
  /**
    * Set to true if size value is requested.
    * @since Chrome 49.
    */
  var size: Boolean = js.native
  /**
    * Set to true if the thumbnail is requested.
    */
  var thumbnail: Boolean = js.native
}

object MetadataRequestedEventOptions {
  @scala.inline
  def apply(
    entryPath: String,
    fileSystemId: String,
    isDirectory: Boolean,
    mimeType: Boolean,
    modificationTime: Boolean,
    name: Boolean,
    requestId: integer,
    size: Boolean,
    thumbnail: Boolean
  ): MetadataRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataRequestedEventOptions]
  }
  @scala.inline
  implicit class MetadataRequestedEventOptionsOps[Self <: MetadataRequestedEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModificationTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

