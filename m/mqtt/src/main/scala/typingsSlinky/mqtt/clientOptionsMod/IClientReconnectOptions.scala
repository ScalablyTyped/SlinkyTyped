package typingsSlinky.mqtt.clientOptionsMod

import typingsSlinky.mqtt.storeMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientReconnectOptions extends js.Object {
  /**
    * a Store for the incoming packets
    */
  var incomingStore: js.UndefOr[Store] = js.native
  /**
    * a Store for the outgoing packets
    */
  var outgoingStore: js.UndefOr[Store] = js.native
}

object IClientReconnectOptions {
  @scala.inline
  def apply(): IClientReconnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientReconnectOptions]
  }
  @scala.inline
  implicit class IClientReconnectOptionsOps[Self <: IClientReconnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncomingStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncomingStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingStore")(js.undefined)
        ret
    }
    @scala.inline
    def withOutgoingStore(value: Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutgoingStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingStore")(js.undefined)
        ret
    }
  }
  
}

