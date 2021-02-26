package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCompute.anon.Alt
import typingsSlinky.maximMazurokGapiClientCompute.anon.FieldsForwardingRule
import typingsSlinky.maximMazurokGapiClientCompute.anon.Filter
import typingsSlinky.maximMazurokGapiClientCompute.anon.ForwardingRuleKey
import typingsSlinky.maximMazurokGapiClientCompute.anon.QuotaUserRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardingRulesResource extends StObject {
  
  /** Retrieves an aggregated list of forwarding rules. */
  def aggregatedList(): Request[ForwardingRuleAggregatedList] = js.native
  def aggregatedList(request: Alt): Request[ForwardingRuleAggregatedList] = js.native
  
  /** Deletes the specified ForwardingRule resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsSlinky.maximMazurokGapiClientCompute.anon.ForwardingRule): Request[Operation] = js.native
  
  /** Returns the specified ForwardingRule resource. */
  def get(): Request[ForwardingRule] = js.native
  def get(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Region): Request[ForwardingRule] = js.native
  
  def insert(request: typingsSlinky.maximMazurokGapiClientCompute.anon.Project, body: ForwardingRule): Request[Operation] = js.native
  /** Creates a ForwardingRule resource in the specified project and region using the data included in the request. */
  def insert(request: QuotaUserRegion): Request[Operation] = js.native
  
  /** Retrieves a list of ForwardingRule resources available to the specified project and region. */
  def list(): Request[ForwardingRuleList] = js.native
  def list(request: Filter): Request[ForwardingRuleList] = js.native
  
  /**
    * Updates the specified forwarding rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
    * Currently, you can only patch the network_tier field.
    */
  def patch(request: FieldsForwardingRule): Request[Operation] = js.native
  def patch(request: typingsSlinky.maximMazurokGapiClientCompute.anon.ForwardingRule, body: ForwardingRule): Request[Operation] = js.native
  
  /** Changes target URL for forwarding rule. The new target should be of the same type as the old target. */
  def setTarget(request: ForwardingRuleKey): Request[Operation] = js.native
  def setTarget(request: typingsSlinky.maximMazurokGapiClientCompute.anon.ForwardingRule, body: TargetReference): Request[Operation] = js.native
}
