package typingsSlinky.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  def HierarchyFilter(path: String): Filter = js.native
  def RangedFilter(low: Double, high: Double): Filter = js.native
  def RangedTwoDimensionalFilter(arr: js.Array[js.Array[Double]]): Filter = js.native
  def TwoDimensionalFilter(filter: js.Array[Double]): Filter = js.native
}

object Filters {
  @scala.inline
  def apply(
    HierarchyFilter: String => Filter,
    RangedFilter: (Double, Double) => Filter,
    RangedTwoDimensionalFilter: js.Array[js.Array[Double]] => Filter,
    TwoDimensionalFilter: js.Array[Double] => Filter
  ): Filters = {
    val __obj = js.Dynamic.literal(HierarchyFilter = js.Any.fromFunction1(HierarchyFilter), RangedFilter = js.Any.fromFunction2(RangedFilter), RangedTwoDimensionalFilter = js.Any.fromFunction1(RangedTwoDimensionalFilter), TwoDimensionalFilter = js.Any.fromFunction1(TwoDimensionalFilter))
    __obj.asInstanceOf[Filters]
  }
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHierarchyFilter(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRangedFilter(value: (Double, Double) => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangedFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRangedTwoDimensionalFilter(value: js.Array[js.Array[Double]] => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangedTwoDimensionalFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTwoDimensionalFilter(value: js.Array[Double] => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwoDimensionalFilter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

