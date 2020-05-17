package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackIdString extends js.Object {
  var playbackId: String = js.native
}

object PlaybackIdString {
  @scala.inline
  def apply(playbackId: String): PlaybackIdString = {
    val __obj = js.Dynamic.literal(playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackIdString]
  }
  @scala.inline
  implicit class PlaybackIdStringOps[Self <: PlaybackIdString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaybackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

