package typingsSlinky.amqp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConsumercancelnotify extends js.Object {
  var consumer_cancel_notify: js.UndefOr[Boolean] = js.native
}

object AnonConsumercancelnotify {
  @scala.inline
  def apply(): AnonConsumercancelnotify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConsumercancelnotify]
  }
  @scala.inline
  implicit class AnonConsumercancelnotifyOps[Self <: AnonConsumercancelnotify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumer_cancel_notify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_cancel_notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumer_cancel_notify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_cancel_notify")(js.undefined)
        ret
    }
  }
  
}

