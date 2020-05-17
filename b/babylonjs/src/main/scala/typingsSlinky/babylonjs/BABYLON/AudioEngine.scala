package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioEngine extends IAudioEngine {
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

object AudioEngine {
  @scala.inline
  def apply(
    WarnedWebAudioUnsupported: Boolean,
    _audioContext: js.Any,
    _audioContextInitialized: js.Any,
    _connectedAnalyser: js.Any,
    _displayMuteButton: js.Any,
    _hideMuteButton: js.Any,
    _hostElement: js.Any,
    _initializeAudioContext: js.Any,
    _moveButtonToTopLeft: js.Any,
    _muteButton: js.Any,
    _onResize: js.Any,
    _resumeAudioContext: js.Any,
    _triggerRunningState: js.Any,
    _triggerSuspendedState: js.Any,
    _tryToRun: js.Any,
    audioContext: () => Nullable[AudioContext],
    canUseWebAudio: Boolean,
    connectToAnalyser: Analyser => Unit,
    dispose: () => Unit,
    getGlobalVolume: () => Double,
    isMP3supported: Boolean,
    isOGGsupported: Boolean,
    lock: () => Unit,
    masterGain: GainNode,
    onAudioLockedObservable: Observable[AudioEngine],
    onAudioUnlockedObservable: Observable[AudioEngine],
    setGlobalVolume: Double => Unit,
    unlock: () => Unit,
    unlocked: Boolean,
    useCustomUnlockedButton: Boolean
  ): AudioEngine = {
    val __obj = js.Dynamic.literal(WarnedWebAudioUnsupported = WarnedWebAudioUnsupported.asInstanceOf[js.Any], _audioContext = _audioContext.asInstanceOf[js.Any], _audioContextInitialized = _audioContextInitialized.asInstanceOf[js.Any], _connectedAnalyser = _connectedAnalyser.asInstanceOf[js.Any], _displayMuteButton = _displayMuteButton.asInstanceOf[js.Any], _hideMuteButton = _hideMuteButton.asInstanceOf[js.Any], _hostElement = _hostElement.asInstanceOf[js.Any], _initializeAudioContext = _initializeAudioContext.asInstanceOf[js.Any], _moveButtonToTopLeft = _moveButtonToTopLeft.asInstanceOf[js.Any], _muteButton = _muteButton.asInstanceOf[js.Any], _onResize = _onResize.asInstanceOf[js.Any], _resumeAudioContext = _resumeAudioContext.asInstanceOf[js.Any], _triggerRunningState = _triggerRunningState.asInstanceOf[js.Any], _triggerSuspendedState = _triggerSuspendedState.asInstanceOf[js.Any], _tryToRun = _tryToRun.asInstanceOf[js.Any], audioContext = js.Any.fromFunction0(audioContext), canUseWebAudio = canUseWebAudio.asInstanceOf[js.Any], connectToAnalyser = js.Any.fromFunction1(connectToAnalyser), dispose = js.Any.fromFunction0(dispose), getGlobalVolume = js.Any.fromFunction0(getGlobalVolume), isMP3supported = isMP3supported.asInstanceOf[js.Any], isOGGsupported = isOGGsupported.asInstanceOf[js.Any], lock = js.Any.fromFunction0(lock), masterGain = masterGain.asInstanceOf[js.Any], onAudioLockedObservable = onAudioLockedObservable.asInstanceOf[js.Any], onAudioUnlockedObservable = onAudioUnlockedObservable.asInstanceOf[js.Any], setGlobalVolume = js.Any.fromFunction1(setGlobalVolume), unlock = js.Any.fromFunction0(unlock), unlocked = unlocked.asInstanceOf[js.Any], useCustomUnlockedButton = useCustomUnlockedButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEngine]
  }
  @scala.inline
  implicit class AudioEngineOps[Self <: AudioEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_audioContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_audioContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_audioContextInitialized(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_audioContextInitialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_connectedAnalyser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_connectedAnalyser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_displayMuteButton(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_displayMuteButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_hideMuteButton(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hideMuteButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_hostElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hostElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_initializeAudioContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initializeAudioContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_moveButtonToTopLeft(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_moveButtonToTopLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_muteButton(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_muteButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onResize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_resumeAudioContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_resumeAudioContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_triggerRunningState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_triggerRunningState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_triggerSuspendedState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_triggerSuspendedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_tryToRun(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tryToRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioContext(value: () => Nullable[AudioContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnectToAnalyser(value: Analyser => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectToAnalyser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetGlobalVolume(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGlobalVolume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetGlobalVolume(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGlobalVolume")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

