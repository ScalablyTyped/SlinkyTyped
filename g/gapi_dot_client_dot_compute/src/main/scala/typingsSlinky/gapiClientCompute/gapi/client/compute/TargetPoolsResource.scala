package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFailoverRatio
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonPrettyPrint
import typingsSlinky.gapiClientCompute.AnonRegionTargetPool
import typingsSlinky.gapiClientCompute.AnonTargetPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetPoolsResource extends js.Object {
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: AnonTargetPool): Request_[Operation] = js.native
  /** Adds an instance to a target pool. */
  def addInstance(request: AnonTargetPool): Request_[Operation] = js.native
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(request: AnonAlt): Request_[TargetPoolAggregatedList] = js.native
  /** Deletes the specified target pool. */
  def delete(request: AnonTargetPool): Request_[Operation] = js.native
  /** Returns the specified target pool. Get a list of available target pools by making a list() request. */
  def get(request: AnonRegionTargetPool): Request_[TargetPool] = js.native
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: AnonRegionTargetPool): Request_[TargetPoolInstanceHealth] = js.native
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(request: AnonFilter): Request_[TargetPoolList] = js.native
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: AnonTargetPool): Request_[Operation] = js.native
  /** Removes instance URL from a target pool. */
  def removeInstance(request: AnonTargetPool): Request_[Operation] = js.native
  /** Changes a backup target pool's configurations. */
  def setBackup(request: AnonFailoverRatio): Request_[Operation] = js.native
}

object TargetPoolsResource {
  @scala.inline
  def apply(
    addHealthCheck: AnonTargetPool => Request_[Operation],
    addInstance: AnonTargetPool => Request_[Operation],
    aggregatedList: AnonAlt => Request_[TargetPoolAggregatedList],
    delete: AnonTargetPool => Request_[Operation],
    get: AnonRegionTargetPool => Request_[TargetPool],
    getHealth: AnonRegionTargetPool => Request_[TargetPoolInstanceHealth],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[TargetPoolList],
    removeHealthCheck: AnonTargetPool => Request_[Operation],
    removeInstance: AnonTargetPool => Request_[Operation],
    setBackup: AnonFailoverRatio => Request_[Operation]
  ): TargetPoolsResource = {
    val __obj = js.Dynamic.literal(addHealthCheck = js.Any.fromFunction1(addHealthCheck), addInstance = js.Any.fromFunction1(addInstance), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getHealth = js.Any.fromFunction1(getHealth), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeHealthCheck = js.Any.fromFunction1(removeHealthCheck), removeInstance = js.Any.fromFunction1(removeInstance), setBackup = js.Any.fromFunction1(setBackup))
    __obj.asInstanceOf[TargetPoolsResource]
  }
  @scala.inline
  implicit class TargetPoolsResourceOps[Self <: TargetPoolsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHealthCheck(value: AnonTargetPool => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHealthCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddInstance(value: AnonTargetPool => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[TargetPoolAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonTargetPool => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonRegionTargetPool => Request_[TargetPool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHealth(value: AnonRegionTargetPool => Request_[TargetPoolInstanceHealth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHealth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[TargetPoolList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveHealthCheck(value: AnonTargetPool => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHealthCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveInstance(value: AnonTargetPool => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBackup(value: AnonFailoverRatio => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackup")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

