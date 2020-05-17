package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redeliveries extends js.Object {
  var publications: Confirm = js.native
  var redeliveries: Counters = js.native
  var subscriptions: DeferCloseChannel = js.native
  var vhosts: Connection = js.native
}

object Redeliveries {
  @scala.inline
  def apply(
    publications: Confirm,
    redeliveries: Counters,
    subscriptions: DeferCloseChannel,
    vhosts: Connection
  ): Redeliveries = {
    val __obj = js.Dynamic.literal(publications = publications.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], vhosts = vhosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redeliveries]
  }
  @scala.inline
  implicit class RedeliveriesOps[Self <: Redeliveries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublications(value: Confirm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedeliveries(value: Counters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeliveries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: DeferCloseChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVhosts(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhosts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

