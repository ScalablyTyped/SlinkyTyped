package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTableReplicaAutoScalingOutput extends js.Object {
  /**
    * Represents the auto scaling properties of the table.
    */
  var TableAutoScalingDescription: js.UndefOr[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableAutoScalingDescription
  ] = js.native
}

object DescribeTableReplicaAutoScalingOutput {
  @scala.inline
  def apply(): DescribeTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingOutput]
  }
  @scala.inline
  implicit class DescribeTableReplicaAutoScalingOutputOps[Self <: DescribeTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableAutoScalingDescription(value: TableAutoScalingDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableAutoScalingDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableAutoScalingDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableAutoScalingDescription")(js.undefined)
        ret
    }
  }
  
}

