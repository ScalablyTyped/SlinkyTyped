package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.anon.Class
import typingsSlinky.nightwatch.nightwatchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchCallbackResultError
  extends NightwatchCallbackResult[js.Any] {
  var state: js.Error | String
  var status: `1`
   // we cannot use `number` so giving it a "symbolic" value allows to disjoint the union
  var value: Class
}

object NightwatchCallbackResultError {
  @scala.inline
  def apply(state: js.Error | String, status: `1`, value: Class): NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchCallbackResultError]
  }
}

