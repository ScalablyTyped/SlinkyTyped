package typingsSlinky.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EjPredicate extends js.Object {
  /** Pass the field name of the column.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** string/integer/date operator.
    */
  var filterOperator: js.UndefOr[String] = js.native
  /** Pass the value to be filtered in a column.
    */
  var filterValue: js.UndefOr[String] = js.native
  /** Optional - pass the ignore case value as true/false.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
}

object EjPredicate {
  @scala.inline
  def apply(): EjPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EjPredicate]
  }
  @scala.inline
  implicit class EjPredicateOps[Self <: EjPredicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(js.undefined)
        ret
    }
  }
  
}

