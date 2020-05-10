package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBProxyTargetGroupResponse extends js.Object {
  /**
    * The settings of the modified DBProxyTarget.
    */
  var DBProxyTargetGroup: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBProxyTargetGroup] = js.native
}

object ModifyDBProxyTargetGroupResponse {
  @scala.inline
  def apply(): ModifyDBProxyTargetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBProxyTargetGroupResponse]
  }
  @scala.inline
  implicit class ModifyDBProxyTargetGroupResponseOps[Self <: ModifyDBProxyTargetGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBProxyTargetGroup(value: DBProxyTargetGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyTargetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBProxyTargetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyTargetGroup")(js.undefined)
        ret
    }
  }
  
}

