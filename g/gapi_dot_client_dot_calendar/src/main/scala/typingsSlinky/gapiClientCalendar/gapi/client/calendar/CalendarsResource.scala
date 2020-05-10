package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCalendar.AnonOauthtoken
import typingsSlinky.gapiClientCalendar.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarsResource extends js.Object {
  /** Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account. */
  def clear(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars. */
  def delete(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Returns metadata for a calendar. */
  def get(request: AnonOauthtoken): Request_[Calendar] = js.native
  /** Creates a secondary calendar. */
  def insert(request: AnonQuotaUser): Request_[Calendar] = js.native
  /** Updates metadata for a calendar. This method supports patch semantics. */
  def patch(request: AnonOauthtoken): Request_[Calendar] = js.native
  /** Updates metadata for a calendar. */
  def update(request: AnonOauthtoken): Request_[Calendar] = js.native
}

object CalendarsResource {
  @scala.inline
  def apply(
    clear: AnonOauthtoken => Request_[Unit],
    delete: AnonOauthtoken => Request_[Unit],
    get: AnonOauthtoken => Request_[Calendar],
    insert: AnonQuotaUser => Request_[Calendar],
    patch: AnonOauthtoken => Request_[Calendar],
    update: AnonOauthtoken => Request_[Calendar]
  ): CalendarsResource = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CalendarsResource]
  }
  @scala.inline
  implicit class CalendarsResourceOps[Self <: CalendarsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[Calendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[Calendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonOauthtoken => Request_[Calendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[Calendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

