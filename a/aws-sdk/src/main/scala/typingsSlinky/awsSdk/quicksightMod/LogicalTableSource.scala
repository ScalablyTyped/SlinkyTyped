package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalTableSource extends js.Object {
  /**
    * Specifies the result of a join of two logical tables.
    */
  var JoinInstruction: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.JoinInstruction] = js.native
  /**
    * Physical table ID.
    */
  var PhysicalTableId: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.PhysicalTableId] = js.native
}

object LogicalTableSource {
  @scala.inline
  def apply(): LogicalTableSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogicalTableSource]
  }
  @scala.inline
  implicit class LogicalTableSourceOps[Self <: LogicalTableSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJoinInstruction(value: JoinInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JoinInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinInstruction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JoinInstruction")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalTableId(value: PhysicalTableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalTableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalTableId")(js.undefined)
        ret
    }
  }
  
}

