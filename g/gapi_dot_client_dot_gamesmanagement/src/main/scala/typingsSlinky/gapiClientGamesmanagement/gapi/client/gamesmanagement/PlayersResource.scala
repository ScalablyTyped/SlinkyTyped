package typingsSlinky.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGamesmanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayersResource extends js.Object {
  /** Hide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def hide(request: AnonFields): Request_[Unit] = js.native
  /** Unhide the given player's leaderboard scores from the given application. This method is only available to user accounts for your developer console. */
  def unhide(request: AnonFields): Request_[Unit] = js.native
}

object PlayersResource {
  @scala.inline
  def apply(hide: AnonFields => Request_[Unit], unhide: AnonFields => Request_[Unit]): PlayersResource = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), unhide = js.Any.fromFunction1(unhide))
    __obj.asInstanceOf[PlayersResource]
  }
  @scala.inline
  implicit class PlayersResourceOps[Self <: PlayersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnhide(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhide")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

