package typingsSlinky.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeoutsOptions extends CreateTimeoutOptions {
  /**
    * The maximum amount of times to retry the operation.
    * @default 10
    */
  var retries: js.UndefOr[Double] = js.native
}

object TimeoutsOptions {
  @scala.inline
  def apply(): TimeoutsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutsOptions]
  }
  @scala.inline
  implicit class TimeoutsOptionsOps[Self <: TimeoutsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
  }
  
}

