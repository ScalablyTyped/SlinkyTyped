package typingsSlinky.maximMazurokGapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Alt
import typingsSlinky.maximMazurokGapiClientAppengine.anon.IngressRulesId
import typingsSlinky.maximMazurokGapiClientAppengine.anon.MatchingAddress
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Resource
import typingsSlinky.maximMazurokGapiClientAppengine.anon.UploadType
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientAppengine.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngressRulesResource extends js.Object {
  
  def batchUpdate(request: Alt, body: BatchUpdateIngressRulesRequest): Request[BatchUpdateIngressRulesResponse] = js.native
  /**
    * Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the final rule does not match traffic
    * with the '*' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list.
    */
  def batchUpdate(request: Resource): Request[BatchUpdateIngressRulesResponse] = js.native
  
  def create(request: Alt, body: FirewallRule): Request[FirewallRule] = js.native
  /** Creates a firewall rule for the application. */
  def create(request: UploadType): Request[FirewallRule] = js.native
  
  /** Deletes the specified firewall rule. */
  def delete(): Request[js.Object] = js.native
  def delete(request: IngressRulesId): Request[js.Object] = js.native
  
  /** Gets the specified firewall rule. */
  def get(): Request[FirewallRule] = js.native
  def get(request: IngressRulesId): Request[FirewallRule] = js.native
  
  /** Lists the firewall rules of an application. */
  def list(): Request[ListIngressRulesResponse] = js.native
  def list(request: MatchingAddress): Request[ListIngressRulesResponse] = js.native
  
  /** Updates the specified firewall rule. */
  def patch(request: Uploadprotocol): Request[FirewallRule] = js.native
  def patch(request: Xgafv, body: FirewallRule): Request[FirewallRule] = js.native
}
