package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.soundMod.Sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Audio/weightedsound", JSImport.Namespace)
@js.native
object weightedsoundMod extends js.Object {
  
  @js.native
  class WeightedSound protected () extends js.Object {
    /**
      * Creates a new WeightedSound from the list of sounds given.
      * @param loop When true a Sound will be selected and played when the current playing Sound completes.
      * @param sounds Array of Sounds that will be selected from.
      * @param weights Array of number values for selection weights; length must equal sounds, values will be normalized to 1
      */
    def this(loop: Boolean, sounds: js.Array[Sound], weights: js.Array[Double]) = this()
    
    var _coneInnerAngle: js.Any = js.native
    
    var _coneOuterAngle: js.Any = js.native
    
    var _currentIndex: js.Any = js.native
    
    var _onended: js.Any = js.native
    
    var _sounds: js.Any = js.native
    
    var _volume: js.Any = js.native
    
    var _weights: js.Any = js.native
    
    /**
      * The size of cone in degrees for a directional sound in which there will be no attenuation.
      */
    def directionalConeInnerAngle: Double = js.native
    /**
      * The size of cone in degress for a directional sound in which there will be no attenuation.
      */
    def directionalConeInnerAngle_=(value: Double): Unit = js.native
    
    /**
      * Size of cone in degrees for a directional sound outside of which there will be no sound.
      * Listener angles between innerAngle and outerAngle will falloff linearly.
      */
    def directionalConeOuterAngle: Double = js.native
    /**
      * Size of cone in degrees for a directional sound outside of which there will be no sound.
      * Listener angles between innerAngle and outerAngle will falloff linearly.
      */
    def directionalConeOuterAngle_=(value: Double): Unit = js.native
    
    /** A Sound is currently paused. */
    var isPaused: Boolean = js.native
    
    /** A Sound is currently playing. */
    var isPlaying: Boolean = js.native
    
    /** When true a Sound will be selected and played when the current playing Sound completes. */
    var loop: Boolean = js.native
    
    /**
      * Suspend playback
      */
    def pause(): Unit = js.native
    
    /**
      * Start playback.
      * @param startOffset Position the clip head at a specific time in seconds.
      */
    def play(): Unit = js.native
    def play(startOffset: Double): Unit = js.native
    
    /**
      * Stop playback
      */
    def stop(): Unit = js.native
    
    /**
      * Playback volume.
      */
    def volume: Double = js.native
    /**
      * Playback volume.
      */
    def volume_=(value: Double): Unit = js.native
  }
}
