package typingsSlinky.mqttPacket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonServerReference extends js.Object {
  var reasonString: js.UndefOr[String] = js.native
  var serverReference: js.UndefOr[String] = js.native
  var sessionExpiryInterval: js.UndefOr[Double] = js.native
  var userProperties: js.UndefOr[js.Object] = js.native
}

object AnonServerReference {
  @scala.inline
  def apply(): AnonServerReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonServerReference]
  }
  @scala.inline
  implicit class AnonServerReferenceOps[Self <: AnonServerReference] (val x: Self) extends AnyVal {
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
    def withServerReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverReference")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionExpiryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionExpiryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionExpiryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionExpiryInterval")(js.undefined)
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

