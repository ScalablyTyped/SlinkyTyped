package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * Represents the equal condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Eq] = js.native
  /**
    * Represents an equal condition to be applied to a single field when querying for findings.
    */
  var Equals: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Equals] = js.native
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var GreaterThan: js.UndefOr[Long] = js.native
  /**
    * Represents a greater than equal condition to be applied to a single field when querying for findings.
    */
  var GreaterThanOrEqual: js.UndefOr[Long] = js.native
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var Gt: js.UndefOr[Integer] = js.native
  /**
    * Represents a greater than equal condition to be applied to a single field when querying for findings.
    */
  var Gte: js.UndefOr[Integer] = js.native
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var LessThan: js.UndefOr[Long] = js.native
  /**
    * Represents a less than equal condition to be applied to a single field when querying for findings.
    */
  var LessThanOrEqual: js.UndefOr[Long] = js.native
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var Lt: js.UndefOr[Integer] = js.native
  /**
    * Represents a less than equal condition to be applied to a single field when querying for findings.
    */
  var Lte: js.UndefOr[Integer] = js.native
  /**
    * Represents the not equal condition to be applied to a single field when querying for findings.
    */
  var Neq: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Neq] = js.native
  /**
    * Represents an not equal condition to be applied to a single field when querying for findings.
    */
  var NotEquals: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.NotEquals] = js.native
}

object Condition {
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEq(value: Eq): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eq")(js.undefined)
        ret
    }
    @scala.inline
    def withEquals(value: Equals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Equals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Equals")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterThan(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreaterThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThan")(js.undefined)
        ret
    }
    @scala.inline
    def withGreaterThanOrEqual(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThanOrEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreaterThanOrEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThanOrEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withGt(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gt")(js.undefined)
        ret
    }
    @scala.inline
    def withGte(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gte")(js.undefined)
        ret
    }
    @scala.inline
    def withLessThan(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessThan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThan")(js.undefined)
        ret
    }
    @scala.inline
    def withLessThanOrEqual(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThanOrEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLessThanOrEqual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThanOrEqual")(js.undefined)
        ret
    }
    @scala.inline
    def withLt(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lt")(js.undefined)
        ret
    }
    @scala.inline
    def withLte(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLte: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lte")(js.undefined)
        ret
    }
    @scala.inline
    def withNeq(value: Neq): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Neq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Neq")(js.undefined)
        ret
    }
    @scala.inline
    def withNotEquals(value: NotEquals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotEquals")(js.undefined)
        ret
    }
  }
  
}

