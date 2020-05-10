package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSafebrowsing.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullHashesResource extends js.Object {
  /** Finds the full hashes that match the requested hash prefixes. */
  def find(request: AnonAlt): Request_[FindFullHashesResponse] = js.native
}

object FullHashesResource {
  @scala.inline
  def apply(find: AnonAlt => Request_[FindFullHashesResponse]): FullHashesResource = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[FullHashesResource]
  }
  @scala.inline
  implicit class FullHashesResourceOps[Self <: FullHashesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFind(value: AnonAlt => Request_[FindFullHashesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

