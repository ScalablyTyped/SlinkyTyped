package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Criterion extends js.Object {
  /**
    * A "contains" operator to match for the filter used to create the rule.
    */
  var contains: js.UndefOr[ValueList] = js.native
  /**
    * An "equals" operator to match for the filter used to create the rule.
    */
  @JSName("eq")
  var eq_FCriterion: js.UndefOr[ValueList] = js.native
  /**
    * An "exists" operator to match for the filter used to create the rule. 
    */
  var exists: js.UndefOr[Boolean] = js.native
  /**
    * A "not equals" operator to match for the filter used to create the rule.
    */
  var neq: js.UndefOr[ValueList] = js.native
}

object Criterion {
  @scala.inline
  def apply(): Criterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Criterion]
  }
  @scala.inline
  implicit class CriterionOps[Self <: Criterion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: ValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withEq(value: ValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(js.undefined)
        ret
    }
    @scala.inline
    def withExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.undefined)
        ret
    }
    @scala.inline
    def withNeq(value: ValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neq")(js.undefined)
        ret
    }
  }
  
}

