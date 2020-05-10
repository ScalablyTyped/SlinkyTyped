package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonCommitment
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionCommitmentsResource extends js.Object {
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(request: AnonAlt): Request_[CommitmentAggregatedList] = js.native
  /** Returns the specified commitment resource. Get a list of available commitments by making a list() request. */
  def get(request: AnonCommitment): Request_[Commitment] = js.native
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves a list of commitments contained within the specified region. */
  def list(request: AnonFilter): Request_[CommitmentList] = js.native
}

object RegionCommitmentsResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[CommitmentAggregatedList],
    get: AnonCommitment => Request_[Commitment],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[CommitmentList]
  ): RegionCommitmentsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RegionCommitmentsResource]
  }
  @scala.inline
  implicit class RegionCommitmentsResourceOps[Self <: RegionCommitmentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[CommitmentAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonCommitment => Request_[Commitment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[CommitmentList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

