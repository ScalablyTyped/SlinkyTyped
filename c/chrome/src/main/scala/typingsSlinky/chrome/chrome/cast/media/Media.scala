package typingsSlinky.chrome.chrome.cast.media

import typingsSlinky.chrome.chrome.cast.Error
import typingsSlinky.chrome.chrome.cast.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Media extends js.Object {
  var activeTrackIds: js.Array[Double] = js.native
  var currentItemId: Double = js.native
  /** @deprecated. Use getEstimatedTime instead */
  var currentTime: Double = js.native
  var customData: js.Object = js.native
  var idleReason: IdleReason = js.native
  var items: js.Array[QueueItem] = js.native
  var liveSeekableRange: js.UndefOr[LiveSeekableRange] = js.native
  var loadingItemId: Double = js.native
  var media: MediaInfo = js.native
  var mediaSessionId: Double = js.native
  var playbackRate: Double = js.native
  var playerState: PlayerState = js.native
  var preloadedItemId: Double = js.native
  var repeatMode: RepeatMode = js.native
  var sessionId: String = js.native
  var supportedMediaCommands: js.Array[MediaCommand] = js.native
  var volume: Volume = js.native
  /**
    * @param {function(boolean)} listener
    */
  def addUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  /**
    * @param {!chrome.cast.media.EditTracksInfoRequest} editTracksInfoRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def editTracksInfo(
    editTracksInfoRequest: EditTracksInfoRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @return {number}
    * @suppress {deprecated} Uses currentTime member to compute estimated time.
    */
  def getEstimatedTime(): Double = js.native
  /**
    * @param {chrome.cast.media.GetStatusRequest} getStatusRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def getStatus(
    getStatusRequest: GetStatusRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {chrome.cast.media.PauseRequest} pauseRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def pause(
    pauseRequest: PauseRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {chrome.cast.media.PlayRequest} playRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def play(
    playRequest: PlayRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueItem} item
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueAppendItem(
    item: QueueItem,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueInsertItemsRequest} queueInsertItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueInsertItems(
    queueInsertItemsRequest: QueueInsertItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!number} itemId
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueJumpToItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {!number} itemId
    * @param {!number} newIndex
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueMoveItemToNewIndex(
    itemId: Double,
    newIndex: Double,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueNext(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queuePrev(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {!number} itemId
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueRemoveItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueReorderItemsRequest} queueReorderItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueReorderItems(
    queueReorderItemsRequest: QueueReorderItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.RepeatMode} repeatMode
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueSetRepeatMode(
    repeatMode: RepeatMode,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.QueueUpdateItemsRequest} queueUpdateItemsRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def queueUpdateItems(
    queueUpdateItemsRequest: QueueUpdateItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {function(boolean)} listener
    */
  def removeUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  /**
    * @param {!chrome.cast.media.SeekRequest} seekRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def seek(
    seekRequest: SeekRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.VolumeRequest} volumeRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def setVolume(
    volumeRequest: VolumeRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {chrome.cast.media.StopRequest} stopRequest
    * @param {function()} successCallback
    * @param {function(!chrome.cast.Error)} errorCallback
    */
  def stop(
    stopRequest: StopRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * @param {!chrome.cast.media.MediaCommand} command
    * @return {boolean}
    */
  def supportsCommand(command: MediaCommand): Boolean = js.native
}

object Media {
  @scala.inline
  def apply(
    activeTrackIds: js.Array[Double],
    addUpdateListener: js.Function1[/* isAlive */ Boolean, Unit] => Unit,
    currentItemId: Double,
    currentTime: Double,
    customData: js.Object,
    editTracksInfo: (EditTracksInfoRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    getEstimatedTime: () => Double,
    getStatus: (GetStatusRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    idleReason: IdleReason,
    items: js.Array[QueueItem],
    loadingItemId: Double,
    media: MediaInfo,
    mediaSessionId: Double,
    pause: (PauseRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    play: (PlayRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    playbackRate: Double,
    playerState: PlayerState,
    preloadedItemId: Double,
    queueAppendItem: (QueueItem, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueInsertItems: (QueueInsertItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueJumpToItem: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueMoveItemToNewIndex: (Double, Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueNext: (js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queuePrev: (js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueRemoveItem: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueReorderItems: (QueueReorderItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueSetRepeatMode: (RepeatMode, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    queueUpdateItems: (QueueUpdateItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    removeUpdateListener: js.Function1[/* isAlive */ Boolean, Unit] => Unit,
    repeatMode: RepeatMode,
    seek: (SeekRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    sessionId: String,
    setVolume: (VolumeRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    stop: (StopRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit,
    supportedMediaCommands: js.Array[MediaCommand],
    supportsCommand: MediaCommand => Boolean,
    volume: Volume
  ): Media = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], addUpdateListener = js.Any.fromFunction1(addUpdateListener), currentItemId = currentItemId.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], editTracksInfo = js.Any.fromFunction3(editTracksInfo), getEstimatedTime = js.Any.fromFunction0(getEstimatedTime), getStatus = js.Any.fromFunction3(getStatus), idleReason = idleReason.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], loadingItemId = loadingItemId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mediaSessionId = mediaSessionId.asInstanceOf[js.Any], pause = js.Any.fromFunction3(pause), play = js.Any.fromFunction3(play), playbackRate = playbackRate.asInstanceOf[js.Any], playerState = playerState.asInstanceOf[js.Any], preloadedItemId = preloadedItemId.asInstanceOf[js.Any], queueAppendItem = js.Any.fromFunction3(queueAppendItem), queueInsertItems = js.Any.fromFunction3(queueInsertItems), queueJumpToItem = js.Any.fromFunction3(queueJumpToItem), queueMoveItemToNewIndex = js.Any.fromFunction4(queueMoveItemToNewIndex), queueNext = js.Any.fromFunction2(queueNext), queuePrev = js.Any.fromFunction2(queuePrev), queueRemoveItem = js.Any.fromFunction3(queueRemoveItem), queueReorderItems = js.Any.fromFunction3(queueReorderItems), queueSetRepeatMode = js.Any.fromFunction3(queueSetRepeatMode), queueUpdateItems = js.Any.fromFunction3(queueUpdateItems), removeUpdateListener = js.Any.fromFunction1(removeUpdateListener), repeatMode = repeatMode.asInstanceOf[js.Any], seek = js.Any.fromFunction3(seek), sessionId = sessionId.asInstanceOf[js.Any], setVolume = js.Any.fromFunction3(setVolume), stop = js.Any.fromFunction3(stop), supportedMediaCommands = supportedMediaCommands.asInstanceOf[js.Any], supportsCommand = js.Any.fromFunction1(supportsCommand), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  @scala.inline
  implicit class MediaOps[Self <: Media] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTrackIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTrackIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddUpdateListener(value: js.Function1[/* isAlive */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUpdateListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditTracksInfo(value: (EditTracksInfoRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTracksInfo")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetEstimatedTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEstimatedTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatus(value: (GetStatusRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIdleReason(value: IdleReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[QueueItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: MediaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaSessionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: (PauseRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPlay(value: (PlayRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPlaybackRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayerState(value: PlayerState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreloadedItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadedItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueAppendItem(value: (QueueItem, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueAppendItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQueueInsertItems(value: (QueueInsertItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueInsertItems")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQueueJumpToItem(value: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueJumpToItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQueueMoveItemToNewIndex(value: (Double, Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueMoveItemToNewIndex")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withQueueNext(value: (js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueNext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQueuePrev(value: (js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuePrev")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQueueRemoveItem(value: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueRemoveItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQueueReorderItems(value: (QueueReorderItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueReorderItems")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQueueSetRepeatMode(value: (RepeatMode, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueSetRepeatMode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withQueueUpdateItems(value: (QueueUpdateItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueUpdateItems")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemoveUpdateListener(value: js.Function1[/* isAlive */ Boolean, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUpdateListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRepeatMode(value: RepeatMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeek(value: (SeekRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetVolume(value: (VolumeRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVolume")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStop(value: (StopRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSupportedMediaCommands(value: js.Array[MediaCommand]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedMediaCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsCommand(value: MediaCommand => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVolume(value: Volume): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiveSeekableRange(value: LiveSeekableRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSeekableRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveSeekableRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveSeekableRange")(js.undefined)
        ret
    }
  }
  
}

