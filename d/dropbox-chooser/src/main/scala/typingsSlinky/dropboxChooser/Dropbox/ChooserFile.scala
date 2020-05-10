package typingsSlinky.dropboxChooser.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooserFile extends js.Object {
  // Size of the file in bytes.
  var bytes: Double = js.native
  // URL to a 64x64px icon for the file based on the file's extension.
  var icon: String = js.native
  // Unique ID for the file, compatible with Dropbox API v2.
  var id: String = js.native
  // whether or not the file is actually a directory
  var isDir: Boolean = js.native
  // URL to access the file, which varies depending on the linkType specified when the
  // Chooser was triggered.
  var link: String = js.native
  // Name of the file.
  var name: String = js.native
  // A thumbnail URL generated when the user selects images and videos.
  // If the user didn't select an image or video, no thumbnail will be included.
  var thumbnailLink: js.UndefOr[String] = js.native
}

object ChooserFile {
  @scala.inline
  def apply(bytes: Double, icon: String, id: String, isDir: Boolean, link: String, name: String): ChooserFile = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooserFile]
  }
  @scala.inline
  implicit class ChooserFileOps[Self <: ChooserFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnailLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailLink")(js.undefined)
        ret
    }
  }
  
}

