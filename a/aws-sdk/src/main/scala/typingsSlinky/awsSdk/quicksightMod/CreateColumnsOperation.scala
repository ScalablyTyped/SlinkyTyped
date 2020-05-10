package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateColumnsOperation extends js.Object {
  /**
    * Calculated columns to create.
    */
  var Columns: CalculatedColumnList = js.native
}

object CreateColumnsOperation {
  @scala.inline
  def apply(Columns: CalculatedColumnList): CreateColumnsOperation = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateColumnsOperation]
  }
  @scala.inline
  implicit class CreateColumnsOperationOps[Self <: CreateColumnsOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: CalculatedColumnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

