package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayRuntimeStrings.aborted
import typingsSlinky.relayRuntime.relayRuntimeStrings.complete
import typingsSlinky.relayRuntime.relayRuntimeStrings.error_
import typingsSlinky.relayRuntime.relayRuntimeStrings.missing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingState extends js.Object {
  var error: js.UndefOr[js.Error] = js.undefined
  var status: aborted | complete | error_ | missing
}

object LoadingState {
  @scala.inline
  def apply(status: aborted | complete | error_ | missing, error: js.Error = null): LoadingState = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingState]
  }
}

