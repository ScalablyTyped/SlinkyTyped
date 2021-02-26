package typingsSlinky.gestalt.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.Node
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.gestalt.anon.Duration
import typingsSlinky.gestalt.anon.Fullscreen
import typingsSlinky.gestalt.anon.Loaded
import typingsSlinky.gestalt.anon.Src
import typingsSlinky.gestalt.anon.Time
import typingsSlinky.gestalt.anon.Volume
import typingsSlinky.gestalt.gestaltStrings.`scale-down`
import typingsSlinky.gestalt.gestaltStrings.`use-credentials`
import typingsSlinky.gestalt.gestaltStrings.anonymous
import typingsSlinky.gestalt.gestaltStrings.auto
import typingsSlinky.gestalt.gestaltStrings.contain
import typingsSlinky.gestalt.gestaltStrings.cover
import typingsSlinky.gestalt.gestaltStrings.fill
import typingsSlinky.gestalt.gestaltStrings.metadata
import typingsSlinky.gestalt.gestaltStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoProps extends StObject {
  
  var accessibilityMaximizeLabel: js.UndefOr[String] = js.native
  
  var accessibilityMinimizeLabel: js.UndefOr[String] = js.native
  
  var accessibilityMuteLabel: js.UndefOr[String] = js.native
  
  var accessibilityPauseLabel: js.UndefOr[String] = js.native
  
  var accessibilityPlayLabel: js.UndefOr[String] = js.native
  
  var accessibilityUnmuteLabel: js.UndefOr[String] = js.native
  
  var aspectRatio: Double = js.native
  
  var captions: String = js.native
  
  var children: js.UndefOr[Node] = js.native
  
  var controls: js.UndefOr[Boolean] = js.native
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var objectFit: js.UndefOr[fill | contain | cover | none | `scale-down`] = js.native
  
  var onDurationChange: js.UndefOr[js.Function1[/* args */ Duration, Unit]] = js.native
  
  var onEnded: js.UndefOr[AbstractEventHandler[SyntheticEvent[Event, HTMLVideoElement], js.Object]] = js.native
  
  var onFullscreenChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[Event, HTMLVideoElement], Fullscreen]] = js.native
  
  var onLoadedChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[Event, HTMLVideoElement], Loaded]] = js.native
  
  var onPause: js.UndefOr[AbstractEventHandler[SyntheticEvent[Event, HTMLDivElement], js.Object]] = js.native
  
  var onPlay: js.UndefOr[AbstractEventHandler[SyntheticEvent[Event, HTMLDivElement], js.Object]] = js.native
  
  var onPlayheadDown: js.UndefOr[AbstractEventHandler[SyntheticMouseEvent[HTMLDivElement], js.Object]] = js.native
  
  var onPlayheadUp: js.UndefOr[AbstractEventHandler[SyntheticMouseEvent[HTMLDivElement], js.Object]] = js.native
  
  var onReady: js.UndefOr[AbstractEventHandler[SyntheticEvent[Event, HTMLVideoElement], js.Object]] = js.native
  
  var onSeek: js.UndefOr[AbstractEventHandler[SyntheticEvent[Event, HTMLVideoElement], js.Object]] = js.native
  
  var onTimeChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[Event, HTMLVideoElement], Time]] = js.native
  
  var onVolumeChange: js.UndefOr[AbstractEventHandler[SyntheticEvent[Event, HTMLDivElement], Volume]] = js.native
  
  var playbackRate: js.UndefOr[Double] = js.native
  
  var playing: js.UndefOr[Boolean] = js.native
  
  var playsInline: js.UndefOr[Boolean] = js.native
  
  var poster: js.UndefOr[String] = js.native
  
  var preload: js.UndefOr[auto | metadata | none] = js.native
  
  var src: String | js.Array[Src] = js.native
  
  var volume: js.UndefOr[Double] = js.native
}
object VideoProps {
  
