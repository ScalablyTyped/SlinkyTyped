package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonOauthtokenOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionOperationsResource extends js.Object {
  /** Deletes the specified region-specific Operations resource. */
  def delete(request: AnonOauthtokenOperation): Request_[Unit] = js.native
  /** Retrieves the specified region-specific Operations resource. */
  def get(request: AnonOauthtokenOperation): Request_[Operation] = js.native
  /** Retrieves a list of Operation resources contained within the specified region. */
  def list(request: AnonFilter): Request_[OperationList] = js.native
}

object RegionOperationsResource {
  @scala.inline
  def apply(
    delete: AnonOauthtokenOperation => Request_[Unit],
    get: AnonOauthtokenOperation => Request_[Operation],
    list: AnonFilter => Request_[OperationList]
  ): RegionOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RegionOperationsResource]
  }
  @scala.inline
  implicit class RegionOperationsResourceOps[Self <: RegionOperationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonOauthtokenOperation => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtokenOperation => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[OperationList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

