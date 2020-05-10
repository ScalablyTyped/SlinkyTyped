package typingsSlinky.hlsJs.mod

import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait mediaAttachedData extends js.Object {
  var mediaSource: String = js.native
  var video: HTMLVideoElement = js.native
}

object mediaAttachedData {
  @scala.inline
  def apply(mediaSource: String, video: HTMLVideoElement): mediaAttachedData = {
    val __obj = js.Dynamic.literal(mediaSource = mediaSource.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[mediaAttachedData]
  }
  @scala.inline
  implicit class mediaAttachedDataOps[Self <: mediaAttachedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: HTMLVideoElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

