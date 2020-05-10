package typingsSlinky.mqttPacket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReasonString extends js.Object {
  var reasonString: js.UndefOr[String] = js.native
  var userProperties: js.UndefOr[js.Object] = js.native
}

object AnonReasonString {
  @scala.inline
  def apply(): AnonReasonString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonReasonString]
  }
  @scala.inline
  implicit class AnonReasonStringOps[Self <: AnonReasonString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReasonString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonString")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProperties")(js.undefined)
        ret
    }
  }
  
}

