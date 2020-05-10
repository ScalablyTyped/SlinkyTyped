package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalTableOutput extends js.Object {
  /**
    * Contains the details of the global table.
    */
  var GlobalTableDescription: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.GlobalTableDescription] = js.native
}

object DescribeGlobalTableOutput {
  @scala.inline
  def apply(): DescribeGlobalTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalTableOutput]
  }
  @scala.inline
  implicit class DescribeGlobalTableOutputOps[Self <: DescribeGlobalTableOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalTableDescription(value: GlobalTableDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableDescription")(js.undefined)
        ret
    }
  }
  
}

