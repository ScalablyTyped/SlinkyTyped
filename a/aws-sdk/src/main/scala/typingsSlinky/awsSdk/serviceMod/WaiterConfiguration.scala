package typingsSlinky.awsSdk.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaiterConfiguration extends js.Object {
  /**
    * The number of seconds to wait between requests
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * The maximum number of requests to send while waiting
    */
  var maxAttempts: js.UndefOr[Double] = js.native
}

object WaiterConfiguration {
  @scala.inline
  def apply(): WaiterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaiterConfiguration]
  }
  @scala.inline
  implicit class WaiterConfigurationOps[Self <: WaiterConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(js.undefined)
        ret
    }
  }
  
}

