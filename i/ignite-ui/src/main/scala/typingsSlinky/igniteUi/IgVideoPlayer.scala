package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgVideoPlayer
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets/Sets whether player controls will auto hide when video is not hovered. This is applicable only when Infragistics playback controls are used.
  	 *
  	 */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the video should start playing immediately after the control is loaded.
  	 *
  	 */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
  	 * Occurs when the banner is clicked.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bannerClick: js.UndefOr[BannerClickEvent] = js.native
  /**
  	 * Occurs when the banner is hidden.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bannerHidden: js.UndefOr[BannerHiddenEvent] = js.native
  /**
  	 * Defines the name of the player banner visible event. Fired when the banner has been displayed.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bannerVisible: js.UndefOr[BannerVisibleEvent] = js.native
  /**
  	 * Gets/Sets an array of banner objects that will show the banners when the video clip is played.
  	 *
  	 */
  var banners: js.UndefOr[js.Array[IgVideoPlayerBanner]] = js.native
  /**
  	 * Occurs when a bookmark is clicked.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bookmarkClick: js.UndefOr[BookmarkClickEvent] = js.native
  /**
  	 * Occurs when a bookmark is hit.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var bookmarkHit: js.UndefOr[BookmarkHitEvent] = js.native
  /**
  	 * Gets/Sets an array of bookmarks that will be displayed in the video player control.
  	 *
  	 */
  var bookmarks: js.UndefOr[js.Array[IgVideoPlayerBookmark]] = js.native
  /**
  	 * Gets/Sets whether if you want to use the built in browser controls. By default player uses Infragistics playback controls. Note that you may have different look and feel across different browsers if you use the built in browser controls. When this option is set to true, no [commercials](ui.igvideoplayer#options:commercials) will be displayed as they are not supported.
  	 *
  	 */
  var browserControls: js.UndefOr[Boolean] = js.native
  /**
  	 * Occurs when browser does not support HTML 5 video.
  	 */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  /**
  	 * Occurs when a chunk of data is buffered.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var buffering: js.UndefOr[BufferingEvent] = js.native
  /**
  	 * Gets/Sets the center big button hide delay.
  	 *
  	 */
  var centerButtonHideDelay: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets an array of commercials objects that will be displayed when the video is playing. Note that [broswerControls](ui.igvideoplayer#options:browserControls) doesn't support commercials.
  	 *
  	 */
  var commercials: js.UndefOr[IgVideoPlayerCommercials] = js.native
  /**
  	 * Occurs when the video has ended.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var ended: js.UndefOr[EndedEvent] = js.native
  /**
  	 * Occurs when igVideoPlayer enters full screen mode.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var enterFullScreen: js.UndefOr[EnterFullScreenEvent] = js.native
  /**
  	 * Occurs when igVideoPlayer exits full screen mode.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var exitFullScreen: js.UndefOr[ExitFullScreenEvent] = js.native
  /**
  	 * Gets/Sets whether the video player to be in full screen or not. This is not a pure full screen, because browsers do not allow that. It just sets 100% width and height to the control.
  	 *
  	 */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the height of the control. By default null will stretch the control to fit data, if no other heights are defined.
  	 *
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgVideoPlayerLocale] = js.native
  /**
  	 * Gets/Sets whether the video to start again after it has ended.
  	 *
  	 */
  var loop: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets whether the video volume is muted.
  	 *
  	 */
  var muted: js.UndefOr[Boolean] = js.native
  /**
  	 * Occurs when the video is paused.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var paused: js.UndefOr[PausedEvent] = js.native
  /**
  	 * Occurs when video gets playing.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var playing: js.UndefOr[PlayingEvent] = js.native
  /**
  	 * Gets/Sets a URL to an image to show, when no video data is available.
  	 *
  	 */
  var posterUrl: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets whether to preload load initial data for duration of video. If true it may start buffering the video, but this highly depends on the specific browser implementation.
  	 *
  	 */
  var preload: js.UndefOr[Boolean] = js.native
  /**
  	 * Occurs when the video has advanced the playback position.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var progress: js.UndefOr[ProgressEvent] = js.native
  /**
  	 * Gets/Sets the format of the video progress label. You should use ${currentTime} to represent current playback position and ${duration} to represent video duration.
  	 *
  	 */
  var progressLabelFormat: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Occurs when a related video is clicked.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var relatedVideoClick: js.UndefOr[RelatedVideoClickEvent] = js.native
  /**
  	 * Gets/Sets an array of related videos that will be displayed when video playback has ended.
  	 *
  	 */
  var relatedVideos: js.UndefOr[js.Array[IgVideoPlayerRelatedVideo]] = js.native
  /**
  	 * Gets/Sets whether the control seek tool tip will be shown when hovering the video progress bar.
  	 *
  	 */
  var showSeekTime: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets a list of video sources to choose from. Best coded/format is automatically detected by the control. Supported types are depending on the browser and could be one of the following mov, mp4, webm, ogg.
  	 *
  	 */
  var sources: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets/Sets video title.
  	 *
  	 */
  var title: js.UndefOr[String] = js.native
  /**
  	 * Gets/Sets the video volume. It can be between 0.0 and 1.0.
  	 *
  	 */
  var volume: js.UndefOr[Double] = js.native
  /**
  	 * Gets/Sets volume slider auto hide delay. This is applicable only when Infragistics playback controls are used.
  	 *
  	 */
  var volumeAutohideDelay: js.UndefOr[Double] = js.native
  /**
  	 * Occurs when igVideoPlayer is waiting for data from the server.
  	 *
  	 * Function takes arguments evt and ui.
  	 */
  var waiting: js.UndefOr[WaitingEvent] = js.native
  /**
  	 * Gets/Sets the width of the control. By default null will stretch the control to fit data, if no other widths are defined.
  	 *
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgVideoPlayer {
  @scala.inline
  def apply(): IgVideoPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayer]
  }
  @scala.inline
  implicit class IgVideoPlayerOps[Self <: IgVideoPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutohide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutohide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autohide")(js.undefined)
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
    def withBannerClick(value: (/* event */ Event, /* ui */ BannerClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBannerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerHidden(value: (/* event */ Event, /* ui */ BannerHiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBannerHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withBannerVisible(value: (/* event */ Event, /* ui */ BannerVisibleEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerVisible")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBannerVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withBanners(value: js.Array[IgVideoPlayerBanner]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banners")(js.undefined)
        ret
    }
    @scala.inline
    def withBookmarkClick(value: (/* event */ Event, /* ui */ BookmarkClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBookmarkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withBookmarkHit(value: (/* event */ Event, /* ui */ BookmarkHitEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkHit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBookmarkHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarkHit")(js.undefined)
        ret
    }
    @scala.inline
    def withBookmarks(value: js.Array[IgVideoPlayerBookmark]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBookmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowserControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserControls")(js.undefined)
        ret
    }
    @scala.inline
    def withBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNotSupported")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBrowserNotSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserNotSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffering(value: (/* event */ Event, /* ui */ BufferingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBuffering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffering")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterButtonHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonHideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterButtonHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerButtonHideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withCommercials(value: IgVideoPlayerCommercials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commercials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommercials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commercials")(js.undefined)
        ret
    }
    @scala.inline
    def withEnded(value: (/* event */ Event, /* ui */ EndedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ended")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterFullScreen(value: (/* event */ Event, /* ui */ EnterFullScreenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterFullScreen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEnterFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withExitFullScreen(value: (/* event */ Event, /* ui */ ExitFullScreenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitFullScreen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExitFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: Boolean): Self = {
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
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgVideoPlayerLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
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
    def withPaused(value: (/* event */ Event, /* ui */ PausedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaying(value: (/* event */ Event, /* ui */ PlayingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playing")(js.undefined)
        ret
    }
    @scala.inline
    def withPosterUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosterUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: (/* event */ Event, /* ui */ ProgressEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressLabelFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressLabelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressLabelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedVideoClick(value: (/* event */ Event, /* ui */ RelatedVideoClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedVideoClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelatedVideoClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedVideoClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedVideos(value: js.Array[IgVideoPlayerRelatedVideo]): Self = {
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
    def withShowSeekTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeekTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSeekTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeekTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[_]): Self = {
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
    @scala.inline
    def withVolumeAutohideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAutohideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeAutohideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeAutohideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withWaiting(value: (/* event */ Event, /* ui */ WaitingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

