package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAttackResponse extends js.Object {
  /**
    * The attack that is described.
    */
  var Attack: js.UndefOr[AttackDetail] = js.native
}

object DescribeAttackResponse {
  @scala.inline
  def apply(): DescribeAttackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAttackResponse]
  }
  @scala.inline
  implicit class DescribeAttackResponseOps[Self <: DescribeAttackResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttack(value: AttackDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attack")(js.undefined)
        ret
    }
  }
  
}

