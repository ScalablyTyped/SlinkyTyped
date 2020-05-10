package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventParams extends js.Object {
  var adClick: AdProgressParam = js.native
  var adCompanions: AdCompanionsParam = js.native
  var adComplete: AdProgressParam = js.native
  var adError: AdErrorParam = js.native
  var adImpression: AdImpressionParam = js.native
  var adPause: AdPlayParam = js.native
  var adPlay: AdPlayParam = js.native
  var adRequest: AdRequestParam = js.native
  var adSchedule: AdScheduleParam = js.native
  var adSkipped: AdProgressParam = js.native
  var adStarted: AdStartedParam = js.native
  var adTime: AdTimeParam = js.native
  var audioTrackChanged: AudioTrackChangedParam = js.native
  var audioTracks: AudioTracksParam = js.native
  var buffer: BufferParam = js.native
  var bufferChange: BufferChangeParam = js.native
  var captionsChanged: CaptionsChangedParam = js.native
  var captionsList: CaptionsListParam = js.native
  var cast: CastParam = js.native
  var controls: ControlsParam = js.native
  var error: ErrorParam = js.native
  var firstFrame: FirstFrameParam = js.native
  var fullscreen: FullscreenParam = js.native
  var idle: IdleParam = js.native
  var levels: LevelsParam = js.native
  var levelsChanged: LevelsChangedParam = js.native
  var meta: MetadataParam = js.native
  var mute: MuteParam = js.native
  var pause: PlayParam = js.native
  var play: PlayParam = js.native
  var playlist: PlaylistParam = js.native
  var playlistItem: PlaylistItemParam = js.native
  var ready: ReadyParam = js.native
  var resize: ResizeParam = js.native
  var seek: SeekParam = js.native
  var setupError: ErrorParam = js.native
  var time: TimeParam = js.native
  var visualQuality: VisualQualityParam = js.native
  var volume: VolumeParam = js.native
}

object EventParams {
  @scala.inline
  def apply(
    adClick: AdProgressParam,
    adCompanions: AdCompanionsParam,
    adComplete: AdProgressParam,
    adError: AdErrorParam,
    adImpression: AdImpressionParam,
    adPause: AdPlayParam,
    adPlay: AdPlayParam,
    adRequest: AdRequestParam,
    adSchedule: AdScheduleParam,
    adSkipped: AdProgressParam,
    adStarted: AdStartedParam,
    adTime: AdTimeParam,
    audioTrackChanged: AudioTrackChangedParam,
    audioTracks: AudioTracksParam,
    buffer: BufferParam,
    bufferChange: BufferChangeParam,
    captionsChanged: CaptionsChangedParam,
    captionsList: CaptionsListParam,
    cast: CastParam,
    controls: ControlsParam,
    error: ErrorParam,
    firstFrame: FirstFrameParam,
    fullscreen: FullscreenParam,
    idle: IdleParam,
    levels: LevelsParam,
    levelsChanged: LevelsChangedParam,
    meta: MetadataParam,
    mute: MuteParam,
    pause: PlayParam,
    play: PlayParam,
    playlist: PlaylistParam,
    playlistItem: PlaylistItemParam,
    ready: ReadyParam,
    resize: ResizeParam,
    seek: SeekParam,
    setupError: ErrorParam,
    time: TimeParam,
    visualQuality: VisualQualityParam,
    volume: VolumeParam
  ): EventParams = {
    val __obj = js.Dynamic.literal(adClick = adClick.asInstanceOf[js.Any], adCompanions = adCompanions.asInstanceOf[js.Any], adComplete = adComplete.asInstanceOf[js.Any], adError = adError.asInstanceOf[js.Any], adImpression = adImpression.asInstanceOf[js.Any], adPause = adPause.asInstanceOf[js.Any], adPlay = adPlay.asInstanceOf[js.Any], adRequest = adRequest.asInstanceOf[js.Any], adSchedule = adSchedule.asInstanceOf[js.Any], adSkipped = adSkipped.asInstanceOf[js.Any], adStarted = adStarted.asInstanceOf[js.Any], adTime = adTime.asInstanceOf[js.Any], audioTrackChanged = audioTrackChanged.asInstanceOf[js.Any], audioTracks = audioTracks.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], bufferChange = bufferChange.asInstanceOf[js.Any], captionsChanged = captionsChanged.asInstanceOf[js.Any], captionsList = captionsList.asInstanceOf[js.Any], cast = cast.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], firstFrame = firstFrame.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], levelsChanged = levelsChanged.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playlist = playlist.asInstanceOf[js.Any], playlistItem = playlistItem.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], setupError = setupError.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], visualQuality = visualQuality.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParams]
  }
  @scala.inline
  implicit class EventParamsOps[Self <: EventParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdClick(value: AdProgressParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdCompanions(value: AdCompanionsParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adCompanions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdComplete(value: AdProgressParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdError(value: AdErrorParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdImpression(value: AdImpressionParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adImpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdPause(value: AdPlayParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdPlay(value: AdPlayParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdRequest(value: AdRequestParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdSchedule(value: AdScheduleParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdSkipped(value: AdProgressParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdStarted(value: AdStartedParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdTime(value: AdTimeParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioTrackChanged(value: AudioTrackChangedParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTrackChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioTracks(value: AudioTracksParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffer(value: BufferParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferChange(value: BufferChangeParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptionsChanged(value: CaptionsChangedParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaptionsList(value: CaptionsListParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCast(value: CastParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControls(value: ControlsParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrorParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstFrame(value: FirstFrameParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreen(value: FullscreenParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdle(value: IdleParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevels(value: LevelsParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelsChanged(value: LevelsChangedParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: MetadataParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMute(value: MuteParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: PlayParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlay(value: PlayParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaylist(value: PlaylistParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaylistItem(value: PlaylistItemParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlistItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReady(value: ReadyParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: ResizeParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeek(value: SeekParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetupError(value: ErrorParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: TimeParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualQuality(value: VisualQualityParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: VolumeParam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

