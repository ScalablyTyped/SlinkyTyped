package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGames.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushtokensResource extends js.Object {
  /** Removes a push token for the current user and application. Removing a non-existent push token will report success. */
  def remove(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Registers a push token for the current user and application. */
  def update(request: AnonOauthtoken): Request_[Unit] = js.native
}

object PushtokensResource {
  @scala.inline
  def apply(remove: AnonOauthtoken => Request_[Unit], update: AnonOauthtoken => Request_[Unit]): PushtokensResource = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PushtokensResource]
  }
  @scala.inline
  implicit class PushtokensResourceOps[Self <: PushtokensResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemove(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

