package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRoleResponse extends js.Object {
  /**
    * If the Success element contains false, this value is an array of one or more error messages that were generated during the test process.
    */
  var Messages: js.UndefOr[ExceptionMessages] = js.native
  /**
    * If the operation is successful, this value is true; otherwise, the value is false.
    */
  var Success: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Success] = js.native
}

object TestRoleResponse {
  @scala.inline
  def apply(): TestRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRoleResponse]
  }
  @scala.inline
  implicit class TestRoleResponseOps[Self <: TestRoleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: ExceptionMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: Success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Success")(js.undefined)
        ret
    }
  }
  
}

