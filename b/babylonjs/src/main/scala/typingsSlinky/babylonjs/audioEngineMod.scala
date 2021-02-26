package typingsSlinky.babylonjs

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.babylonjs.iaudioengineMod.IAudioEngine
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioEngineMod {
  
  @JSImport("babylonjs/Audio/audioEngine", "AudioEngine")
  @js.native
  /**
    * Instantiates a new audio engine.
    *
    * There should be only one per page as some browsers restrict the number
    * of audio contexts you can create.
    * @param hostElement defines the host element where to display the mute icon if necessary
    */
  class AudioEngine () extends IAudioEngine {
    def this(hostElement: Nullable[HTMLElement]) = this()
    
    var _audioContext: js.Any = js.native
    
    var _audioContextInitialized: js.Any = js.native
    
    var _connectedAnalyser: js.Any = js.native
    
    var _displayMuteButton: js.Any = js.native
    
    var _hideMuteButton: js.Any = js.native
    
    var _hostElement: js.Any = js.native
    
    var _initializeAudioContext: js.Any = js.native
    
    var _moveButtonToTopLeft: js.Any = js.native
    
    var _muteButton: js.Any = js.native
    
    var _onResize: js.Any = js.native
    
    var _resumeAudioContext: js.Any = js.native
    
    var _triggerRunningState: js.Any = js.native
    
    var _triggerSuspendedState: js.Any = js.native
    
    var _tryToRun: js.Any = js.native
    
    /**
      * Gets the current AudioContext if available.
      */
    @JSName("audioContext")
    def audioContext_MAudioEngine: Nullable[AudioContext] = js.native
  }
}
