package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFields
import typingsSlinky.gapiClientCompute.AnonQuotaUser
import typingsSlinky.gapiClientCompute.AnonQuotaUserTargetInstance
import typingsSlinky.gapiClientCompute.AnonTargetInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInstancesResource extends js.Object {
  /** Retrieves an aggregated list of target instances. */
  def aggregatedList(request: AnonAlt): Request_[TargetInstanceAggregatedList] = js.native
  /** Deletes the specified TargetInstance resource. */
  def delete(request: AnonTargetInstance): Request_[Operation] = js.native
  /** Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request. */
  def get(request: AnonQuotaUserTargetInstance): Request_[TargetInstance] = js.native
  /** Creates a TargetInstance resource in the specified project and zone using the data included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation] = js.native
  /** Retrieves a list of TargetInstance resources available to the specified project and zone. */
  def list(request: AnonFields): Request_[TargetInstanceList] = js.native
}

object TargetInstancesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[TargetInstanceAggregatedList],
    delete: AnonTargetInstance => Request_[Operation],
    get: AnonQuotaUserTargetInstance => Request_[TargetInstance],
    insert: AnonQuotaUser => Request_[Operation],
    list: AnonFields => Request_[TargetInstanceList]
  ): TargetInstancesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TargetInstancesResource]
  }
  @scala.inline
  implicit class TargetInstancesResourceOps[Self <: TargetInstancesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[TargetInstanceAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonTargetInstance => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonQuotaUserTargetInstance => Request_[TargetInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[TargetInstanceList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

