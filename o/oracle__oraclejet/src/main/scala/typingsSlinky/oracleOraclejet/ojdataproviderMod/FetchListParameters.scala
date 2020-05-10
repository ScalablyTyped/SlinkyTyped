package typingsSlinky.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchListParameters[D] extends js.Object {
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.native
  var filterCriterion: js.UndefOr[FilterOperator[D]] = js.native
  var size: Double = js.native
  var sortCriteria: js.UndefOr[js.Array[SortCriterion[D]]] = js.native
}

object FetchListParameters {
  @scala.inline
  def apply[D](size: Double): FetchListParameters[D] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchListParameters[D]]
  }
  @scala.inline
  implicit class FetchListParametersOps[Self[d] <: FetchListParameters[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withSize(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Array[String | FetchAttribute]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterCriterion(value: FilterOperator[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCriterion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterCriterion: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCriterion")(js.undefined)
        ret
    }
    @scala.inline
    def withSortCriteria(value: js.Array[SortCriterion[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortCriteria: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCriteria")(js.undefined)
        ret
    }
  }
  
}