  @scala.inline
  def apply(aspectRatio: Double, captions: String, src: String | js.Array[Src]): VideoProps = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], captions = captions.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProps]
  }
  
  @scala.inline
  implicit class VideoPropsMutableBuilder[Self <: VideoProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityMaximizeLabel(value: String): Self = StObject.set(x, "accessibilityMaximizeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityMaximizeLabelUndefined: Self = StObject.set(x, "accessibilityMaximizeLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityMinimizeLabel(value: String): Self = StObject.set(x, "accessibilityMinimizeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityMinimizeLabelUndefined: Self = StObject.set(x, "accessibilityMinimizeLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityMuteLabel(value: String): Self = StObject.set(x, "accessibilityMuteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityMuteLabelUndefined: Self = StObject.set(x, "accessibilityMuteLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityPauseLabel(value: String): Self = StObject.set(x, "accessibilityPauseLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityPauseLabelUndefined: Self = StObject.set(x, "accessibilityPauseLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityPlayLabel(value: String): Self = StObject.set(x, "accessibilityPlayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityPlayLabelUndefined: Self = StObject.set(x, "accessibilityPlayLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityUnmuteLabel(value: String): Self = StObject.set(x, "accessibilityUnmuteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUnmuteLabelUndefined: Self = StObject.set(x, "accessibilityUnmuteLabel", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptions(value: String): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setObjectFit(value: fill | contain | cover | none | `scale-down`): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: /* args */ Duration => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEnded(
      value: /* arg */ js.Object with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLVideoElement]]) => Unit
    ): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnFullscreenChange(
      value: /* arg */ Fullscreen with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLVideoElement]]) => Unit
    ): Self = StObject.set(x, "onFullscreenChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFullscreenChangeUndefined: Self = StObject.set(x, "onFullscreenChange", js.undefined)
    
    @scala.inline
    def setOnLoadedChange(
      value: /* arg */ Loaded with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLVideoElement]]) => Unit
    ): Self = StObject.set(x, "onLoadedChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedChangeUndefined: Self = StObject.set(x, "onLoadedChange", js.undefined)
    
    @scala.inline
    def setOnPause(
      value: /* arg */ js.Object with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLDivElement]]) => Unit
    ): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(
      value: /* arg */ js.Object with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLDivElement]]) => Unit
    ): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlayheadDown(
      value: /* arg */ js.Object with typingsSlinky.gestalt.anon.Event[SyntheticMouseEvent[HTMLDivElement]] => Unit
    ): Self = StObject.set(x, "onPlayheadDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayheadDownUndefined: Self = StObject.set(x, "onPlayheadDown", js.undefined)
    
    @scala.inline
    def setOnPlayheadUp(
      value: /* arg */ js.Object with typingsSlinky.gestalt.anon.Event[SyntheticMouseEvent[HTMLDivElement]] => Unit
    ): Self = StObject.set(x, "onPlayheadUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayheadUpUndefined: Self = StObject.set(x, "onPlayheadUp", js.undefined)
    
    @scala.inline
    def setOnReady(
      value: /* arg */ js.Object with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLVideoElement]]) => Unit
    ): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    @scala.inline
    def setOnSeek(
      value: /* arg */ js.Object with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLVideoElement]]) => Unit
    ): Self = StObject.set(x, "onSeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
    
    @scala.inline
    def setOnTimeChange(
      value: /* arg */ Time with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLVideoElement]]) => Unit
    ): Self = StObject.set(x, "onTimeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeChangeUndefined: Self = StObject.set(x, "onTimeChange", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(
      value: /* arg */ Volume with (typingsSlinky.gestalt.anon.Event[SyntheticEvent[Event, HTMLDivElement]]) => Unit
    ): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
    
    @scala.inline
    def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
    
    @scala.inline
    def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    @scala.inline
    def setPreload(value: auto | metadata | none): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setSrc(value: String | js.Array[Src]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcVarargs(value: Src*): Self = StObject.set(x, "src", js.Array(value :_*))
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
