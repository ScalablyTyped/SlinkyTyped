package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.Filter
import typingsSlinky.gapiClientCompute.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionCommitmentsResource extends js.Object {
  /** Retrieves an aggregated list of commitments. */
  def aggregatedList(request: Alt): Request[CommitmentAggregatedList] = js.native
  /** Returns the specified commitment resource. Get a list of available commitments by making a list() request. */
  def get(request: typingsSlinky.gapiClientCompute.anon.Commitment): Request[Commitment] = js.native
  /** Creates a commitment in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of commitments contained within the specified region. */
  def list(request: Filter): Request[CommitmentList] = js.native
}

object RegionCommitmentsResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[CommitmentAggregatedList],
    get: typingsSlinky.gapiClientCompute.anon.Commitment => Request[Commitment],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[CommitmentList]
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
    def withAggregatedList(value: Alt => Request[CommitmentAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: typingsSlinky.gapiClientCompute.anon.Commitment => Request[Commitment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: PrettyPrint => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Filter => Request[CommitmentList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

