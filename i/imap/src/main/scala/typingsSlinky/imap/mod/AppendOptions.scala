package typingsSlinky.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppendOptions extends js.Object {
    /* string|string[] */ /** What to use for message arrival date/time. Default: (current date/time) */
  var date: js.UndefOr[js.Date] = js.native
  /** A single flag (e.g. 'Seen') or an array of flags (e.g. ['Seen', 'Flagged']) to append to the message. Default: (no flags) */
  var flags: js.UndefOr[js.Any] = js.native
  /** The name of the mailbox to append the message to. Default: the currently open mailbox */
  var mailbox: js.UndefOr[String] = js.native
}

object AppendOptions {
  @scala.inline
  def apply(): AppendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendOptions]
  }
  @scala.inline
  implicit class AppendOptionsOps[Self <: AppendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withMailbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailbox")(js.undefined)
        ret
    }
  }
  
}

