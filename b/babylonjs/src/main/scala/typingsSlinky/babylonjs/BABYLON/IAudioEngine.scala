package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAudioEngine extends IDisposable {
  /**
    * Defines if Babylon should emit a warning if WebAudio is not supported.
    * @ignoreNaming
    */
  var WarnedWebAudioUnsupported: Boolean = js.native
  /**
    * Gets the current AudioContext if available.
    */
  val audioContext: Nullable[AudioContext] = js.native
  /**
    * Gets whether the current host supports Web Audio and thus could create AudioContexts.
    */
  val canUseWebAudio: Boolean = js.native
  /**
    * Gets whether or not mp3 are supported by your browser.
    */
  val isMP3supported: Boolean = js.native
  /**
    * Gets whether or not ogg are supported by your browser.
    */
  val isOGGsupported: Boolean = js.native
  /**
    * The master gain node defines the global audio volume of your audio engine.
    */
  val masterGain: GainNode = js.native
  /**
    * Event raised when audio has been locked on the browser.
    */
  var onAudioLockedObservable: Observable[AudioEngine] = js.native
  /**
    * Event raised when audio has been unlocked on the browser.
    */
  var onAudioUnlockedObservable: Observable[AudioEngine] = js.native
  /**
    * Gets whether or not the audio engine is unlocked (require first a user gesture on some browser).
    */
  val unlocked: Boolean = js.native
  /**
    * Defines if the audio engine relies on a custom unlocked button.
    * In this case, the embedded button will not be displayed.
    */
  var useCustomUnlockedButton: Boolean = js.native
  /**
    * Flags the audio engine in Locked state.
    * This happens due to new browser policies preventing audio to autoplay.
    */
  def lock(): Unit = js.native
  /**
    * Unlocks the audio engine once a user action has been done on the dom.
    * This is helpful to resume play once browser policies have been satisfied.
    */
  def unlock(): Unit = js.native
}

object IAudioEngine {
  @scala.inline
  def apply(
    WarnedWebAudioUnsupported: Boolean,
    canUseWebAudio: Boolean,
    dispose: () => Unit,
    isMP3supported: Boolean,
    isOGGsupported: Boolean,
    lock: () => Unit,
    masterGain: GainNode,
    onAudioLockedObservable: Observable[AudioEngine],
    onAudioUnlockedObservable: Observable[AudioEngine],
    unlock: () => Unit,
    unlocked: Boolean,
    useCustomUnlockedButton: Boolean
  ): IAudioEngine = {
    val __obj = js.Dynamic.literal(WarnedWebAudioUnsupported = WarnedWebAudioUnsupported.asInstanceOf[js.Any], canUseWebAudio = canUseWebAudio.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isMP3supported = isMP3supported.asInstanceOf[js.Any], isOGGsupported = isOGGsupported.asInstanceOf[js.Any], lock = js.Any.fromFunction0(lock), masterGain = masterGain.asInstanceOf[js.Any], onAudioLockedObservable = onAudioLockedObservable.asInstanceOf[js.Any], onAudioUnlockedObservable = onAudioUnlockedObservable.asInstanceOf[js.Any], unlock = js.Any.fromFunction0(unlock), unlocked = unlocked.asInstanceOf[js.Any], useCustomUnlockedButton = useCustomUnlockedButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAudioEngine]
  }
  @scala.inline
  implicit class IAudioEngineOps[Self <: IAudioEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWarnedWebAudioUnsupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarnedWebAudioUnsupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanUseWebAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canUseWebAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMP3supported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMP3supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOGGsupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOGGsupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMasterGain(value: GainNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAudioLockedObservable(value: Observable[AudioEngine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAudioLockedObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAudioUnlockedObservable(value: Observable[AudioEngine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAudioUnlockedObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnlock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCustomUnlockedButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomUnlockedButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioContext(value: Nullable[AudioContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(null)
        ret
    }
  }
  
}

