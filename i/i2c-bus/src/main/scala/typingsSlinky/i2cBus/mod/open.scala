package typingsSlinky.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("i2c-bus", "open")
@js.native
object open extends js.Object {
  
  def apply(busNumber: Double, callback: CompletionCallback): I2CBus = js.native
  def apply(busNumber: Double, options: OpenOptions, callback: CompletionCallback): I2CBus = js.native
}
