package typingsSlinky.pulumiAws.inputMod.cloudwatch

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetSqsTarget extends js.Object {
  /**
    * The FIFO message group ID to use as the target.
    */
  var messageGroupId: js.UndefOr[Input[String]] = js.native
}

object EventTargetSqsTarget {
  @scala.inline
  def apply(): EventTargetSqsTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTargetSqsTarget]
  }
  @scala.inline
  implicit class EventTargetSqsTargetOps[Self <: EventTargetSqsTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageGroupId")(js.undefined)
        ret
    }
  }
  
}

