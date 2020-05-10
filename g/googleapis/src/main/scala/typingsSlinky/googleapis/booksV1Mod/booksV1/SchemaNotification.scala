package typingsSlinky.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNotification extends js.Object {
  var body: js.UndefOr[String] = js.native
  /**
    * The list of crm experiment ids.
    */
  var crmExperimentIds: js.UndefOr[js.Array[String]] = js.native
  var doc_id: js.UndefOr[String] = js.native
  var doc_type: js.UndefOr[String] = js.native
  var dont_show_notification: js.UndefOr[Boolean] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var is_document_mature: js.UndefOr[Boolean] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  var notificationGroup: js.UndefOr[String] = js.native
  var notification_type: js.UndefOr[String] = js.native
  var pcampaign_id: js.UndefOr[String] = js.native
  var reason: js.UndefOr[String] = js.native
  var show_notification_settings_action: js.UndefOr[Boolean] = js.native
  var targetUrl: js.UndefOr[String] = js.native
  var timeToExpireMs: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object SchemaNotification {
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  @scala.inline
  implicit class SchemaNotificationOps[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCrmExperimentIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crmExperimentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrmExperimentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crmExperimentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDoc_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDoc_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_type")(js.undefined)
        ret
    }
    @scala.inline
    def withDont_show_notification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dont_show_notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDont_show_notification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dont_show_notification")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_document_mature(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_document_mature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_document_mature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_document_mature")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification_type")(js.undefined)
        ret
    }
    @scala.inline
    def withPcampaign_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcampaign_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPcampaign_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcampaign_id")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_notification_settings_action(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_notification_settings_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_notification_settings_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_notification_settings_action")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToExpireMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToExpireMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToExpireMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToExpireMs")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

