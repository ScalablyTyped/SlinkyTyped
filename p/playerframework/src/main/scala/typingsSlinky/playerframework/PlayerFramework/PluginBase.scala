package typingsSlinky.playerframework.PlayerFramework

import typingsSlinky.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginBase extends js.Object {
  var currentMediaSource: MediaSource = js.native
  var isActive: Boolean = js.native
  var isEnabled: Boolean = js.native
  var isLoaded: Boolean = js.native
  var mediaPlayer: MediaPlayer = js.native
  def load(): Unit = js.native
  def unload(): Unit = js.native
  def update(mediaSource: MediaSource): Unit = js.native
}

object PluginBase {
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    unload: () => Unit,
    update: MediaSource => Unit
  ): PluginBase = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PluginBase]
  }
  @scala.inline
  implicit class PluginBaseOps[Self <: PluginBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentMediaSource(value: MediaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMediaSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMediaPlayer(value: MediaPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaPlayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: MediaSource => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

