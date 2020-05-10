package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackEventsOutput extends js.Object {
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * A list of StackEvents structures.
    */
  var StackEvents: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackEvents] = js.native
}

object DescribeStackEventsOutput {
  @scala.inline
  def apply(): DescribeStackEventsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackEventsOutput]
  }
  @scala.inline
  implicit class DescribeStackEventsOutputOps[Self <: DescribeStackEventsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStackEvents(value: StackEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackEvents")(js.undefined)
        ret
    }
  }
  
}

