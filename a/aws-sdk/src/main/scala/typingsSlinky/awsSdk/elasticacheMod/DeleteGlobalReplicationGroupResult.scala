package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalReplicationGroupResult extends js.Object {
  var GlobalReplicationGroup: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.GlobalReplicationGroup] = js.native
}

object DeleteGlobalReplicationGroupResult {
  @scala.inline
  def apply(): DeleteGlobalReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGlobalReplicationGroupResult]
  }
  @scala.inline
  implicit class DeleteGlobalReplicationGroupResultOps[Self <: DeleteGlobalReplicationGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalReplicationGroup(value: GlobalReplicationGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalReplicationGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalReplicationGroup")(js.undefined)
        ret
    }
  }
  
}

