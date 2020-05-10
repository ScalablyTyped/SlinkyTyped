package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonAlt
import typingsSlinky.gapiClientGmail.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiltersResource extends js.Object {
  /** Creates a filter. */
  def create(request: AnonAlt): Request_[Filter] = js.native
  /** Deletes a filter. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets a filter. */
  def get(request: AnonFields): Request_[Filter] = js.native
  /** Lists the message filters of a Gmail user. */
  def list(request: AnonAlt): Request_[ListFiltersResponse] = js.native
}

object FiltersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Filter],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Filter],
    list: AnonAlt => Request_[ListFiltersResponse]
  ): FiltersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FiltersResource]
  }
  @scala.inline
  implicit class FiltersResourceOps[Self <: FiltersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListFiltersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

