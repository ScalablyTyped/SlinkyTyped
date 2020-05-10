package typingsSlinky.googleapis.computeV1Mod.computeV1

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCommitmentsScopedList extends js.Object {
  /**
    * [Output Only] A list of commitments contained in this scope.
    */
  var commitments: js.UndefOr[js.Array[SchemaCommitment]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of
    * commitments when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaCommitmentsScopedList {
  @scala.inline
  def apply(): SchemaCommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitmentsScopedList]
  }
  @scala.inline
  implicit class SchemaCommitmentsScopedListOps[Self <: SchemaCommitmentsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitments(value: js.Array[SchemaCommitment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitments")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

