package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTagmanager.AnonAlt
import typingsSlinky.gapiClientTagmanager.AnonIncludeDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionHeadersResource extends js.Object {
  /** Gets the latest container version header */
  def latest(request: AnonAlt): Request_[ContainerVersionHeader] = js.native
  /** Lists all Container Versions of a GTM Container. */
  def list(request: AnonIncludeDeleted): Request_[ListContainerVersionsResponse] = js.native
}

object VersionHeadersResource {
  @scala.inline
  def apply(
    latest: AnonAlt => Request_[ContainerVersionHeader],
    list: AnonIncludeDeleted => Request_[ListContainerVersionsResponse]
  ): VersionHeadersResource = {
    val __obj = js.Dynamic.literal(latest = js.Any.fromFunction1(latest), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VersionHeadersResource]
  }
  @scala.inline
  implicit class VersionHeadersResourceOps[Self <: VersionHeadersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatest(value: AnonAlt => Request_[ContainerVersionHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonIncludeDeleted => Request_[ListContainerVersionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

