package typingsSlinky.gapiClientDiscovery.gapi.client.discovery

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDiscovery.AnonAlt
import typingsSlinky.gapiClientDiscovery.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApisResource extends js.Object {
  /** Retrieve the description of a particular version of an api. */
  def getRest(request: AnonAlt): Request_[RestDescription] = js.native
  /** Retrieve the list of APIs supported at this endpoint. */
  def list(request: AnonFields): Request_[DirectoryList] = js.native
}

object ApisResource {
  @scala.inline
  def apply(getRest: AnonAlt => Request_[RestDescription], list: AnonFields => Request_[DirectoryList]): ApisResource = {
    val __obj = js.Dynamic.literal(getRest = js.Any.fromFunction1(getRest), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ApisResource]
  }
  @scala.inline
  implicit class ApisResourceOps[Self <: ApisResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRest(value: AnonAlt => Request_[RestDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[DirectoryList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

