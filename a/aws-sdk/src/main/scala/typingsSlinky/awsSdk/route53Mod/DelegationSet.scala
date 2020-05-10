package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegationSet extends js.Object {
  /**
    * The value that you specified for CallerReference when you created the reusable delegation set.
    */
  var CallerReference: js.UndefOr[Nonce] = js.native
  /**
    * The ID that Amazon Route 53 assigns to a reusable delegation set.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable delegation set.
    */
  var NameServers: DelegationSetNameServers = js.native
}

object DelegationSet {
  @scala.inline
  def apply(NameServers: DelegationSetNameServers): DelegationSet = {
    val __obj = js.Dynamic.literal(NameServers = NameServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationSet]
  }
  @scala.inline
  implicit class DelegationSetOps[Self <: DelegationSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNameServers(value: DelegationSetNameServers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallerReference(value: Nonce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallerReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerReference")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
  }
  
}

