package typingsSlinky.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerConfig extends js.Object {
  var defaults: js.UndefOr[BrokerConfig] = js.native
  var encryption: js.UndefOr[StringDictionary[Encryption]] = js.native
  var publications: js.UndefOr[StringDictionary[PublicationConfig]] = js.native
  var recovery: js.UndefOr[StringDictionary[Recovery | js.Array[Recovery]]] = js.native
  var redeliveries: js.UndefOr[Redelivery] = js.native
  var subscriptions: js.UndefOr[StringDictionary[SubscriptionConfig]] = js.native
  var vhosts: js.UndefOr[StringDictionary[VhostConfig]] = js.native
}

object BrokerConfig {
  @scala.inline
  def apply(): BrokerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerConfig]
  }
  @scala.inline
  implicit class BrokerConfigOps[Self <: BrokerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: BrokerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: StringDictionary[Encryption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withPublications(value: StringDictionary[PublicationConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publications")(js.undefined)
        ret
    }
    @scala.inline
    def withRecovery(value: StringDictionary[Recovery | js.Array[Recovery]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recovery")(js.undefined)
        ret
    }
    @scala.inline
    def withRedeliveries(value: Redelivery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeliveries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedeliveries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeliveries")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptions(value: StringDictionary[SubscriptionConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(js.undefined)
        ret
    }
    @scala.inline
    def withVhosts(value: StringDictionary[VhostConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVhosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhosts")(js.undefined)
        ret
    }
  }
  
}

