package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.TimeRanges
import typingsSlinky.playable.adaptersTypesMod.IAdapterDebugInfo
import typingsSlinky.playable.adaptersTypesMod.IPlaybackAdapterClass
import typingsSlinky.playable.configMod.IPlayerConfig
import typingsSlinky.playable.engineStateMod.EngineState
import typingsSlinky.playable.eventEmitterTypesMod.IEventEmitter
import typingsSlinky.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typingsSlinky.playable.mediaStreamMod.MediaStreamType
import typingsSlinky.playable.playableStrings.html5video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playbackEngineTypesMod {
  
  @js.native
  sealed trait CrossOriginValue extends StObject
  @JSImport("playable/dist/src/modules/playback-engine/types", "CrossOriginValue")
  @js.native
  object CrossOriginValue extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CrossOriginValue with String] = js.native
    
    @js.native
    sealed trait ANONYMUS extends CrossOriginValue
    /* "anonymous" */ val ANONYMUS: typingsSlinky.playable.playbackEngineTypesMod.CrossOriginValue.ANONYMUS with String = js.native
    
    @js.native
    sealed trait CREDENTIALS extends CrossOriginValue
    /* "use-credentials" */ val CREDENTIALS: typingsSlinky.playable.playbackEngineTypesMod.CrossOriginValue.CREDENTIALS with String = js.native
  }
  
  @js.native
  sealed trait PreloadType extends StObject
  @JSImport("playable/dist/src/modules/playback-engine/types", "PreloadType")
  @js.native
  object PreloadType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PreloadType with String] = js.native
    
    @js.native
    sealed trait AUTO extends PreloadType
    /* "auto" */ val AUTO: typingsSlinky.playable.playbackEngineTypesMod.PreloadType.AUTO with String = js.native
    
    @js.native
    sealed trait METADATA extends PreloadType
    /* "metadata" */ val METADATA: typingsSlinky.playable.playbackEngineTypesMod.PreloadType.METADATA with String = js.native
    
    @js.native
    sealed trait NONE extends PreloadType
    /* "none" */ val NONE: typingsSlinky.playable.playbackEngineTypesMod.PreloadType.NONE with String = js.native
  }
  
  @js.native
  trait IEngineDebugInfo extends StObject {
    
    var currentTime: Double = js.native
    
    var duration: Double = js.native
    
    var output: String = js.native
  }
  object IEngineDebugInfo {
    
    @scala.inline
    def apply(currentTime: Double, duration: Double, output: String): IEngineDebugInfo = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEngineDebugInfo]
    }
    
    @scala.inline
    implicit class IEngineDebugInfoMutableBuilder[Self <: IEngineDebugInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILiveStateEngineDependencies extends StObject {
    
    var engine: IPlaybackEngine = js.native
    
    var eventEmitter: IEventEmitter = js.native
  }
  object ILiveStateEngineDependencies {
    
    @scala.inline
    def apply(engine: IPlaybackEngine, eventEmitter: IEventEmitter): ILiveStateEngineDependencies = {
      val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveStateEngineDependencies]
    }
    
    @scala.inline
    implicit class ILiveStateEngineDependenciesMutableBuilder[Self <: ILiveStateEngineDependencies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @property viewDimensions - Current size of view port provided by engine (right now - actual size of video tag)
    * @property currentTime - Current time of playback
    * @property duration - Duration of current video
    * @property loadingStateTimestamps - Object with time spend for different initial phases
    * @property output - Type of the output (html5video, chromecast etc.);
    */
  @js.native
  trait INativeDebugInfo extends IAdapterDebugInfo {
    
    var currentTime: Double = js.native
    
    var duration: Double = js.native
    
    var loadingStateTimestamps: js.Object = js.native
    
    var output: html5video = js.native
    
    var viewDimensions: js.Object = js.native
  }
  object INativeDebugInfo {
    
    @scala.inline
    def apply(
      bitrates: js.Array[String],
      bwEstimate: Double,
      currentBitrate: String,
      currentTime: Double,
      deliveryPriority: MediaStreamDeliveryPriority,
      duration: Double,
      loadingStateTimestamps: js.Object,
      nearestBufferSegInfo: js.Object,
      output: html5video,
      overallBufferLength: Double,
      `type`: MediaStreamType,
      url: String,
      viewDimensions: js.Object
    ): INativeDebugInfo = {
      val __obj = js.Dynamic.literal(bitrates = bitrates.asInstanceOf[js.Any], bwEstimate = bwEstimate.asInstanceOf[js.Any], currentBitrate = currentBitrate.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], deliveryPriority = deliveryPriority.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loadingStateTimestamps = loadingStateTimestamps.asInstanceOf[js.Any], nearestBufferSegInfo = nearestBufferSegInfo.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], overallBufferLength = overallBufferLength.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], viewDimensions = viewDimensions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[INativeDebugInfo]
    }
    
    @scala.inline
    implicit class INativeDebugInfoMutableBuilder[Self <: INativeDebugInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingStateTimestamps(value: js.Object): Self = StObject.set(x, "loadingStateTimestamps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: html5video): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDimensions(value: js.Object): Self = StObject.set(x, "viewDimensions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IParsedPlayableSource extends StObject {
    
    var `type`: MediaStreamType = js.native
    
    var url: String = js.native
  }
  object IParsedPlayableSource {
    
    @scala.inline
    def apply(`type`: MediaStreamType, url: String): IParsedPlayableSource = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParsedPlayableSource]
    }
    
    @scala.inline
    implicit class IParsedPlayableSourceMutableBuilder[Self <: IParsedPlayableSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPlayableSource extends StObject {
    
    var mimeType: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[MediaStreamType] = js.native
    
    var url: String = js.native
  }
  object IPlayableSource {
    
    @scala.inline
    def apply(url: String): IPlayableSource = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlayableSource]
    }
    
    @scala.inline
    implicit class IPlayableSourceMutableBuilder[Self <: IPlayableSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setType(value: MediaStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPlaybackEngine extends StObject {
    
    def changeOutput(chromecastOutput: IVideoOutput): Unit = js.native
    def changeOutput(chromecastOutput: IVideoOutput, callback: js.Function): Unit = js.native
    
    def decreaseVolume(value: Double): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getAutoplay(): Boolean = js.native
    
    def getBuffered(): TimeRanges = js.native
    
    def getCrossOrigin(): CrossOriginValue = js.native
    
    def getCurrentState(): EngineState = js.native
    
    def getCurrentTime(): Double = js.native
    
    def getDebugInfo(): IEngineDebugInfo = js.native
    
    def getDuration(): Double = js.native
    
    def getElement(): HTMLVideoElement | Null = js.native
    
    def getLoop(): Boolean = js.native
    
    def getPlaybackRate(): Double = js.native
    
    def getPlaysinline(): Boolean = js.native
    
    def getPreload(): String = js.native
    
    def getSrc(): PlayableMediaSource = js.native
    
    def getVideoHeight(): Double = js.native
    
    def getVideoWidth(): Double = js.native
    
    def getVolume(): Double = js.native
    
    def increaseVolume(value: Double): Unit = js.native
    
    var isAutoPlayActive: Boolean = js.native
    
    var isDynamicContent: Boolean = js.native
    
    var isDynamicContentEnded: Boolean = js.native
    
    var isEnded: Boolean = js.native
    
    var isMetadataLoaded: Boolean = js.native
    
    var isMuted: Boolean = js.native
    
    var isPaused: Boolean = js.native
    
    var isPreloadActive: Boolean = js.native
    
    var isSeekAvailable: Boolean = js.native
    
    var isSyncWithLive: Boolean = js.native
    
    def pause(): Unit = js.native
    
    def play(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resetOutput(): Unit = js.native
    
    def seekBackward(sec: Double): Unit = js.native
    
    def seekForward(sec: Double): Unit = js.native
    
    def seekTo(time: Double): Unit = js.native
    
    def setAutoplay(isAutoplay: Boolean): Unit = js.native
    
    def setCrossOrigin(): Unit = js.native
    def setCrossOrigin(crossOrigin: CrossOriginValue): Unit = js.native
    
    def setLoop(isLoop: Boolean): Unit = js.native
    
    def setMute(isMuted: Boolean): Unit = js.native
    
    def setPlaybackRate(rate: Double): Unit = js.native
    
    def setPlaysinline(isPlaysinline: Boolean): Unit = js.native
    
    def setPreload(preload: PreloadType): Unit = js.native
    
    def setSrc(src: PlayableMediaSource): Unit = js.native
    def setSrc(src: PlayableMediaSource, callback: js.Function): Unit = js.native
    
    def setVolume(volume: Double): Unit = js.native
    
    def syncWithLive(): Unit = js.native
    
    def togglePlayback(): Unit = js.native
  }
  
  @js.native
  trait IPlaybackEngineAPI extends StObject {
    
    var decreaseVolume: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var getAutoplay: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var getCrossOrigin: js.UndefOr[js.Function0[CrossOriginValue]] = js.native
    
    var getCurrentTime: js.UndefOr[js.Function0[Double]] = js.native
    
    var getDebugInfo: js.UndefOr[js.Function0[IEngineDebugInfo]] = js.native
    
    var getDuration: js.UndefOr[js.Function0[Double]] = js.native
    
    var getLoop: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var getPlaybackRate: js.UndefOr[js.Function0[Double]] = js.native
    
    var getPlaybackState: js.UndefOr[js.Function0[EngineState]] = js.native
    
    var getPlaysinline: js.UndefOr[js.Function0[Boolean]] = js.native
    
    var getPreload: js.UndefOr[js.Function0[String]] = js.native
    
    var getSrc: js.UndefOr[js.Function0[PlayableMediaSource]] = js.native
    
    var getVideoHeight: js.UndefOr[js.Function0[Double]] = js.native
    
    var getVideoWidth: js.UndefOr[js.Function0[Double]] = js.native
    
    var getVolume: js.UndefOr[js.Function0[Double]] = js.native
    
    var increaseVolume: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var isEnded: js.UndefOr[Boolean] = js.native
    
    var isMuted: js.UndefOr[Boolean] = js.native
    
    var isPaused: js.UndefOr[Boolean] = js.native
    
    var mute: js.UndefOr[js.Function0[Unit]] = js.native
    
    var pause: js.UndefOr[js.Function0[Unit]] = js.native
    
    var play: js.UndefOr[js.Function0[Unit]] = js.native
    
    var resetPlayback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var seekBackward: js.UndefOr[js.Function1[/* sec */ Double, Unit]] = js.native
    
    var seekForward: js.UndefOr[js.Function1[/* sec */ Double, Unit]] = js.native
    
    var seekTo: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.native
    
    var setAutoplay: js.UndefOr[js.Function1[/* isAutoplay */ Boolean, Unit]] = js.native
    
    var setCrossOrigin: js.UndefOr[js.Function1[/* crossOrigin */ js.UndefOr[CrossOriginValue], Unit]] = js.native
    
    var setLoop: js.UndefOr[js.Function1[/* isLoop */ Boolean, Unit]] = js.native
    
    var setPlaybackRate: js.UndefOr[js.Function1[/* rate */ Double, Unit]] = js.native
    
    var setPlaysinline: js.UndefOr[js.Function1[/* isPlaysinline */ Boolean, Unit]] = js.native
    
    var setPreload: js.UndefOr[js.Function1[/* preload */ PreloadType, Unit]] = js.native
    
    var setSrc: js.UndefOr[
        js.Function2[/* src */ PlayableMediaSource, /* callback */ js.UndefOr[js.Function], Unit]
      ] = js.native
    
    var setVolume: js.UndefOr[js.Function1[/* volume */ Double, Unit]] = js.native
    
    var syncWithLive: js.UndefOr[js.Function0[Unit]] = js.native
    
    var togglePlayback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var unmute: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IPlaybackEngineAPI {
    
    @scala.inline
    def apply(): IPlaybackEngineAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlaybackEngineAPI]
    }
    
    @scala.inline
    implicit class IPlaybackEngineAPIMutableBuilder[Self <: IPlaybackEngineAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecreaseVolume(value: /* value */ Double => Unit): Self = StObject.set(x, "decreaseVolume", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecreaseVolumeUndefined: Self = StObject.set(x, "decreaseVolume", js.undefined)
      
      @scala.inline
      def setGetAutoplay(value: () => Boolean): Self = StObject.set(x, "getAutoplay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAutoplayUndefined: Self = StObject.set(x, "getAutoplay", js.undefined)
      
      @scala.inline
      def setGetCrossOrigin(value: () => CrossOriginValue): Self = StObject.set(x, "getCrossOrigin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCrossOriginUndefined: Self = StObject.set(x, "getCrossOrigin", js.undefined)
      
      @scala.inline
      def setGetCurrentTime(value: () => Double): Self = StObject.set(x, "getCurrentTime", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentTimeUndefined: Self = StObject.set(x, "getCurrentTime", js.undefined)
      
      @scala.inline
      def setGetDebugInfo(value: () => IEngineDebugInfo): Self = StObject.set(x, "getDebugInfo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDebugInfoUndefined: Self = StObject.set(x, "getDebugInfo", js.undefined)
      
      @scala.inline
      def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
      
      @scala.inline
      def setGetLoop(value: () => Boolean): Self = StObject.set(x, "getLoop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLoopUndefined: Self = StObject.set(x, "getLoop", js.undefined)
      
      @scala.inline
      def setGetPlaybackRate(value: () => Double): Self = StObject.set(x, "getPlaybackRate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPlaybackRateUndefined: Self = StObject.set(x, "getPlaybackRate", js.undefined)
      
      @scala.inline
      def setGetPlaybackState(value: () => EngineState): Self = StObject.set(x, "getPlaybackState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPlaybackStateUndefined: Self = StObject.set(x, "getPlaybackState", js.undefined)
      
      @scala.inline
      def setGetPlaysinline(value: () => Boolean): Self = StObject.set(x, "getPlaysinline", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPlaysinlineUndefined: Self = StObject.set(x, "getPlaysinline", js.undefined)
      
      @scala.inline
      def setGetPreload(value: () => String): Self = StObject.set(x, "getPreload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreloadUndefined: Self = StObject.set(x, "getPreload", js.undefined)
      
      @scala.inline
      def setGetSrc(value: () => PlayableMediaSource): Self = StObject.set(x, "getSrc", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSrcUndefined: Self = StObject.set(x, "getSrc", js.undefined)
      
      @scala.inline
      def setGetVideoHeight(value: () => Double): Self = StObject.set(x, "getVideoHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVideoHeightUndefined: Self = StObject.set(x, "getVideoHeight", js.undefined)
      
      @scala.inline
      def setGetVideoWidth(value: () => Double): Self = StObject.set(x, "getVideoWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVideoWidthUndefined: Self = StObject.set(x, "getVideoWidth", js.undefined)
      
      @scala.inline
      def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVolumeUndefined: Self = StObject.set(x, "getVolume", js.undefined)
      
      @scala.inline
      def setIncreaseVolume(value: /* value */ Double => Unit): Self = StObject.set(x, "increaseVolume", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncreaseVolumeUndefined: Self = StObject.set(x, "increaseVolume", js.undefined)
      
      @scala.inline
      def setIsEnded(value: Boolean): Self = StObject.set(x, "isEnded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEndedUndefined: Self = StObject.set(x, "isEnded", js.undefined)
      
      @scala.inline
      def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMutedUndefined: Self = StObject.set(x, "isMuted", js.undefined)
      
      @scala.inline
      def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
      
      @scala.inline
      def setMute(value: () => Unit): Self = StObject.set(x, "mute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setResetPlayback(value: () => Unit): Self = StObject.set(x, "resetPlayback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetPlaybackUndefined: Self = StObject.set(x, "resetPlayback", js.undefined)
      
      @scala.inline
      def setSeekBackward(value: /* sec */ Double => Unit): Self = StObject.set(x, "seekBackward", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSeekBackwardUndefined: Self = StObject.set(x, "seekBackward", js.undefined)
      
      @scala.inline
      def setSeekForward(value: /* sec */ Double => Unit): Self = StObject.set(x, "seekForward", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSeekForwardUndefined: Self = StObject.set(x, "seekForward", js.undefined)
      
      @scala.inline
      def setSeekTo(value: /* time */ Double => Unit): Self = StObject.set(x, "seekTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSeekToUndefined: Self = StObject.set(x, "seekTo", js.undefined)
      
      @scala.inline
      def setSetAutoplay(value: /* isAutoplay */ Boolean => Unit): Self = StObject.set(x, "setAutoplay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAutoplayUndefined: Self = StObject.set(x, "setAutoplay", js.undefined)
      
      @scala.inline
      def setSetCrossOrigin(value: /* crossOrigin */ js.UndefOr[CrossOriginValue] => Unit): Self = StObject.set(x, "setCrossOrigin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCrossOriginUndefined: Self = StObject.set(x, "setCrossOrigin", js.undefined)
      
      @scala.inline
      def setSetLoop(value: /* isLoop */ Boolean => Unit): Self = StObject.set(x, "setLoop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLoopUndefined: Self = StObject.set(x, "setLoop", js.undefined)
      
      @scala.inline
      def setSetPlaybackRate(value: /* rate */ Double => Unit): Self = StObject.set(x, "setPlaybackRate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPlaybackRateUndefined: Self = StObject.set(x, "setPlaybackRate", js.undefined)
      
      @scala.inline
      def setSetPlaysinline(value: /* isPlaysinline */ Boolean => Unit): Self = StObject.set(x, "setPlaysinline", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPlaysinlineUndefined: Self = StObject.set(x, "setPlaysinline", js.undefined)
      
      @scala.inline
      def setSetPreload(value: /* preload */ PreloadType => Unit): Self = StObject.set(x, "setPreload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPreloadUndefined: Self = StObject.set(x, "setPreload", js.undefined)
      
      @scala.inline
      def setSetSrc(value: (/* src */ PlayableMediaSource, /* callback */ js.UndefOr[js.Function]) => Unit): Self = StObject.set(x, "setSrc", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSrcUndefined: Self = StObject.set(x, "setSrc", js.undefined)
      
      @scala.inline
      def setSetVolume(value: /* volume */ Double => Unit): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVolumeUndefined: Self = StObject.set(x, "setVolume", js.undefined)
      
      @scala.inline
      def setSyncWithLive(value: () => Unit): Self = StObject.set(x, "syncWithLive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSyncWithLiveUndefined: Self = StObject.set(x, "syncWithLive", js.undefined)
      
      @scala.inline
      def setTogglePlayback(value: () => Unit): Self = StObject.set(x, "togglePlayback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTogglePlaybackUndefined: Self = StObject.set(x, "togglePlayback", js.undefined)
      
      @scala.inline
      def setUnmute(value: () => Unit): Self = StObject.set(x, "unmute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnmuteUndefined: Self = StObject.set(x, "unmute", js.undefined)
    }
  }
  
  @js.native
  trait IPlaybackEngineDependencies extends StObject {
    
    var availablePlaybackAdapters: js.Array[IPlaybackAdapterClass] = js.native
    
    var config: IPlayerConfig = js.native
    
    var eventEmitter: IEventEmitter = js.native
    
    var nativeOutput: IVideoOutput = js.native
  }
  object IPlaybackEngineDependencies {
    
    @scala.inline
    def apply(
      availablePlaybackAdapters: js.Array[IPlaybackAdapterClass],
      config: IPlayerConfig,
      eventEmitter: IEventEmitter,
      nativeOutput: IVideoOutput
    ): IPlaybackEngineDependencies = {
      val __obj = js.Dynamic.literal(availablePlaybackAdapters = availablePlaybackAdapters.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], nativeOutput = nativeOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlaybackEngineDependencies]
    }
    
    @scala.inline
    implicit class IPlaybackEngineDependenciesMutableBuilder[Self <: IPlaybackEngineDependencies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailablePlaybackAdapters(value: js.Array[IPlaybackAdapterClass]): Self = StObject.set(x, "availablePlaybackAdapters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailablePlaybackAdaptersVarargs(value: IPlaybackAdapterClass*): Self = StObject.set(x, "availablePlaybackAdapters", js.Array(value :_*))
      
      @scala.inline
      def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeOutput(value: IVideoOutput): Self = StObject.set(x, "nativeOutput", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IVideoOutput extends StObject {
    
    var autoplay: Boolean = js.native
    
    var buffered: TimeRanges = js.native
    
    var crossOrigin: CrossOriginValue = js.native
    
    var currentState: EngineState = js.native
    
    var currentTime: Double = js.native
    
    var duration: Double = js.native
    
    def getDebugInfo(): IEngineDebugInfo = js.native
    
    def getElement(): HTMLVideoElement | Null = js.native
    
    var isAutoPlayActive: Boolean = js.native
    
    var isAutoplay: Boolean = js.native
    
    var isDynamicContent: Boolean = js.native
    
    var isDynamicContentEnded: js.Any = js.native
    
    var isEnded: Boolean = js.native
    
    var isInline: Boolean = js.native
    
    var isLoop: Boolean = js.native
    
    var isMetadataLoaded: Boolean = js.native
    
    var isMuted: Boolean = js.native
    
    var isPaused: Boolean = js.native
    
    var isPreloadActive: Boolean = js.native
    
    var isSeekAvailable: Boolean = js.native
    
    var isSyncWithLive: Boolean = js.native
    
    def pause(): Unit = js.native
    
    def play(): Unit = js.native
    
    var playbackRate: Double = js.native
    
    var preload: PreloadType = js.native
    
    def setAutoplay(isAutoplay: Boolean): Unit = js.native
    
    def setCrossOrigin(): Unit = js.native
    def setCrossOrigin(crossOrigin: CrossOriginValue): Unit = js.native
    
    def setCurrentTime(time: Double): Unit = js.native
    
    def setInline(isPlaysinline: Boolean): Unit = js.native
    
    def setLoop(mute: Boolean): Unit = js.native
    
    def setMute(mute: Boolean): Unit = js.native
    
    def setPlaybackRate(rate: Double): Unit = js.native
    
    def setPreload(preload: PreloadType): Unit = js.native
    
    def setSrc(): Unit = js.native
    def setSrc(src: js.UndefOr[PlayableMediaSource], callback: js.Function): Unit = js.native
    def setSrc(src: PlayableMediaSource): Unit = js.native
    
    def setVolume(volume: Double): Unit = js.native
    
    var src: PlayableMediaSource = js.native
    
    def syncWithLive(): Unit = js.native
    
    var videoHeight: js.UndefOr[Double] = js.native
    
    var videoWidth: js.UndefOr[Double] = js.native
    
    var volume: Double = js.native
  }
  
  type PlayableMediaSource = String | IPlayableSource | (js.Array[String | IPlayableSource])
}
