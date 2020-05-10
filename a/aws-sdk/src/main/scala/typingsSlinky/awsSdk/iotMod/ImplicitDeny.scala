package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImplicitDeny extends js.Object {
  /**
    * Policies that don't contain a matching allow or deny statement for the specified action on the specified resource. 
    */
  var policies: js.UndefOr[Policies] = js.native
}

object ImplicitDeny {
  @scala.inline
  def apply(): ImplicitDeny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplicitDeny]
  }
  @scala.inline
  implicit class ImplicitDenyOps[Self <: ImplicitDeny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicies(value: Policies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(js.undefined)
        ret
    }
  }
  
}

