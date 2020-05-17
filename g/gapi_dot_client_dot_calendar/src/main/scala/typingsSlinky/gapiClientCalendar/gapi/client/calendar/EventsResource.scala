package typingsSlinky.gapiClientCalendar.gapi.client.calendar

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCalendar.anon.AlwaysIncludeEmail
import typingsSlinky.gapiClientCalendar.anon.ConferenceDataVersion
import typingsSlinky.gapiClientCalendar.anon.Destination
import typingsSlinky.gapiClientCalendar.anon.EventId
import typingsSlinky.gapiClientCalendar.anon.ICalUID
import typingsSlinky.gapiClientCalendar.anon.MaxAttendees
import typingsSlinky.gapiClientCalendar.anon.OriginalStart
import typingsSlinky.gapiClientCalendar.anon.SendNotifications
import typingsSlinky.gapiClientCalendar.anon.SendUpdates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResource extends js.Object {
  /** Deletes an event. */
  def delete(request: EventId): Request[Unit] = js.native
  /** Returns an event. */
  def get(request: AlwaysIncludeEmail): Request[Event] = js.native
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: ConferenceDataVersion): Request[Event] = js.native
  /** Creates an event. */
  def insert(request: MaxAttendees): Request[Event] = js.native
  /** Returns instances of the specified recurring event. */
  def instances(request: OriginalStart): Request[Events] = js.native
  /** Returns events on the specified calendar. */
  def list(request: ICalUID): Request[Events] = js.native
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(request: Destination): Request[Event] = js.native
  /** Updates an event. This method supports patch semantics. */
  def patch(request: SendNotifications): Request[Event] = js.native
  /** Creates an event based on a simple text string. */
  def quickAdd(request: SendUpdates): Request[Event] = js.native
  /** Updates an event. */
  def update(request: SendNotifications): Request[Event] = js.native
  /** Watch for changes to Events resources. */
  def watch(request: ICalUID): Request[Channel] = js.native
}

object EventsResource {
  @scala.inline
  def apply(
    delete: EventId => Request[Unit],
    get: AlwaysIncludeEmail => Request[Event],
    `import`: ConferenceDataVersion => Request[Event],
    insert: MaxAttendees => Request[Event],
    instances: OriginalStart => Request[Events],
    list: ICalUID => Request[Events],
    move: Destination => Request[Event],
    patch: SendNotifications => Request[Event],
    quickAdd: SendUpdates => Request[Event],
    update: SendNotifications => Request[Event],
    watch: ICalUID => Request[Channel]
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
    def withDelete(value: EventId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AlwaysIncludeEmail => Request[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImport(value: ConferenceDataVersion => Request[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: MaxAttendees => Request[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInstances(value: OriginalStart => Request[Events]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: ICalUID => Request[Events]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMove(value: Destination => Request[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: SendNotifications => Request[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuickAdd(value: SendUpdates => Request[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: SendNotifications => Request[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: ICalUID => Request[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

