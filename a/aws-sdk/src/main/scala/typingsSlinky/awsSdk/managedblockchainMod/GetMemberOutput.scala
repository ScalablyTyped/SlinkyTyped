package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMemberOutput extends js.Object {
  /**
    * The properties of a member.
    */
  var Member: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.Member] = js.native
}

object GetMemberOutput {
  @scala.inline
  def apply(): GetMemberOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMemberOutput]
  }
  @scala.inline
  implicit class GetMemberOutputOps[Self <: GetMemberOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMember(value: Member): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Member")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Member")(js.undefined)
        ret
    }
  }
  
}

