package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMemberOutput extends js.Object {
  /**
    * The unique identifier of the member.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
}

object CreateMemberOutput {
  @scala.inline
  def apply(): CreateMemberOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMemberOutput]
  }
  @scala.inline
  implicit class CreateMemberOutputOps[Self <: CreateMemberOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberId")(js.undefined)
        ret
    }
  }
  
}

