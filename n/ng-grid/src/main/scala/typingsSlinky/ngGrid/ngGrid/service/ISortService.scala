package typingsSlinky.ngGrid.ngGrid.service

import typingsSlinky.ngGrid.ngGrid.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortService extends js.Object {
  var colSortFnCache: js.Any = js.native
  var isCustomSort: Boolean = js.native
  var isSorting: Boolean = js.native
  def Sort(sortInfo: ISortInfo, data: js.Any): Unit = js.native
  def basicSort(a: js.Any, b: js.Any): Double = js.native
  def getSortFn(col: IColumn, data: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def guessSortFn(item: js.Any): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def sortAlpha(a: String, b: String): Double = js.native
  def sortBool(a: Boolean, b: Boolean): Double = js.native
  def sortData(sortInfo: ISortInfo, data: js.Any): Unit = js.native
  def sortDate(a: js.Date, b: js.Date): Double = js.native
  def sortNumber(a: Double, b: Double): Double = js.native
  def sortNumberStr(a: String, b: String): Double = js.native
}

object ISortService {
  @scala.inline
  def apply(
    Sort: (ISortInfo, js.Any) => Unit,
    basicSort: (js.Any, js.Any) => Double,
    colSortFnCache: js.Any,
    getSortFn: (IColumn, js.Any) => js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    guessSortFn: js.Any => js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    isCustomSort: Boolean,
    isSorting: Boolean,
    sortAlpha: (String, String) => Double,
    sortBool: (Boolean, Boolean) => Double,
    sortData: (ISortInfo, js.Any) => Unit,
    sortDate: (js.Date, js.Date) => Double,
    sortNumber: (Double, Double) => Double,
    sortNumberStr: (String, String) => Double
  ): ISortService = {
    val __obj = js.Dynamic.literal(Sort = js.Any.fromFunction2(Sort), basicSort = js.Any.fromFunction2(basicSort), colSortFnCache = colSortFnCache.asInstanceOf[js.Any], getSortFn = js.Any.fromFunction2(getSortFn), guessSortFn = js.Any.fromFunction1(guessSortFn), isCustomSort = isCustomSort.asInstanceOf[js.Any], isSorting = isSorting.asInstanceOf[js.Any], sortAlpha = js.Any.fromFunction2(sortAlpha), sortBool = js.Any.fromFunction2(sortBool), sortData = js.Any.fromFunction2(sortData), sortDate = js.Any.fromFunction2(sortDate), sortNumber = js.Any.fromFunction2(sortNumber), sortNumberStr = js.Any.fromFunction2(sortNumberStr))
    __obj.asInstanceOf[ISortService]
  }
  @scala.inline
  implicit class ISortServiceOps[Self <: ISortService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSort(value: (ISortInfo, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBasicSort(value: (js.Any, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicSort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withColSortFnCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSortFnCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSortFn(value: (IColumn, js.Any) => js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGuessSortFn(value: js.Any => js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guessSortFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsCustomSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortAlpha(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAlpha")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortBool(value: (Boolean, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBool")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortData(value: (ISortInfo, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortDate(value: (js.Date, js.Date) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortNumber(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortNumber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortNumberStr(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortNumberStr")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

