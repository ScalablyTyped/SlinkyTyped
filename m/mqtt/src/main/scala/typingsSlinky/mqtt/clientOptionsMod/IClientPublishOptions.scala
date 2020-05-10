package typingsSlinky.mqtt.clientOptionsMod

import typingsSlinky.mqttPacket.mod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientPublishOptions extends js.Object {
  /**
    * callback called when message is put into `outgoingStore`
    */
  var cbStorePut: js.UndefOr[StorePutCallback] = js.native
  /**
    * whether or not mark a message as duplicate
    */
  var dup: js.UndefOr[Boolean] = js.native
  /**
    * the QoS
    */
  var qos: QoS = js.native
  /**
    * the retain flag
    */
  var retain: js.UndefOr[Boolean] = js.native
}

object IClientPublishOptions {
  @scala.inline
  def apply(qos: QoS): IClientPublishOptions = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientPublishOptions]
  }
  @scala.inline
  implicit class IClientPublishOptionsOps[Self <: IClientPublishOptions] (val x: Self) extends AnyVal {
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
    def withCbStorePut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbStorePut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCbStorePut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cbStorePut")(js.undefined)
        ret
    }
    @scala.inline
    def withDup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dup")(js.undefined)
        ret
    }
    @scala.inline
    def withRetain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retain")(js.undefined)
        ret
    }
  }
  
}

