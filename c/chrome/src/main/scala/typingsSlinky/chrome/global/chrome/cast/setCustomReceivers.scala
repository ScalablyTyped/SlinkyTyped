package typingsSlinky.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.setCustomReceivers")
@js.native
object setCustomReceivers extends js.Object {
  
  def apply(
    receivers: js.Array[typingsSlinky.chrome.chrome.cast.Receiver],
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ typingsSlinky.chrome.chrome.cast.Error, Unit]
  ): Unit = js.native
}
