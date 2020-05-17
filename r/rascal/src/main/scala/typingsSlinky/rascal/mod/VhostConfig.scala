package typingsSlinky.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rascal.anon.RegularPool
import typingsSlinky.rascal.rascalStrings.fixed
import typingsSlinky.rascal.rascalStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VhostConfig extends js.Object {
  var assert: js.UndefOr[Boolean] = js.native
  var bindings: js.UndefOr[StringDictionary[BindingConfig] | js.Array[String]] = js.native
  var check: js.UndefOr[Boolean] = js.native
  var connection: js.UndefOr[ConnectionConfig] = js.native
  var connectionStrategy: js.UndefOr[random | fixed] = js.native
  var connections: js.UndefOr[js.Array[ConnectionConfig]] = js.native
  var exchanges: js.UndefOr[StringDictionary[ExchangeConfig] | js.Array[String]] = js.native
  var namespace: js.UndefOr[String | Boolean] = js.native
  var publicationChannelPools: js.UndefOr[RegularPool] = js.native
  var publications: js.UndefOr[StringDictionary[PublicationConfig]] = js.native
  var queues: js.UndefOr[StringDictionary[QueueConfig] | js.Array[String]] = js.native
  var subscriptions: js.UndefOr[StringDictionary[SubscriptionConfig]] = js.native
}

object VhostConfig {
  @scala.inline
  def apply(): VhostConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VhostConfig]
  }
  @scala.inline
  implicit class VhostConfigOps[Self <: VhostConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(js.undefined)
        ret
    }
    @scala.inline
    def withBindings(value: StringDictionary[BindingConfig] | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection(value: ConnectionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionStrategy(value: random | fixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withConnections(value: js.Array[ConnectionConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connections")(js.undefined)
        ret
    }
    @scala.inline
    def withExchanges(value: StringDictionary[ExchangeConfig] | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchanges")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicationChannelPools(value: RegularPool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicationChannelPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicationChannelPools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicationChannelPools")(js.undefined)
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
    def withQueues(value: StringDictionary[QueueConfig] | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(js.undefined)
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
  }
  
}

