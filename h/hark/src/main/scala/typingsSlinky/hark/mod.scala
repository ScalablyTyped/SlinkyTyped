package typingsSlinky.hark

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.hark.harkStrings.speaking
import typingsSlinky.hark.harkStrings.state_change
import typingsSlinky.hark.harkStrings.stopped_speaking
import typingsSlinky.hark.harkStrings.volume_change
import typingsSlinky.std.AudioContextState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hark", JSImport.Namespace)
  @js.native
  def apply(stream: MediaStream): Harker = js.native
  @JSImport("hark", JSImport.Namespace)
  @js.native
  def apply(stream: MediaStream, option: Option): Harker = js.native
  @JSImport("hark", JSImport.Namespace)
  @js.native
  def apply(stream: HTMLAudioElement): Harker = js.native
  @JSImport("hark", JSImport.Namespace)
  @js.native
  def apply(stream: HTMLAudioElement, option: Option): Harker = js.native
  @JSImport("hark", JSImport.Namespace)
  @js.native
  def apply(stream: HTMLVideoElement): Harker = js.native
  @JSImport("hark", JSImport.Namespace)
  @js.native
  def apply(stream: HTMLVideoElement, option: Option): Harker = js.native
  
  @js.native
  trait Harker extends StObject {
    
    @JSName("on")
    def on_speaking(event: speaking, listener: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_statechange(event: state_change, listener: js.Function1[/* state */ AudioContextState, Unit]): Unit = js.native
    @JSName("on")
    def on_stoppedspeaking(event: stopped_speaking, listener: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_volumechange(
      event: volume_change,
      listener: js.Function2[/* currentVolume */ Double, /* threshold */ Double, Unit]
    ): Unit = js.native
    
    def resume(): js.Promise[Unit] = js.native
    
    def setInterval(i: Double): Unit = js.native
    
    def setThreshold(t: Double): Unit = js.native
    
    var speaking: Boolean = js.native
    
    var speakingHistory: js.Array[Double] = js.native
    
    val state: AudioContextState = js.native
    
    def stop(): Unit = js.native
    
    def suspend(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Option extends StObject {
    
    var audioContext: js.UndefOr[AudioContext] = js.native
    
    var history: js.UndefOr[Double] = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var play: js.UndefOr[Boolean] = js.native
    
    var smoothing: js.UndefOr[Double] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioContextUndefined: Self = StObject.set(x, "audioContext", js.undefined)
      
      @scala.inline
      def setHistory(value: Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setSmoothing(value: Double): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
