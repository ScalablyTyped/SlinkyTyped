package typingsSlinky.ejWebAll.ej.Grid

import typingsSlinky.ejWebAll.ej.FilterOperators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSettingsFilteredColumn extends js.Object {
  /** Gets or sets a value that indicates whether to define the field name of the column to be filter.
    */
  var field: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define the matchCase of given value to be filter.
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to define the filter condition to filtered column. See operator
    */
  var operator: js.UndefOr[FilterOperators | String] = js.native
  /** Gets or sets a value that indicates whether to define the predicate as and/or.
    */
  var predicate: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define the value to be filtered in a column.
    */
  var value: js.UndefOr[String | Double] = js.native
}

object FilterSettingsFilteredColumn {
  @scala.inline
  def apply(): FilterSettingsFilteredColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSettingsFilteredColumn]
  }
  @scala.inline
  implicit class FilterSettingsFilteredColumnOps[Self <: FilterSettingsFilteredColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: FilterOperators | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withPredicate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predicate")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

