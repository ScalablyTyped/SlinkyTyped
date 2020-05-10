package typingsSlinky.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  var FILTERS: js.UndefOr[js.Array[QueryFilter]] = js.native
  var PAGENUM: js.UndefOr[Double] = js.native
  var PAGESIZE: js.UndefOr[Double] = js.native
  var SELECTCOLUMNS: js.UndefOr[js.Array[String]] = js.native
  var SORT: js.UndefOr[QuerySortDirections] = js.native
}

object Query {
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFILTERS(value: js.Array[QueryFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FILTERS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFILTERS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FILTERS")(js.undefined)
        ret
    }
    @scala.inline
    def withPAGENUM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGENUM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPAGENUM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGENUM")(js.undefined)
        ret
    }
    @scala.inline
    def withPAGESIZE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGESIZE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPAGESIZE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGESIZE")(js.undefined)
        ret
    }
    @scala.inline
    def withSELECTCOLUMNS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECTCOLUMNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSELECTCOLUMNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECTCOLUMNS")(js.undefined)
        ret
    }
    @scala.inline
    def withSORT(value: QuerySortDirections): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSORT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SORT")(js.undefined)
        ret
    }
  }
  
}

