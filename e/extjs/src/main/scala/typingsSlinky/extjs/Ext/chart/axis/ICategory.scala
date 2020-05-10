package typingsSlinky.extjs.Ext.chart.axis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICategory extends IAxis {
  /** [Config Option] (Boolean) */
  var calculateCategoryCount: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var categoryNames: js.UndefOr[String] = js.native
}

object ICategory {
  @scala.inline
  def apply(): ICategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICategory]
  }
  @scala.inline
  implicit class ICategoryOps[Self <: ICategory] (val x: Self) extends AnyVal {
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

