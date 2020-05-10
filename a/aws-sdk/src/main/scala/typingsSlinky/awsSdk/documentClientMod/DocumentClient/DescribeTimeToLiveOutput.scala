package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTimeToLiveOutput extends js.Object {
  /**
    * 
    */
  var TimeToLiveDescription: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TimeToLiveDescription] = js.native
}

object DescribeTimeToLiveOutput {
  @scala.inline
  def apply(): DescribeTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTimeToLiveOutput]
  }
  @scala.inline
  implicit class DescribeTimeToLiveOutputOps[Self <: DescribeTimeToLiveOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimeToLiveDescription(value: TimeToLiveDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToLiveDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeToLiveDescription")(js.undefined)
        ret
    }
  }
  
}

