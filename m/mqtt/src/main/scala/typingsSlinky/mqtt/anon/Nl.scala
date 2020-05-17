package typingsSlinky.mqtt.anon

import typingsSlinky.mqttPacket.mod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nl extends js.Object {
  var nl: js.UndefOr[Boolean] = js.native
  var qos: QoS = js.native
  var rap: js.UndefOr[Boolean] = js.native
  var rh: js.UndefOr[Double] = js.native
}

object Nl {
  @scala.inline
  def apply(qos: QoS): Nl = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nl]
  }
  @scala.inline
  implicit class NlOps[Self <: Nl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQos(value: QoS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nl")(js.undefined)
        ret
    }
    @scala.inline
    def withRap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rap")(js.undefined)
        ret
    }
    @scala.inline
    def withRh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rh")(js.undefined)
        ret
    }
  }
  
}

