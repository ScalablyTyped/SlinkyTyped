package typingsSlinky.chromeApps.chrome.mediaGalleries

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanProgressEventArgs extends js.Object {
  /**
    * Appoximate number of media files found;
    * some file types can be either audio or video
    * and are included in both counts.
    */
  var audioCount: js.UndefOr[integer] = js.native
  /** The number of Galleries found. */
  var galleryCount: js.UndefOr[integer] = js.native
  var imageCount: js.UndefOr[integer] = js.native
  /** The type of progress event, i.e. start, finish, etc. */
  var `type`: ScanProgressType = js.native
  var videoCount: js.UndefOr[integer] = js.native
}

object ScanProgressEventArgs {
  @scala.inline
  def apply(`type`: ScanProgressType): ScanProgressEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanProgressEventArgs]
  }
  @scala.inline
  implicit class ScanProgressEventArgsOps[Self <: ScanProgressEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ScanProgressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGalleryCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGalleryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("galleryCount")(js.undefined)
        ret
    }
    @scala.inline
    def withImageCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCount")(js.undefined)
        ret
    }
  }
  
}

