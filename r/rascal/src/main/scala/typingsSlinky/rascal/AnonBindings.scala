package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBindings extends js.Object {
  var bindings: AnonBindingKey = js.native
  var connection: AnonHostname = js.native
  var connectionStrategy: String = js.native
  var exchanges: AnonAssert = js.native
  var publicationChannelPools: AnonConfirmPool = js.native
  var queues: AnonAssertBoolean = js.native
}

object AnonBindings {
  @scala.inline
  def apply(
    bindings: AnonBindingKey,
    connection: AnonHostname,
    connectionStrategy: String,
    exchanges: AnonAssert,
    publicationChannelPools: AnonConfirmPool,
    queues: AnonAssertBoolean
  ): AnonBindings = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connectionStrategy = connectionStrategy.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], publicationChannelPools = publicationChannelPools.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBindings]
  }
  @scala.inline
  implicit class AnonBindingsOps[Self <: AnonBindings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: AnonBindingKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: AnonHostname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExchanges(value: AnonAssert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicationChannelPools(value: AnonConfirmPool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicationChannelPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueues(value: AnonAssertBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

