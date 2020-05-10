package typingsSlinky.pulumiAws.subnetGroupMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetGroupArgs extends js.Object {
  /**
    * A description of the subnet group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the subnet group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of VPC subnet IDs for the subnet group.
    */
  val subnetIds: Input[js.Array[Input[String]]] = js.native
}

object SubnetGroupArgs {
  @scala.inline
  def apply(subnetIds: Input[js.Array[Input[String]]]): SubnetGroupArgs = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetGroupArgs]
  }
  @scala.inline
  implicit class SubnetGroupArgsOps[Self <: SubnetGroupArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

