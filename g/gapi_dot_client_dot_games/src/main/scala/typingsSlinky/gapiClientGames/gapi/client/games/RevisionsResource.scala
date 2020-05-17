package typingsSlinky.gapiClientGames.gapi.client.games

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGames.anon.ClientRevision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionsResource extends js.Object {
  /** Checks whether the games client is out of date. */
  def check(request: ClientRevision): Request[RevisionCheckResponse] = js.native
}

object RevisionsResource {
  @scala.inline
  def apply(check: ClientRevision => Request[RevisionCheckResponse]): RevisionsResource = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
    __obj.asInstanceOf[RevisionsResource]
  }
  @scala.inline
  implicit class RevisionsResourceOps[Self <: RevisionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck(value: ClientRevision => Request[RevisionCheckResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

