package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConditionalForwardersResult extends js.Object {
  /**
    * The list of conditional forwarders that have been created.
    */
  var ConditionalForwarders: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ConditionalForwarders] = js.native
}

object DescribeConditionalForwardersResult {
  @scala.inline
  def apply(): DescribeConditionalForwardersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConditionalForwardersResult]
  }
  @scala.inline
  implicit class DescribeConditionalForwardersResultOps[Self <: DescribeConditionalForwardersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionalForwarders(value: ConditionalForwarders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalForwarders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalForwarders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalForwarders")(js.undefined)
        ret
    }
  }
  
}

