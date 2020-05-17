package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bindings extends js.Object {
  var bindings: BindingKey = js.native
  var connection: Hostname = js.native
  var connectionStrategy: String = js.native
  var exchanges: Assert = js.native
  var publicationChannelPools: ConfirmPool = js.native
  var queues: AssertBoolean = js.native
}

object Bindings {
  @scala.inline
  def apply(
    bindings: BindingKey,
    connection: Hostname,
    connectionStrategy: String,
    exchanges: Assert,
    publicationChannelPools: ConfirmPool,
    queues: AssertBoolean
  ): Bindings = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connectionStrategy = connectionStrategy.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], publicationChannelPools = publicationChannelPools.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bindings]
  }
  @scala.inline
  implicit class BindingsOps[Self <: Bindings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindings(value: BindingKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: Hostname): Self = {
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
    def withExchanges(value: Assert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicationChannelPools(value: ConfirmPool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicationChannelPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueues(value: AssertBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

