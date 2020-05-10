package typingsSlinky.chromecastCafSender.cast.framework

import typingsSlinky.chrome.chrome.cast.media.PlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedPlayerState extends js.Object {
  var currentTime: Double = js.native
  var isPaused: Boolean = js.native
  var mediaInfo: PlayerState | Null = js.native
}

object SavedPlayerState {
  @scala.inline
  def apply(currentTime: Double, isPaused: Boolean): SavedPlayerState = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedPlayerState]
  }
  @scala.inline
  implicit class SavedPlayerStateOps[Self <: SavedPlayerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaInfo(value: PlayerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaInfo")(null)
        ret
    }
  }
  
}

