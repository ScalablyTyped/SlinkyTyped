package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.Duration
import typingsSlinky.gestalt.anon.Fullscreen
import typingsSlinky.gestalt.anon.Loaded
import typingsSlinky.gestalt.anon.Src
import typingsSlinky.gestalt.anon.Time
import typingsSlinky.gestalt.anon.Volume
import typingsSlinky.gestalt.anon.`4`
import typingsSlinky.gestalt.anon.`5`
import typingsSlinky.gestalt.gestaltStrings.auto
import typingsSlinky.gestalt.gestaltStrings.metadata
import typingsSlinky.gestalt.gestaltStrings.none
import typingsSlinky.gestalt.mod.VideoProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Video {
  @JSImport("gestalt", "Video")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Video] {
    @scala.inline
    def accessibilityMaximizeLabel(value: String): this.type = set("accessibilityMaximizeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityMinimizeLabel(value: String): this.type = set("accessibilityMinimizeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityMuteLabel(value: String): this.type = set("accessibilityMuteLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityPauseLabel(value: String): this.type = set("accessibilityPauseLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityPlayLabel(value: String): this.type = set("accessibilityPlayLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityUnmuteLabel(value: String): this.type = set("accessibilityUnmuteLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def onDurationChange(value: /* args */ Duration => Unit): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def onEnded(value: /* args */ `4` => Unit): this.type = set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def onFullscreenChange(value: /* args */ Fullscreen => Unit): this.type = set("onFullscreenChange", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadedChange(value: /* args */ Loaded => Unit): this.type = set("onLoadedChange", js.Any.fromFunction1(value))
    @scala.inline
    def onPause(value: /* args */ `5` => Unit): this.type = set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def onPlay(value: /* args */ `5` => Unit): this.type = set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def onReady(value: /* args */ `4` => Unit): this.type = set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def onSeek(value: /* args */ `4` => Unit): this.type = set("onSeek", js.Any.fromFunction1(value))
    @scala.inline
    def onTimeChange(value: /* args */ Time => Unit): this.type = set("onTimeChange", js.Any.fromFunction1(value))
    @scala.inline
    def onVolumeChange(value: /* args */ Volume => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def playbackRate(value: Double): this.type = set("playbackRate", value.asInstanceOf[js.Any])
    @scala.inline
    def playing(value: Boolean): this.type = set("playing", value.asInstanceOf[js.Any])
    @scala.inline
    def playsInline(value: Boolean): this.type = set("playsInline", value.asInstanceOf[js.Any])
    @scala.inline
    def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def preload(value: auto | metadata | none): this.type = set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VideoProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(aspectRatio: Double, captions: String, src: String | js.Array[Src]): Builder = {
    val __props = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], captions = captions.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VideoProps]))
  }
}

