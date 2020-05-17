package typingsSlinky.gapiClientCalendar.anon

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Private extends js.Object {
  /** Properties that are private to the copy of the event that appears on this calendar. */
  var `private`: js.UndefOr[Record[String, String]] = js.native
  /** Properties that are shared between copies of the event on other attendees' calendars. */
  var shared: js.UndefOr[Record[String, String]] = js.native
}

object Private {
  @scala.inline
  def apply(): Private = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Private]
  }
  @scala.inline
  implicit class PrivateOps[Self <: Private] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivate(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
  }
  
}

