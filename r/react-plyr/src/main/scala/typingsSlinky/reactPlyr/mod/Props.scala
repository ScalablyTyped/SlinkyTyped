package typingsSlinky.reactPlyr.mod

import typingsSlinky.reactPlyr.anon.Active
import typingsSlinky.reactPlyr.anon.Controls
import typingsSlinky.reactPlyr.anon.Default
import typingsSlinky.reactPlyr.anon.Enabled
import typingsSlinky.reactPlyr.anon.Focused
import typingsSlinky.reactPlyr.anon.Key
import typingsSlinky.reactPlyr.anon.Kind
import typingsSlinky.reactPlyr.anon.Options
import typingsSlinky.reactPlyr.anon.Size
import typingsSlinky.reactPlyr.reactPlyrStrings.audio
import typingsSlinky.reactPlyr.reactPlyrStrings.video
import typingsSlinky.reactPlyr.reactPlyrStrings.vimeo
import typingsSlinky.reactPlyr.reactPlyrStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var autopause: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var blankVideo: js.UndefOr[String] = js.native
  var captions: js.UndefOr[js.Array[Kind]] = js.native
  var className: js.UndefOr[String] = js.native
  var clickToPlay: js.UndefOr[Boolean] = js.native
  var controls: js.UndefOr[js.Array[String]] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var disableContextMenu: js.UndefOr[Boolean] = js.native
  var displayDuration: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var fullscreen: js.UndefOr[Enabled] = js.native
  var hideControls: js.UndefOr[Boolean] = js.native
  var iconPrefix: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var invertTime: js.UndefOr[Boolean] = js.native
  var keyboard: js.UndefOr[Focused] = js.native
  var loadSprite: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Active] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var onCaptionsDisabled: js.UndefOr[js.Function0[Unit]] = js.native
  var onCaptionsEnabled: js.UndefOr[js.Function0[Unit]] = js.native
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onEnterFullscreen: js.UndefOr[js.Function0[Unit]] = js.native
  var onExitFullscreen: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoadedData: js.UndefOr[js.Function0[Unit]] = js.native
  var onPause: js.UndefOr[js.Function0[Unit]] = js.native
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.native
  var onReady: js.UndefOr[js.Function1[/* player */ js.UndefOr[js.Any], Unit]] = js.native
  var onSeeked: js.UndefOr[js.Function1[/* time */ js.UndefOr[Double], Unit]] = js.native
  var onTimeUpdate: js.UndefOr[js.Function1[/* time */ js.UndefOr[Double], Unit]] = js.native
  var onVolumeChange: js.UndefOr[js.Function1[/* params */ OnVolumeChangeParam, Unit]] = js.native
  var poster: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Default] = js.native
  var ratio: js.UndefOr[String] = js.native
  var resetOnEnd: js.UndefOr[Boolean] = js.native
  var seekTime: js.UndefOr[Double] = js.native
  var settings: js.UndefOr[js.Array[String]] = js.native
  var sources: js.UndefOr[js.Array[Size]] = js.native
  var speed: js.UndefOr[Options] = js.native
  var storage: js.UndefOr[Key] = js.native
  var title: js.UndefOr[String] = js.native
  var toggleInvert: js.UndefOr[Boolean] = js.native
  var tooltips: js.UndefOr[Controls] = js.native
  var `type`: js.UndefOr[youtube | vimeo | video | audio] = js.native
  var url: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutopause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autopause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutopause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autopause")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withBlankVideo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlankVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptions(value: js.Array[Kind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captions")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withHideControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideControls")(js.undefined)
        ret
    }
    @scala.inline
    def withIconPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Focused): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadSprite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSprite")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Active): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCaptionsDisabled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaptionsDisabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCaptionsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaptionsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCaptionsEnabled(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaptionsEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCaptionsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCaptionsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnterFullscreen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterFullscreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnEnterFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnterFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExitFullscreen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExitFullscreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExitFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExitFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: /* player */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeked(value: /* time */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdate(value: /* time */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChange(value: /* params */ OnVolumeChangeParam => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVolumeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSeekTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeekTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[Size]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleInvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleInvert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleInvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleInvert")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltips(value: Controls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: youtube | vimeo | video | audio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

