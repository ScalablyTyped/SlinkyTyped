package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains control requests' settings.
  */
@js.native
trait RequestSettings extends js.Object {
  /**
    * Specifies the maximum number of commands that can be sent in one request.
    */
  var maxCommandCount: Double = js.native
  /**
    * Specifies a period before a request is sent to the server.
    */
  var pendingPeriod: Double = js.native
  /**
    * Specifies the time that the control waits for a response before to sent a request again.
    */
  var responseWaitingTime: Double = js.native
}

object RequestSettings {
  @scala.inline
  def apply(maxCommandCount: Double, pendingPeriod: Double, responseWaitingTime: Double): RequestSettings = {
    val __obj = js.Dynamic.literal(maxCommandCount = maxCommandCount.asInstanceOf[js.Any], pendingPeriod = pendingPeriod.asInstanceOf[js.Any], responseWaitingTime = responseWaitingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSettings]
  }
  @scala.inline
  implicit class RequestSettingsOps[Self <: RequestSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCommandCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCommandCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseWaitingTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseWaitingTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

