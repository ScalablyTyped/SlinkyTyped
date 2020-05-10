package typingsSlinky.gapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientLogging.AnonAccesstoken
import typingsSlinky.gapiClientLogging.AnonAlt
import typingsSlinky.gapiClientLogging.AnonBearertoken
import typingsSlinky.gapiClientLogging.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusionsResource extends js.Object {
  /**
    * Creates a new exclusion in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions
    * in a resource.
    */
  def create(request: AnonAccesstoken): Request_[LogExclusion] = js.native
  /** Deletes an exclusion. */
  def delete(request: AnonAlt): Request_[js.Object] = js.native
  /** Gets the description of an exclusion. */
  def get(request: AnonAlt): Request_[LogExclusion] = js.native
  /** Lists all the exclusions in a parent resource. */
  def list(request: AnonBearertoken): Request_[ListExclusionsResponse] = js.native
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: AnonCallback): Request_[LogExclusion] = js.native
}

object ExclusionsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[LogExclusion],
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[LogExclusion],
    list: AnonBearertoken => Request_[ListExclusionsResponse],
    patch: AnonCallback => Request_[LogExclusion]
  ): ExclusionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[ExclusionsResource]
  }
  @scala.inline
  implicit class ExclusionsResourceOps[Self <: ExclusionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[LogExclusion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[LogExclusion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListExclusionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonCallback => Request_[LogExclusion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

