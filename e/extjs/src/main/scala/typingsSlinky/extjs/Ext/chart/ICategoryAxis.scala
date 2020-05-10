package typingsSlinky.extjs.Ext.chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICategoryAxis
  extends typingsSlinky.extjs.Ext.chart.axis.IAxis {
  /** [Config Option] (Boolean) */
  var calculateCategoryCount: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var categoryNames: js.UndefOr[String] = js.native
}

object ICategoryAxis {
  @scala.inline
  def apply(): ICategoryAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICategoryAxis]
  }
  @scala.inline
  implicit class ICategoryAxisOps[Self <: ICategoryAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateCategoryCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateCategoryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculateCategoryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateCategoryCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryNames")(js.undefined)
        ret
    }
  }
  
}

