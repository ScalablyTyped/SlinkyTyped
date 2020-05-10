package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStackOutput extends js.Object {
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackId] = js.native
}

object CreateStackOutput {
  @scala.inline
  def apply(): CreateStackOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStackOutput]
  }
  @scala.inline
  implicit class CreateStackOutputOps[Self <: CreateStackOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackId(value: StackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
  }
  
}

