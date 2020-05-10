package typingsSlinky.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPayload extends js.Object {
  /**
    * if true, requires payload validation as part of the scheme and forbids routes from disabling payload auth validation. Defaults to false.
    */
  var payload: js.UndefOr[Boolean] = js.native
}

object AnonPayload {
  @scala.inline
  def apply(): AnonPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPayload]
  }
  @scala.inline
  implicit class AnonPayloadOps[Self <: AnonPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
  }
  
}

