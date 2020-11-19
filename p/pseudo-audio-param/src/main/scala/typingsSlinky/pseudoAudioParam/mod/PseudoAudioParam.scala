package typingsSlinky.pseudoAudioParam.mod

import org.scalajs.dom.raw.AudioParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Simulate scheduled AudioParam values */
@js.native
trait PseudoAudioParam extends js.Object {
  
  /**
    * Apply scheduled methods to the provided audioParam. If reset is `true`,
    * cancel all events of AudioParam before applying
    */
  def applyTo(audioParam: AudioParam): PseudoAudioParam = js.native
  def applyTo(audioParam: AudioParam, reset: Boolean): PseudoAudioParam = js.native
  
  def cancelAndHoldAtTime(time: Double): PseudoAudioParam = js.native
  
  def cancelScheduledValues(time: Double): PseudoAudioParam = js.native
  
  var events: js.Array[PseudoAudioParamEvent] = js.native
  
  def exponentialRampToValueAtTime(value: Double, time: Double): PseudoAudioParam = js.native
  
  /**
    * Return scheduled value at time
    */
  def getValueAtTime(time: Double): Double = js.native
  
  def linearRampToValueAtTime(value: Double, time: Double): PseudoAudioParam = js.native
  
  def setTargetAtTime(value: Double, time: Double, timeConstant: Double): PseudoAudioParam = js.native
  
  def setValueAtTime(value: Double, time: Double): PseudoAudioParam = js.native
  
  def setValueCurveAtTime(values: js.Array[Double], time: Double, duration: Double): PseudoAudioParam = js.native
}
