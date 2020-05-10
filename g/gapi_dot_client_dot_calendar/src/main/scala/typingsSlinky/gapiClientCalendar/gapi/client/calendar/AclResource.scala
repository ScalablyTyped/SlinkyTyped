package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCalendar.AnonAlt
import typingsSlinky.gapiClientCalendar.AnonCalendarId
import typingsSlinky.gapiClientCalendar.AnonFields
import typingsSlinky.gapiClientCalendar.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclResource extends js.Object {
  /** Deletes an access control rule. */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Returns an access control rule. */
  def get(request: AnonAlt): Request_[AclRule] = js.native
  /** Creates an access control rule. */
  def insert(request: AnonCalendarId): Request_[AclRule] = js.native
  /** Returns the rules in the access control list for the calendar. */
  def list(request: AnonFields): Request_[Acl_] = js.native
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: AnonKey): Request_[AclRule] = js.native
  /** Updates an access control rule. */
  def update(request: AnonKey): Request_[AclRule] = js.native
  /** Watch for changes to ACL resources. */
  def watch(request: AnonFields): Request_[Channel] = js.native
}

object AclResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[AclRule],
    insert: AnonCalendarId => Request_[AclRule],
    list: AnonFields => Request_[Acl_],
    patch: AnonKey => Request_[AclRule],
    update: AnonKey => Request_[AclRule],
    watch: AnonFields => Request_[Channel]
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
    def withDelete(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[AclRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonCalendarId => Request_[AclRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[Acl_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonKey => Request_[AclRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[AclRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: AnonFields => Request_[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

