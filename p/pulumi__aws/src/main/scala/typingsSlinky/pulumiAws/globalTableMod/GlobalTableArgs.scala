package typingsSlinky.pulumiAws.globalTableMod

import typingsSlinky.pulumiAws.inputMod.dynamodb.GlobalTableReplica
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalTableArgs extends js.Object {
  /**
    * The name of the global table. Must match underlying DynamoDB Table names in all regions.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
    */
  val replicas: Input[js.Array[Input[GlobalTableReplica]]] = js.native
}

object GlobalTableArgs {
  @scala.inline
  def apply(replicas: Input[js.Array[Input[GlobalTableReplica]]]): GlobalTableArgs = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableArgs]
  }
  @scala.inline
  implicit class GlobalTableArgsOps[Self <: GlobalTableArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicas(value: Input[js.Array[Input[GlobalTableReplica]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
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

