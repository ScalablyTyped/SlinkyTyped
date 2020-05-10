package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SNS topic.
    */
  var TargetAddress: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.TargetAddress] = js.native
  /**
    * The status of the target.
    */
  var TargetStatus: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.TargetStatus] = js.native
  /**
    * The type of the target (for example, SNS).
    */
  var TargetType: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.TargetType] = js.native
}

object TargetSummary {
  @scala.inline
  def apply(): TargetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetSummary]
  }
  @scala.inline
  implicit class TargetSummaryOps[Self <: TargetSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetAddress(value: TargetAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetStatus(value: TargetStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetType(value: TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(js.undefined)
        ret
    }
  }
  
}

