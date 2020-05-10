package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedConnectionInfo extends js.Object {
  /**
  		 * Summary of details containing any connection changes.
  		 */
  var connection: ConnectionSummary = js.native
  /**
  		 * Owner URI of the connection that changed.
  		 */
  var connectionUri: String = js.native
}

object ChangedConnectionInfo {
  @scala.inline
  def apply(connection: ConnectionSummary, connectionUri: String): ChangedConnectionInfo = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], connectionUri = connectionUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedConnectionInfo]
  }
  @scala.inline
  implicit class ChangedConnectionInfoOps[Self <: ChangedConnectionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: ConnectionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

