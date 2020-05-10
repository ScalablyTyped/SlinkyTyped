package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAppengine.AnonAccesstoken
import typingsSlinky.gapiClientAppengine.AnonIngressRulesId
import typingsSlinky.gapiClientAppengine.AnonKey
import typingsSlinky.gapiClientAppengine.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IngressRulesResource extends js.Object {
  /**
    * Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the
    * final rule does not match traffic with the '&#42;' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list.
    */
  def batchUpdate(request: AnonAccesstoken): Request_[BatchUpdateIngressRulesResponse] = js.native
  /** Creates a firewall rule for the application. */
  def create(request: AnonAccesstoken): Request_[FirewallRule] = js.native
  /** Deletes the specified firewall rule. */
  def delete(request: AnonIngressRulesId): Request_[js.Object] = js.native
  /** Gets the specified firewall rule. */
  def get(request: AnonIngressRulesId): Request_[FirewallRule] = js.native
  /** Lists the firewall rules of an application. */
  def list(request: AnonKey): Request_[ListIngressRulesResponse] = js.native
  /** Updates the specified firewall rule. */
  def patch(request: AnonOauthtoken): Request_[FirewallRule] = js.native
}

object IngressRulesResource {
  @scala.inline
  def apply(
    batchUpdate: AnonAccesstoken => Request_[BatchUpdateIngressRulesResponse],
    create: AnonAccesstoken => Request_[FirewallRule],
    delete: AnonIngressRulesId => Request_[js.Object],
    get: AnonIngressRulesId => Request_[FirewallRule],
    list: AnonKey => Request_[ListIngressRulesResponse],
    patch: AnonOauthtoken => Request_[FirewallRule]
  ): IngressRulesResource = {
    val __obj = js.Dynamic.literal(batchUpdate = js.Any.fromFunction1(batchUpdate), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[IngressRulesResource]
  }
  @scala.inline
  implicit class IngressRulesResourceOps[Self <: IngressRulesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchUpdate(value: AnonAccesstoken => Request_[BatchUpdateIngressRulesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[FirewallRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonIngressRulesId => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonIngressRulesId => Request_[FirewallRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListIngressRulesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonOauthtoken => Request_[FirewallRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

