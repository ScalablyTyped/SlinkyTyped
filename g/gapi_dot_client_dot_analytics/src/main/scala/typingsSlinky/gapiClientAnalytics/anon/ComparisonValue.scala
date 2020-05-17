package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComparisonValue extends js.Object {
  /** Type of comparison. Possible values are LESS_THAN or GREATER_THAN. */
  var comparisonType: js.UndefOr[String] = js.native
  /** Value used for this comparison. */
  var comparisonValue: js.UndefOr[String] = js.native
}

object ComparisonValue {
  @scala.inline
  def apply(): ComparisonValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparisonValue]
  }
  @scala.inline
  implicit class ComparisonValueOps[Self <: ComparisonValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonType")(js.undefined)
        ret
    }
    @scala.inline
    def withComparisonValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonValue")(js.undefined)
        ret
    }
  }
  
}

