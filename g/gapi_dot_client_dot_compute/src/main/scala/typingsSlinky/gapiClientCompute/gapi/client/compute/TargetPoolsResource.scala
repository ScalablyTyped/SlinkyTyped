package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.FailoverRatio
import typingsSlinky.gapiClientCompute.anon.Filter
import typingsSlinky.gapiClientCompute.anon.PrettyPrint
import typingsSlinky.gapiClientCompute.anon.RegionTargetPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetPoolsResource extends js.Object {
  /** Adds health check URLs to a target pool. */
  def addHealthCheck(request: typingsSlinky.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Adds an instance to a target pool. */
  def addInstance(request: typingsSlinky.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Retrieves an aggregated list of target pools. */
  def aggregatedList(request: Alt): Request[TargetPoolAggregatedList] = js.native
  /** Deletes the specified target pool. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Returns the specified target pool. Get a list of available target pools by making a list() request. */
  def get(request: RegionTargetPool): Request[TargetPool] = js.native
  /** Gets the most recent health check results for each IP for the instance that is referenced by the given target pool. */
  def getHealth(request: RegionTargetPool): Request[TargetPoolInstanceHealth] = js.native
  /** Creates a target pool in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of target pools available to the specified project and region. */
  def list(request: Filter): Request[TargetPoolList] = js.native
  /** Removes health check URL from a target pool. */
  def removeHealthCheck(request: typingsSlinky.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Removes instance URL from a target pool. */
  def removeInstance(request: typingsSlinky.gapiClientCompute.anon.TargetPool): Request[Operation] = js.native
  /** Changes a backup target pool's configurations. */
  def setBackup(request: FailoverRatio): Request[Operation] = js.native
}

object TargetPoolsResource {
  @scala.inline
  def apply(
    addHealthCheck: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation],
    addInstance: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation],
    aggregatedList: Alt => Request[TargetPoolAggregatedList],
    delete: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation],
    get: RegionTargetPool => Request[TargetPool],
    getHealth: RegionTargetPool => Request[TargetPoolInstanceHealth],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[TargetPoolList],
    removeHealthCheck: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation],
    removeInstance: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation],
    setBackup: FailoverRatio => Request[Operation]
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
    def withAddHealthCheck(value: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHealthCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddInstance(value: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggregatedList(value: Alt => Request[TargetPoolAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: RegionTargetPool => Request[TargetPool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHealth(value: RegionTargetPool => Request[TargetPoolInstanceHealth]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHealth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: PrettyPrint => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Filter => Request[TargetPoolList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveHealthCheck(value: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHealthCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveInstance(value: typingsSlinky.gapiClientCompute.anon.TargetPool => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInstance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBackup(value: FailoverRatio => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackup")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

