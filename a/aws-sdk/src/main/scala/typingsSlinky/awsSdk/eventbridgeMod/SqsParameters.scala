package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqsParameters extends js.Object {
  /**
    * The FIFO message group ID to use as the target.
    */
  var MessageGroupId: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.MessageGroupId] = js.native
}

object SqsParameters {
  @scala.inline
  def apply(): SqsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqsParameters]
  }
  @scala.inline
  implicit class SqsParametersOps[Self <: SqsParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageGroupId(value: MessageGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageGroupId")(js.undefined)
        ret
    }
  }
  
}

