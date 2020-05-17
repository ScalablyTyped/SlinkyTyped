package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetworksScopedList extends js.Object {
  /** List of subnetworks contained in this scope. */
  var subnetworks: js.UndefOr[js.Array[Subnetwork]] = js.native
  /** An informational warning that appears when the list of addresses is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object SubnetworksScopedList {
  @scala.inline
  def apply(): SubnetworksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworksScopedList]
  }
  @scala.inline
  implicit class SubnetworksScopedListOps[Self <: SubnetworksScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnetworks(value: js.Array[Subnetwork]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworks")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

