package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPublications extends js.Object {
  var publications: AnonConfirm = js.native
  var redeliveries: AnonCounters = js.native
  var subscriptions: AnonDeferCloseChannel = js.native
  var vhosts: AnonBindings = js.native
}

object AnonPublications {
  @scala.inline
  def apply(
    publications: AnonConfirm,
    redeliveries: AnonCounters,
    subscriptions: AnonDeferCloseChannel,
    vhosts: AnonBindings
  ): AnonPublications = {
    val __obj = js.Dynamic.literal(publications = publications.asInstanceOf[js.Any], redeliveries = redeliveries.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], vhosts = vhosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPublications]
  }
  @scala.inline
  implicit class AnonPublicationsOps[Self <: AnonPublications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublications(value: AnonConfirm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedeliveries(value: AnonCounters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redeliveries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions(value: AnonDeferCloseChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVhosts(value: AnonBindings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vhosts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

