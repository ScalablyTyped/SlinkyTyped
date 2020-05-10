package typingsSlinky.mqtt.clientMod

import typingsSlinky.mqttPacket.mod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionRequest extends js.Object {
  /*
    * no local flag
    * */
  var nl: js.UndefOr[Boolean] = js.native
  /**
    *  is the granted qos level on it
    */
  var qos: QoS = js.native
  /*
    * Retain As Published flag
    * */
  var rap: js.UndefOr[Boolean] = js.native
  /*
    * Retain Handling option
    * */
  var rh: js.UndefOr[Double] = js.native
  /**
    *  is a subscribed to topic
    */
  var topic: String = js.native
}

object ISubscriptionRequest {
  @scala.inline
  def apply(qos: QoS, topic: String): ISubscriptionRequest = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionRequest]
  }
  @scala.inline
  implicit class ISubscriptionRequestOps[Self <: ISubscriptionRequest] (val x: Self) extends AnyVal {
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
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
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

