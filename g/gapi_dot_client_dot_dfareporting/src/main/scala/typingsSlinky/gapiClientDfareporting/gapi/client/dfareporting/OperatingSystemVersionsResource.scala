package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemVersionsResource extends js.Object {
  /** Gets one operating system version by ID. */
  def get(request: AnonFields): Request_[OperatingSystemVersion] = js.native
  /** Retrieves a list of operating system versions. */
  def list(request: AnonKey): Request_[OperatingSystemVersionsListResponse] = js.native
}

object OperatingSystemVersionsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[OperatingSystemVersion],
    list: AnonKey => Request_[OperatingSystemVersionsListResponse]
  ): OperatingSystemVersionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperatingSystemVersionsResource]
  }
  @scala.inline
  implicit class OperatingSystemVersionsResourceOps[Self <: OperatingSystemVersionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[OperatingSystemVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[OperatingSystemVersionsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

