package typingsSlinky.chromecastCafSender.cast.framework

import typingsSlinky.chrome.chrome.cast.media.LiveSeekableRange
import typingsSlinky.chrome.chrome.cast.media.MediaInfo
import typingsSlinky.chrome.chrome.cast.media.PlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemotePlayer extends js.Object {
  var canControlVolume: Boolean = js.native
  var canPause: Boolean = js.native
  var canSeek: Boolean = js.native
  var controller: RemotePlayerController | Null = js.native
  var currentTime: Double = js.native
  var displayName: String = js.native
  var displayStatus: String = js.native
  var duration: Double = js.native
  var imageUrl: String | Null = js.native
  var isConnected: Boolean = js.native
  var isMediaLoaded: Boolean = js.native
  var isMuted: Boolean = js.native
  var isPaused: Boolean = js.native
  var liveSeekableRange: js.UndefOr[LiveSeekableRange] = js.native
  var mediaInfo: js.UndefOr[MediaInfo] = js.native
  var playerState: PlayerState | Null = js.native
  var savedPlayerState: SavedPlayerState | Null = js.native
  var statusText: String = js.native
  var title: String = js.native
  var volumeLevel: Double = js.native
}

object RemotePlayer {
  @scala.inline
  def apply(
    canControlVolume: Boolean,
    canPause: Boolean,
    canSeek: Boolean,
    currentTime: Double,
    displayName: String,
    displayStatus: String,
    duration: Double,
    isConnected: Boolean,
    isMediaLoaded: Boolean,
    isMuted: Boolean,
    isPaused: Boolean,
    statusText: String,
    title: String,
    volumeLevel: Double
  ): RemotePlayer = {
    val __obj = js.Dynamic.literal(canControlVolume = canControlVolume.asInstanceOf[js.Any], canPause = canPause.asInstanceOf[js.Any], canSeek = canSeek.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayStatus = displayStatus.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], isConnected = isConnected.asInstanceOf[js.Any], isMediaLoaded = isMediaLoaded.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], volumeLevel = volumeLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemotePlayer]
  }
  @scala.inline
  implicit class RemotePlayerOps[Self <: RemotePlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanControlVolume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canControlVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanPause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanSeek(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMediaLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMediaLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMuted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withController(value: RemotePlayerController): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControllerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(null)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(null)
        ret
    }
    @scala.inline
    def withLiveSeekableRange(value: LiveSeekableRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSeekableRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSeekableRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSeekableRange")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaInfo(value: MediaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayerState(value: PlayerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerState")(null)
        ret
    }
    @scala.inline
    def withSavedPlayerState(value: SavedPlayerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedPlayerState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavedPlayerStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedPlayerState")(null)
        ret
    }
  }
  
}

