package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCalendar.AnonAlwaysIncludeEmail
import typingsSlinky.gapiClientCalendar.AnonConferenceDataVersion
import typingsSlinky.gapiClientCalendar.AnonDestination
import typingsSlinky.gapiClientCalendar.AnonEventId
import typingsSlinky.gapiClientCalendar.AnonICalUID
import typingsSlinky.gapiClientCalendar.AnonMaxAttendees
import typingsSlinky.gapiClientCalendar.AnonOriginalStart
import typingsSlinky.gapiClientCalendar.AnonSendNotifications
import typingsSlinky.gapiClientCalendar.AnonSendUpdates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResource extends js.Object {
  /** Deletes an event. */
  def delete(request: AnonEventId): Request_[Unit] = js.native
  /** Returns an event. */
  def get(request: AnonAlwaysIncludeEmail): Request_[Event] = js.native
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: AnonConferenceDataVersion): Request_[Event] = js.native
  /** Creates an event. */
  def insert(request: AnonMaxAttendees): Request_[Event] = js.native
  /** Returns instances of the specified recurring event. */
  def instances(request: AnonOriginalStart): Request_[Events_] = js.native
  /** Returns events on the specified calendar. */
  def list(request: AnonICalUID): Request_[Events_] = js.native
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(request: AnonDestination): Request_[Event] = js.native
  /** Updates an event. This method supports patch semantics. */
  def patch(request: AnonSendNotifications): Request_[Event] = js.native
  /** Creates an event based on a simple text string. */
  def quickAdd(request: AnonSendUpdates): Request_[Event] = js.native
  /** Updates an event. */
  def update(request: AnonSendNotifications): Request_[Event] = js.native
  /** Watch for changes to Events resources. */
  def watch(request: AnonICalUID): Request_[Channel] = js.native
}

object EventsResource {
  @scala.inline
  def apply(
    delete: AnonEventId => Request_[Unit],
    get: AnonAlwaysIncludeEmail => Request_[Event],
    `import`: AnonConferenceDataVersion => Request_[Event],
    insert: AnonMaxAttendees => Request_[Event],
    instances: AnonOriginalStart => Request_[Events_],
    list: AnonICalUID => Request_[Events_],
    move: AnonDestination => Request_[Event],
    patch: AnonSendNotifications => Request_[Event],
    quickAdd: AnonSendUpdates => Request_[Event],
    update: AnonSendNotifications => Request_[Event],
    watch: AnonICalUID => Request_[Channel]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), instances = js.Any.fromFunction1(instances), list = js.Any.fromFunction1(list), move = js.Any.fromFunction1(move), patch = js.Any.fromFunction1(patch), quickAdd = js.Any.fromFunction1(quickAdd), update = js.Any.fromFunction1(update), watch = js.Any.fromFunction1(watch))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[EventsResource]
  }
  @scala.inline
  implicit class EventsResourceOps[Self <: EventsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonEventId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlwaysIncludeEmail => Request_[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImport(value: AnonConferenceDataVersion => Request_[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonMaxAttendees => Request_[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstances(value: AnonOriginalStart => Request_[Events_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonICalUID => Request_[Events_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMove(value: AnonDestination => Request_[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonSendNotifications => Request_[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuickAdd(value: AnonSendUpdates => Request_[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonSendNotifications => Request_[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: AnonICalUID => Request_[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

