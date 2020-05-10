package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttackSummary extends js.Object {
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[String] = js.native
  /**
    * The list of attacks for a specified time period.
    */
  var AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.native
  /**
    * The end time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * The start time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
}

object AttackSummary {
  @scala.inline
  def apply(): AttackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackSummary]
  }
  @scala.inline
  implicit class AttackSummaryOps[Self <: AttackSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttackId(value: String): Self = {
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
    def withAttackVectors(value: AttackVectorDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackVectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttackVectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackVectors")(js.undefined)
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
    def withResourceArn(value: String): Self = {
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
  }
  
}

