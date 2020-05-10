package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SortCriteria...
  */
@js.native
trait ISortCriteria extends js.Object {
  /**
    * Sort by expression.
    */
  var qExpression: js.UndefOr[IValueExpr] = js.native
  /**
    * Sorts the field by alphabetical order.
    */
  var qSortByAscii: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field by expression.
    */
  var qSortByExpression: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field values by frequency
    * (number of occurrences in the field).
    */
  var qSortByFrequency: js.UndefOr[TypeSortDirection] = js.native
  /**
    * no / empty docu
    */
  var qSortByGreyness: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field values by the initial load order.
    */
  var qSortByLoadOrder: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field values by numeric value.
    */
  var qSortByNumeric: js.UndefOr[TypeSortDirection] = js.native
  /**
    * Sorts the field values according to their logical state
    * (selected, optional, alternative or excluded).
    */
  var qSortByState: js.UndefOr[TypeSortDirection] = js.native
}

object ISortCriteria {
  @scala.inline
  def apply(): ISortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortCriteria]
  }
  @scala.inline
  implicit class ISortCriteriaOps[Self <: ISortCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQExpression(value: IValueExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortByAscii(value: TypeSortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByAscii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortByAscii: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByAscii")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortByExpression(value: TypeSortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortByExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortByFrequency(value: TypeSortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortByFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortByGreyness(value: TypeSortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByGreyness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortByGreyness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByGreyness")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortByLoadOrder(value: TypeSortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByLoadOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortByLoadOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByLoadOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortByNumeric(value: TypeSortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortByNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByNumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withQSortByState(value: TypeSortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQSortByState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByState")(js.undefined)
        ret
    }
  }
  
}

