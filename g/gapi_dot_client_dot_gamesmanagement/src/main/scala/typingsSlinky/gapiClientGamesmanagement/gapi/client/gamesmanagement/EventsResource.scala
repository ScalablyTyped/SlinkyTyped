package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGamesmanagement.AnonAlt
import typingsSlinky.gapiClientGamesmanagement.AnonEventId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResource extends js.Object {
  /**
    * Resets all player progress on the event with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application. All quests for this player that use the event will also be reset.
    */
  def reset(request: AnonEventId): Request_[Unit] = js.native
  /**
    * Resets all player progress on all events for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application. All quests for this player will also be reset.
    */
  def resetAll(request: AnonAlt): Request_[Unit] = js.native
  /**
    * Resets all draft events for all players. This method is only available to user accounts for your developer console. All quests that use any of these
    * events will also be reset.
    */
  def resetAllForAllPlayers(request: AnonAlt): Request_[Unit] = js.native
  /**
    * Resets the event with the given ID for all players. This method is only available to user accounts for your developer console. Only draft events can be
    * reset. All quests that use the event will also be reset.
    */
  def resetForAllPlayers(request: AnonEventId): Request_[Unit] = js.native
  /**
    * Resets events with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft events may be
    * reset. All quests that use any of the events will also be reset.
    */
  def resetMultipleForAllPlayers(request: AnonAlt): Request_[Unit] = js.native
}

object EventsResource {
  @scala.inline
  def apply(
    reset: AnonEventId => Request_[Unit],
    resetAll: AnonAlt => Request_[Unit],
    resetAllForAllPlayers: AnonAlt => Request_[Unit],
    resetForAllPlayers: AnonEventId => Request_[Unit],
    resetMultipleForAllPlayers: AnonAlt => Request_[Unit]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
    __obj.asInstanceOf[EventsResource]
  }
  @scala.inline
  implicit class EventsResourceOps[Self <: EventsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset(value: AnonEventId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetAll(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetAllForAllPlayers(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAllForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetForAllPlayers(value: AnonEventId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetMultipleForAllPlayers(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetMultipleForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

