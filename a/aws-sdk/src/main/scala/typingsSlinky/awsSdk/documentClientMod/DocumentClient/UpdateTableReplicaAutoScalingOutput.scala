package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTableReplicaAutoScalingOutput extends js.Object {
  /**
    * Returns information about the auto scaling settings of a table with replicas.
    */
  var TableAutoScalingDescription: js.UndefOr[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableAutoScalingDescription
  ] = js.native
}

object UpdateTableReplicaAutoScalingOutput {
  @scala.inline
  def apply(): UpdateTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingOutput]
  }
  @scala.inline
  implicit class UpdateTableReplicaAutoScalingOutputOps[Self <: UpdateTableReplicaAutoScalingOutput] (val x: Self) extends AnyVal {
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

