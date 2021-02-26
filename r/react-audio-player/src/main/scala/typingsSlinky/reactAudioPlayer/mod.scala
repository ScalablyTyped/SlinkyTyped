package typingsSlinky.reactAudioPlayer

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLAudioElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-audio-player", JSImport.Default)
  @js.native
  class default () extends ReactAudioPlayer
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings._empty
    - typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings.none
    - typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings.metadata
    - typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings.auto
  */
  trait Preload extends StObject
  object Preload {
    
    @scala.inline
    def _empty: typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings._empty = "".asInstanceOf[typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings._empty]
    
    @scala.inline
    def auto: typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings.auto = "auto".asInstanceOf[typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings.auto]
    
    @scala.inline
    def metadata: typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings.metadata = "metadata".asInstanceOf[typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings.metadata]
    
    @scala.inline
    def none: typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings.none = "none".asInstanceOf[typingsSlinky.reactAudioPlayer.reactAudioPlayerStrings.none]
  }
  
  @js.native
  trait ReactAudioPlayer
    extends Component[ReactAudioPlayerProps, js.Any, js.Any] {
    
    var audioEl: HTMLAudioElement = js.native
    
    def clearListenTrack(): Unit = js.native
    
    def setListenTrack(): Unit = js.native
    
    def updateVolume(volume: Double): Unit = js.native
  }
  
  @js.native
  trait ReactAudioPlayerProps extends StObject {
    
    var autoPlay: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var controls: js.UndefOr[Boolean] = js.native
    
    var controlsList: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var listenInterval: js.UndefOr[Double] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var muted: js.UndefOr[Boolean] = js.native
    
    var onAbort: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onCanPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onEnded: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onListen: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onLoadedMetadata: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onPause: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onPlay: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onSeeked: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var onVolumeChanged: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLAudioElement], Unit]] = js.native
    
    var preload: js.UndefOr[Preload] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var volume: js.UndefOr[Double] = js.native
  }
  object ReactAudioPlayerProps {
    
    @scala.inline
    def apply(): ReactAudioPlayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactAudioPlayerProps]
    }
    
    @scala.inline
    implicit class ReactAudioPlayerPropsMutableBuilder[Self <: ReactAudioPlayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsList(value: String): Self = StObject.set(x, "controlsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsListUndefined: Self = StObject.set(x, "controlsList", js.undefined)
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setListenInterval(value: Double): Self = StObject.set(x, "listenInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenIntervalUndefined: Self = StObject.set(x, "listenInterval", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setOnAbort(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnEnded(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnListen(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onListen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnListenUndefined: Self = StObject.set(x, "onListen", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnPause(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnVolumeChanged(value: /* event */ SyntheticEvent[Event, HTMLAudioElement] => Unit): Self = StObject.set(x, "onVolumeChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangedUndefined: Self = StObject.set(x, "onVolumeChanged", js.undefined)
      
      @scala.inline
      def setPreload(value: Preload): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
}
