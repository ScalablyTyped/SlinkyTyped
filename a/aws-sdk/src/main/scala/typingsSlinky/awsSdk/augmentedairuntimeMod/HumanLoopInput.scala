package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopInput extends js.Object {
  /**
    * Serialized input from the human loop. The input must be a string representation of a file in JSON format.
    */
  var InputContent: typingsSlinky.awsSdk.augmentedairuntimeMod.InputContent = js.native
}

object HumanLoopInput {
  @scala.inline
  def apply(InputContent: InputContent): HumanLoopInput = {
    val __obj = js.Dynamic.literal(InputContent = InputContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopInput]
  }
  @scala.inline
  implicit class HumanLoopInputOps[Self <: HumanLoopInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputContent(value: InputContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

