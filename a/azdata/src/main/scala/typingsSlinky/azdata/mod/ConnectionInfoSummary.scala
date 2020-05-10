package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionInfoSummary extends js.Object {
  /**
  		 * connection id returned from service host.
  		 */
  var connectionId: String = js.native
  /**
  		 * information about the actual connection established
  		 */
  var connectionSummary: ConnectionSummary = js.native
  /**
  		 * Error message returned from the engine, if any.
  		 */
  var errorMessage: String = js.native
  /**
  		 * Error number returned from the engine, if any.
  		 */
  var errorNumber: Double = js.native
  /**
  		 * any diagnostic messages return from the service host.
  		 */
  var messages: String = js.native
  /**
  		 * URI identifying the owner of the connection
  		 */
  var ownerUri: String = js.native
  /**
  		 * Information about the connected server.
  		 */
  var serverInfo: ServerInfo = js.native
}

object ConnectionInfoSummary {
  @scala.inline
  def apply(
    connectionId: String,
    connectionSummary: ConnectionSummary,
    errorMessage: String,
    errorNumber: Double,
    messages: String,
    ownerUri: String,
    serverInfo: ServerInfo
  ): ConnectionInfoSummary = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], connectionSummary = connectionSummary.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], errorNumber = errorNumber.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfoSummary]
  }
  @scala.inline
  implicit class ConnectionInfoSummaryOps[Self <: ConnectionInfoSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionSummary(value: ConnectionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerInfo(value: ServerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

