package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalNodeGroup extends js.Object {
  /**
    * The name of the global node group
    */
  var GlobalNodeGroupId: js.UndefOr[String] = js.native
  /**
    * The keyspace for this node group
    */
  var Slots: js.UndefOr[String] = js.native
}

object GlobalNodeGroup {
  @scala.inline
  def apply(): GlobalNodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalNodeGroup]
  }
  @scala.inline
  implicit class GlobalNodeGroupOps[Self <: GlobalNodeGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalNodeGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNodeGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalNodeGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNodeGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withSlots(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slots")(js.undefined)
        ret
    }
  }
  
}

