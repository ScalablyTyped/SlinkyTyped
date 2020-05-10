package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgVideoPlayerLocale
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets ad message text.
  	 *
  	 */
  var adMessage: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets long ad message text.
  	 *
  	 */
  var adMessageLong: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets ad message text when no duration is specified.
  	 *
  	 */
  var adMessageNoDuration: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets new ad window title.
  	 *
  	 */
  var adNewWindowTip: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets buffering label text.
  	 *
  	 */
  var buffering: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets enter fullscreen button title.
  	 *
  	 */
  var enterFullscreen: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets exit fullscreen button title.
  	 *
  	 */
  var exitFullscreen: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets live video title.
  	 *
  	 */
  var live: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets live stream video title.
  	 *
  	 */
  var liveStream: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets paused button title.
  	 *
  	 */
  var paused: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets play button title.
  	 *
  	 */
  var play: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets playing button title.
  	 *
  	 */
  var playing: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets progress label long format.
  	 *
  	 */
  var progressLabelLongFormat: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets progress label short format.
  	 *
  	 */
  var progressLabelShortFormat: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets related videos text.
  	 *
  	 */
  var relatedVideos: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets replay button text.
  	 *
  	 */
  var replayButton: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets replay button tooltip.
  	 *
  	 */
  var replayTooltip: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets skip to button title.
  	 *
  	 */
  var skipTo: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets volume button title.
  	 *
  	 */
  var volume: js.UndefOr[Boolean] = js.native
}

object IgVideoPlayerLocale {
  @scala.inline
  def apply(): IgVideoPlayerLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerLocale]
  }
  @scala.inline
  implicit class IgVideoPlayerLocaleOps[Self <: IgVideoPlayerLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withAdMessageLong(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adMessageLong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdMessageLong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adMessageLong")(js.undefined)
        ret
    }
    @scala.inline
    def withAdMessageNoDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adMessageNoDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdMessageNoDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adMessageNoDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAdNewWindowTip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adNewWindowTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdNewWindowTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adNewWindowTip")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withExitFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withLive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveStream")(js.undefined)
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.undefined)
        ret
    }
    @scala.inline
    def withPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressLabelLongFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressLabelLongFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressLabelLongFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressLabelLongFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressLabelShortFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressLabelShortFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressLabelShortFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressLabelShortFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedVideos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedVideos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedVideos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedVideos")(js.undefined)
        ret
    }
    @scala.inline
    def withReplayButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replayButton")(js.undefined)
        ret
    }
    @scala.inline
    def withReplayTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replayTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplayTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replayTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTo")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Boolean): Self = {
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

