package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VacationSettings extends js.Object {
  var enableAutoReply: js.UndefOr[Boolean] = js.native
  var endTime: js.UndefOr[String] = js.native
  var responseBodyHtml: js.UndefOr[String] = js.native
  var responseBodyPlainText: js.UndefOr[String] = js.native
  var responseSubject: js.UndefOr[String] = js.native
  var restrictToContacts: js.UndefOr[Boolean] = js.native
  var restrictToDomain: js.UndefOr[Boolean] = js.native
  var startTime: js.UndefOr[String] = js.native
}

object VacationSettings {
  @scala.inline
  def apply(): VacationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VacationSettings]
  }
  @scala.inline
  implicit class VacationSettingsOps[Self <: VacationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableAutoReply(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoReply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoReply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoReply")(js.undefined)
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
    def withResponseBodyHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBodyHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseBodyHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBodyHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseBodyPlainText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBodyPlainText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseBodyPlainText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBodyPlainText")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseSubject")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictToContacts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictToContacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictToContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictToContacts")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictToDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictToDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictToDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictToDomain")(js.undefined)
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
  }
  
}

