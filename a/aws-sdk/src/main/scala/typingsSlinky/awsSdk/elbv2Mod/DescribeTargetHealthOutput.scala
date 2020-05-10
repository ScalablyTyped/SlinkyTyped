package typingsSlinky.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTargetHealthOutput extends js.Object {
  /**
    * Information about the health of the targets.
    */
  var TargetHealthDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetHealthDescriptions] = js.native
}

object DescribeTargetHealthOutput {
  @scala.inline
  def apply(): DescribeTargetHealthOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTargetHealthOutput]
  }
  @scala.inline
  implicit class DescribeTargetHealthOutputOps[Self <: DescribeTargetHealthOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetHealthDescriptions(value: TargetHealthDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetHealthDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetHealthDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetHealthDescriptions")(js.undefined)
        ret
    }
  }
  
}

