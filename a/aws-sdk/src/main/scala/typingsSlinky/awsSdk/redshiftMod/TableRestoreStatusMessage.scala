package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRestoreStatusMessage extends js.Object {
  /**
    * A pagination token that can be used in a subsequent DescribeTableRestoreStatus request.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of status details for one or more table restore requests.
    */
  var TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList] = js.native
}

object TableRestoreStatusMessage {
  @scala.inline
  def apply(): TableRestoreStatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRestoreStatusMessage]
  }
  @scala.inline
  implicit class TableRestoreStatusMessageOps[Self <: TableRestoreStatusMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRestoreStatusDetails(value: TableRestoreStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableRestoreStatusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRestoreStatusDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableRestoreStatusDetails")(js.undefined)
        ret
    }
  }
  
}

