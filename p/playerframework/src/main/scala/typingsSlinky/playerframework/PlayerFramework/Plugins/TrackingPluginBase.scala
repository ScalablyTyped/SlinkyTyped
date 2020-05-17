package typingsSlinky.playerframework.PlayerFramework.Plugins

import typingsSlinky.playerframework.PlayerFramework.MediaPlayer
import typingsSlinky.playerframework.PlayerFramework.PluginBase
import typingsSlinky.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingPluginBase extends PluginBase {
  var trackingEvents: js.Array[_] = js.native
}

object TrackingPluginBase {
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    trackingEvents: js.Array[_],
    unload: () => Unit,
    update: MediaSource => Unit
  ): TrackingPluginBase = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TrackingPluginBase]
  }
  @scala.inline
  implicit class TrackingPluginBaseOps[Self <: TrackingPluginBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackingEvents(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingEvents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

