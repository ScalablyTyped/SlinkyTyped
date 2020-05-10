package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionsList extends js.Object {
  /**
    * A list of connections used by the job.
    */
  var Connections: js.UndefOr[OrchestrationStringList] = js.native
}

object ConnectionsList {
  @scala.inline
  def apply(): ConnectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionsList]
  }
  @scala.inline
  implicit class ConnectionsListOps[Self <: ConnectionsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnections(value: OrchestrationStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connections")(js.undefined)
        ret
    }
  }
  
}

