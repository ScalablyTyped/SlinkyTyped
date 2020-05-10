package typingsSlinky.nodeGcm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISenderSendOptions extends js.Object {
  var backoff: js.UndefOr[Double] = js.native
  var retries: js.UndefOr[Double] = js.native
}

object ISenderSendOptions {
  @scala.inline
  def apply(): ISenderSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISenderSendOptions]
  }
  @scala.inline
  implicit class ISenderSendOptionsOps[Self <: ISenderSendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(js.undefined)
        ret
    }
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

