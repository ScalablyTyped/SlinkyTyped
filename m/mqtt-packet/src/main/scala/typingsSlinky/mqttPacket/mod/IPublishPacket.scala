package typingsSlinky.mqttPacket.mod

import typingsSlinky.mqttPacket.AnonCorrelationData
import typingsSlinky.mqttPacket.mqttPacketStrings.publish
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPublishPacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IPublishPacket: publish = js.native
  var dup: Boolean = js.native
  var payload: String | Buffer = js.native
  var properties: js.UndefOr[AnonCorrelationData] = js.native
  var qos: QoS = js.native
  var retain: Boolean = js.native
  var topic: String = js.native
}

object IPublishPacket {
  @scala.inline
  def apply(cmd: publish, dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishPacket]
  }
  @scala.inline
  implicit class IPublishPacketOps[Self <: IPublishPacket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: publish): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQos(value: QoS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: AnonCorrelationData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

