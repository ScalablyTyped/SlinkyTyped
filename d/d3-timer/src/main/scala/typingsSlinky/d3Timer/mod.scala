package typingsSlinky.d3Timer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-timer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def interval(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = js.native
  def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: js.UndefOr[scala.Nothing], time: Double): Timer_ = js.native
  def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = js.native
  def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = js.native
  
  def now(): Double = js.native
  
  def timeout(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = js.native
  def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: js.UndefOr[scala.Nothing], time: Double): Timer_ = js.native
  def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = js.native
  def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = js.native
  
  def timer(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = js.native
  def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: js.UndefOr[scala.Nothing], time: Double): Timer_ = js.native
  def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = js.native
  def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = js.native
  
  def timerFlush(): Unit = js.native
  
  @js.native
  trait Timer_ extends js.Object {
    
    /**
      * Restart a timer with the specified callback and optional delay and time.
      * This is equivalent to stopping this timer and creating a new timer with the specified arguments,
      * although this timer retains the original invocation priority.
      *
      * @param callback A callback function to be invoked and passed in the apparent
      * elapsed time since the timer became active in milliseconds.
      * @param delay An optional numeric delay in milliseconds (default = 0) relative to time.
      * @param time An optional time in milliseconds relative to which the delay is calculated (default = now).
      */
    def restart(callbackFn: js.Function1[/* elapsed */ Double, Unit]): Unit = js.native
    def restart(
      callbackFn: js.Function1[/* elapsed */ Double, Unit],
      delay: js.UndefOr[scala.Nothing],
      time: Double
    ): Unit = js.native
    def restart(callbackFn: js.Function1[/* elapsed */ Double, Unit], delay: Double): Unit = js.native
    def restart(callbackFn: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Unit = js.native
    
    /**
      * Stop the timer.
      */
    def stop(): Unit = js.native
  }
}
