package typingsSlinky.pulumiAws.resourceAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAssociationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the RAM Resource Share.
    */
  val resourceShareArn: js.UndefOr[Input[String]] = js.native
}

object ResourceAssociationState {
  @scala.inline
  def apply(): ResourceAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAssociationState]
  }
  @scala.inline
  implicit class ResourceAssociationStateOps[Self <: ResourceAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceShareArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceShareArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceShareArn")(js.undefined)
        ret
    }
  }
  
}

