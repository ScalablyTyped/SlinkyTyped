package typingsSlinky.johnnyFive.mod.IR

import typingsSlinky.johnnyFive.johnnyFiveStrings.calibratedData
import typingsSlinky.johnnyFive.johnnyFiveStrings.data
import typingsSlinky.johnnyFive.johnnyFiveStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "IR.Reflect")
@js.native
object Reflect extends js.Object {
  
  @js.native
  class Array protected () extends js.Object {
    def this(option: ArrayOption) = this()
    
    def calibrate(): Unit = js.native
    
    def calibrateUntil(predicate: js.Function0[Unit]): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def loadCalibration(option: LoadCalibrationOption): Unit = js.native
    
    def on(event: String, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_calibratedData(event: calibratedData, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_line(event: line, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  }
}
