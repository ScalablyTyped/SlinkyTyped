package typingsSlinky.chrome.chrome.serial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.serial.send")
@js.native
object send extends js.Object {
  def apply(
    connectionId: Double,
    data: scala.scalajs.js.typedarray.ArrayBuffer,
    callback: js.Function1[/* sendInfo */ js.Object, Unit]
  ): Unit = js.native
}

