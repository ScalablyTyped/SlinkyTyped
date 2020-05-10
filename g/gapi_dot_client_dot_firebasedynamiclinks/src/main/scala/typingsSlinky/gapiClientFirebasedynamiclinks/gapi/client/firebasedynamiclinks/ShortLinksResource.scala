package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFirebasedynamiclinks.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortLinksResource extends js.Object {
  /**
    * Creates a short Dynamic Link given either a valid long Dynamic Link or
    * details such as Dynamic Link domain, Android and iOS app information.
    * The created short Dynamic Link will not expire.
    *
    * Repeated calls with the same long Dynamic Link or Dynamic Link information
    * will produce the same short Dynamic Link.
    *
    * The Dynamic Link domain in the request must be owned by requester's
    * Firebase project.
    */
  def create(request: AnonAccesstoken): Request_[CreateShortDynamicLinkResponse] = js.native
}

object ShortLinksResource {
  @scala.inline
  def apply(create: AnonAccesstoken => Request_[CreateShortDynamicLinkResponse]): ShortLinksResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ShortLinksResource]
  }
  @scala.inline
  implicit class ShortLinksResourceOps[Self <: ShortLinksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[CreateShortDynamicLinkResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

