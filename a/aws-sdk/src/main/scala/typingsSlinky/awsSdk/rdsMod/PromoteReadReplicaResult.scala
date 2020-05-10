package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteReadReplicaResult extends js.Object {
  var DBInstance: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBInstance] = js.native
}

object PromoteReadReplicaResult {
  @scala.inline
  def apply(): PromoteReadReplicaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromoteReadReplicaResult]
  }
  @scala.inline
  implicit class PromoteReadReplicaResultOps[Self <: PromoteReadReplicaResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBInstance(value: DBInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstance")(js.undefined)
        ret
    }
  }
  
}

