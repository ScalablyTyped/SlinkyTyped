package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGames.anon.Alt
import typingsSlinky.gapiClientGames.anon.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResource extends js.Object {
  /** Returns a list showing the current progress on events in this application for the currently authenticated user. */
  def listByPlayer(request: Alt): Request[PlayerEventListResponse] = js.native
  /** Returns a list of the event definitions in this application. */
  def listDefinitions(request: Alt): Request[EventDefinitionListResponse] = js.native
  /** Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application. */
  def record(request: Language): Request[EventUpdateResponse] = js.native
}

object EventsResource {
  @scala.inline
  def apply(
    listByPlayer: Alt => Request[PlayerEventListResponse],
    listDefinitions: Alt => Request[EventDefinitionListResponse],
    record: Language => Request[EventUpdateResponse]
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
    def withListByPlayer(value: Alt => Request[PlayerEventListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByPlayer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListDefinitions(value: Alt => Request[EventDefinitionListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDefinitions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecord(value: Language => Request[EventUpdateResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

