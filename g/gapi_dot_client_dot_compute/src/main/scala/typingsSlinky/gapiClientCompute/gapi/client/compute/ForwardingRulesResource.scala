package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.Filter
import typingsSlinky.gapiClientCompute.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingRulesResource extends js.Object {
  /** Retrieves an aggregated list of forwarding rules. */
  def aggregatedList(request: Alt): Request[ForwardingRuleAggregatedList]
  /** Deletes the specified ForwardingRule resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.ForwardingRule): Request[Operation]
  /** Returns the specified ForwardingRule resource. */
  def get(request: typingsSlinky.gapiClientCompute.anon.Region): Request[ForwardingRule]
  /** Creates a ForwardingRule resource in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves a list of ForwardingRule resources available to the specified project and region. */
  def list(request: Filter): Request[ForwardingRuleList]
  /** Changes target URL for forwarding rule. The new target should be of the same type as the old target. */
  def setTarget(request: typingsSlinky.gapiClientCompute.anon.ForwardingRule): Request[Operation]
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
}

