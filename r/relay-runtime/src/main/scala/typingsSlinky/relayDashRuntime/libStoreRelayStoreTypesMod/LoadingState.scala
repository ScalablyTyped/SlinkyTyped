package typingsSlinky.relayDashRuntime.libStoreRelayStoreTypesMod

import typingsSlinky.relayDashRuntime.relayDashRuntimeStrings.aborted
import typingsSlinky.relayDashRuntime.relayDashRuntimeStrings.complete
import typingsSlinky.relayDashRuntime.relayDashRuntimeStrings.error_
import typingsSlinky.relayDashRuntime.relayDashRuntimeStrings.missing
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

