package typingsSlinky.apn.mod

import typingsSlinky.apn.anon.Reason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseFailure extends js.Object {
  var device: String = js.native
  var error: js.UndefOr[js.Error] = js.native
  var response: js.UndefOr[Reason] = js.native
  var status: js.UndefOr[String] = js.native
}

object ResponseFailure {
  @scala.inline
  def apply(device: String): ResponseFailure = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseFailure]
  }
  @scala.inline
  implicit class ResponseFailureOps[Self <: ResponseFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: Reason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

