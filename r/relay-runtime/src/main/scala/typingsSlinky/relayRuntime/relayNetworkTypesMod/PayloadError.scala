package typingsSlinky.relayRuntime.relayNetworkTypesMod

import typingsSlinky.relayRuntime.AnonColumn
import typingsSlinky.relayRuntime.relayRuntimeStrings.CRITICAL
import typingsSlinky.relayRuntime.relayRuntimeStrings.ERROR
import typingsSlinky.relayRuntime.relayRuntimeStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayloadError extends js.Object {
  var locations: js.UndefOr[js.Array[AnonColumn]] = js.native
  var message: String = js.native
  var severity: js.UndefOr[CRITICAL | ERROR | WARNING] = js.native
}

object PayloadError {
  @scala.inline
  def apply(message: String): PayloadError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadError]
  }
  @scala.inline
  implicit class PayloadErrorOps[Self <: PayloadError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[AnonColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: CRITICAL | ERROR | WARNING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
  }
  
}

