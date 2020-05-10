package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonMaxAllowedMaturityRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonalizedstreamResource extends js.Object {
  /** Returns a stream of personalized book clusters */
  def get(request: AnonMaxAllowedMaturityRating): Request_[Discoveryclusters] = js.native
}

object PersonalizedstreamResource {
  @scala.inline
  def apply(get: AnonMaxAllowedMaturityRating => Request_[Discoveryclusters]): PersonalizedstreamResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[PersonalizedstreamResource]
  }
  @scala.inline
  implicit class PersonalizedstreamResourceOps[Self <: PersonalizedstreamResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonMaxAllowedMaturityRating => Request_[Discoveryclusters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

