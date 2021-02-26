package typingsSlinky.reactPlayer.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.mediastream.MediaStream
import typingsSlinky.reactPlayer.anon.Loaded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactPlayerProps
  extends /* otherProps */ StringDictionary[js.Any] {
  
  var config: js.UndefOr[Config] = js.native
  
  var controls: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[String | Double] = js.native
  
  var light: js.UndefOr[Boolean | String] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var muted: js.UndefOr[Boolean] = js.native
  
  var onBuffer: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onBufferEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onDisablePIP: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onDuration: js.UndefOr[js.Function1[/* duration */ Double, Unit]] = js.native
  
  var onEnablePIP: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onEnded: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onError: js.UndefOr[
    js.Function4[
      /* error */ js.Any, 
      /* data */ js.UndefOr[js.Any], 
      /* hlsInstance */ js.UndefOr[js.Any], 
      /* hlsGlobal */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var onPause: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onProgress: js.UndefOr[js.Function1[/* state */ Loaded, Unit]] = js.native
  
  var onReady: js.UndefOr[js.Function1[/* player */ ReactPlayer, Unit]] = js.native
  
  var onSeek: js.UndefOr[js.Function1[/* seconds */ Double, Unit]] = js.native
  
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var pip: js.UndefOr[Boolean] = js.native
  
  var playbackRate: js.UndefOr[Double] = js.native
  
  var playing: js.UndefOr[Boolean] = js.native
  
  var playsinline: js.UndefOr[Boolean] = js.native
  
  var progressInterval: js.UndefOr[Double] = js.native
  
  var stopOnUnmount: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var url: js.UndefOr[String | (js.Array[SourceProps | String]) | MediaStream] = js.native
  
  var volume: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
  
  var wrapper: js.UndefOr[js.Any] = js.native
}
object ReactPlayerProps {
  
  @scala.inline
  def apply(): ReactPlayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactPlayerProps]
  }
  
  @scala.inline
  implicit class ReactPlayerPropsMutableBuilder[Self <: ReactPlayerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLight(value: Boolean | String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setOnBuffer(value: () => Unit): Self = StObject.set(x, "onBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBufferEnd(value: () => Unit): Self = StObject.set(x, "onBufferEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBufferEndUndefined: Self = StObject.set(x, "onBufferEnd", js.undefined)
    
    @scala.inline
    def setOnBufferUndefined: Self = StObject.set(x, "onBuffer", js.undefined)
    
    @scala.inline
    def setOnDisablePIP(value: () => Unit): Self = StObject.set(x, "onDisablePIP", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDisablePIPUndefined: Self = StObject.set(x, "onDisablePIP", js.undefined)
    
    @scala.inline
    def setOnDuration(value: /* duration */ Double => Unit): Self = StObject.set(x, "onDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationUndefined: Self = StObject.set(x, "onDuration", js.undefined)
    
    @scala.inline
    def setOnEnablePIP(value: () => Unit): Self = StObject.set(x, "onEnablePIP", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEnablePIPUndefined: Self = StObject.set(x, "onEnablePIP", js.undefined)
    
    @scala.inline
    def setOnEnded(value: () => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(
      value: (/* error */ js.Any, /* data */ js.UndefOr[js.Any], /* hlsInstance */ js.UndefOr[js.Any], /* hlsGlobal */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: () => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* state */ Loaded => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnReady(value: /* player */ ReactPlayer => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnSeek(value: /* seconds */ Double => Unit): Self = StObject.set(x, "onSeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
    
    @scala.inline
    def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    @scala.inline
    def setPip(value: Boolean): Self = StObject.set(x, "pip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipUndefined: Self = StObject.set(x, "pip", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
    
    @scala.inline
    def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
    
    @scala.inline
    def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
    
    @scala.inline
    def setProgressInterval(value: Double): Self = StObject.set(x, "progressInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressIntervalUndefined: Self = StObject.set(x, "progressInterval", js.undefined)
    
    @scala.inline
    def setStopOnUnmount(value: Boolean): Self = StObject.set(x, "stopOnUnmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOnUnmountUndefined: Self = StObject.set(x, "stopOnUnmount", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUrl(value: String | (js.Array[SourceProps | String]) | MediaStream): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlMediaStream(value: MediaStream): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUrlVarargs(value: (SourceProps | String)*): Self = StObject.set(x, "url", js.Array(value :_*))
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrapper(value: js.Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
