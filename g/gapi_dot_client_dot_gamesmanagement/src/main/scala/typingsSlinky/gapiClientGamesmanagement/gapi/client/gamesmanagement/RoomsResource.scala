package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGamesmanagement.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomsResource extends js.Object {
  /**
    * Reset all rooms for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: Alt): Request[Unit] = js.native
  /**
    * Deletes rooms where the only room participants are from whitelisted tester accounts for your application. This method is only available to user
    * accounts for your developer console.
    */
  def resetForAllPlayers(request: Alt): Request[Unit] = js.native
}

object RoomsResource {
  @scala.inline
  def apply(reset: Alt => Request[Unit], resetForAllPlayers: Alt => Request[Unit]): RoomsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers))
    __obj.asInstanceOf[RoomsResource]
  }
  @scala.inline
  implicit class RoomsResourceOps[Self <: RoomsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResetForAllPlayers(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetForAllPlayers")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

