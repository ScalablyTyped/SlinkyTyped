package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssignmentResponse extends js.Object {
  /**
    *  The assignment. The response includes one Assignment element. 
    */
  var Assignment: js.UndefOr[typingsSlinky.awsSdk.mturkMod.Assignment] = js.native
  /**
    *  The HIT associated with this assignment. The response includes one HIT element.
    */
  var HIT: js.UndefOr[typingsSlinky.awsSdk.mturkMod.HIT] = js.native
}

object GetAssignmentResponse {
  @scala.inline
  def apply(): GetAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssignmentResponse]
  }
  @scala.inline
  implicit class GetAssignmentResponseOps[Self <: GetAssignmentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignment(value: Assignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assignment")(js.undefined)
        ret
    }
    @scala.inline
    def withHIT(value: HIT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHIT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HIT")(js.undefined)
        ret
    }
  }
  
}

