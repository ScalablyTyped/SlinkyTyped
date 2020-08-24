package typingsSlinky.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.setSystemTime")
@js.native
object setSystemTime extends js.Object {
  /**
    * Set the current system time used by fake timers. Simulates a user
    * changing the system clock while your program is running. It affects the
    * current time but it does not in itself cause e.g. timers to fire; they
    * will fire exactly as they would have done without the call to
    * jest.setSystemTime().
    *
    * > Note: This function is only available when using modern fake timers
    * > implementation
    */
  def apply(): Unit = js.native
  def apply(now: Double): Unit = js.native
  def apply(now: js.Date): Unit = js.native
}

