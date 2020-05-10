package typingsSlinky.fmWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait subscribedClient extends js.Object {
  /**
    * The subscribed client's bound records.
    */
  var boundRecords: js.Any = js.native
  /**
    * The subscribed client's unique identifier.
    */
  var id: String = js.native
}

object subscribedClient {
  @scala.inline
  def apply(boundRecords: js.Any, id: String): subscribedClient = {
    val __obj = js.Dynamic.literal(boundRecords = boundRecords.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribedClient]
  }
  @scala.inline
  implicit class subscribedClientOps[Self <: subscribedClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundRecords(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

