package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonDartId
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemsResource extends js.Object {
  /** Gets one operating system by DART ID. */
  def get(request: AnonDartId): Request_[OperatingSystem] = js.native
  /** Retrieves a list of operating systems. */
  def list(request: AnonKey): Request_[OperatingSystemsListResponse] = js.native
}

object OperatingSystemsResource {
  @scala.inline
  def apply(
    get: AnonDartId => Request_[OperatingSystem],
    list: AnonKey => Request_[OperatingSystemsListResponse]
  ): OperatingSystemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperatingSystemsResource]
  }
  @scala.inline
  implicit class OperatingSystemsResourceOps[Self <: OperatingSystemsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonDartId => Request_[OperatingSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[OperatingSystemsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

