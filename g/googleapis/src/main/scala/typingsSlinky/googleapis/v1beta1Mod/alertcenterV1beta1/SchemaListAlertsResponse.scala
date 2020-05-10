package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for an alert listing request.
  */
@js.native
trait SchemaListAlertsResponse extends js.Object {
  /**
    * The list of alerts.
    */
  var alerts: js.UndefOr[js.Array[SchemaAlert]] = js.native
  /**
    * The token for the next page. If not empty, indicates that there may be
    * more alerts that match the listing request; this value can be used in a
    * subsequent ListAlertsRequest to get alerts continuing from last result of
    * the current list call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAlertsResponse {
  @scala.inline
  def apply(): SchemaListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAlertsResponse]
  }
  @scala.inline
  implicit class SchemaListAlertsResponseOps[Self <: SchemaListAlertsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlerts(value: js.Array[SchemaAlert]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alerts")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

