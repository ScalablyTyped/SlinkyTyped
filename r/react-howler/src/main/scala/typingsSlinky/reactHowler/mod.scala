package typingsSlinky.reactHowler

import typingsSlinky.howler.mod.Howl
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-howler", JSImport.Default)
  @js.native
  class default () extends ReactHowler
  
  @js.native
  sealed trait HOWLER_STATE extends StObject
  @JSImport("react-howler", "HOWLER_STATE")
  @js.native
  object HOWLER_STATE extends StObject {
    
    @js.native
    sealed trait LOADED extends HOWLER_STATE
    
    @js.native
    sealed trait LOADING extends HOWLER_STATE
    
    @js.native
    sealed trait UNLOADED extends HOWLER_STATE
  }
  
  @js.native
  trait Props extends StObject {
    
    var format: js.UndefOr[js.Array[String]] = js.native
    
    var html5: js.UndefOr[Boolean] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var mute: js.UndefOr[Boolean] = js.native
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLoadError: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.native
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPlay: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.native
    
    var onStop: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.native
    
    var onVolume: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.native
    
    var playing: js.UndefOr[Boolean] = js.native
    
    var preload: js.UndefOr[Boolean] = js.native
    
    var src: String | js.Array[String] = js.native
    
    var volume: js.UndefOr[Double] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(src: String | js.Array[String]): Props = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      @scala.inline
      def setHtml5(value: Boolean): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml5Undefined: Self = StObject.set(x, "html5", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      @scala.inline
      def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadError(value: /* id */ Double => Unit): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: /* id */ Double => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnStop(value: /* id */ Double => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setOnVolume(value: /* id */ Double => Unit): Self = StObject.set(x, "onVolume", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeUndefined: Self = StObject.set(x, "onVolume", js.undefined)
      
      @scala.inline
      def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
      
      @scala.inline
      def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  @js.native
  trait ReactHowler
    extends Component[Props, js.Object, js.Any] {
    
    def duration(): Double = js.native
    def duration(id: Double): Double = js.native
    
    var howler: Howl = js.native
    
    def howlerState(): HOWLER_STATE = js.native
    
    def seek(): Double = js.native
    def seek(time: Double): Double = js.native
    
    def stop(): Unit = js.native
    def stop(id: Double): Unit = js.native
  }
}
