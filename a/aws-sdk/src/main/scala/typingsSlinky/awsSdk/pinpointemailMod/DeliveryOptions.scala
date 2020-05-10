package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryOptions extends js.Object {
  /**
    * The name of the dedicated IP pool that you want to associate with the configuration set.
    */
  var SendingPoolName: js.UndefOr[PoolName] = js.native
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is Require, messages are only delivered if a TLS connection can be established. If the value is Optional, messages can be delivered in plain text if a TLS connection can't be established.
    */
  var TlsPolicy: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.TlsPolicy] = js.native
}

object DeliveryOptions {
  @scala.inline
  def apply(): DeliveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryOptions]
  }
  @scala.inline
  implicit class DeliveryOptionsOps[Self <: DeliveryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSendingPoolName(value: PoolName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingPoolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendingPoolName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendingPoolName")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsPolicy(value: TlsPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TlsPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TlsPolicy")(js.undefined)
        ret
    }
  }
  
}

