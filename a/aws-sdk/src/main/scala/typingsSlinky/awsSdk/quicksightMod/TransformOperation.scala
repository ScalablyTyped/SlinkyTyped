package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOperation extends js.Object {
  /**
    * A transform operation that casts a column to a different type.
    */
  var CastColumnTypeOperation: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.CastColumnTypeOperation] = js.native
  /**
    * An operation that creates calculated columns. Columns created in one such operation form a lexical closure.
    */
  var CreateColumnsOperation: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.CreateColumnsOperation] = js.native
  /**
    * An operation that filters rows based on some condition.
    */
  var FilterOperation: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.FilterOperation] = js.native
  /**
    * An operation that projects columns. Operations that come after a projection can only refer to projected columns.
    */
  var ProjectOperation: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ProjectOperation] = js.native
  /**
    * An operation that renames a column.
    */
  var RenameColumnOperation: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RenameColumnOperation] = js.native
  /**
    * An operation that tags a column with additional information.
    */
  var TagColumnOperation: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.TagColumnOperation] = js.native
}

object TransformOperation {
  @scala.inline
  def apply(): TransformOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOperation]
  }
  @scala.inline
  implicit class TransformOperationOps[Self <: TransformOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCastColumnTypeOperation(value: CastColumnTypeOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CastColumnTypeOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCastColumnTypeOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CastColumnTypeOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateColumnsOperation(value: CreateColumnsOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateColumnsOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateColumnsOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateColumnsOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOperation(value: FilterOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectOperation(value: ProjectOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameColumnOperation(value: RenameColumnOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenameColumnOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameColumnOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenameColumnOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withTagColumnOperation(value: TagColumnOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagColumnOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagColumnOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagColumnOperation")(js.undefined)
        ret
    }
  }
  
}

