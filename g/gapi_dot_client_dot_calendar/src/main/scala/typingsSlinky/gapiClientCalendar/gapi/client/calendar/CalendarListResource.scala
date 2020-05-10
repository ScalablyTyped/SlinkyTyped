package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCalendar.AnonColorRgbFormat
import typingsSlinky.gapiClientCalendar.AnonMaxResults
import typingsSlinky.gapiClientCalendar.AnonOauthtoken
import typingsSlinky.gapiClientCalendar.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarListResource extends js.Object {
  /** Removes a calendar from the user's calendar list. */
  def delete(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Returns a calendar from the user's calendar list. */
  def get(request: AnonOauthtoken): Request_[CalendarListEntry] = js.native
  /** Inserts an existing calendar into the user's calendar list. */
  def insert(request: AnonColorRgbFormat): Request_[CalendarListEntry] = js.native
  /** Returns the calendars on the user's calendar list. */
  def list(request: AnonMaxResults): Request_[CalendarList_] = js.native
  /** Updates an existing calendar on the user's calendar list. This method supports patch semantics. */
  def patch(request: AnonPrettyPrint): Request_[CalendarListEntry] = js.native
  /** Updates an existing calendar on the user's calendar list. */
  def update(request: AnonPrettyPrint): Request_[CalendarListEntry] = js.native
  /** Watch for changes to CalendarList resources. */
  def watch(request: AnonMaxResults): Request_[Channel] = js.native
}

object CalendarListResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => Request_[Unit],
    get: AnonOauthtoken => Request_[CalendarListEntry],
    insert: AnonColorRgbFormat => Request_[CalendarListEntry],
    list: AnonMaxResults => Request_[CalendarList_],
    patch: AnonPrettyPrint => Request_[CalendarListEntry],
    update: AnonPrettyPrint => Request_[CalendarListEntry],
    watch: AnonMaxResults => Request_[Channel]
  ): CalendarListResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[CalendarListResource]
  }
  @scala.inline
  implicit class CalendarListResourceOps[Self <: CalendarListResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[CalendarListEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonColorRgbFormat => Request_[CalendarListEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[CalendarList_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonPrettyPrint => Request_[CalendarListEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonPrettyPrint => Request_[CalendarListEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: AnonMaxResults => Request_[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

