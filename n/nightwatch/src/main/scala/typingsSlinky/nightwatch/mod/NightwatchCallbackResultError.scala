package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.anon.Class
import typingsSlinky.nightwatch.nightwatchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchCallbackResultError
  extends NightwatchCallbackResult[js.Any] {
  var state: js.Error | String = js.native
  var status: `1` = js.native
   // we cannot use `number` so giving it a "symbolic" value allows to disjoint the union
  var value: Class = js.native
}

object NightwatchCallbackResultError {
  @scala.inline
  def apply(state: js.Error | String, status: `1`, value: Class): NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchCallbackResultError]
  }
  @scala.inline
  implicit class NightwatchCallbackResultErrorOps[Self <: NightwatchCallbackResultError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: js.Error | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Class): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

