package typingsSlinky.playerframework.PlayerFramework.Plugins

import typingsSlinky.playerframework.PlayerFramework.MediaPlayer
import typingsSlinky.playerframework.PlayerFramework.PluginBase
import typingsSlinky.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaptersPlugin extends PluginBase {
  var autoCreateChaptersFromTextTracks: Boolean = js.native
  var autoCreateDefaultChapters: Boolean = js.native
  var defaultChapterCount: Double = js.native
  var visualMarkerClass: String = js.native
}

object ChaptersPlugin {
  @scala.inline
  def apply(
    autoCreateChaptersFromTextTracks: Boolean,
    autoCreateDefaultChapters: Boolean,
    currentMediaSource: MediaSource,
    defaultChapterCount: Double,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    unload: () => Unit,
    update: MediaSource => Unit,
    visualMarkerClass: String
  ): ChaptersPlugin = {
    val __obj = js.Dynamic.literal(autoCreateChaptersFromTextTracks = autoCreateChaptersFromTextTracks.asInstanceOf[js.Any], autoCreateDefaultChapters = autoCreateDefaultChapters.asInstanceOf[js.Any], currentMediaSource = currentMediaSource.asInstanceOf[js.Any], defaultChapterCount = defaultChapterCount.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update), visualMarkerClass = visualMarkerClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChaptersPlugin]
  }
  @scala.inline
  implicit class ChaptersPluginOps[Self <: ChaptersPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCreateChaptersFromTextTracks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreateChaptersFromTextTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCreateDefaultChapters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreateDefaultChapters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultChapterCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultChapterCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualMarkerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualMarkerClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

