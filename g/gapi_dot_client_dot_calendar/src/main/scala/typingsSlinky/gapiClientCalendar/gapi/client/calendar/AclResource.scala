package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCalendar.anon.Alt
import typingsSlinky.gapiClientCalendar.anon.CalendarId
import typingsSlinky.gapiClientCalendar.anon.Fields
import typingsSlinky.gapiClientCalendar.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclResource extends js.Object {
  /** Deletes an access control rule. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Returns an access control rule. */
  def get(request: Alt): Request[AclRule] = js.native
  /** Creates an access control rule. */
  def insert(request: CalendarId): Request[AclRule] = js.native
  /** Returns the rules in the access control list for the calendar. */
  def list(request: Fields): Request[Acl] = js.native
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: Key): Request[AclRule] = js.native
  /** Updates an access control rule. */
  def update(request: Key): Request[AclRule] = js.native
  /** Watch for changes to ACL resources. */
  def watch(request: Fields): Request[Channel] = js.native
}

object AclResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[AclRule],
    insert: CalendarId => Request[AclRule],
    list: Fields => Request[Acl],
    patch: Key => Request[AclRule],
    update: Key => Request[AclRule],
    watch: Fields => Request[Channel]
  ): AclResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[AclResource]
  }
  @scala.inline
  implicit class AclResourceOps[Self <: AclResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[AclRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: CalendarId => Request[AclRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[Acl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Key => Request[AclRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[AclRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: Fields => Request[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

