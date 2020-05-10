package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubResourceSummary extends js.Object {
  /**
    * The list of attack types and associated counters.
    */
  var AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.native
  /**
    * The counters that describe the details of the attack.
    */
  var Counters: js.UndefOr[SummarizedCounterList] = js.native
  /**
    * The unique identifier (ID) of the SubResource.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The SubResource type.
    */
  var Type: js.UndefOr[SubResourceType] = js.native
}

object SubResourceSummary {
  @scala.inline
  def apply(): SubResourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubResourceSummary]
  }
  @scala.inline
  implicit class SubResourceSummaryOps[Self <: SubResourceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttackVectors(value: SummarizedAttackVectorList): Self = {
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
    def withCounters(value: SummarizedCounterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Counters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Counters")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: SubResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

