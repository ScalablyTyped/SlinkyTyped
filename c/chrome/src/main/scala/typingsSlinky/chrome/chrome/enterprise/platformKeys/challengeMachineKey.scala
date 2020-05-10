package typingsSlinky.chrome.chrome.enterprise.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys.challengeMachineKey")
@js.native
object challengeMachineKey extends js.Object {
  def apply(
    challenge: js.typedarray.ArrayBuffer,
    callback: js.Function1[/* response */ js.typedarray.ArrayBuffer, Unit]
  ): Unit = js.native
  def apply(
    challenge: js.typedarray.ArrayBuffer,
    registerKey: Boolean,
    callback: js.Function1[/* response */ js.typedarray.ArrayBuffer, Unit]
  ): Unit = js.native
}

