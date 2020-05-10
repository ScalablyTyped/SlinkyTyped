package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single firewall rule that is evaluated against incoming traffic and
  * provides an action to take on matched requests.
  */
@js.native
trait SchemaFirewallRule extends js.Object {
  /**
    * The action to take on matched requests.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * An optional string description of this rule. This field has a maximum
    * length of 100 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A positive integer between 1, Int32.MaxValue-1 that defines the order of
    * rule evaluation. Rules with the lowest priority are evaluated first.A
    * default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic
    * when no previous rule matches. Only the action of this rule can be
    * modified by the user.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * IP address or range, defined using CIDR notation, of requests that this
    * rule applies to. You can use the wildcard character &quot;*&quot; to
    * match all IPs equivalent to &quot;0/0&quot; and &quot;::/0&quot;
    * together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32  or
    * 2001:0db8:0000:0042:0000:8a2e:0370:7334.&lt;p&gt;Truncation will be
    * silently performed on addresses which are not properly truncated. For
    * example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24.
    * Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as
    * 2001:db8::/32.
    */
  var sourceRange: js.UndefOr[String] = js.native
}

object SchemaFirewallRule {
  @scala.inline
  def apply(): SchemaFirewallRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallRule]
  }
  @scala.inline
  implicit class SchemaFirewallRuleOps[Self <: SchemaFirewallRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRange")(js.undefined)
        ret
    }
  }
  
}

