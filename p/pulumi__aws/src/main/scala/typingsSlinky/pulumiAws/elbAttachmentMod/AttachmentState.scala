package typingsSlinky.pulumiAws.elbAttachmentMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentState extends js.Object {
  /**
    * The name of the ELB.
    */
  val elb: js.UndefOr[Input[String]] = js.native
  /**
    * Instance ID to place in the ELB pool.
    */
  val instance: js.UndefOr[Input[String]] = js.native
}

object AttachmentState {
  @scala.inline
  def apply(): AttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentState]
  }
  @scala.inline
  implicit class AttachmentStateOps[Self <: AttachmentState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElb(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elb")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
  }
  
}

