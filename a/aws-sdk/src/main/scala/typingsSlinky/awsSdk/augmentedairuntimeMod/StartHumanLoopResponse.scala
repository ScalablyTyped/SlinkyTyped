package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartHumanLoopResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the human loop.
    */
  var HumanLoopArn: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopArn] = js.native
}

object StartHumanLoopResponse {
  @scala.inline
  def apply(): StartHumanLoopResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartHumanLoopResponse]
  }
  @scala.inline
  implicit class StartHumanLoopResponseOps[Self <: StartHumanLoopResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanLoopArn(value: HumanLoopArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopArn")(js.undefined)
        ret
    }
  }
  
}

