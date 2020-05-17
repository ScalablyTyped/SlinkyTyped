package typingsSlinky.playerframework.PlayerFramework.Plugins

import typingsSlinky.playerframework.PlayerFramework.MediaPlayer
import typingsSlinky.playerframework.PlayerFramework.PluginBase
import typingsSlinky.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlPlugin extends PluginBase {
  def compactThresholdInInches(): Double = js.native
  def hide(): Unit = js.native
  def isCompact(): Boolean = js.native
  def orientation(): String = js.native
  def show(): Unit = js.native
}

object ControlPlugin {
  @scala.inline
  def apply(
    compactThresholdInInches: () => Double,
    currentMediaSource: MediaSource,
    hide: () => Unit,
    isActive: Boolean,
    isCompact: () => Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    orientation: () => String,
    show: () => Unit,
    unload: () => Unit,
    update: MediaSource => Unit
  ): ControlPlugin = {
    val __obj = js.Dynamic.literal(compactThresholdInInches = js.Any.fromFunction0(compactThresholdInInches), currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isCompact = js.Any.fromFunction0(isCompact), isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], orientation = js.Any.fromFunction0(orientation), show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ControlPlugin]
  }
  @scala.inline
  implicit class ControlPluginOps[Self <: ControlPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompactThresholdInInches(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactThresholdInInches")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCompact(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompact")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOrientation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

