package typingsSlinky.gapiClientFitness.gapi.client.fitness

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFitness.AnonEndTime
import typingsSlinky.gapiClientFitness.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionsResource extends js.Object {
  /** Deletes a session specified by the given session ID. */
  def delete(request: AnonOauthtoken): Request_[Unit] = js.native
  /** Lists sessions previously created. */
  def list(request: AnonEndTime): Request_[ListSessionsResponse] = js.native
  /** Updates or insert a given session. */
  def update(request: AnonOauthtoken): Request_[Session] = js.native
}

object SessionsResource {
  @scala.inline
  def apply(
    delete: AnonOauthtoken => Request_[Unit],
    list: AnonEndTime => Request_[ListSessionsResponse],
    update: AnonOauthtoken => Request_[Session]
  ): SessionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SessionsResource]
  }
  @scala.inline
  implicit class SessionsResourceOps[Self <: SessionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonOauthtoken => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonEndTime => Request_[ListSessionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonOauthtoken => Request_[Session]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

