package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInterconnectDiagnosticsLinkLACPStatus extends js.Object {
  /**
    * System ID of the port on Google?s side of the LACP exchange.
    */
  var googleSystemId: js.UndefOr[String] = js.native
  /**
    * System ID of the port on the neighbor?s side of the LACP exchange.
    */
  var neighborSystemId: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object SchemaInterconnectDiagnosticsLinkLACPStatus {
  @scala.inline
  def apply(): SchemaInterconnectDiagnosticsLinkLACPStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkLACPStatus]
  }
  @scala.inline
  implicit class SchemaInterconnectDiagnosticsLinkLACPStatusOps[Self <: SchemaInterconnectDiagnosticsLinkLACPStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogleSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleSystemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleSystemId")(js.undefined)
        ret
    }
    @scala.inline
    def withNeighborSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeighborSystemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborSystemId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

