package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupSummary extends js.Object {
  /**
    * The filter expression defining the parameters to include traces.
    */
  var FilterExpression: js.UndefOr[String] = js.native
  /**
    * The ARN of the group generated based on the GroupName.
    */
  var GroupARN: js.UndefOr[String] = js.native
  /**
    * The unique case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[String] = js.native
}

object GroupSummary {
  @scala.inline
  def apply(): GroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSummary]
  }
  @scala.inline
  implicit class GroupSummaryOps[Self <: GroupSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupARN")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
  }
  
}

