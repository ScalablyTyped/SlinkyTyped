package typingsSlinky.babylonjs.audioEngineMod

import org.scalajs.dom.raw.AudioContext
import org.scalajs.dom.raw.GainNode
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.sceneMod.IDisposable
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Flags the audio engine in Locked state.
    * This happens due to new browser policies preventing audio to autoplay.
    */
  def lock(): Unit = js.native
  
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
    * Unlocks the audio engine once a user action has been done on the dom.
    * This is helpful to resume play once browser policies have been satisfied.
    */
  def unlock(): Unit = js.native
  
  /**
    * Gets whether or not the audio engine is unlocked (require first a user gesture on some browser).
    */
  val unlocked: Boolean = js.native
  
  /**
    * Defines if the audio engine relies on a custom unlocked button.
    * In this case, the embedded button will not be displayed.
    */
  var useCustomUnlockedButton: Boolean = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWarnedWebAudioUnsupported(value: Boolean): Self = this.set("WarnedWebAudioUnsupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUseWebAudio(value: Boolean): Self = this.set("canUseWebAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMP3supported(value: Boolean): Self = this.set("isMP3supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOGGsupported(value: Boolean): Self = this.set("isOGGsupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock(value: () => Unit): Self = this.set("lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMasterGain(value: GainNode): Self = this.set("masterGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAudioLockedObservable(value: Observable[AudioEngine]): Self = this.set("onAudioLockedObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAudioUnlockedObservable(value: Observable[AudioEngine]): Self = this.set("onAudioUnlockedObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlock(value: () => Unit): Self = this.set("unlock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlocked(value: Boolean): Self = this.set("unlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomUnlockedButton(value: Boolean): Self = this.set("useCustomUnlockedButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioContext(value: Nullable[AudioContext]): Self = this.set("audioContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioContextNull: Self = this.set("audioContext", null)
  }
}
