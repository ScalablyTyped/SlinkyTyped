package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An alert affecting a customer.
  */
@js.native
trait SchemaAlert extends js.Object {
  /**
    * Output only. The unique identifier for the alert.
    */
  var alertId: js.UndefOr[String] = js.native
  /**
    * Output only. The time this alert was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The unique identifier of the Google account of the customer.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Optional. The data associated with this alert, for example
    * google.apps.alertcenter.type.DeviceCompromised.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. `True` if this alert is marked for deletion.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The time the event that caused this alert ceased being active.
    * If provided, the end time must not be earlier than the start time. If not
    * provided, it indicates an ongoing alert.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. An optional [Security Investigation
    * Tool](https://support.google.com/a/answer/7575955) query for this alert.
    */
  var securityInvestigationToolLink: js.UndefOr[String] = js.native
  /**
    * Required. A unique identifier for the system that reported the alert.
    * This is output only after alert is created.  Supported sources are any of
    * the following:  * Google Operations * Mobile device management * Gmail
    * phishing * Domain wide takeout * Government attack warning * Google
    * identity
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Required. The time the event that caused this alert was started or
    * detected.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Required. The type of the alert. This is output only after alert is
    * created. For a list of available alert types see [G Suite Alert
    * types](/admin-sdk/alertcenter/reference/alert-types).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAlert {
  @scala.inline
  def apply(): SchemaAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlert]
  }
  @scala.inline
  implicit class SchemaAlertOps[Self <: SchemaAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityInvestigationToolLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityInvestigationToolLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityInvestigationToolLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityInvestigationToolLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

