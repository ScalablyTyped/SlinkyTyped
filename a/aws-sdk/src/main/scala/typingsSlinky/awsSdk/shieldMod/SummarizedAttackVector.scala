package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummarizedAttackVector extends js.Object {
  /**
    * The list of counters that describe the details of the attack.
    */
  var VectorCounters: js.UndefOr[SummarizedCounterList] = js.native
  /**
    * The attack type, for example, SNMP reflection or SYN flood.
    */
  var VectorType: String = js.native
}

object SummarizedAttackVector {
  @scala.inline
  def apply(VectorType: String): SummarizedAttackVector = {
    val __obj = js.Dynamic.literal(VectorType = VectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummarizedAttackVector]
  }
  @scala.inline
  implicit class SummarizedAttackVectorOps[Self <: SummarizedAttackVector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVectorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVectorCounters(value: SummarizedCounterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VectorCounters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVectorCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VectorCounters")(js.undefined)
        ret
    }
  }
  
}

