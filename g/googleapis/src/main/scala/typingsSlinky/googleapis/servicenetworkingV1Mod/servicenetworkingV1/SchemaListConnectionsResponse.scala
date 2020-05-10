package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListConnectionsResponse is the response to list peering states for the
  * given service and consumer project.
  */
@js.native
trait SchemaListConnectionsResponse extends js.Object {
  /**
    * The list of Connections.
    */
  var connections: js.UndefOr[js.Array[SchemaConnection]] = js.native
}

object SchemaListConnectionsResponse {
  @scala.inline
  def apply(): SchemaListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConnectionsResponse]
  }
  @scala.inline
  implicit class SchemaListConnectionsResponseOps[Self <: SchemaListConnectionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnections(value: js.Array[SchemaConnection]): Self = {
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
  }
  
}

