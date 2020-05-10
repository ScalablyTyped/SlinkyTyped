package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBClusterParameterGroupResult extends js.Object {
  var DBClusterParameterGroup: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBClusterParameterGroup] = js.native
}

object CopyDBClusterParameterGroupResult {
  @scala.inline
  def apply(): CopyDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBClusterParameterGroupResult]
  }
  @scala.inline
  implicit class CopyDBClusterParameterGroupResultOps[Self <: CopyDBClusterParameterGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterParameterGroup(value: DBClusterParameterGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterParameterGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroup")(js.undefined)
        ret
    }
  }
  
}

