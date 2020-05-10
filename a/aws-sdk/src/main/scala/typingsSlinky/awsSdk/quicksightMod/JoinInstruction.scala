package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinInstruction extends js.Object {
  /**
    * Left operand.
    */
  var LeftOperand: LogicalTableId = js.native
  /**
    * On Clause.
    */
  var OnClause: typingsSlinky.awsSdk.quicksightMod.OnClause = js.native
  /**
    * Right operand.
    */
  var RightOperand: LogicalTableId = js.native
  /**
    * Type.
    */
  var Type: JoinType = js.native
}

object JoinInstruction {
  @scala.inline
  def apply(LeftOperand: LogicalTableId, OnClause: OnClause, RightOperand: LogicalTableId, Type: JoinType): JoinInstruction = {
    val __obj = js.Dynamic.literal(LeftOperand = LeftOperand.asInstanceOf[js.Any], OnClause = OnClause.asInstanceOf[js.Any], RightOperand = RightOperand.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinInstruction]
  }
  @scala.inline
  implicit class JoinInstructionOps[Self <: JoinInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftOperand(value: LogicalTableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftOperand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClause(value: OnClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnClause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightOperand(value: LogicalTableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightOperand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: JoinType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

