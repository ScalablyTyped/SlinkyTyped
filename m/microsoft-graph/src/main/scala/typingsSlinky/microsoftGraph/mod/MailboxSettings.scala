package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailboxSettings extends js.Object {
  // Folder ID of an archive folder for the user.
  var archiveFolder: js.UndefOr[String] = js.native
  // Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
  var automaticRepliesSetting: js.UndefOr[AutomaticRepliesSetting] = js.native
  // The date format for the user's mailbox.
  var dateFormat: js.UndefOr[String] = js.native
  // The locale information for the user, including the preferred language and country/region.
  var language: js.UndefOr[LocaleInfo] = js.native
  // The time format for the user's mailbox.
  var timeFormat: js.UndefOr[String] = js.native
  // The default time zone for the user's mailbox.
  var timeZone: js.UndefOr[String] = js.native
  // The days of the week and hours in a specific time zone that the user works.
  var workingHours: js.UndefOr[WorkingHours] = js.native
}

object MailboxSettings {
  @scala.inline
  def apply(): MailboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailboxSettings]
  }
  @scala.inline
  implicit class MailboxSettingsOps[Self <: MailboxSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchiveFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archiveFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archiveFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticRepliesSetting(value: AutomaticRepliesSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticRepliesSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticRepliesSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticRepliesSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: LocaleInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingHours(value: WorkingHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workingHours")(js.undefined)
        ret
    }
  }
  
}

