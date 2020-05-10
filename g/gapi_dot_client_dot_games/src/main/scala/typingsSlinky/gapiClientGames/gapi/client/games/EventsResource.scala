package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonAlt
import typingsSlinky.gapiClientGames.AnonLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResource extends js.Object {
  /** Returns a list showing the current progress on events in this application for the currently authenticated user. */
  def listByPlayer(request: AnonAlt): Request_[PlayerEventListResponse] = js.native
  /** Returns a list of the event definitions in this application. */
  def listDefinitions(request: AnonAlt): Request_[EventDefinitionListResponse] = js.native
  /** Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application. */
  def record(request: AnonLanguage): Request_[EventUpdateResponse] = js.native
}

object EventsResource {
  @scala.inline
  def apply(
    listByPlayer: AnonAlt => Request_[PlayerEventListResponse],
    listDefinitions: AnonAlt => Request_[EventDefinitionListResponse],
    record: AnonLanguage => Request_[EventUpdateResponse]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(listByPlayer = js.Any.fromFunction1(listByPlayer), listDefinitions = js.Any.fromFunction1(listDefinitions), record = js.Any.fromFunction1(record))
    __obj.asInstanceOf[EventsResource]
  }
  @scala.inline
  implicit class EventsResourceOps[Self <: EventsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListByPlayer(value: AnonAlt => Request_[PlayerEventListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByPlayer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListDefinitions(value: AnonAlt => Request_[EventDefinitionListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDefinitions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecord(value: AnonLanguage => Request_[EventUpdateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

