package typingsSlinky.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiveQueueMessageOptions extends js.Object {
  var isPeekLock: js.UndefOr[Boolean] = js.native
  var timeoutIntervalInS: js.UndefOr[Double] = js.native
}

object ReceiveQueueMessageOptions {
  @scala.inline
  def apply(): ReceiveQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiveQueueMessageOptions]
  }
  @scala.inline
  implicit class ReceiveQueueMessageOptionsOps[Self <: ReceiveQueueMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsPeekLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPeekLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPeekLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPeekLock")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutIntervalInS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutIntervalInS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutIntervalInS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutIntervalInS")(js.undefined)
        ret
    }
  }
  
}

