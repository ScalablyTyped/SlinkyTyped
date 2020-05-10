package typingsSlinky.pulumiAws.globalTableMod

import typingsSlinky.pulumiAws.inputMod.dynamodb.GlobalTableReplica
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableState extends js.Object {
  /**
    * The ARN of the DynamoDB Global Table
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the global table. Must match underlying DynamoDB Table names in all regions.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
    */
  val replicas: js.UndefOr[Input[js.Array[Input[GlobalTableReplica]]]] = js.native
}

object GlobalTableState {
  @scala.inline
  def apply(): GlobalTableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalTableState]
  }
  @scala.inline
  implicit class GlobalTableStateOps[Self <: GlobalTableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
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
    @scala.inline
    def withReplicas(value: Input[js.Array[Input[GlobalTableReplica]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(js.undefined)
        ret
    }
  }
  
}

