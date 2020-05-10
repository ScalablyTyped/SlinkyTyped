package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberFrameworkAttributes extends js.Object {
  /**
    * Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[MemberFabricAttributes] = js.native
}

object MemberFrameworkAttributes {
  @scala.inline
  def apply(): MemberFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFrameworkAttributes]
  }
  @scala.inline
  implicit class MemberFrameworkAttributesOps[Self <: MemberFrameworkAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFabric(value: MemberFabricAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fabric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFabric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fabric")(js.undefined)
        ret
    }
  }
  
}

