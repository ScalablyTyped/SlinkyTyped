package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttackDetail extends js.Object {
  /**
    * List of counters that describe the attack for the specified time period.
    */
  var AttackCounters: js.UndefOr[SummarizedCounterList] = js.native
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[typingsSlinky.awsSdk.shieldMod.AttackId] = js.native
  /**
    * The array of AttackProperty objects.
    */
  var AttackProperties: js.UndefOr[typingsSlinky.awsSdk.shieldMod.AttackProperties] = js.native
  /**
    * The time the attack ended, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * List of mitigation actions taken for the attack.
    */
  var Mitigations: js.UndefOr[MitigationList] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[typingsSlinky.awsSdk.shieldMod.ResourceArn] = js.native
  /**
    * The time the attack started, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
    */
  var SubResources: js.UndefOr[SubResourceSummaryList] = js.native
}

object AttackDetail {
  @scala.inline
  def apply(): AttackDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackDetail]
  }
  @scala.inline
  implicit class AttackDetailOps[Self <: AttackDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttackCounters(value: SummarizedCounterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackCounters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttackCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackCounters")(js.undefined)
        ret
    }
    @scala.inline
    def withAttackId(value: AttackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackId")(js.undefined)
        ret
    }
    @scala.inline
    def withAttackProperties(value: AttackProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttackProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMitigations(value: MitigationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mitigations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMitigations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mitigations")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceArn(value: ResourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSubResources(value: SubResourceSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubResources")(js.undefined)
        ret
    }
  }
  
}

