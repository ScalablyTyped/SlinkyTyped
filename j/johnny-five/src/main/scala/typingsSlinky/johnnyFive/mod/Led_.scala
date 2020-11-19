package typingsSlinky.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Led")
@js.native
class Led_ protected () extends js.Object {
  def this(option: Double) = this()
  def this(option: LedOption) = this()
  
  def blink(): Unit = js.native
  def blink(ms: Double): Unit = js.native
  
  def brightness(`val`: Double): Unit = js.native
  
  def fade(brightness: Double, ms: Double): Unit = js.native
  
  def fadeIn(ms: Double): Unit = js.native
  
  def fadeOut(ms: Double): Unit = js.native
  
  var id: String = js.native
  
  def off(): Unit = js.native
  
  def on(): Unit = js.native
  
  var pin: Double = js.native
  
  def pulse(ms: Double): Unit = js.native
  
  def stop(ms: Double): Unit = js.native
  
  def strobe(ms: Double): Unit = js.native
  
  def toggle(): Unit = js.native
}
