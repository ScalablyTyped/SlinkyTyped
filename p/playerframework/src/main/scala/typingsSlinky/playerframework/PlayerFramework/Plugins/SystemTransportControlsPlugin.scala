package typingsSlinky.playerframework.PlayerFramework.Plugins

import typingsSlinky.playerframework.PlayerFramework.MediaPlayer
import typingsSlinky.playerframework.PlayerFramework.PluginBase
import typingsSlinky.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemTransportControlsPlugin extends PluginBase {
  var isNextTrackEnabled: Boolean = js.native
  var isPreviousTrackEnabled: Boolean = js.native
  var nextTrackExists: Boolean = js.native
  var previousTrackExists: Boolean = js.native
}

object SystemTransportControlsPlugin {
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    isNextTrackEnabled: Boolean,
    isPreviousTrackEnabled: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    nextTrackExists: Boolean,
    previousTrackExists: Boolean,
    unload: () => Unit,
    update: MediaSource => Unit
  ): SystemTransportControlsPlugin = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isNextTrackEnabled = isNextTrackEnabled.asInstanceOf[js.Any], isPreviousTrackEnabled = isPreviousTrackEnabled.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], nextTrackExists = nextTrackExists.asInstanceOf[js.Any], previousTrackExists = previousTrackExists.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SystemTransportControlsPlugin]
  }
  @scala.inline
  implicit class SystemTransportControlsPluginOps[Self <: SystemTransportControlsPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsNextTrackEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNextTrackEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPreviousTrackEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreviousTrackEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextTrackExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTrackExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousTrackExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTrackExists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

