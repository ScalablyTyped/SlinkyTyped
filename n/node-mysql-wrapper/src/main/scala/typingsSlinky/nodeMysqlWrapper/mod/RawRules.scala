package typingsSlinky.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawRules extends js.Object {
  var begin: String = js.native
  var end: String = js.native
  var groupBy: String = js.native
  var limit: Double = js.native
  var limitEnd: Double = js.native
   // limit = limitStart  =0 and limitEnd = limit.
  var limitStart: Double = js.native
  var orderBy: String = js.native
  var orderByDesc: String = js.native
  var table: String = js.native
}

object RawRules {
  @scala.inline
  def apply(
    begin: String,
    end: String,
    groupBy: String,
    limit: Double,
    limitEnd: Double,
    limitStart: Double,
    orderBy: String,
    orderByDesc: String,
    table: String
  ): RawRules = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], limitEnd = limitEnd.asInstanceOf[js.Any], limitStart = limitStart.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], orderByDesc = orderByDesc.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawRules]
  }
  @scala.inline
  implicit class RawRulesOps[Self <: RawRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimitEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimitStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderByDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderByDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

