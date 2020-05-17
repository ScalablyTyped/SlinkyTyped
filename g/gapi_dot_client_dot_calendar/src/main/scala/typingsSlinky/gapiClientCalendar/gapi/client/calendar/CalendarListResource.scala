package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCalendar.anon.ColorRgbFormat
import typingsSlinky.gapiClientCalendar.anon.MaxResults
import typingsSlinky.gapiClientCalendar.anon.Oauthtoken
import typingsSlinky.gapiClientCalendar.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarListResource extends js.Object {
  /** Removes a calendar from the user's calendar list. */
  def delete(request: Oauthtoken): Request[Unit] = js.native
  /** Returns a calendar from the user's calendar list. */
  def get(request: Oauthtoken): Request[CalendarListEntry] = js.native
  /** Inserts an existing calendar into the user's calendar list. */
  def insert(request: ColorRgbFormat): Request[CalendarListEntry] = js.native
  /** Returns the calendars on the user's calendar list. */
  def list(request: MaxResults): Request[CalendarList] = js.native
  /** Updates an existing calendar on the user's calendar list. This method supports patch semantics. */
  def patch(request: PrettyPrint): Request[CalendarListEntry] = js.native
  /** Updates an existing calendar on the user's calendar list. */
  def update(request: PrettyPrint): Request[CalendarListEntry] = js.native
  /** Watch for changes to CalendarList resources. */
  def watch(request: MaxResults): Request[Channel] = js.native
}

object CalendarListResource {
  @scala.inline
  def apply(
    delete: Oauthtoken => Request[Unit],
    get: Oauthtoken => Request[CalendarListEntry],
    insert: ColorRgbFormat => Request[CalendarListEntry],
    list: MaxResults => Request[CalendarList],
    patch: PrettyPrint => Request[CalendarListEntry],
    update: PrettyPrint => Request[CalendarListEntry],
    watch: MaxResults => Request[Channel]
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
    def withDelete(value: Oauthtoken => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Oauthtoken => Request[CalendarListEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: ColorRgbFormat => Request[CalendarListEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[CalendarList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: PrettyPrint => Request[CalendarListEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: PrettyPrint => Request[CalendarListEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: MaxResults => Request[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

