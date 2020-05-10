package typingsSlinky.firebaseFirestore.specTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecQuery extends js.Object {
  var collectionGroup: js.UndefOr[String] = js.native
  var filters: js.UndefOr[js.Array[SpecQueryFilter]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var limitType: js.UndefOr[SpecLimitType] = js.native
  var orderBys: js.UndefOr[js.Array[SpecQueryOrderBy]] = js.native
  var path: String = js.native
}

object SpecQuery {
  @scala.inline
  def apply(path: String): SpecQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecQuery]
  }
  @scala.inline
  implicit class SpecQueryOps[Self <: SpecQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollectionGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[SpecQueryFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitType(value: SpecLimitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitType")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBys(value: js.Array[SpecQueryOrderBy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBys")(js.undefined)
        ret
    }
  }
  
}

