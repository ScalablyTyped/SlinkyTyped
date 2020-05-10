package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTableOutput extends js.Object {
  /**
    * The properties of the table.
    */
  var Table: js.UndefOr[TableDescription] = js.native
}

object DescribeTableOutput {
  @scala.inline
  def apply(): DescribeTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableOutput]
  }
  @scala.inline
  implicit class DescribeTableOutputOps[Self <: DescribeTableOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTable(value: TableDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Table")(js.undefined)
        ret
    }
  }
  
}

