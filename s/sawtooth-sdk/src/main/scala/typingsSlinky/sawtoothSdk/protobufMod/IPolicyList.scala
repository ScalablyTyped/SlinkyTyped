package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolicyList extends js.Object {
  /** PolicyList policies */
  var policies: js.UndefOr[js.Array[IPolicy] | Null] = js.native
}

object IPolicyList {
  @scala.inline
  def apply(): IPolicyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicyList]
  }
  @scala.inline
  implicit class IPolicyListOps[Self <: IPolicyList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicies(value: js.Array[IPolicy]): Self = {
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
    @scala.inline
    def withPoliciesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(null)
        ret
    }
  }
  
}

