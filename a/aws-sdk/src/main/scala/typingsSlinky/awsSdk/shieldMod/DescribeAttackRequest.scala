package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAttackRequest extends js.Object {
  /**
    * The unique identifier (ID) for the attack that to be described.
    */
  var AttackId: typingsSlinky.awsSdk.shieldMod.AttackId = js.native
}

object DescribeAttackRequest {
  @scala.inline
  def apply(AttackId: AttackId): DescribeAttackRequest = {
    val __obj = js.Dynamic.literal(AttackId = AttackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAttackRequest]
  }
  @scala.inline
  implicit class DescribeAttackRequestOps[Self <: DescribeAttackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttackId(value: AttackId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

