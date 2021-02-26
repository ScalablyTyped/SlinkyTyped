package typingsSlinky.playcanvas.mod

import org.scalajs.dom.raw.AudioBuffer
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of an audio asset.
  * @property buffer - If the Web Audio API is supported this contains the audio data.
  * @property audio - If the Web Audio API is not supported this contains the audio data.
  * @property duration - Returns the duration of the sound. If the sound is not loaded it returns 0.
  * @param resource - If the Web Audio API is supported, pass an AudioBuffer object, otherwise
  an Audio object.
  */
@JSImport("playcanvas", "Sound")
@js.native
class Sound protected ()
  extends typingsSlinky.playcanvas.pc.Sound {
  def this(resource: AudioBuffer) = this()
  def this(resource: HTMLAudioElement) = this()
}
