package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskTypesResource extends js.Object {
  /** Retrieves an aggregated list of disk types. */
  def aggregatedList(request: Alt): Request[DiskTypeAggregatedList] = js.native
  /** Returns the specified disk type. Get a list of available disk types by making a list() request. */
  def get(request: typingsSlinky.gapiClientCompute.anon.DiskType): Request[DiskType] = js.native
  /** Retrieves a list of disk types available to the specified project. */
  def list(request: Fields): Request[DiskTypeList] = js.native
}

object DiskTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[DiskTypeAggregatedList],
    get: typingsSlinky.gapiClientCompute.anon.DiskType => Request[DiskType],
    list: Fields => Request[DiskTypeList]
  ): DiskTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DiskTypesResource]
  }
  @scala.inline
  implicit class DiskTypesResourceOps[Self <: DiskTypesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: Alt => Request[DiskTypeAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: typingsSlinky.gapiClientCompute.anon.DiskType => Request[DiskType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[DiskTypeList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

