package typingsSlinky.gtagJs.Gtag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlParams extends js.Object {
  var event_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var event_timeout: js.UndefOr[Double] = js.native
  var groups: js.UndefOr[String | js.Array[String]] = js.native
  var send_to: js.UndefOr[String | js.Array[String]] = js.native
}

object ControlParams {
  @scala.inline
  def apply(): ControlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlParams]
  }
  @scala.inline
  implicit class ControlParamsOps[Self <: ControlParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent_callback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEvent_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_callback")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withSend_to(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_to")(js.undefined)
        ret
    }
  }
  
}

