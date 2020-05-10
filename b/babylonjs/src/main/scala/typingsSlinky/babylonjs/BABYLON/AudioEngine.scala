package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AudioEngine")
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
  /**
    * Connect the audio engine to an audio analyser allowing some amazing
    * synchornization between the sounds/music and your visualization (VuMeter for instance).
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  def connectToAnalyser(analyser: Analyser): Unit = js.native
  /**
    * Gets the global volume sets on the master gain.
    * @returns the global volume if set or -1 otherwise
    */
  def getGlobalVolume(): Double = js.native
  /**
    * Sets the global volume of your experience (sets on the master gain).
    * @param newVolume Defines the new global volume of the application
    */
  def setGlobalVolume(newVolume: Double): Unit = js.native
}

