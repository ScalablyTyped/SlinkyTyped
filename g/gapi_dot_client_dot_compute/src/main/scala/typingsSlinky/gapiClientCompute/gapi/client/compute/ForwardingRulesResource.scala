package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.Filter
import typingsSlinky.gapiClientCompute.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardingRulesResource extends js.Object {
  /** Retrieves an aggregated list of forwarding rules. */
  def aggregatedList(request: Alt): Request[ForwardingRuleAggregatedList] = js.native
  /** Deletes the specified ForwardingRule resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.ForwardingRule): Request[Operation] = js.native
  /** Returns the specified ForwardingRule resource. */
  def get(request: typingsSlinky.gapiClientCompute.anon.Region): Request[ForwardingRule] = js.native
  /** Creates a ForwardingRule resource in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of ForwardingRule resources available to the specified project and region. */
  def list(request: Filter): Request[ForwardingRuleList] = js.native
  /** Changes target URL for forwarding rule. The new target should be of the same type as the old target. */
  def setTarget(request: typingsSlinky.gapiClientCompute.anon.ForwardingRule): Request[Operation] = js.native
}

object ForwardingRulesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[ForwardingRuleAggregatedList],
    delete: typingsSlinky.gapiClientCompute.anon.ForwardingRule => Request[Operation],
    get: typingsSlinky.gapiClientCompute.anon.Region => Request[ForwardingRule],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[ForwardingRuleList],
    setTarget: typingsSlinky.gapiClientCompute.anon.ForwardingRule => Request[Operation]
  ): ForwardingRulesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setTarget = js.Any.fromFunction1(setTarget))
    __obj.asInstanceOf[ForwardingRulesResource]
  }
  @scala.inline
  implicit class ForwardingRulesResourceOps[Self <: ForwardingRulesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: Alt => Request[ForwardingRuleAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: typingsSlinky.gapiClientCompute.anon.ForwardingRule => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: typingsSlinky.gapiClientCompute.anon.Region => Request[ForwardingRule]): Self = {
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
    def withList(value: Filter => Request[ForwardingRuleList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTarget(value: typingsSlinky.gapiClientCompute.anon.ForwardingRule => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTarget")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

