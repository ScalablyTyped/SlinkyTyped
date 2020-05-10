package typingsSlinky.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VacationSettings extends js.Object {
  /** Flag that controls whether Gmail automatically replies to messages. */
  var enableAutoReply: js.UndefOr[Boolean] = js.native
  /**
    * An optional end time for sending auto-replies (epoch ms). When this is specified, Gmail will automatically reply only to messages that it receives
    * before the end time. If both startTime and endTime are specified, startTime must precede endTime.
    */
  var endTime: js.UndefOr[String] = js.native
  /** Response body in HTML format. Gmail will sanitize the HTML before storing it. */
  var responseBodyHtml: js.UndefOr[String] = js.native
  /** Response body in plain text format. */
  var responseBodyPlainText: js.UndefOr[String] = js.native
  /**
    * Optional text to prepend to the subject line in vacation responses. In order to enable auto-replies, either the response subject or the response body
    * must be nonempty.
    */
  var responseSubject: js.UndefOr[String] = js.native
  /** Flag that determines whether responses are sent to recipients who are not in the user's list of contacts. */
  var restrictToContacts: js.UndefOr[Boolean] = js.native
  /** Flag that determines whether responses are sent to recipients who are outside of the user's domain. This feature is only available for G Suite users. */
  var restrictToDomain: js.UndefOr[Boolean] = js.native
  /**
    * An optional start time for sending auto-replies (epoch ms). When this is specified, Gmail will automatically reply only to messages that it receives
    * after the start time. If both startTime and endTime are specified, startTime must precede endTime.
    */
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

