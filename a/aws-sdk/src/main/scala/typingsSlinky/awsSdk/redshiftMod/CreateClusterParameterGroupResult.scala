package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterParameterGroupResult extends js.Object {
  var ClusterParameterGroup: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ClusterParameterGroup] = js.native
}

object CreateClusterParameterGroupResult {
  @scala.inline
  def apply(): CreateClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterParameterGroupResult]
  }
  @scala.inline
  implicit class CreateClusterParameterGroupResultOps[Self <: CreateClusterParameterGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterParameterGroup(value: ClusterParameterGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterParameterGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterGroup")(js.undefined)
        ret
    }
  }
  
}

