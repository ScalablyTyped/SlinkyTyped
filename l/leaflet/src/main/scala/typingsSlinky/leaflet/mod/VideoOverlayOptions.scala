package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoOverlayOptions extends ImageOverlayOptions {
  /** Whether the video starts playing automatically when loaded. */
  var autoplay: js.UndefOr[Boolean] = js.native
  /** Whether the video will save aspect ratio after the projection. */
  var keepAspectRatio: js.UndefOr[Boolean] = js.native
  /** Whether the video will loop back to the beginning when played. */
  var loop: js.UndefOr[Boolean] = js.native
}

object VideoOverlayOptions {
  @scala.inline
  def apply(): VideoOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOverlayOptions]
  }
  @scala.inline
  implicit class VideoOverlayOptionsOps[Self <: VideoOverlayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
  }
  
}

