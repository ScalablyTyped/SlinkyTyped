package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a planned outage on this Interconnect. Next id: 9
  */
@js.native
trait SchemaInterconnectOutageNotification extends js.Object {
  /**
    * If issue_type is IT_PARTIAL_OUTAGE, a list of the Google-side circuit IDs
    * that will be affected.
    */
  var affectedCircuits: js.UndefOr[js.Array[String]] = js.native
  /**
    * A description about the purpose of the outage.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Scheduled end time for the outage (milliseconds since Unix epoch).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Form this outage is expected to take. Note that the &quot;IT_&quot;
    * versions of this enum have been deprecated in favor of the unprefixed
    * values.
    */
  var issueType: js.UndefOr[String] = js.native
  /**
    * Unique identifier for this outage notification.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The party that generated this notification. Note that
    * &quot;NSRC_GOOGLE&quot; has been deprecated in favor of
    * &quot;GOOGLE&quot;
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Scheduled start time for the outage (milliseconds since Unix epoch).
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * State of this notification. Note that the &quot;NS_&quot; versions of
    * this enum have been deprecated in favor of the unprefixed values.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaInterconnectOutageNotification {
  @scala.inline
  def apply(): SchemaInterconnectOutageNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectOutageNotification]
  }
  @scala.inline
  implicit class SchemaInterconnectOutageNotificationOps[Self <: SchemaInterconnectOutageNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectedCircuits(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedCircuits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffectedCircuits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedCircuits")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withIssueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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

