package typingsSlinky.reactPlyr.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPlyr.AnonActive
import typingsSlinky.reactPlyr.AnonControls
import typingsSlinky.reactPlyr.AnonDefault
import typingsSlinky.reactPlyr.AnonEnabled
import typingsSlinky.reactPlyr.AnonFocused
import typingsSlinky.reactPlyr.AnonKey
import typingsSlinky.reactPlyr.AnonKind
import typingsSlinky.reactPlyr.AnonOptions
import typingsSlinky.reactPlyr.AnonSize
import typingsSlinky.reactPlyr.mod.OnVolumeChangeParam
import typingsSlinky.reactPlyr.mod.Props
import typingsSlinky.reactPlyr.mod.default
import typingsSlinky.reactPlyr.reactPlyrStrings.audio
import typingsSlinky.reactPlyr.reactPlyrStrings.video
import typingsSlinky.reactPlyr.reactPlyrStrings.vimeo
import typingsSlinky.reactPlyr.reactPlyrStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPlyr {
  @JSImport("react-plyr", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autopause(value: Boolean): this.type = set("autopause", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def blankVideo(value: String): this.type = set("blankVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def captions(value: js.Array[AnonKind]): this.type = set("captions", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clickToPlay(value: Boolean): this.type = set("clickToPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def controls(value: js.Array[String]): this.type = set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def disableContextMenu(value: Boolean): this.type = set("disableContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def displayDuration(value: Boolean): this.type = set("displayDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def fullscreen(value: AnonEnabled): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def hideControls(value: Boolean): this.type = set("hideControls", value.asInstanceOf[js.Any])
    @scala.inline
    def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def iconUrl(value: String): this.type = set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def invertTime(value: Boolean): this.type = set("invertTime", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboard(value: AnonFocused): this.type = set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def loadSprite(value: Boolean): this.type = set("loadSprite", value.asInstanceOf[js.Any])
    @scala.inline
    def loop(value: AnonActive): this.type = set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def onCaptionsDisabled(value: () => Unit): this.type = set("onCaptionsDisabled", js.Any.fromFunction0(value))
    @scala.inline
    def onCaptionsEnabled(value: () => Unit): this.type = set("onCaptionsEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def onEnd(value: () => Unit): this.type = set("onEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onEnterFullscreen(value: () => Unit): this.type = set("onEnterFullscreen", js.Any.fromFunction0(value))
    @scala.inline
    def onExitFullscreen(value: () => Unit): this.type = set("onExitFullscreen", js.Any.fromFunction0(value))
    @scala.inline
    def onLoadedData(value: () => Unit): this.type = set("onLoadedData", js.Any.fromFunction0(value))
    @scala.inline
    def onPause(value: () => Unit): this.type = set("onPause", js.Any.fromFunction0(value))
    @scala.inline
    def onPlay(value: () => Unit): this.type = set("onPlay", js.Any.fromFunction0(value))
    @scala.inline
    def onReady(value: /* player */ js.UndefOr[js.Any] => Unit): this.type = set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def onSeeked(value: /* time */ js.UndefOr[Double] => Unit): this.type = set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def onTimeUpdate(value: /* time */ js.UndefOr[Double] => Unit): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def onVolumeChange(value: /* params */ OnVolumeChangeParam => Unit): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def quality(value: AnonDefault): this.type = set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def ratio(value: String): this.type = set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def resetOnEnd(value: Boolean): this.type = set("resetOnEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def seekTime(value: Double): this.type = set("seekTime", value.asInstanceOf[js.Any])
    @scala.inline
    def settings(value: js.Array[String]): this.type = set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def sources(value: js.Array[AnonSize]): this.type = set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def speed(value: AnonOptions): this.type = set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def storage(value: AnonKey): this.type = set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def toggleInvert(value: Boolean): this.type = set("toggleInvert", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltips(value: AnonControls): this.type = set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: youtube | vimeo | video | audio): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def videoId(value: String): this.type = set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactPlyr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

